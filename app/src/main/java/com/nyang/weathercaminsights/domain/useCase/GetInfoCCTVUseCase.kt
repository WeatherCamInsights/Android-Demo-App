package com.nyang.weathercaminsights.domain.useCase

import com.nyang.weathercaminsights.domain.model.RequestCCTV
import com.nyang.weathercaminsights.domain.model.ResponseCCTV
import com.nyang.weathercaminsights.domain.model.ResponseInfoCCTV
import com.nyang.weathercaminsights.domain.repository.GetInfoCCTVRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetInfoCCTVUseCase @Inject constructor(
    private val repository: GetInfoCCTVRepository
) {
    /*operator fun invoke(requestCCTV: RequestCCTV): Flow<ResponseCCTV> = flow {
        emit(repository.getInfoCCTV(requestCCTV))
    }*/

    suspend operator fun invoke(requestCCTV: RequestCCTV): Flow<ResponseCCTV> = flow {
        emit(ResponseCCTV(ResponseInfoCCTV(dataCount = -1)))
        emit(repository.getInfoCCTV(requestCCTV))
    }

}