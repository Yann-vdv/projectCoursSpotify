package com.example.projectcoursspotify.ui.screen

import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.projectcoursspotify.R
import com.example.projectcoursspotify.ui.theme.ProjectCoursSpotifyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Library() {
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.padding(8.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp)) {
                Chip(text = "Artistes", onClick = {})
                /*Spacer(modifier = Modifier.width(12.dp))
                Chip(text = "musiques", onClick = {})
                Spacer(modifier = Modifier.width(12.dp))
                Chip(text = "clips", onClick = {})*/
            }
            Spacer(modifier = Modifier.padding(12.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp), horizontalArrangement = Arrangement.SpaceBetween) {
                Row() {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_order),
                        contentDescription = "ordre",
                        tint = Color.White
                    )
                    Text(text = "Récents", color = Color.White, modifier = Modifier.padding(start = 5.dp))
                }
                Icon(
                    painter = painterResource(id = R.drawable.ic_display_block),
                    contentDescription = "affichage",
                    tint = Color.White
                )
            }
            Spacer(modifier = Modifier.padding(8.dp))
            Column(modifier = Modifier.fillMaxSize()) {
                Card(
                    onClick = {},
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row() {
                        AsyncImage(
                            modifier = Modifier
                                .height(50.dp)
                                .clip(CircleShape),
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://yt3.googleusercontent.com/ZVRLcVugHPiEZYOwC-uYPnIK2z32yl75HlMdOCPgC6kq5jdYDG-2wboc57JEDT4V-8as2olanu8=s900-c-k-c0x00ffffff-no-rj")
                                .build(),
                            contentDescription = ""
                        )
                        Column(modifier = Modifier.padding(start = 5.dp)) {
                            Text(text = "Daft Punk", color = Color.White)
                            Text(text = "Artiste", color = Color.LightGray)
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(12.dp))
                Card(
                    onClick = {},
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row() {
                        AsyncImage(
                            modifier = Modifier
                                .height(50.dp)
                                .clip(CircleShape),
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://e-cdn-images.dzcdn.net/images/artist/a648871eca6611fcf67fa5d55546d3dc/264x264-000000-80-0-0.jpg")
                                .build(),
                            contentDescription = ""
                        )
                        Column(modifier = Modifier.padding(start = 5.dp)) {
                            Text(text = "Indochine", color = Color.White)
                            Text(text = "Artiste", color = Color.LightGray)
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(12.dp))
                Card(
                    onClick = {},
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row() {
                        AsyncImage(
                            modifier = Modifier
                                .height(50.dp)
                                .clip(CircleShape),
                            model = ImageRequest.Builder(LocalContext.current)
                                .data("https://i.scdn.co/image/ab6761610000e5eb920dc1f617550de8388f368e")
                                .build(),
                            contentDescription = ""
                        )
                        Column(modifier = Modifier.padding(start = 5.dp)) {
                            Text(text = "Imagine Dragons", color = Color.White)
                            Text(text = "Artiste", color = Color.LightGray)
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(12.dp))
                Card(
                    onClick = {},
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_add),
                            contentDescription = "add1",
                            tint = Color.LightGray,
                            modifier = Modifier
                                .padding(16.dp)
                                .drawBehind {
                                    drawCircle(
                                        color = Color.DarkGray,
                                        radius = this.size.maxDimension
                                    )
                                },
                        )
                        Text(text = "Ajouter des artistes", color = Color.White)
                    }
                }
                Spacer(modifier = Modifier.padding(12.dp))
                Card(
                    onClick = {},
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(start = 2.dp)
                    ) {
                        Box(
                            modifier = Modifier.background(Color.DarkGray),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_add),
                                contentDescription = "add2",
                                tint = Color.LightGray,
                                modifier = Modifier.padding(10.dp)
                            )
                        }
                        Text(
                            text = "Ajouter des podcasts et des émissions",
                            color = Color.White,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                }
            }
        }
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