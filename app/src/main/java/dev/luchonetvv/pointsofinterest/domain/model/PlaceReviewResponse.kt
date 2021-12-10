package dev.luchonetvv.pointsofinterest.domain.model

import com.google.gson.annotations.SerializedName

data class PlaceReviewResponse(
    @SerializedName("time") val time: Long,
    @SerializedName("author_name") val authorName: String,
    @SerializedName("rating") val rating: Double,
    @SerializedName("text") val comment: String
)
