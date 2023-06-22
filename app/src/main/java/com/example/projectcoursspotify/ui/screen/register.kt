package com.example.projectcoursspotify.ui.screen

import androidx.compose.foundation.Image
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.projectcoursspotify.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun register(navController: NavHostController) {

    val _emailTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _mdpTextFieldValue = remember {
        mutableStateOf(TextFieldValue(""))
    }
    val _result = remember {
        mutableStateOf("")
    }
    val _resultColor = remember {
        mutableStateOf(Color.Green)
    }
    val firebaseAuth = Firebase.auth

    Scaffold() {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.spotify),
                contentDescription = "Logo Spotify",
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(250.dp)
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = "S'inscrire")
            Spacer(modifier = Modifier.padding(top = 10.dp))
            TextField(
                value = _emailTextFieldValue.value,
                onValueChange = {
                    _emailTextFieldValue.value = it;
                },
                //placeholder = { Text(text = "écris ici") },
                label = { Text(text = "Email") },
                singleLine = true,
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            TextField(
                value = _mdpTextFieldValue.value,
                onValueChange = {
                    _mdpTextFieldValue.value = it;
                },
                label = { Text(text = "Mot de passe") },
                singleLine = true,
            )
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Button(onClick = {
                _result.value = ""
                val emailValue = _emailTextFieldValue.value.text
                val mdpValue = _mdpTextFieldValue.value.text
                Log.i("createUser","a cliqué : $emailValue, $mdpValue")
                firebaseAuth.createUserWithEmailAndPassword(
                    emailValue,
                    mdpValue
                ).addOnCompleteListener{
                    if(it.isSuccessful){
                        Log.i("createUser:success","success")
                        _result.value = "Inscription réussie"
                        _resultColor.value = Color.Green
                        navController.navigate("login")
                    }
                    else{
                        it.exception?.message?.let { it1 -> Log.w("createUser:fail", it1) }
                        _result.value = "Inscription échouée"
                        _resultColor.value = Color.Red
                    }
                }
            }) {
                Text(text = "Enregistrer")
            }
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Text(text = _result.value, color = _resultColor.value)
            Spacer(modifier = Modifier.padding(top = 10.dp))
            Button(onClick = { navController.navigate("login") }, colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)) { Text(text = "J'ai déjà un compte") }
        }
    }
}