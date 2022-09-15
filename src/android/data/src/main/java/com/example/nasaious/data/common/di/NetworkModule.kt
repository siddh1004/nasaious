package com.example.nasaious.data.common.di

import com.example.nasaious.data.remote.api.ImageApi
import com.example.nasaious.data.remote.api.ImageApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {
    @Binds
    abstract fun provideImageApi(
        imageApiImpl: ImageApiImpl
    ): ImageApi

}