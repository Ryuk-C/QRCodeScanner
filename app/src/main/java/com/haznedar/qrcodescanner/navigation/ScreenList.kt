package com.haznedar.qrcodescanner.navigation

const val ROOT_GRAPH_ROUTE = "root"
const val SPLASH_GRAPH_ROUTE = "splash"
const val HOME_GRAPH_ROUTE = "home"

sealed class ScreenList(
    val route: String,
    val title: String? = null,
    val icon: Int? = null
) {

    object SplashScreen : ScreenList("Splash_Screen")
    object MainScreen : ScreenList("Main_Screen")
    object QrCodeScannerScreen : ScreenList("Scanner_Screen")
    object SettingsScreen : ScreenList("Settings_Screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

}