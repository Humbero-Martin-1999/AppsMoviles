package com.example.workclass.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.workclass.R

@Composable
fun UIParamountScreen(navController: NavHostController) {
    val scrollState = rememberScrollState()

    Scaffold(
        bottomBar = { BottomNavigationBar() }
    ) { innerPadding ->
        // BOX principal que contendrá la imagen de fondo y la
        // capa semitransparente un Box Dentro de otro Box
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // 1) Imagen de fondo
            Image(
                painter = painterResource(id = R.drawable.portada_nemo),
                contentDescription = "Fondo Finding Nemo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            // Fondo con opacidad
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    // Ajuste la opacidad del fondo
                    .background(Color.Black.copy(alpha = 0.890f))
            )


            // 3) Contenido principal en primer plano (Column con scroll)
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState),
                horizontalAlignment = Alignment.CenterHorizontally
            )


            {

                Spacer(modifier = Modifier.height(30.dp))

                // 4) Imagen principal
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 49.dp)
                        .clip(RoundedCornerShape(20.dp))

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.portada_nemo),
                        contentDescription = "Portada de Finding Nemo",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                // 5) Botón redondo de Play y texto "Reproducir"
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    FloatingActionButton(
                        onClick = { /* Acción para reproducir */ },
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ) {
                        Icon(
                            imageVector = Icons.Filled.PlayArrow,
                            contentDescription = "Reproducir"
                        )
                    }
                    Text(
                        text = "Reproducir",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // 6) Nombre de la película
                Text(
                    text = "Finding Nemo",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Composable local para mostrar texto dentro de un óvalo gris
                @Composable
                fun OvalText(text: String) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .background(color = Color.Gray, shape = RoundedCornerShape(50))
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(text = text, color = Color.White, fontSize = 14.sp)
                    }
                }

                // 7) Año, duración y clasificación en óvalos grises
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    OvalText(text = "2003")
                    Spacer(modifier = Modifier.width(8.dp))
                    OvalText(text = "1h 40m")
                    Spacer(modifier = Modifier.width(8.dp))
                    OvalText(text = "A")
                }

                Spacer(modifier = Modifier.height(16.dp))

                // 8) Texto verde: "Disponible Ahora"
                Text(
                    text = "Disponible Ahora",
                    color = Color(0xFF00FF00),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(24.dp))

                // 9) Fila de botones: Mi lista, Descargar, Compartir, Notificar
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    BotonAccion(
                        icon = Icons.Filled.Add,
                        text = "Mi lista",
                        onClick = { /* Acción Mi lista */ }
                    )
                    BotonAccion(
                        icon = Icons.Filled.ArrowDropDown,
                        text = "Descargar",
                        onClick = { /* Acción Descargar */ }
                    )
                    BotonAccion(
                        icon = Icons.Filled.Share,
                        text = "Compartir",
                        onClick = { /* Acción Compartir */ }
                    )
                    BotonAccion(
                        icon = Icons.Filled.Notifications,
                        text = "Notificar",
                        onClick = { /* Acción Notificar */ }
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))





            }
        }
    }
}

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.Black,
        modifier = Modifier.fillMaxWidth()
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Inicio",
                    tint = Color.White
                )
            },
            label = { Text(text = "Inicio", color = Color.White) },
            selected = true,
            onClick = { /* Acción Inicio */ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Buscar",
                    tint = Color.White
                )
            },
            label = { Text(text = "Buscar", color = Color.White) },
            selected = false,
            onClick = { /* Acción Buscar */ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Filled.AddCircle,
                    contentDescription = "Mi lista",
                    tint = Color.White
                )
            },
            label = { Text(text = "Mi lista", color = Color.White) },
            selected = false,
            onClick = { /* Acción Mi lista */ }
        )
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Filled.Menu,
                    contentDescription = "Más",
                    tint = Color.White
                )
            },
            label = { Text(text = "Más", color = Color.White) },
            selected = false,
            onClick = { /* Acción Más */ }
        )
    }
}

@Composable
fun BotonAccion(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String,
    onClick: () -> Unit
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        IconButton(
            onClick = onClick,
            modifier = Modifier.size(48.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = Color.White
            )
        }
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp
        )
    }
}
@Composable
fun MiAplicacioniParamount() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Pantalla MiAplicacioniParamount",
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
//hola

