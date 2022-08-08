package com.atif.spatify.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "albumcredit")
data class AlbumCredit (
    @PrimaryKey val id: String,
    @ColumnInfo(name = "credit_name") val creditName: String,
    @ColumnInfo(name = "credit_contribution") val creditContribution: String,
    @ColumnInfo(name = "credit_image_url") val creditImageUrl: String,
    @ColumnInfo(name = "credit_album_id") val creditAlbumId: String)
{
    override fun toString(): String {
        return "Credit id: $id" + "\n" +
                "Credit album id: $creditAlbumId" +
                "Credit name: $creditName" + "\n" +
                "Credit contribution: $creditContribution" + "\n" +
                "Credit image URL: $creditImageUrl"
    }

}
