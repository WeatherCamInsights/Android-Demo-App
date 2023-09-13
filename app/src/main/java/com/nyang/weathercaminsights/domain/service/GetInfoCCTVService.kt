package com.nyang.weathercaminsights.domain.service

import com.nyang.weathercaminsights.domain.model.ResponseCCTV
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface GetInfoCCTVService {
    @GET("/cctvInfo?")
    suspend fun getInfoCCTV(
        @Query("apiKey") apiKey: String,
        @Query("type") type: String,
        @Query("cctvType") cctvType: String,
        @Query("minX") minX: Double,
        @Query("maxX") maxX: Double,
        @Query("minY") minY: Double,
        @Query("maxY") maxY: Double,
        @Query("getType") getType: String,
    ): Response<ResponseCCTV>
}