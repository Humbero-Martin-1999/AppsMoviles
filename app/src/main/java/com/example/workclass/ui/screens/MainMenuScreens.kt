package com.example.workclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun MainMenuScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
    ) {
        Text("main menu")
        Button(
            onClick = { navController.navigate("home_screen") }
        ) {
            Text("Go to Home Screen")

        }
        Button(
            onClick = { navController.navigate("test_screen") }
        ) {
            Text("Go to test Screen")

        }

        Button(
            onClick = { navController.navigate("MiAplicacioniParamount") }
        ) {
            Text("Go to Paramount Screen")

        }

    }
}