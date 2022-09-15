package com.example.nasaious.data.remote.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0089\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\b\b\u0001\u0010\u0002*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052(\u0010\u0006\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072(\u0010\t\u001a$\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u001a\u001a\u0010\f\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0005\u001a:\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0001\u001a:\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\b\u00f8\u0001\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001\u00a8\u0006\u0012"}, d2 = {"getData", "Lcom/example/nasaious/domain/model/Result;", "R", "T", "", "Lretrofit2/Response;", "successAction", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "failureAction", "Lcom/example/nasaious/domain/model/HttpError;", "(Lretrofit2/Response;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHttpError", "onFailure", "action", "Lkotlin/Function1;", "", "onSuccess", "data_debug"})
public final class NetworkResultKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>retrofit2.Response<T> onSuccess(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>retrofit2.Response<T> onFailure(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$onFailure, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.nasaious.domain.model.HttpError, kotlin.Unit> action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.example.nasaious.domain.model.HttpError getHttpError(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$getHttpError) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object, R extends java.lang.Object>java.lang.Object getData(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<T> $this$getData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<? extends R>>, ? extends java.lang.Object> successAction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.nasaious.domain.model.HttpError, ? super kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<? extends R>>, ? extends java.lang.Object> failureAction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<? extends R>> p3) {
        return null;
    }
}