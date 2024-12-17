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
import com.example.odev4.ui.theme.Orange

@Composable
fun SayfaA(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Orange),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Sayfa A ya hoşgeldiniz")
        Button(
            onClick = { navController.navigate("sayfaB") },
            modifier = Modifier.background(Color.Black)
        )
        {
            Text(text = "Sayfa B ' ye git")
        }
    }
}