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
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.github.sunnamaskar.UI.HomeScreem
import com.github.sunnamaskar.UI.ItemPracticeScreem
import com.github.sunnamaskar.UI.PacticeScreem
import com.github.sunnamaskar.UI.PlayScreem
import com.github.sunnamaskar.UI.ItemPracticeScreem

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
        content = { NavigateToScreems()},
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
            onClick = {index==0 },
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
            onClick = {index==1 },
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
            onClick = {index==2 },
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





//Pro Navigation1: Crea cada objeto es una pantalla
sealed class Routes(val route: String){
    object PracticeScreem: Routes("Screem1")
    object ItemPracticeScreem: Routes("Screem2?imagename={imagename}") {
        fun createRoute(imagename: Int) = "Screem2?imagename=$imagename"
    }
    object HomeScreem: Routes("Screem3")
    object PlayScreem: Routes("Screem4")


}




@Composable
fun NavigateToScreems() {
    val navigationController = rememberNavController()
    NavHost(navController = navigationController, startDestination = Routes.PracticeScreem.route) {
        composable(Routes.PracticeScreem.route) { PacticeScreem(navigationController) }
        composable(Routes.ItemPracticeScreem.route, arguments = listOf(navArgument("imagename"){type = NavType.IntType})) {
                backStackEntry-> ItemPracticeScreem(navigationController, backStackEntry.arguments?.getInt("imagename") ?: R.drawable.sol) }
        composable(Routes.HomeScreem.route) { HomeScreem(navigationController) }
        composable(Routes.PlayScreem.route) { PlayScreem(navigationController) }


    }
}
