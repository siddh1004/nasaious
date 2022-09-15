package com.example.nasaious.data.remote.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/nasaious/data/remote/util/DomainMapper;", "T", "", "mapToDomainModel", "()Ljava/lang/Object;", "data_debug"})
public abstract interface DomainMapper<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract T mapToDomainModel();
}