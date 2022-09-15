package com.example.nasaious.domain.interaction.image

import com.example.nasaious.domain.repository.image.ImageRepository
import javax.inject.Inject

class GetImageUseCaseImpl @Inject constructor(
    private val imageRepository: ImageRepository
) : GetImageUseCase {
    override suspend fun getImages() = imageRepository.getImages()

    override suspend fun getImage(title: String) = imageRepository.getImage(title)
}

