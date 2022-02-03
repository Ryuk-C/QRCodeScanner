package com.haznedar.qrcodescanner.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.*
import com.haznedar.qrcodescanner.R
import com.haznedar.qrcodescanner.navigation.HOME_GRAPH_ROUTE
import com.haznedar.qrcodescanner.ui.theme.RedVisne
import kotlinx.coroutines.delay

@Composable
fun SplashPage(
    navController: NavController
){

    LaunchedEffect(key1 = Unit){
        delay(3000)
        navController.navigate(HOME_GRAPH_ROUTE)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {

        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier.weight(10f)) {
            LoadingAnimation(3.5f)

        }

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(70f)) {
            WelcomeLogo()
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.weight(20f)) {

            HaznedarText()

        }

    }
}

@Composable
fun LoadingAnimation(speed: Float) {

    val compositionLoading by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.anim_loading))
    val progressLoading by animateLottieCompositionAsState(
        composition = compositionLoading,
        isPlaying = true,
        speed = speed,
        restartOnPlay = true,
        iterations = LottieConstants.IterateForever
    )

    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier.padding(top = 1.dp)
    ) {

        LottieAnimation(
            composition = compositionLoading,
            progress = progressLoading,
            modifier = Modifier.size(45.dp)
        )
    }
}

@Composable
fun WelcomeLogo() {

    val compositionLoading by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.anim_splash))
    val progressLoading by animateLottieCompositionAsState(
        composition = compositionLoading,
        isPlaying = true,
        speed = 1.5f,
        restartOnPlay = true,
        iterations = LottieConstants.IterateForever
    )

    Row(
        verticalAlignment = Alignment.Top,
        modifier = Modifier.padding(top = 1.dp)
    ) {

        LottieAnimation(
            composition = compositionLoading,
            progress = progressLoading
        )
    }

}


@Composable
fun HaznedarText() {

    val customFont = Font(R.font.phantasm)

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(bottom = 5.dp)
    ) {

        Text(
            text = "HAZNEDAR",
            color = RedVisne,
            fontFamily = FontFamily(customFont),
            fontSize = 28.sp
        )
    }
}