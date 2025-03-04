package com.example.workclass.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun ComponentsScreen(navController: NavHostController) {
    Buttons()


}

@Preview(showBackground = true)
@Composable
fun Buttons() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween

    ) {
        Button(onClick = {}) {
            Text("Filled Button")

        }
        FilledTonalButton(onClick = {}) {
            Text("Tonal Button")

        }
        OutlinedButton(onClick = {}) {
            Text("Outlined Button")

        }
        ElevatedButton(onClick = { }) {
            Text("Elevated Button")

        }
        TextButton(onClick = { }) {
            Text("Text Button")

        }

    }
}









