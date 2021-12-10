package dev.luchonetvv.pointsofinterest.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PlaceReviewEntity (
    @PrimaryKey @ColumnInfo(name = "time") val time: Long,
    @ColumnInfo(name = "author_name") val authorName: String,
    @ColumnInfo(name = "rating") val rating: Double,
    @ColumnInfo(name = "comment") val comment: String,
    val placeIdFK: String
)
