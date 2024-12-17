package com.example.odev4.ui.sayfalar

import androidx.compose.foundation.background
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
fun SayfaX(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sayfa X hoşgeldiniz!!")
        Button(
            onClick = {navController.navigate("sayfaY") },
            modifier = Modifier.background(Color.Yellow)
        )
        {
            Text(text = "Sayfa Y git")
        }
    }
}