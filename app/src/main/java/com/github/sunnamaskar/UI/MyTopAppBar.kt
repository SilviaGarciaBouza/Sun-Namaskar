package com.github.sunnamaskar.UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyTopAppBar(modifier: Modifier) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.LightGray)
        .padding(12.dp), Alignment.Center){
        Text(text = "Saludos Al Sol")
    }
}