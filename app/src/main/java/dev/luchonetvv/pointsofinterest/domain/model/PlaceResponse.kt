package dev.luchonetvv.pointsofinterest.domain.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(
    @SerializedName("place_id") val placeId: String,
    @SerializedName("name") val name: String,
    @SerializedName("formatted_address") val formattedAddress: String,
    @SerializedName("icon") val urlIcon: String,
    @SerializedName("rating") val rating: Double,
    @SerializedName("reviews") val reviews: List<PlaceReviewResponse>
)
