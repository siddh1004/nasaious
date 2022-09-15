package com.example.nasaious.data.common.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0005\u00a8\u0006\n"}, d2 = {"Lcom/example/nasaious/data/common/utils/ContextProvider;", "", "default", "Lkotlin/coroutines/CoroutineContext;", "getDefault", "()Lkotlin/coroutines/CoroutineContext;", "io", "getIo", "main", "getMain", "data_debug"})
public abstract interface ContextProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.coroutines.CoroutineContext getMain();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.coroutines.CoroutineContext getIo();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.coroutines.CoroutineContext getDefault();
}