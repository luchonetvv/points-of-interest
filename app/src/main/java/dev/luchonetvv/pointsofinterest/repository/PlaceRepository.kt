package dev.luchonetvv.pointsofinterest.repository

import android.util.Log
import dev.luchonetvv.pointsofinterest.config.PointsOfInterestDatabase
import dev.luchonetvv.pointsofinterest.domain.model.PlaceResponse
import dev.luchonetvv.pointsofinterest.repository.network.PlaceApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlaceRepository(
    private val pointsOfInterestDatabase: PointsOfInterestDatabase,
    private val placeApi: PlaceApi) {
    fun getAll(location: String, keyword: String) {
        placeApi.getPlacesByLocationAndKeywords(location, keyword).enqueue(object : Callback<PlaceResponse> {
            override fun onResponse(call: Call<PlaceResponse>, response: Response<PlaceResponse>) {
                if (response.body() != null) {
                    Log.i(PlaceRepository::class.java.simpleName, response.body().toString())
                }
            }

            override fun onFailure(call: Call<PlaceResponse>, t: Throwable) {
                Log.e(PlaceRepository::class.java.simpleName, "Failure Response", t)
            }
        })
    }
}
