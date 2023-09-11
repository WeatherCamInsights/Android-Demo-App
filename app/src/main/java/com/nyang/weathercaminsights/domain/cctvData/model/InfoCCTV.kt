package com.nyang.weathercaminsights.domain.cctvData.model

/**
 * @param roadsectionid 도로 구간 ID
 * @param filecreatetime 파일 생성 시간(YYYYMMDDHH24MISS)
 * @param cctvtype CCTV 유형(1: 실시간 스트리밍(HLS) / 2: 동영상 파일 / 3: 정지 영상)
 * @param cctvurl CCTV 영상 주소
 * @param cctvresolution CCTV 해상도
 * @param coordx 경도 좌표
 * @param coordy 위도 좌표
 * @param cctvformat CCTV 형식
 * @param cctvname    CCTV 설치 장소명
 **/
data class InfoCCTV(
    val roadsectionid: String,
    val filecreatetime: String,
    val cctvtype: String,
    val cctvurl: String,
    val cctvresolution: String,
    val coordx: String,
    val coordy: String,
    val cctvformat: String,
    val cctvname: String
)