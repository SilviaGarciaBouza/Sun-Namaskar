package com.github.sunnamaskar.UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.github.sunnamaskar.R
@ExperimentalMaterial3Api
@Composable
fun HomeScreem(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyTopAppBar(modifier = Modifier.weight(1f), navController, false )
        Box(modifier = Modifier.weight(4f)) {
            Image(
                painterResource(id = R.drawable.sol),
                contentDescription = "Sun",
                modifier = Modifier.height(400.dp)
            )
            Box(
                modifier = Modifier
                    .height(200.dp)
                    .verticalScroll(rememberScrollState()), contentAlignment = Alignment.Center
            ) {
                Text(text = "El saludo al sol BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA BLABLABLABLABLA")
            }
        }
        MyBottomAppBar(modifier = Modifier.weight(1f), navController)
    }


}
