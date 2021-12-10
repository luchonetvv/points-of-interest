package dev.luchonetvv.pointsofinterest.domain.entity

import androidx.room.Embedded
import androidx.room.Relation

data class PlaceWithReviews (
    @Embedded val place: PlaceEntity,
    @Relation(
        parentColumn = "place_id",
        entityColumn = "placeIdFK"
    )
    val reviews: List<PlaceReviewEntity>
)
