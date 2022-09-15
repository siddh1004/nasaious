package com.example.nasaious.screen.imageList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.nasaious.R
import com.example.nasaious.base.FragmentBase
import com.example.nasaious.base.Loading
import com.example.nasaious.base.Success
import com.example.nasaious.databinding.FragmentImageListBinding
import com.example.nasaious.domain.model.Image
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ImageListFragment : FragmentBase(R.layout.fragment_image_list) {

    @Inject
    lateinit var imageListViewModel: ImageViewModel

    private lateinit var imageItemAdapter: ImageItemAdapter

    private var _binding: FragmentImageListBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        setBindings(view)
        setAdapter()
        setObservers()
    }

    private fun loadData() {
        imageListViewModel.getImages()
    }

    private fun setBindings(view: View) {
        _binding = FragmentImageListBinding.bind(view)
    }

    private fun setAdapter() {
        imageItemAdapter = ImageItemAdapter(::onImageClick)
        binding.imageRecyclerView.adapter = imageItemAdapter
        binding.imageRecyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }

    private fun setObservers() {
        imageListViewModel.viewState.observe { viewState ->
            binding.progress.isVisible = viewState is Loading
            when (viewState) {
                is Success -> {
                    imageItemAdapter.submitList(viewState.data)
                }
                else -> {
                }
            }
        }
    }

    private fun onImageClick(image: Image) {
        navigateTo(ImageListFragmentDirections.showImageDetail(image.title))
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}