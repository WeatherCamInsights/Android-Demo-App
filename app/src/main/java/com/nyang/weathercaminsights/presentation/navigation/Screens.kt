package com.nyang.weathercaminsights.presentation.navigation

sealed class Screens(val route: String, val title: String = "") {
    object Launcher : Screens(route = "launcher", title = "런처")
    object Map : Screens(route = "map", title = "맵")
}