package com.example.nasaious.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/nasaious/data/remote/api/ImageApiImpl;", "Lcom/example/nasaious/data/remote/api/ImageApi;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fromJson", "", "Lcom/example/nasaious/data/remote/response/ImageItemResponse;", "getImages", "Lretrofit2/Response;", "Lcom/example/nasaious/data/remote/response/BaseResponse;", "Lcom/example/nasaious/data/remote/response/ImageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readFile", "", "Landroid/content/res/AssetManager;", "fileName", "Companion", "data_debug"})
public final class ImageApiImpl implements com.example.nasaious.data.remote.api.ImageApi {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.nasaious.data.remote.api.ImageApiImpl.Companion Companion = null;
    private static final java.lang.String SOURCE_FILE_NAME = "data.json";
    
    @javax.inject.Inject()
    public ImageApiImpl(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getImages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.nasaious.data.remote.response.BaseResponse<com.example.nasaious.data.remote.response.ImageResponse>>> continuation) {
        return null;
    }
    
    private final java.util.List<com.example.nasaious.data.remote.response.ImageItemResponse> fromJson() {
        return null;
    }
    
    private final java.lang.String readFile(android.content.res.AssetManager $this$readFile, java.lang.String fileName) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/nasaious/data/remote/api/ImageApiImpl$Companion;", "", "()V", "SOURCE_FILE_NAME", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}