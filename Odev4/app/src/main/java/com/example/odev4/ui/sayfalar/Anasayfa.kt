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
fun Anasayfa(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Blue),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Anasayfaya hoşgeldininz")
        Button(
            onClick = { navController.navigate("sayfaA") },
            modifier = Modifier.background(Orange)
            )
        {
            Text(text = "Sayfa A git")
        }
        Button(
            onClick = { navController.navigate("sayfaX") },
            modifier = Modifier.background(Color.Gray)
        )
        {
            Text(text = "Sayfa X git")
        }
    }
}