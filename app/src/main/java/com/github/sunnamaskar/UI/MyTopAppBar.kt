package com.github.sunnamaskar.UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/*
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(modifier: Modifier) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.LightGray)
        .padding(12.dp), Alignment.Center){
        Text(text = "Saludos Al Sol")
    }

}
*/
@ExperimentalMaterial3Api
@Composable
fun MyTopAppBar(modifier: Modifier, navController: NavController, isVisible: Boolean) {


    TopAppBar(
        title = { Text(text = "Ricky And Morty Characteres") },
        modifier = Modifier.fillMaxWidth(),
        //backgroundColor = Color.DarkGray,
        // contentColor = Color.White,
        // elevation = 4.dp,
        //a la izda:
        navigationIcon = {
            if (isVisible) {
                IconButton(onClick = { navController.navigate("Screem1") }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")

                }
            }

        }
    )
}