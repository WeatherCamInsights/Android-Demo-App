package com.nyang.weathercaminsights.presentation.feature.map

import android.app.Application
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import com.nyang.weathercaminsights.domain.model.RequestCCTV
import com.nyang.weathercaminsights.domain.model.ResponseCCTV
import com.nyang.weathercaminsights.domain.useCase.GetInfoCCTVUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    private val getInfoCCTVUseCase: GetInfoCCTVUseCase,
    application: Application,
) : AndroidViewModel(application) {

    val responseCCTV = mutableStateOf(ResponseCCTV())


    suspend fun getInfoCCTV() {
        val requestCCTV = RequestCCTV()
        getInfoCCTVUseCase(requestCCTV).collect {
            responseCCTV.value = it
        }
    }
}