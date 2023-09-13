package com.nyang.weathercaminsights.domain.model

import com.google.gson.annotations.SerializedName

/**
 * @param coordType 좌표타입
 * @param dataCount CCTV 개수
 * @param infoCCTVList 조회된 CCTV 정보 리스트
 */
data class ResponseCCTV(
    val response: ResponseInfoCCTV? = ResponseInfoCCTV()
)

data class ResponseInfoCCTV(
    @SerializedName("coordtype")
    val coordType: Int? = 0,
    @SerializedName("data")
    val infoCCTVList: List<InfoCCTV>? = emptyList(),
    @SerializedName("datacount")
    val dataCount: Int? = 0,
)




