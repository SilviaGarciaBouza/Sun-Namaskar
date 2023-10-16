package com.github.sunnamaskar.UI

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.github.sunnamaskar.R
import com.github.sunnamaskar.Routes
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
@ExperimentalMaterial3Api
@Composable
fun PacticeScreem(navController: NavController){
    //imageItem:(Int)->Unit){
   // var numberImage by rememberSaveable{ mutableStateOf(14) }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        MyTopAppBar(modifier = Modifier.weight(1f), navController, false)

        Box(modifier = Modifier.weight(5f)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp, bottom = 80.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                    Spacer(modifier = Modifier.size(80.dp))
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                    Spacer(modifier = Modifier.size(100.dp))
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                    Spacer(modifier = Modifier.size(130.dp))
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                    Spacer(modifier = Modifier.size(130.dp))
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                    Spacer(modifier = Modifier.size(100.dp))
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                    Spacer(modifier = Modifier.size(80.dp))
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f), horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(id = R.drawable.sol),
                        contentDescription = "",
                        Modifier.clickable {
                            navController.navigate(
                                Routes.ItemPracticeScreem.createRoute(
                                    R.drawable.sol
                                )
                            )
                        })

                }
            }

        }
        MyBottomAppBar(modifier = Modifier.weight(1f), navController = navController)
    }


}

@ExperimentalMaterial3Api
@Composable
fun ItemPracticeScreem(navController: NavController, imagename: Int) {
    var expanded by remember { mutableStateOf(false) }

    //TODO Mytopappbar flacha atrás
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyTopAppBar(modifier = Modifier.weight(1f), navController, true)

        Box(modifier = Modifier.weight(5f)) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(40.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxSize(),
                    //.height(200.dp),
                    // elevation = 20.dp,
                    shape = MaterialTheme.shapes.small,
                    // backgroundColor = Color.White
                ) {
                    Column {


                        Image(
                            painter = painterResource(imagename),
                            contentDescription = null,
                            alpha = 0.5f,
                            //redondo, borde le pones grosor, color y el redondeado q en este caso lo mismo q la imagen
                            modifier = Modifier
                                .padding(22.dp)
                                .fillMaxSize()
                        )
                     /*   Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                            Button(onClick = { navController.navigate(Routes.PracticeScreem.route) }) {

                                Text(text = "Voltear")
                            }
                        }*/





                        IconButton(onClick = { expanded = !expanded }) {
                            Icon(
                                imageVector = if (expanded) {
                                    Icons.Default.KeyboardArrowDown
                                } else {
                                    Icons.Default.KeyboardArrowUp
                                },
                                contentDescription = "Icon",
                               // tint = MaterialTheme.colors.onPrimary,
                            )

                        }
                    }
                    if (expanded) {
                        ItemDescription(imagename)
                    }
                }
            }
        }


    }
                }
//Lo q aparece al expandir
@Composable
fun ItemDescription(imagename: Int){
    Column(Modifier.padding(12.dp)) {
        Text(text = "Description",//color = MaterialTheme.colors.onPrimary,
            fontWeight = Bold)
        Text(text = "wñgle,ñ")
    }
}













