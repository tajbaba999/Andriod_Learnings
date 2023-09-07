package com.example.firstjetpackcompose

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun  NotificationScreen() {
    var count : MutableState<Int> = rememberSaveable { mutableStateOf(0) }
    NotificationCounter(count.value) { count.value++ }
}

@Composable
fun NotificationCounter(count: Int, incrementer: () -> Int) {
    var count : MutableState<Int> = rememberSaveable { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "you have sent ${count.value} notificaions")
        Button(onClick = {
           incrementer()
            Log.d("CODESTAG","Button Clicked")
        }) {
            Text(text = "Send Noticaions")
        }
    }
}
