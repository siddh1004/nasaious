package com.example.nasaious.domain.di

import com.example.nasaious.domain.interaction.image.GetImageUseCase
import com.example.nasaious.domain.interaction.image.GetImageUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class InteractionModule {

    @Binds
    abstract fun bindImageUseCase(
        imageUseCaseImpl: GetImageUseCaseImpl
    ): GetImageUseCase
}