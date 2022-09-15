package com.example.nasaious.domain.model

data class Image(
    val id: Int,
    val copyright: String?,
    val date: String,
    val url: String,
    val title: String,
    val description: String,
)