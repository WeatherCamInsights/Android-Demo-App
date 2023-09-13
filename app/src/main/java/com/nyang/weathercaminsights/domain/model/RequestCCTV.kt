package com.nyang.weathercaminsights.domain.model

import com.nyang.weathercaminsights.BuildConfig


/**
 * cctv 요청 전문 data input
 *
 * @param apiKey 공개키
 * @param type 도로 유형(ex: 고속도로 / its: 국도)
 * @param cctvType CCTV 유형(1: 실시간 스트리밍(HLS) / 2: 동영상 파일 / 3: 정지 영상)
 * @param minX 최소 경도 영역
 * @param maxX 최대 경도 영역
 * @param minY 최소 위도 영역
 * @param maxY 최대 위도 영역
 * @param getType 출력 결과 형식(xml, json / 기본: json)
 *
 */

data class RequestCCTV(
    val apiKey: String = BuildConfig.GET_INFO_CCTV_API_KEY,
    val type: String = "ex",
    val cctvType: String = "1",
    val minX: Double = 127.100000,
    val maxX: Double = 128.890000,
    val minY: Double = 34.100000,
    val maxY: Double = 39.100000,
    val getType: String = "json"
)