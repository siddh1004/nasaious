package com.example.nasaious.data.common.repository.image

import com.example.nasaious.data.local.dao.ImageDao
import com.example.nasaious.data.remote.GENERAL_NETWORK_ERROR
import com.example.nasaious.data.remote.api.ApiCaller
import com.example.nasaious.data.remote.api.ImageApi
import com.example.nasaious.data.remote.response.ImageResponse
import com.example.nasaious.domain.model.*
import com.example.nasaious.domain.repository.image.ImageRepository
import javax.inject.Inject

class ImageRepositoryImpl @Inject constructor(
    private val imageDao: ImageDao,
    private val imageApi: ImageApi
) : ImageRepository, ApiCaller() {
    override suspend fun getImages(): Result<List<Image>> {
        return call(
            apiCall = { imageApi.getImages() },
            onSuccess = { response ->
                if (response.data != null) {
                    saveImagesToDb(response.data)
                    getImagesFromDb()
                } else {
                    Failure(HttpError(GENERAL_NETWORK_ERROR))
                }
            }
        )
    }

    override suspend fun getImage(id: Int): Result<Image> {
        return try {
            val image = imageDao.getImage(id).mapToDomainModel()
            Success(image)
        } catch (ex: Exception) {
            Failure(HttpError(ex.message ?: GENERAL_NETWORK_ERROR))
        }
    }

    private suspend fun saveImagesToDb(imageResponse: ImageResponse) {
        if (!imageResponse.images.isNullOrEmpty()) {
            imageDao.nukeTable()
            imageDao.saveImages(imageResponse.images.map { it.mapToRoomEntity() })
        }
    }

    private suspend fun getImagesFromDb() =
        Success(imageDao.getImages().map { it.mapToDomainModel() })
}