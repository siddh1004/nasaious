package com.example.nasaious.data.common.repository.image;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/nasaious/data/common/repository/image/ImageRepositoryImpl;", "Lcom/example/nasaious/domain/repository/image/ImageRepository;", "Lcom/example/nasaious/data/remote/api/ApiCaller;", "imageDao", "Lcom/example/nasaious/data/local/dao/ImageDao;", "imageApi", "Lcom/example/nasaious/data/remote/api/ImageApi;", "(Lcom/example/nasaious/data/local/dao/ImageDao;Lcom/example/nasaious/data/remote/api/ImageApi;)V", "getImage", "Lcom/example/nasaious/domain/model/Result;", "Lcom/example/nasaious/domain/model/Image;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImages", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImagesFromDb", "Lcom/example/nasaious/domain/model/Success;", "saveImagesToDb", "", "imageResponse", "Lcom/example/nasaious/data/remote/response/ImageResponse;", "(Lcom/example/nasaious/data/remote/response/ImageResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class ImageRepositoryImpl extends com.example.nasaious.data.remote.api.ApiCaller implements com.example.nasaious.domain.repository.image.ImageRepository {
    private final com.example.nasaious.data.local.dao.ImageDao imageDao = null;
    private final com.example.nasaious.data.remote.api.ImageApi imageApi = null;
    
    @javax.inject.Inject()
    public ImageRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.nasaious.data.local.dao.ImageDao imageDao, @org.jetbrains.annotations.NotNull()
    com.example.nasaious.data.remote.api.ImageApi imageApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<? extends java.util.List<com.example.nasaious.domain.model.Image>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImage(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<com.example.nasaious.domain.model.Image>> continuation) {
        return null;
    }
    
    private final java.lang.Object saveImagesToDb(com.example.nasaious.data.remote.response.ImageResponse imageResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getImagesFromDb(kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Success<? extends java.util.List<com.example.nasaious.domain.model.Image>>> continuation) {
        return null;
    }
}