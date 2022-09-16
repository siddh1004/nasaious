package com.example.nasaious

import android.content.Context
import com.example.nasaious.data.common.di.DatabaseModule
import com.example.nasaious.data.common.di.RepositoryModule
import com.example.nasaious.data.common.repository.image.ImageRepositoryImpl
import com.example.nasaious.data.common.utils.*
import com.example.nasaious.data.local.dao.ImageDao
import com.example.nasaious.data.local.database.AppDatabase
import com.example.nasaious.domain.repository.image.ImageRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [RepositoryModule::class]
)
abstract class TestRepositoryModule {
    @Binds
    abstract fun provideImageRepository(
        mockRepository: MockRepository
    ): ImageRepository
}