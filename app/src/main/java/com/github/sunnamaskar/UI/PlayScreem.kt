package com.github.sunnamaskar.UI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@ExperimentalMaterial3Api
@Composable
fun PlayScreem(navController: NavController){
    var asanaImage by rememberSaveable { mutableStateOf(com.github.sunnamaskar.R.drawable.sol) }
    var asanaNAme by rememberSaveable{ mutableStateOf("Tadasana") }
    var breathing by rememberSaveable{ mutableStateOf("Exhala") }
    Column(
                modifier = Modifier
                    .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyTopAppBar(modifier = Modifier.weight(1f), navController, false )

        Box(modifier = Modifier.weight(4f)) {
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
                        .fillMaxWidth()
                        .height(200.dp),
                    // elevation = 20.dp,
                    shape = MaterialTheme.shapes.small,
                    // backgroundColor = Color.White
                ) {
                    Image(
                        painter = painterResource(asanaImage),
                        contentDescription = null,
                        alpha = 0.5f,
                        //redondo, borde le pones grosor, color y el redondeado q en este caso lo mismo q la imagen
                        modifier = Modifier
                            .padding(22.dp)
                            .fillMaxSize()
                    )
                }
                Spacer(modifier = Modifier.size(40.dp))
                Column(
                    modifier = Modifier
                        .background(color = Color.LightGray)
                        .padding(22.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = asanaNAme, fontSize = 24.sp)
                    Text(text = breathing, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.size(22.dp))
                Row() {
                    Button(onClick = {
                        when (asanaImage) {
                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "inhala"
                                asanaNAme = "Urdhva Hastasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Uttanasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Ardha Uttanasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Anjaneyasana prep"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Anjaneyasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Anjaneyasana prep"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Phasakasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Ashtanga pranam"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Bhujangasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Adho mukha svanasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Apnea"
                                asanaNAme = "Anjaneyasana prep"
                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Anjaneyasana "

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Anjaneyasana prep"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Ardha Uttanasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Uttanasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Inhala"
                                asanaNAme = "Urdhva Hastasana"

                            }

                            com.github.sunnamaskar.R.drawable.sol -> {
                                asanaImage = com.github.sunnamaskar.R.drawable.sol
                                breathing = "Exhala"
                                asanaNAme = "Tadasana"

                            }
                        }
                    }, modifier = Modifier.weight(1f)) {
                        Text(text = "Siguiente")
                    }
                }
            }
        }

            MyBottomAppBar(modifier = Modifier.weight(1f),navController)
        }

    }
