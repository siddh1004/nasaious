package com.example.nasaious.screen.imageList

import com.example.nasaious.base.Error
import com.example.nasaious.base.Success
import com.example.nasaious.base.ViewModelBase
import com.example.nasaious.domain.model.Image
import com.example.nasaious.domain.model.onFailure
import com.example.nasaious.domain.model.onSuccess
import com.example.nasaious.domain.repository.image.ImageRepository
import javax.inject.Inject

class ImageViewModel @Inject constructor(
    private val imageRepository: ImageRepository
) : ViewModelBase<List<Image>>() {
    fun getImages() = executeUseCase {
        imageRepository.getImages()
            .onSuccess { _viewState.value = Success(it) }
            .onFailure { _viewState.value = Error(it.errorMessage) }
    }
}