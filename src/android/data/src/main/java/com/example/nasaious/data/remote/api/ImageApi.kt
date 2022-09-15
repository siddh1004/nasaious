package com.example.nasaious.data.remote.api

import com.example.nasaious.data.remote.response.BaseResponse
import com.example.nasaious.data.remote.response.ImageItemResponse
import com.example.nasaious.data.remote.response.ImageResponse
import retrofit2.Response
import retrofit2.http.*

interface ImageApi {
    suspend fun getImages(): Response<BaseResponse<ImageResponse>>
}
