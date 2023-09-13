package com.nyang.weathercaminsights.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nyang.weathercaminsights.presentation.feature.map.MapScreen

@Composable
fun NavGraph(
    navController: NavHostController,
) {

    //val currentBackStack by navController.currentBackStackEntryAsState()
    //val currentDestination = currentBackStack?.destination

    NavHost(
        navController = navController,
        startDestination = Screens.Map.route
    )
    {
        composable(route = Screens.Map.route) {
            MapScreen()
        }
    }
}