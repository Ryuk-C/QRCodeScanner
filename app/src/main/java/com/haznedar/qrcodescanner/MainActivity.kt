package com.haznedar.qrcodescanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.haznedar.qrcodescanner.navigation.SetupNavGraph
import com.haznedar.qrcodescanner.presentation.SplashPage
import com.haznedar.qrcodescanner.ui.theme.QRCodeScannerTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @ExperimentalAnimationApi
    @ExperimentalComposeUiApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QRCodeScannerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    navController = rememberNavController()
                    SetupNavGraph(navController = navController)
                }
            }
        }
    }
}