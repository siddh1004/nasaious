package com.example.nasaious.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/nasaious/data/remote/api/ImageApi;", "", "getImages", "Lretrofit2/Response;", "Lcom/example/nasaious/data/remote/response/BaseResponse;", "Lcom/example/nasaious/data/remote/response/ImageResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract interface ImageApi {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImages(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.nasaious.data.remote.response.BaseResponse<com.example.nasaious.data.remote.response.ImageResponse>>> continuation);
}