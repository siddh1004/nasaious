package com.example.nasaious.screen.imageList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nasaious.databinding.ListItemImageBinding
import com.example.nasaious.domain.model.Image

class ImageItemAdapter(private val onClick: (Image) -> Unit) :
    ListAdapter<Image, ImageItemAdapter.ImageViewHolder>(ImageDiffCallback) {

    class ImageViewHolder(
        private val binding: ListItemImageBinding,
        private val onClick: (Image) -> Unit
    ) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener {
                binding.nasaImage?.let { image ->
                    onClick.invoke(image)
                }
            }
        }

        fun bind(image: Image) {
            binding.apply {
                nasaImage = image
                executePendingBindings()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ListItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onClick
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val image = getItem(position)
        holder.bind(image)
    }
}

object ImageDiffCallback : DiffUtil.ItemCallback<Image>() {
    override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
        return oldItem == newItem
    }
}