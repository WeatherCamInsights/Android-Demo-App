package com.nyang.weathercaminsights.domain.repository

import com.nyang.weathercaminsights.domain.model.RequestCCTV
import com.nyang.weathercaminsights.domain.model.ResponseCCTV

interface GetInfoCCTVRepository {
    suspend fun getInfoCCTV(requestCCTV: RequestCCTV): ResponseCCTV
}