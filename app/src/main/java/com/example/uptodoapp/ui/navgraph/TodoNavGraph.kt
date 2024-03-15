package com.example.uptodoapp.ui.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uptodoapp.ui.onboarding.OnBoardingScreen
import com.example.uptodoapp.ui.onboarding.SplashScreen
import com.example.uptodoapp.ui.screens.LoginScreen
import com.example.uptodoapp.ui.screens.WelcomeScreen


@Composable
fun TodoNavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.SPLASH_SCREEN) {

        composable(Routes.SPLASH_SCREEN) {
            SplashScreen(navController)
        }

        composable(Routes.ON_BOARDING_SCREEN) {
            OnBoardingScreen(navController)
        }

        composable(Routes.WELCOME_SCREEN) {
            WelcomeScreen(navController)
        }

        composable(Routes.LOGIN_SCREEN) {
            LoginScreen(navController)
        }

    }
}