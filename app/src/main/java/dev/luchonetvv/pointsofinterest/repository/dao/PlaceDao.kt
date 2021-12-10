package dev.luchonetvv.pointsofinterest.repository.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.luchonetvv.pointsofinterest.domain.entity.PlaceEntity
import dev.luchonetvv.pointsofinterest.domain.entity.PlaceWithReviews

@Dao
interface PlaceDao {
    @Query("SELECT * FROM PlaceEntity")
    fun getPlaces(): List<PlaceEntity>

    @Query("SELECT * FROM PlaceEntity pe WHERE pe.place_id = :placeId")
    fun getPlaceWithReviews(placeId: String): List<PlaceWithReviews>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(place: PlaceEntity)
}
