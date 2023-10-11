package com.github.sunnamaskar.UI

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.github.sunnamaskar.MainActivity
import com.github.sunnamaskar.Routes

@Composable
fun MyBottomAppBar(modifier: Modifier,navController: NavController) {
    Column(modifier = Modifier.fillMaxWidth()) {
        val index by rememberSaveable{ mutableStateOf(0) }

        BottomAppBar() {
            NavigationBarItem(selected = index == 0,
                onClick = { navController.navigate(Routes.HomeScreem.route) },
                icon =
                {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "home"
                    )
                },
                label = { Text(text = "Home") }
            )
            NavigationBarItem(selected = index == 1,
                onClick = { navController.navigate(Routes.PlayScreem.route)},
                icon =
                {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Play"
                    )
                },
                label = { Text(text = "Play") }
            )
            NavigationBarItem(selected = index == 2,
                onClick = { navController.navigate(Routes.PracticeScreem.route)},
                icon =
                {
                    Icon(
                        imageVector = Icons.Default.List,
                        contentDescription = "Practice"
                    )
                },
                label = { Text(text = "Practice") }
            )

        }
    }
}
