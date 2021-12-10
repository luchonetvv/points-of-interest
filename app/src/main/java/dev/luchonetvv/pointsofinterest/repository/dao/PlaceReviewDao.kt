package dev.luchonetvv.pointsofinterest.repository.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import dev.luchonetvv.pointsofinterest.domain.entity.PlaceReviewEntity

@Dao
interface PlaceReviewDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAll(reviews: List<PlaceReviewEntity>)
}
