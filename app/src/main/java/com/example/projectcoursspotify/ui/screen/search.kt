package com.example.projectcoursspotify.ui.screen

import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
fun search() {

    val _searchTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())) {
        TextField(
            value = _searchTextFieldValue.value,
            onValueChange = {
                _searchTextFieldValue.value = it;
            },
            shape = RoundedCornerShape(7.dp),
            placeholder = { Text(text = "Que souhaitez-vous écouter ?") },
            //label = { Text(text = "") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "search",
                    tint = Color.Black
                )
            }
        )
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Parcourir tout", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(horizontal = 12.dp))
        Spacer(modifier = Modifier.padding(8.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Red)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Podcasts", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Cyan)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Evénements live", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Blue)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Conçu spécialement pour vous", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Yellow)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Dernières sorties", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Magenta)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Hip-Hop", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Green)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Pop", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
        }
        Spacer(modifier = Modifier.padding(12.dp))
        Row(modifier = Modifier
            .padding(horizontal = 12.dp)
            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Blue)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Variété Française", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
                }
            }
            Card(onClick = {},
                colors = CardDefaults.cardColors(containerColor = Color.Gray)) {
                Row(modifier = Modifier.height(100.dp).width(165.dp).padding(horizontal = 4.dp, vertical = 1.dp)) {
                    Text(text = "Eté", color = Color.White, modifier = Modifier.padding(top = 6.dp, start = 2.dp).weight(1f), fontWeight = FontWeight.Bold)
                    AsyncImage(
                        modifier = Modifier.height(70.dp).graphicsLayer { rotationZ = 30f }.offset(x = 30.dp, y = 25.dp),
                        model = ImageRequest.Builder(LocalContext.current)
                            .data("https://images.radio-canada.ca/q_auto,w_400/v1/ici-musique/1x1/pochette-joseph-carre-magique.png")
                            .build(),
                        contentDescription = ""
                    )
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