package com.example.nasaious.data.common.di

import com.example.nasaious.data.common.repository.image.ImageRepositoryImpl
import com.example.nasaious.domain.repository.image.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideImageRepository(
        imageRepositoryImpl: ImageRepositoryImpl
    ): ImageRepository
}