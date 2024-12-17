package com.example.odev4.ui.sayfalar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SayfaGecisleri(){
    val navController= rememberNavController()
    
    //ilk açılacak sayfanın tanımlanması
    NavHost(navController = navController, startDestination = "anasayfa" ){
        composable("anasayfa"){
            Anasayfa(navController=navController)
        }

        composable("sayfaA"){
            SayfaA(navController = navController)
        }

        composable("sayfaB"){
            SayfaB(navController = navController)
        }

        composable("sayfaY"){
            SayfaY(navController = navController)
        }

        composable("sayfaX"){
            SayfaX(navController = navController)
        }
    }
}