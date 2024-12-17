package com.example.odev4.ui.sayfalar

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun SayfaY(navController: NavController){
    BackHandler {
        navController.popBackStack(route = "anasayfa", inclusive = false)
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
       Text(text = "Sayfa Y ye hoşgeldiniz")
    }
}