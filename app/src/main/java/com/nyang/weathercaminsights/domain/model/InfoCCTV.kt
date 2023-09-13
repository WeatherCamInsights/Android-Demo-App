package com.nyang.weathercaminsights.domain.model

import com.google.gson.annotations.SerializedName

/**
 * @param roadSectionId 도로 구간 ID
 * @param fileCreateTime 파일 생성 시간(YYYYMMDDHH24MISS)
 * @param cctvType CCTV 유형(1: 실시간 스트리밍(HLS) / 2: 동영상 파일 / 3: 정지 영상)
 * @param cctvUrl CCTV 영상 주소
 * @param cctvResolution CCTV 해상도
 * @param coordX 경도 좌표
 * @param coordY 위도 좌표
 * @param cctvFormat CCTV 형식
 * @param cctvName    CCTV 설치 장소명
 **/
data class InfoCCTV(
    @SerializedName("roadsectionid")
    val roadSectionId: String? = "",
    @SerializedName("filecreatetime")
    val fileCreateTime: String? = "",
    @SerializedName("cctvtype")
    val cctvType: Int? = 0,
    @SerializedName("cctvurl")
    val cctvUrl: String? = "",
    @SerializedName("cctvresolution")
    val cctvResolution: String? = "",
    @SerializedName("coordX")
    val coordX: Double? = 0.0,
    @SerializedName("coordy")
    val coordY: Double? = 0.0,
    @SerializedName("cctvformat")
    val cctvFormat: String? = "",
    @SerializedName("cctvname")
    val cctvName: String? = ""
)