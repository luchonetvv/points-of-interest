package dev.luchonetvv.pointsofinterest.repository.network

import dev.luchonetvv.pointsofinterest.config.PointsOfInterestService
import dev.luchonetvv.pointsofinterest.domain.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceApi {
    @GET(PointsOfInterestService.URL_BASE + PointsOfInterestService.RESOURCE_SEARCH_BY_LOCATION_AND_KEYWORD)
    fun getPlacesByLocationAndKeywords(
        @Query("location") location: String,
        @Query("keyword") keyword: String): Call<PlaceResponse>
}
