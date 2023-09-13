package com.nyang.weathercaminsights.data.service

import com.google.gson.GsonBuilder
import com.nyang.weathercaminsights.domain.service.GetInfoCCTVService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

object GetInfoCCTVManager {
    private const val BASE_URL = "https://openapi.its.go.kr:9443"
    private fun getInstance() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        //.client(okHttpClient)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
        .build()

    var okHttpClient = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.MINUTES)
        .readTimeout(50, TimeUnit.SECONDS)
        .writeTimeout(50, TimeUnit.SECONDS)
        .build()

    fun getService() = getInstance().create(GetInfoCCTVService::class.java)
}