package com.example.odev4.ui.sayfalar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun SayfaB(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Sayfa B hoşgeldiniz", color = Color.White)
        Button(
            onClick = {navController.navigate("sayfaY") },
            modifier=Modifier.background(Color.Yellow)
       ) {
            Text(text = "Sayfa Y git")
        }
    }
}