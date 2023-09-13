package com.nyang.weathercaminsights.presentation.feature.map

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.nyang.weathercaminsights.domain.model.ResponseCCTV

@Composable
fun MapScreen(viewModel: MapViewModel = hiltViewModel()) {

    MapContent(viewModel.responseCCTV.value)
}

@Composable
fun MapContent(responseCCTV: ResponseCCTV) {
    Text(text = "${responseCCTV.response?.dataCount}")
}