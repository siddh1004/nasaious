package com.example.nasaious.domain.repository.image

import com.example.nasaious.domain.model.Image
import com.example.nasaious.domain.model.Result

interface ImageRepository {
    suspend fun getImages(): Result<List<Image>>
    suspend fun getImage(id: Int): Result<Image>
}