package com.example.firstjetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstjetpackcompose.ui.theme.FirstJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Hello First Jetpack Compose")
        }
    }
}


//@Composable
//fun Hellocheez(name: String = "TAJ BABA"){
//    Text(text = "Hello $name")
//}

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, name = "HelloCheez", showSystemUi = true)
//@Composable
//fun previewFunction() {
//    Text(
//        text = "Hello CheezyCode",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.SemiBold,
//        fontSize = 36.sp,
//        color = Color.Green,
//        textAlign = TextAlign.Right
//
//    )
//    Image(painter = painterResource(id = R.drawable.kylie),
//        contentDescription = "Dummy Image",
////        colorFilter = ColorFilter.tint(Color.Blue)
//    )

//    Button(onClick = {
//
//    },
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.White,
//
//        ),
//        enabled = true
//    ) {
//        Text(text = "Hello")
//        Image(painter = painterResource(id = R.drawable.kylie), contentDescription = "Dummy Btn")
//    }


//}

//@SuppressLint("UnrememberedMutableState")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TextInput(){
//    val state = remember {
//        mutableStateOf("")
//    }
//    TextField(value = state.value,
//        onValueChange = {
//            state.value = it
//        },
//        label = { Text(text = "Enter message ")}
//    )
//}


@Preview(showBackground = true, widthDp = 300, heightDp = 600)
@Composable
private fun PreviewFuncion(){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }


    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }

    Box (
        contentAlignment = Alignment.Center
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }


}


