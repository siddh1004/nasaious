package com.example.nasaious

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.nasaious.domain.repository.image.ImageRepository
import com.example.nasaious.screen.imageList.ImageViewModel
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class ImageViewModelInstrumentalTest {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

//    @get:Rule
//    var instantExecutorRule =InstantT

    @Inject
    lateinit var imageRepository: ImageRepository

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.nasaious", appContext.packageName)
    }

    @Test
    fun getImages_EmptyList_returnsOk() {
        val imageViewModel = ImageViewModel(imageRepository)

        imageViewModel.getImages()

//        val viewState = imageViewModel.viewState.getOrAwaitValue()
    }
}