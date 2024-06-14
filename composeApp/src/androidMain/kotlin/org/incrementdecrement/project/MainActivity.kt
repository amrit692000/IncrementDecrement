package org.incrementdecrement.project

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           // App()

           //App()
//>>>>>>> 322cf42 (initial commit)
            IncremntDecement()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
   // App()
    IncremntDecement()
}
@Composable
fun IncremntDecement(){

    var count: Int by remember{ mutableStateOf(0)}
    Column(
        Modifier
            .fillMaxWidth()
            .padding(22.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Text(text ="Count value: $count")
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
            Button(onClick = { count++}) {
                Text(text = "increment")
            }
            Button(onClick = { count--}) {
                Text(text ="decrement")
            }
        }
    }
}