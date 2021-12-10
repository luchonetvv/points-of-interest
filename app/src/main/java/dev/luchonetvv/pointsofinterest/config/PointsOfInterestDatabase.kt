package dev.luchonetvv.pointsofinterest.config

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import dev.luchonetvv.pointsofinterest.domain.entity.PlaceEntity
import dev.luchonetvv.pointsofinterest.domain.entity.PlaceReviewEntity
import dev.luchonetvv.pointsofinterest.repository.dao.PlaceDao
import dev.luchonetvv.pointsofinterest.repository.dao.PlaceReviewDao

@Database(entities = [PlaceEntity::class, PlaceReviewEntity::class], version = 1)
abstract class PointsOfInterestDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
    abstract fun placeReviewsDao(): PlaceReviewDao

    companion object {
        @Volatile
        private var INSTANCE: PointsOfInterestDatabase? = null

        fun getPointsOfInterestDatabase(
            context: Context,
            databaseName: String
        ): PointsOfInterestDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    PointsOfInterestDatabase::class.java,
                    databaseName
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
