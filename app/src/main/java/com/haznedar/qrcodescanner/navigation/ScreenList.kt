package com.haznedar.qrcodescanner.navigation

const val ROOT_GRAPH_ROUTE = "root"
const val SPLASH_GRAPH_ROUTE = "splash"
const val HOME_GRAPH_ROUTE = "home"

sealed class ScreenList(
    val route: String
) {

    object SplashScreen : ScreenList("Splash_Screen")
    object QrCodeScannerScreen : ScreenList("Scanner_Screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

}