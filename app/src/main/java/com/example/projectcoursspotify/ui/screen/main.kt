package com.example.projectcoursspotify.ui.screen

import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.projectcoursspotify.R
import com.example.projectcoursspotify.ui.theme.ProjectCoursSpotifyTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main() {
    val navController = rememberNavController();
    val currentScreen = remember {
        mutableStateOf(TextFieldValue("home"))
    }
    val firebaseAuth = Firebase.auth
    Scaffold(
        containerColor = Color.Black,
        topBar = {
            if (currentScreen.value.text == "search") {
                TopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black),
                    title = { Text(text = "Rechercher", color = Color.White, fontWeight = FontWeight.Bold) },
                    actions = {
                        Row() {
                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_camera_white),
                                    contentDescription = " ",
                                    tint = Color.White
                                )
                            }
                        }
                    }
                )
            } 
            else if (currentScreen.value.text == "home") {
                TopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black),
                    title = { Text(text = "Bonjour", color = Color.White, fontWeight = FontWeight.Bold) },
                    actions = {
                        Row() {
                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_notif),
                                    contentDescription = " ",
                                    tint = Color.White
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_time),
                                    contentDescription = " ",
                                    tint = Color.White
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_setting),
                                    contentDescription = " ",
                                    tint = Color.White
                                )
                            }
                        }
                    }
                )
            }
            else if (currentScreen.value.text == "library") {
                TopAppBar(
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black),
                    navigationIcon = {
                        firebaseAuth.currentUser?.email?.get(0).toString().uppercase().let {
                            Text(
                                modifier = Modifier
                                    .padding(16.dp)
                                    .drawBehind {
                                        drawCircle(
                                            color = Color.Yellow,
                                            radius = this.size.maxDimension
                                        )
                                    },
                                text = it,
                            )
                        }
                    },
                    title = { Text(text = "Bibliothèque", color = Color.White, fontWeight = FontWeight.Bold) },
                    actions = {
                        Row() {
                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_search),
                                    contentDescription = " ",
                                    tint = Color.White
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_add),
                                    contentDescription = " ",
                                    tint = Color.White
                                )
                            }
                        }
                    }
                )
            }
        },
        bottomBar = {
            NavigationBar(
                containerColor = Color.Black
            ) {
                NavigationBarItem(
                    selected = true,
                    onClick = { navController.navigate("home"); currentScreen.value = TextFieldValue("home") },
                    label = { Text(text = "Accueil", color = if (currentScreen.value.text == "home") { Color.White } else Color.Gray) },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_home),
                            contentDescription = "Accueil",
                            tint = if (currentScreen.value.text == "home") { Color.White } else Color.Gray
                        )
                    },
                    colors = androidx.compose.material3.NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.White,
                        indicatorColor = Color.Transparent
                    )
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("search"); currentScreen.value = TextFieldValue("search") },
                    label = { Text(text = "Rechercher", color = if (currentScreen.value.text == "search") { Color.White } else Color.Gray) },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search),
                            contentDescription = "Rechercher",
                            tint = if (currentScreen.value.text == "search") { Color.White } else Color.Gray
                        )
                    }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("library"); currentScreen.value = TextFieldValue("library") },
                    label = { Text(text = "Bibliothèque", color = if (currentScreen.value.text == "library") { Color.White } else Color.Gray) },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_music_library),
                            contentDescription = "Bibliothèque",
                            tint = if (currentScreen.value.text == "library") { Color.White } else Color.Gray
                        )
                    }
                )
                /*NavigationBarItem(
                    selected = false,
                    onClick = { },
                    label = { Text(text = "Prenium", color = Color.Gray) },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_spotify),
                            contentDescription = "Prenium",
                            tint = Color.Gray
                        )
                    }
                )*/
            }
        }
    ) {
        NavHost(modifier= Modifier.padding(it), navController = navController, startDestination = "home") {
            composable("home") {
                home()
            }
            composable("search") {
                search()
            }
            composable("library") {
                Library()
            }
        }
    }
}