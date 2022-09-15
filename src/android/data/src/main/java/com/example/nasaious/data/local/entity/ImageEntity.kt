package com.example.nasaious.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.nasaious.data.local.database.IMAGE_TABLE_NAME
import com.example.nasaious.data.remote.util.DomainMapper
import com.example.nasaious.domain.model.Image

@Entity(tableName = IMAGE_TABLE_NAME)
data class ImageEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val copyright: String?,
    val date: String,
    val explanation: String,
    val hdurl: String,
    val media_type: String,
    val service_version: String,
    val title: String,
    val url: String,
) : DomainMapper<Image> {

    override fun mapToDomainModel() = Image(
        id = id,
        copyright = copyright,
        date = date,
        url = url,
        title = title,
        description = explanation
    )
}