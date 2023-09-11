package com.nyang.weathercaminsights.domain.cctvData.model

import com.google.gson.annotations.SerializedName

/**
 * @param coordtype 좌표타입
 * @param datacount CCTV 개수
 * @param
 */
data class ResponseCCTV(
    val coordtype: String,
    val datacount: Int,
    @SerializedName("data")
    val InfoCCTVList: List<InfoCCTV>
)
