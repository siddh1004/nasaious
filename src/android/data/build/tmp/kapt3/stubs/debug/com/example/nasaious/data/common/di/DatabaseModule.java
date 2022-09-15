package com.example.nasaious.data.common.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/nasaious/data/common/di/DatabaseModule;", "", "()V", "provideCoroutineContext", "Lcom/example/nasaious/data/common/utils/ContextProvider;", "provideDb", "Lcom/example/nasaious/data/local/database/AppDatabase;", "context", "Landroid/content/Context;", "provideImageDao", "Lcom/example/nasaious/data/local/dao/ImageDao;", "db", "provideNetworkConnectivityHelper", "Lcom/example/nasaious/data/common/utils/Connectivity;", "data_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.nasaious.data.local.database.AppDatabase provideDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.nasaious.data.local.dao.ImageDao provideImageDao(@org.jetbrains.annotations.NotNull()
    com.example.nasaious.data.local.database.AppDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nasaious.data.common.utils.ContextProvider provideCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.nasaious.data.common.utils.Connectivity provideNetworkConnectivityHelper(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
}