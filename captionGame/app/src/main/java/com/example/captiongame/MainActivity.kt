package com.example.captiongame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.captiongame.ui.theme.CaptionGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptionGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    captionGame()

                }
            }
        }
    }
}

@Composable
fun  captionGame (){
    // initi the states
    val treasureFound = remember{ mutableStateOf(0) }
    val  direction = remember { mutableStateOf("North") }
    val stromORtreasure = remember {
        mutableStateOf("")
    }


    Column (
modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Treasure Found : ${treasureFound.value}")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Direction :  ${direction.value}")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "${stromORtreasure.value}")
        Spacer(modifier = Modifier.height(16.dp))
        
        Button(onClick = {
            direction.value = "East"
            if (Random.nextBoolean()){
                treasureFound .value  += 1
                stromORtreasure.value = "Found a Treasure"
            }
            else{
                stromORtreasure.value = " Treasure Ahead!!!!!"
            }
        })
        {
            
            Text("Sail East")
            
        }


        Button(onClick = {
            direction.value = "West"
            if (Random.nextBoolean()){
                treasureFound .value  += 1
                stromORtreasure.value = "Found a Treasure"
            }
            else{
                stromORtreasure.value = " Treasure Ahead!!!!!"
            }
        })
        {

            Text("Sail West")

        }

        Button(onClick = {
            direction.value = "North"
            if (Random.nextBoolean()){
                treasureFound .value  += 1
                stromORtreasure.value = "Found a Treasure"
            }
            else{
                stromORtreasure.value = " Treasure Ahead!!!!!"
            }
        })
        {

            Text("Sail North")

        }


        Button(onClick = {
            direction.value = "South"
            if (Random.nextBoolean()){
                treasureFound .value  += 1
                stromORtreasure.value = "Found a Treasure"
            }
            else{
                stromORtreasure.value = " Treasure Ahead!!!!!"
            }
        })
        {

            Text("Sail South")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun  captionGamePreview (){
    captionGame()
}
