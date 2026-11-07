package com.example.kopidannyemil.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kopidannyemil.data.DataSource
import com.example.kopidannyemil.data.Order
import com.example.kopidannyemil.ui.auth.LoginScreen
import com.example.kopidannyemil.ui.auth.RegisterScreen
import com.example.kopidannyemil.ui.auth.WelcomeScreen
import com.example.kopidannyemil.ui.checkout.AddressScreen
import com.example.kopidannyemil.ui.checkout.OrderConfirmationScreen
import com.example.kopidannyemil.ui.home.HomeScreen
import com.example.kopidannyemil.ui.profile.ProfileScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(
                onLoginClick = { navController.navigate("login") },
                onRegisterClick = { navController.navigate("register") }
            )
        }
        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("home") { popUpTo("welcome") { inclusive = true } } },
                onRegisterClick = { navController.navigate("register") }
            )
        }
        composable("register") {
            RegisterScreen(
                onRegisterSuccess = { navController.navigate("home") { popUpTo("welcome") { inclusive = true } } }
            )
        }
        composable("home") {
            HomeScreen(
                onItemClick = { item ->
                    DataSource.currentItem = item
                    navController.navigate("address")
                },
                onProfileClick = { navController.navigate("profile") }
            )
        }
        composable("address") {
            val selectedItem = DataSource.currentItem ?: DataSource.menuList[0]
            AddressScreen(
                selectedItem = selectedItem,
                onProceedToConfirmation = { address, note, paymentMethod ->
                    DataSource.currentAddress = address
                    DataSource.currentNote = note
                    DataSource.currentPaymentMethod = paymentMethod
                    navController.navigate("confirmation")
                }
            )
        }
        composable("confirmation") {
            val selectedItem = DataSource.currentItem ?: DataSource.menuList[0]
            OrderConfirmationScreen(
                selectedItem = selectedItem,
                address = DataSource.currentAddress,
                paymentMethod = DataSource.currentPaymentMethod,
                note = DataSource.currentNote,
                onFinishOrder = {
                    DataSource.orderHistory.add(
                        Order(
                            item = selectedItem,
                            address = DataSource.currentAddress,
                            paymentMethod = DataSource.currentPaymentMethod,
                            note = DataSource.currentNote
                        )
                    )
                    navController.navigate("home") { popUpTo("home") { inclusive = true } }
                }
            )
        }
        composable("profile") {
            ProfileScreen(
                onHomeClick = { navController.navigate("home") { popUpTo("home") { inclusive = true } } },
                onLogout = {
                    navController.navigate("welcome") { popUpTo("home") { inclusive = true } }
                }
            )
        }
    }
}