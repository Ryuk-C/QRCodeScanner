package com.haznedar.qrcodescanner.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.haznedar.qrcodescanner.presentation.QrScannerPage

fun NavGraphBuilder.mainNavGraph(
    navController : NavController
){

    navigation(startDestination = ScreenList.QrCodeScannerScreen.route, HOME_GRAPH_ROUTE){

        composable(route = ScreenList.QrCodeScannerScreen.route){
            QrScannerPage(navController = navController)
        }

    }

}