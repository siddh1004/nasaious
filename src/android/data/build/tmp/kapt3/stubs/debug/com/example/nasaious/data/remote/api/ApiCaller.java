package com.example.nasaious.data.remote.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002Jy\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\b\b\u0000\u0010\f*\u00020\u0001\"\b\b\u0001\u0010\u000b*\u00020\u00012\"\u0010\r\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2(\u0010\u0011\u001a$\b\u0001\u0012\u0004\u0012\u0002H\f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/nasaious/data/remote/api/ApiCaller;", "", "()V", "contextProvider", "Lcom/example/nasaious/data/common/utils/ContextProvider;", "getContextProvider", "()Lcom/example/nasaious/data/common/utils/ContextProvider;", "setContextProvider", "(Lcom/example/nasaious/data/common/utils/ContextProvider;)V", "call", "Lcom/example/nasaious/domain/model/Result;", "R", "T", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "onSuccess", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public abstract class ApiCaller {
    @javax.inject.Inject()
    public com.example.nasaious.data.common.utils.ContextProvider contextProvider;
    
    public ApiCaller() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.nasaious.data.common.utils.ContextProvider getContextProvider() {
        return null;
    }
    
    public final void setContextProvider(@org.jetbrains.annotations.NotNull()
    com.example.nasaious.data.common.utils.ContextProvider p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object, R extends java.lang.Object>java.lang.Object call(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super retrofit2.Response<T>>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<? extends R>>, ? extends java.lang.Object> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.nasaious.domain.model.Result<? extends R>> continuation) {
        return null;
    }
}