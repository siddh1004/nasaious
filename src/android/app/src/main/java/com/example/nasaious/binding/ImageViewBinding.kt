package com.example.nasaious.binding

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter(value = ["imageUrl", "placeholder", "size"], requireAll = false)
fun loadImageUrl(
    imageView: ImageView,
    imageUrl: String?,
    placeholder: Drawable?,
    size: Float
) {
    try {
        if (imageUrl != null) {
            loadUrl(imageView, imageUrl, placeholder, size.toInt())
        } else {
            imageView.setImageDrawable(
                placeholder ?: ColorDrawable(Color.GRAY)
            )
        }
    } catch (ex: Exception) {
        imageView.setImageDrawable(placeholder ?: ColorDrawable(Color.GRAY))
    }
}

private fun loadUrl(
    imageView: ImageView,
    imageUrl: String?,
    placeholder: Drawable?,
    size: Int
) {
    val options: RequestOptions = RequestOptions()
        .placeholder(ColorDrawable(Color.GRAY))
        .error(placeholder ?: ColorDrawable(Color.GRAY))

    Glide
        .with(imageView.context)
        .load(imageUrl)
        .apply(options)
        .override(size)
        .into(imageView)
}