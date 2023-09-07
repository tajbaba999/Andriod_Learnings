package com.example.firstjetpackcompose

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


//@Preview
@Composable
//fun PreviewItem(){
//    Screen(img = R.drawable.kylie, title = "Programming", subtitle = "Learn Different Languages")
//}


//@Preview(showBackground = true)
//@Composable
fun Screen(img : Int, title: String, subtitle : String){
    Card(
        modifier = Modifier.padding(48.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(painter = painterResource(id = img),
                contentDescription = "",
                modifier =  Modifier.size(8.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            extracted(title, subtitle, Modifier.weight(.8f))

        }

    }
}

@Composable
private fun extracted(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier =  modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.bodySmall

        )
    }
}