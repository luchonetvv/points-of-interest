package dev.luchonetvv.pointsofinterest.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PlaceEntity (
    @PrimaryKey @ColumnInfo(name = "place_id") val placeId: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "formatted_address") val formattedAddress: String,
    @ColumnInfo(name = "icon") val urlIcon: String,
    @ColumnInfo(name = "rating") val rating: Double
)
