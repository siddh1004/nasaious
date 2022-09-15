package com.example.nasaious.screen.imageList

import com.example.nasaious.base.Error
import com.example.nasaious.base.Success
import com.example.nasaious.base.ViewModelBase
import com.example.nasaious.domain.interaction.image.GetImageUseCase
import com.example.nasaious.domain.model.Image
import com.example.nasaious.domain.model.onFailure
import com.example.nasaious.domain.model.onSuccess
import javax.inject.Inject

class ImageListViewModel @Inject constructor(
    private val imageUseCase: GetImageUseCase
) : ViewModelBase<List<Image>>() {
    fun getImages() = executeUseCase {
        imageUseCase.getImages()
            .onSuccess { _viewState.value = Success(it) }
            .onFailure { _viewState.value = Error(it.errorMessage) }
    }
}