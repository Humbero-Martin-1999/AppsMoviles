package com.example.workclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.rememberNestedScrollInteropConnection
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.Style
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.workclass.ui.screens.HomeScreen
import com.example.workclass.ui.screens.MainMenuScreen
import com.example.workclass.ui.screens.TestScreen
import com.example.workclass.ui.theme.WorkClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            WorkClassTheme {
                ComposeMultiScreenApp()
                //  Column(){
                //    Column() {
                //      TextComposable("Marco")
                //    TextComposable()
                //  TextComposable()
                //TextComposable()
                //}
                //Row() {
                //  TextComposable()
                //TextComposable()
                // TextComposable()
                //TextComposable()
                //}
                //Column {
                //  ModifierExampleTwo()
                // ModifierExampleFour()
                // CustomText()
                //}
                //  }

                /*
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }

                 */
            }
        }
    }

    private fun column(function: () -> Unit) {

    }



    @Composable
    fun ComposeMultiScreenApp(){
        val navController = rememberNavController()
        SetupNavGraph(navController = navController)
    }
    @Composable
    fun SetupNavGraph(navController: NavHostController){
        NavHost(navController = navController, startDestination = "main_menu"){
            composable("main_menu"){ MainMenuScreen(navController)}
            composable("home_screen"){ HomeScreen(navController)}
            composable("test_screen"){ TestScreen(navController)}

            }
        }


}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LittleProjectAndroidTheme {
        Greeting("Android")
    }
}*/