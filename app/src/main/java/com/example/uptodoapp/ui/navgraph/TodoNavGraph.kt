package com.example.uptodoapp.ui.navgraph

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.uptodoapp.R
import com.example.uptodoapp.ui.components.AppBottomBar
import com.example.uptodoapp.ui.components.AppTopBar
import com.example.uptodoapp.ui.onboarding.OnBoardingScreen
import com.example.uptodoapp.ui.onboarding.SplashScreen
import com.example.uptodoapp.ui.screens.CalenderScreen
import com.example.uptodoapp.ui.screens.FocusScreen
import com.example.uptodoapp.ui.screens.IndexScreen
import com.example.uptodoapp.ui.screens.LoginScreen
import com.example.uptodoapp.ui.screens.ProfileScreen
import com.example.uptodoapp.ui.screens.RegistrationScreen
import com.example.uptodoapp.ui.screens.WelcomeScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoNavGraph() {

    val navController = rememberNavController()
    var selected by remember {
        mutableIntStateOf(R.drawable.home)
    }
    var showNavigationBars by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            AppTopBar { showNavigationBars }
        },

        bottomBar = {
            AppBottomBar(
                visibilityProvider = { showNavigationBars },
                selectedIconProvider = { R.drawable.home },
                onBottomBarItemClicked = { route ->
                    when (route) {
                        Routes.INDEX -> {
                            selected = R.drawable.home
                            navController.navigate(Routes.INDEX) {
                                popUpTo(0)
                            }
                        }

                        Routes.CALENDER -> {
                            selected = R.drawable.calendar
                            navController.navigate(Routes.CALENDER) {
                                popUpTo(0)
                            }
                        }

                        Routes.FOCUS -> {
                            selected = R.drawable.clock
                            navController.navigate(Routes.FOCUS) {
                                popUpTo(0)
                            }
                        }

                        Routes.PROFILE -> {
                            selected = R.drawable.user
                            navController.navigate(Routes.PROFILE) {
                                popUpTo(0)
                            }
                        }
                    }
                })
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Routes.SPLASH_SCREEN,
            modifier = Modifier.padding(it)
        ) {
            composable(Routes.SPLASH_SCREEN) {
                showNavigationBars = false
                SplashScreen(navController)
            }

            composable(Routes.ON_BOARDING_SCREEN) {
                showNavigationBars = false
                OnBoardingScreen(navController)
            }

            composable(Routes.WELCOME_SCREEN) {
                showNavigationBars = false
                WelcomeScreen(navController)
            }

            composable(Routes.LOGIN_SCREEN) {
                showNavigationBars = false
                LoginScreen(navController, onLoginClicked = {
                    navController.navigate(Routes.INDEX) {
                        popUpTo(0)
                    }
                })
            }

            composable(Routes.REGISTRATION_SCREEN) {
                showNavigationBars = false
                RegistrationScreen(navController)
            }

            composable(Routes.INDEX) {
                showNavigationBars = true
                IndexScreen()
            }

            composable(Routes.CALENDER) {
                showNavigationBars = true
                CalenderScreen()
            }

            composable(Routes.FOCUS) {
                showNavigationBars = true
                FocusScreen()
            }

            composable(Routes.PROFILE) {
                showNavigationBars = true
                ProfileScreen()
            }
        }
    }
}