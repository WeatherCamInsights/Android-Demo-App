package com.nyang.weathercaminsights.presentation.feature.map

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.naver.maps.geometry.LatLng
import com.naver.maps.map.compose.ExperimentalNaverMapApi
import com.naver.maps.map.compose.LocationTrackingMode
import com.naver.maps.map.compose.MapProperties
import com.naver.maps.map.compose.MapUiSettings
import com.naver.maps.map.compose.Marker
import com.naver.maps.map.compose.MarkerState
import com.naver.maps.map.compose.NaverMap
import com.naver.maps.map.compose.rememberFusedLocationSource
import com.nyang.weathercaminsights.domain.model.ResponseInfoCCTV

@Composable
fun MapScreen(viewModel: MapViewModel = hiltViewModel()) {

    MapContent(viewModel.responseInfoCCTV.value)
}

@OptIn(ExperimentalNaverMapApi::class)
@Composable
fun MapContent(responseInfoCCTV: ResponseInfoCCTV) {

    Box {
        NaverMap(
            locationSource = rememberFusedLocationSource(),
            properties = MapProperties(
                locationTrackingMode = LocationTrackingMode.Follow,
            ),
            uiSettings = MapUiSettings(
                isLocationButtonEnabled = true,
            ),
            modifier = Modifier.fillMaxSize()
        ) {
            /*for (cctv in responseInfoCCTV.infoCCTVList ?: emptyList()) {
                MapMarker(cctv.coordY, cctv.coordX, cctv.cctvName ?: "")
            }*/

        }

    }


}

@OptIn(ExperimentalNaverMapApi::class)
@Composable
fun MapMarker(latitude: Double?, longitude: Double?, localName: String) {
    if (latitude == null || longitude == null) return
    Marker(
        state = MarkerState(position = LatLng(latitude, longitude)),
        captionText = localName
    )
}