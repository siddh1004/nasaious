package com.example.nasaious.screen.imageDetail

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.navArgs
import com.example.nasaious.R
import com.example.nasaious.base.FragmentBase
import com.example.nasaious.base.Loading
import com.example.nasaious.base.Success
import com.example.nasaious.databinding.FragmentImageDetailBinding
import com.example.nasaious.screen.imageList.ImageViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ImageDetailFragment : FragmentBase(R.layout.fragment_image_detail) {

    @Inject
    lateinit var imageViewModel: ImageViewModel

    private lateinit var imagePreviewAdapter: ImageDetailAdapter

    private var _binding: FragmentImageDetailBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val args: ImageDetailFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setBindings(view)
        setAdapter()
        setObservers()
    }

    private fun loadData() {
        imageViewModel.getImages()
    }

    private fun setBindings(view: View) {
        _binding = FragmentImageDetailBinding.bind(view)
    }

    private fun setAdapter() {
        imagePreviewAdapter = ImageDetailAdapter()
        binding.viewPager.adapter = imagePreviewAdapter
    }

    private fun setObservers() {
        imageViewModel.viewState.observe { viewState ->
            binding.progress.isVisible = viewState is Loading
            when (viewState) {
                is Success -> {
                    imagePreviewAdapter.submitList(viewState.data)
                    val selectedPosition =
                        (viewState.data.indices).firstOrNull { viewState.data[it].title == args.title }
                            ?: 0
                    binding.viewPager.setCurrentItem(selectedPosition, false)
                }
                else -> {
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}