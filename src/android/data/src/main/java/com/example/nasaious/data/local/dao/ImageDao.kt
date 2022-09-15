package com.example.nasaious.data.local.dao

import androidx.room.*
import com.example.nasaious.data.local.database.IMAGE_TABLE_NAME
import com.example.nasaious.data.local.entity.ImageEntity

@Dao
abstract class ImageDao {
    @Query("SELECT * FROM $IMAGE_TABLE_NAME")
    abstract suspend fun getImages(): List<ImageEntity>

    @Query("SELECT * FROM $IMAGE_TABLE_NAME Where id = :id")
    abstract suspend fun getImage(id: Int): ImageEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun saveImages(images: List<ImageEntity>)

    @Query("DELETE FROM $IMAGE_TABLE_NAME")
    abstract suspend fun nukeTable()
}