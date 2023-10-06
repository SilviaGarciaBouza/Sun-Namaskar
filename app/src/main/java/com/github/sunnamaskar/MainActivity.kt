package com.github.sunnamaskar

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.sunnamaskar.UI.ItemPracticeScreem
import com.github.sunnamaskar.UI.PacticeScreem
import com.github.sunnamaskar.ui.theme.SunNamaskarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunNamaskarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyScaffold()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SunNamaskarTheme {
        Greeting("Android")
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyScaffold() {
    Scaffold (topBar = {MyTopBar()}  ,
        content = {PacticeScreem({})},
        bottomBar ={ MyBottonNavigation()} )


}




@Composable
fun MyTopBar() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.LightGray)
        .padding(12.dp), Alignment.Center){
        Text(text = "Saludos Al Sol")}
}


@Composable
fun MyBottonNavigation() {
    var index  by remember { mutableStateOf(0) }
    BottomAppBar() {
        NavigationBarItem(selected =index == 0,
            onClick = { index == 0 },
            icon =
            {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "home"
                )
            }
            ,
            label = {Text(text = "Home")}
        )
        NavigationBarItem(selected =index == 1,
            onClick = { index == 1 },
            icon =
            {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play"
                )
            }
            ,
            label = {Text(text = "Play")}
        )
        NavigationBarItem(selected =index == 2,
            onClick = { index == 2 },
            icon =
            {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Practice"
                )
            }
            ,
            label = {Text(text = "Practice")}
        )


    }




}
