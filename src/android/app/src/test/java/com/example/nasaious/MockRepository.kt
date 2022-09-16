package com.example.nasaious

import com.example.nasaious.domain.model.Image
import com.example.nasaious.domain.model.Result
import com.example.nasaious.domain.model.Success
import com.example.nasaious.domain.repository.image.ImageRepository
import javax.inject.Inject

class MockRepository @Inject constructor() : ImageRepository {
    override suspend fun getImages(): Result<List<Image>> {
        return Success(
            listOf(
                Image(
                    copyright = "",
                    date = "2019-12-01",
                    title = "Test Image 1",
                    url = "",
                    description = "Test description 1"
                ),
                Image(
                    copyright = "",
                    date = "2020-12-01",
                    title = "Test Image 2",
                    url = "",
                    description = "Test description 2"
                )
            )
        )
    }

    override suspend fun getImage(title: String): Result<Image> {
        TODO("Not yet implemented")
    }
}