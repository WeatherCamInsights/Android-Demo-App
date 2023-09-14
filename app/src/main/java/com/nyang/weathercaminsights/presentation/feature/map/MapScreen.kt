package com.nyang.weathercaminsights.presentation.feature.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.NaverMap

@Composable
fun MapScreen(viewModel: MapViewModel = hiltViewModel()) {

    MapContent()
}

@OptIn(ExperimentalNaverMapApi::class)
@Composable
fun MapContent() {
    NaverMap(
        modifier = Modifier.fillMaxSize()
    )
}