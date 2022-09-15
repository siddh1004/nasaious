package com.example.nasaious.screen.imageDetail

import com.example.nasaious.base.Error
import com.example.nasaious.base.Success
import com.example.nasaious.base.ViewModelBase
import com.example.nasaious.domain.interaction.image.GetImageUseCase
import com.example.nasaious.domain.model.Image
import com.example.nasaious.domain.model.onFailure
import com.example.nasaious.domain.model.onSuccess
import javax.inject.Inject

class ImageDetailViewModel @Inject constructor(
    private val imageUseCase: GetImageUseCase
) : ViewModelBase<Image>() {
    fun getImage(id: Int) = executeUseCase {
        imageUseCase.getImage(id)
            .onSuccess { _viewState.value = Success(it) }
            .onFailure { _viewState.value = Error(it.errorMessage) }
    }
}