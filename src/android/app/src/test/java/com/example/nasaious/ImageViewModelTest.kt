package com.example.nasaious

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.nasaious.base.Success
import com.example.nasaious.domain.repository.image.ImageRepository
import com.example.nasaious.screen.imageList.ImageViewModel
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.HiltTestApplication
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import javax.inject.Inject

@HiltAndroidTest
@Config(application = HiltTestApplication::class)
@RunWith(RobolectricTestRunner::class)
class ImageViewModelTest {

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    lateinit var viewModel: ImageViewModel

    @Inject
    lateinit var repository: ImageRepository

    @Before
    @Throws(Exception::class)
    fun setUp() {
        hiltRule.inject()
        viewModel = ImageViewModel(repository)
        viewModel.getImages()
    }

    @Test
    fun getImages_ReturnSuccess() {
        val value = viewModel.viewState.getOrAwaitValue()
        val test = value is Success
        assert(test)
    }

    @Test
    fun getImages_testCount() {
        val value = viewModel.viewState.getOrAwaitValue()
        val test = value as Success
        assert(test.data.count() == 2)
    }

    @Test
    fun getImages_testOrder() {
        val value = viewModel.viewState.getOrAwaitValue()
        val test = value as Success
        assert(test.data[0].date > test.data[1].date)
    }
}