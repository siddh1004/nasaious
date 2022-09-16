package com.example.nasaious.data.common.di

import android.content.Context
import com.example.nasaious.data.common.utils.*
import com.example.nasaious.data.local.dao.ImageDao
import com.example.nasaious.data.local.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {
    @Singleton
    @Provides
    fun provideDb(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideImageDao(db: AppDatabase): ImageDao {
        return db.imageDao()
    }

    @Provides
    @Singleton
    fun provideCoroutineContext(): ContextProvider {
        return CoroutineContextProvider()
    }

    @Provides
    @Singleton
    fun provideNetworkConnectivityHelper(@ApplicationContext context: Context): Connectivity {
        return ConnectivityImpl(context)
    }
}