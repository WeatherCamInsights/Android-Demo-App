package com.nyang.weathercaminsights.presentation.feature.map

import android.app.Application
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.nyang.weathercaminsights.domain.model.RequestCCTV
import com.nyang.weathercaminsights.domain.model.ResponseInfoCCTV
import com.nyang.weathercaminsights.domain.useCase.GetInfoCCTVUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    private val getInfoCCTVUseCase: GetInfoCCTVUseCase,
    application: Application,
) : AndroidViewModel(application) {

    val responseInfoCCTV = mutableStateOf(ResponseInfoCCTV())

    init {
        viewModelScope.launch {
            getInfoCCTV()
        }
    }

    private suspend fun getInfoCCTV() {
        val requestCCTV = RequestCCTV()
        getInfoCCTVUseCase(requestCCTV).collect {
            responseInfoCCTV.value = it.response ?: ResponseInfoCCTV()
        }
    }
}