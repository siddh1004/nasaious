package com.example.nasaious.domain.interaction.image

import com.example.nasaious.domain.model.Image
import com.example.nasaious.domain.model.Result

interface GetImageUseCase {
    suspend fun getImages(): Result<List<Image>>
    suspend fun getImage(id: Int): Result<Image>
}

