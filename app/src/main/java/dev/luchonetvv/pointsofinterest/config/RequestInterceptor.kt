package dev.luchonetvv.pointsofinterest.config

import dev.luchonetvv.pointsofinterest.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val httpUrl = request.url().newBuilder().addQueryParameter("key", BuildConfig.MAPS_API_KEY).build()
        request = request.newBuilder().url(httpUrl).build()
        return chain.proceed(request)
    }
}
