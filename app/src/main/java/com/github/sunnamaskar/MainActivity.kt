package com.github.sunnamaskar

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.TopAppBar
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

                    val navigationController = rememberNavController()
                    NavHost(navController = navigationController, startDestination = Routes.PracticeScreem.route) {
                        composable(Routes.PracticeScreem.route) { PacticeScreem(navigationController) }
                        composable(Routes.ItemPracticeScreem.route, arguments = listOf(navArgument("imagename"){type = NavType.IntType})) {
                                backStackEntry-> ItemPracticeScreem(navigationController, backStackEntry.arguments?.getInt("imagename") ?: R.drawable.sol) }
                        composable(Routes.HomeScreem.route) { HomeScreem(navigationController) }
                        composable(Routes.PlayScreem.route) { PlayScreem(navigationController) }
                    }
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SunNamaskarTheme {
    }
}




/*
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyScaffold() {
    Scaffold (topBar = { MyTopBarTitle() }  ,
        content = { NavigateToScreems()},
        bottomBar ={ MyBottonNavigation()} )



*/









//Pro Navigation1: Crea cada objeto es una pantalla
sealed class Routes(val route: String){
    object PracticeScreem: Routes("Screem1")
    object ItemPracticeScreem: Routes("Screem2?imagename={imagename}") {
        fun createRoute(imagename: Int) = "Screem2?imagename=$imagename"
    }
    object HomeScreem: Routes("Screem3")
    object PlayScreem: Routes("Screem4")


}



