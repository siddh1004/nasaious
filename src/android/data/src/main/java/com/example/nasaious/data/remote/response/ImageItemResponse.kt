package com.example.nasaious.data.remote.response

import com.example.nasaious.data.local.entity.ImageEntity
import com.example.nasaious.data.remote.util.RoomMapper

data class ImageItemResponse(
    val copyright: String?,
    val date: String,
    val explanation: String,
    val hdurl: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String,
) : RoomMapper<ImageEntity> {
    override fun mapToRoomEntity() = ImageEntity(
        copyright = copyright,
        date = date,
        explanation = explanation,
        hdurl = hdurl,
        media_type = media_type,
        service_version = service_version,
        title = title,
        url = url
    )
}