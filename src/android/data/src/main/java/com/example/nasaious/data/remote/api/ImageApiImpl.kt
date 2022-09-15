package com.example.nasaious.data.remote.api

import android.content.Context
import android.content.res.AssetManager
import com.example.nasaious.data.remote.response.BaseResponse
import com.example.nasaious.data.remote.response.ImageItemResponse
import com.example.nasaious.data.remote.response.ImageResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Response
import javax.inject.Inject

class ImageApiImpl @Inject constructor(
    @ApplicationContext
    private val context: Context
) : ImageApi {
    companion object {
        private const val SOURCE_FILE_NAME = "data.json"
    }

    override suspend fun getImages(): Response<BaseResponse<ImageResponse>> {
        return Response.success(
            BaseResponse(
                success = true,
                data = ImageResponse(
                    fromJson()
                )
            )
        )
    }

    private fun fromJson(): List<ImageItemResponse> {
        val jsonString = context.assets.readFile(SOURCE_FILE_NAME)
        val listType = object : TypeToken<List<ImageItemResponse>>() {}.type
        return Gson().fromJson(jsonString, listType)
    }

    private fun AssetManager.readFile(fileName: String) = open(fileName)
        .bufferedReader()
        .use { it.readText() }
}