package com.example.projectcoursspotify.ui.screen

import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.projectcoursspotify.R
import com.example.projectcoursspotify.ui.theme.ProjectCoursSpotifyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun home() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Spacer(modifier = Modifier.padding(12.dp))
        Text(text = "Essayer autre chose", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 12.dp))
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .horizontalScroll(rememberScrollState())) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 1", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 2", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 3", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 4", color = Color.LightGray)
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text(text = "Artistes que vous aimez", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 12.dp))
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .horizontalScroll(rememberScrollState())) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 1", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 2", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 3", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 4", color = Color.LightGray)
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Text(text = "Conçu pour vous", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 12.dp))
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .horizontalScroll(rememberScrollState())) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 1", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 2", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 3", color = Color.LightGray)
                }
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0.dp)) {
                Column() {
                    AsyncImage(
                        modifier = Modifier.height(150.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Text(text = "musique 4", color = Color.LightGray)
                }
            }
        }
        Spacer(modifier = Modifier.padding(8.dp))
        Card(
            onClick = {},
            colors = CardDefaults.cardColors(containerColor = Color.Magenta),
            modifier = Modifier.padding(horizontal = 5.dp)
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Row() {
                    AsyncImage(
                        modifier = Modifier.height(50.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier.padding(6.dp))
                    Column() {
                        Text(text = "L'aventurier", color = Color.White, fontWeight = FontWeight.SemiBold)
                        Text(text = "Indochine", color = Color.LightGray)
                    }
                }
                Row(modifier = Modifier.padding(vertical = 5.dp)) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_platform_white),
                        contentDescription = " ",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_fav_white),
                        contentDescription = " ",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.padding(1.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_play_white),
                        contentDescription = " ",
                        modifier = Modifier.size(40.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Composable
fun Chip(text: String, onClick: () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.clickable(onClick = onClick),
        colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
    ) {
        Text(text = text, modifier = Modifier.padding(horizontal = 15.dp, vertical = 4.dp), color = Color.White)
    }
}