package dev.luchonetvv.pointsofinterest.config

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface PointsOfInterestService {
    companion object {
        const val URL_BASE = "https://maps.googleapis.com/maps/api/place/nearbysearch/"

        const val RESOURCE_SEARCH_BY_LOCATION_AND_KEYWORD = "json?type=point_of_interest&rankby=distance"

        fun <S> cteateService(serviceClass: Class<S>?): S {
            val requestInterceptor = OkHttpClient()
            requestInterceptor.interceptors().add(RequestInterceptor())

            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(URL_BASE)
                .client(requestInterceptor)
                .build()
                .create(serviceClass!!)
        }
    }
}
