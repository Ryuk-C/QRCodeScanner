package com.haznedar.qrcodescanner.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.haznedar.qrcodescanner.presentation.SplashPage

fun NavGraphBuilder.splashNavGraph(
    navController: NavController
){

    navigation(startDestination = ScreenList.SplashScreen.route, SPLASH_GRAPH_ROUTE){

        composable(route = ScreenList.SplashScreen.route){
            SplashPage(navController = navController)
        }

    }

}