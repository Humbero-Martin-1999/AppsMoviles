package com.example.workclass.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.workclass.ui.components.TopBarComponent

@Composable
fun AccountsScreen(navController: NavController) {
    Column {
        TopBarComponent(title = "Accounts")
    }
}
