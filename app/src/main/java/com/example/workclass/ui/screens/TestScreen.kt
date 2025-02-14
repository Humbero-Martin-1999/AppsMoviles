package com.example.workclass.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workclass.R
import androidx.compose.ui.Modifier

@Composable
fun TestScreen (navController: NavHostController){
    Column (
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize()
    ){
        Text("Test Screen")
        Button(
            onClick = {navController.navigate("main_menu")}
        ) {
            Text("Go to Main Menu")
        }
        Button(
            onClick = {navController.navigate("home_screen")}
        ) {
            Text("Go to Home Screen")
        }

    }
}







@Preview(showBackground = true)
@Composable
fun TextComposable(name: String = "Empty") {
    Text("Welcome")
    Text(name)
}

@Preview(showBackground = true)
@Composable
fun ModifierExampleOne() {
    Column(
        modifier = androidx.compose.ui.Modifier
            .padding(24.dp, 10.dp, 5.dp, 20.dp)

    ) {
        Text("My name is")
    }
}

@Preview(showBackground = true)
@Composable
fun ModifierExampleTwo() {
    Column(
        modifier = androidx.compose.ui.Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .clickable(onClick = {})
    ) {
        Text("My name is")
    }
}

fun clickAction(){
    println("column clicked")
}

@Preview(showBackground = true)
@Composable
fun ModifierExampleThree(){
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .background(Color.Cyan)
            .border(width = 2.dp, Color.Black)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        TextComposable("1.")
        TextComposable("2")
        TextComposable("3")
        TextComposable("4")
    }
}
@Preview(showBackground = true)
@Composable
fun ModifierExampleFour(){
    Box(
        modifier = androidx.compose.ui.Modifier
            .background(Color.Green)
            .padding(10.dp)
            .height(300.dp)
            .width(300.dp)
    ){
        Text("1", androidx.compose.ui.Modifier.align(Alignment.TopStart))
        Text("2", androidx.compose.ui.Modifier.align(Alignment.TopCenter))
        Text("3", androidx.compose.ui.Modifier.align(Alignment.TopEnd))
        Text("4", androidx.compose.ui.Modifier.align(Alignment.CenterStart))
        Text("5", androidx.compose.ui.Modifier.align(Alignment.Center))
        Text("6", androidx.compose.ui.Modifier.align(Alignment.CenterEnd))
        Text("7", androidx.compose.ui.Modifier.align(Alignment.BottomStart))
        Text("8", androidx.compose.ui.Modifier.align(Alignment.BottomCenter))
        Text("9", androidx.compose.ui.Modifier.align(Alignment.BottomEnd))

    }
}
@Preview(showBackground = true)
@Composable
fun CustomText(){
    Column() {
        Text(
            stringResource(R.string.sample_text),
            color = colorResource(R.color.teal_700),
            fontSize = 10.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Thin
        )
        val gradientColor = listOf(Color.Cyan, Color.Magenta, Color.Green)
        Text(
            stringResource(R.string.sample_text),
            style = TextStyle(Brush.linearGradient(colors = gradientColor))
        )
    }
}
@Preview(showBackground = true)
@Composable
fun Picture (){
    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .height(300.dp)
    ){
        Image(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth(),
            painter = painterResource(R.drawable.image),
            contentDescription = "Logo Outlast",
            contentScale = ContentScale.FillHeight
        )
    }
}