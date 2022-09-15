package com.example.nasaious.screen.imageDetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nasaious.databinding.ItemImageDetailBinding
import com.example.nasaious.domain.model.Image
import com.example.nasaious.screen.imageList.ImageDiffCallback

class ImageDetailAdapter :
    ListAdapter<Image, ImageDetailAdapter.ImageViewHolder>(ImageDiffCallback) {

    class ImageViewHolder(
        private val binding: ItemImageDetailBinding,
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(image: Image) {
            binding.apply {
                nasaImage = image
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemImageDetailBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = getItem(position)
        holder.bind(image)
    }
}