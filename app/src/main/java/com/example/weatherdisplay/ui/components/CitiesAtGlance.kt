package com.example.weatherdisplay.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CitiesAtGlance() {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
    border = BorderStroke(2.dp, color = Color.Magenta),
        shape = RoundedCornerShape(8.dp)
    ) {
        // Todo: Might wanna switch to a LazyColumn here:
        Column(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
            CityRowAtGlance()
        }
    }
}

@Composable
fun CityRowAtGlance() {
    // Todo: Add access to the MVVM layer to get the data from the Api.
    Row(
        Modifier
            .fillMaxWidth()
            .padding(4.dp)) {
        Text("City Name",
            fontSize = 16.sp /* Add to Constants */,
            fontWeight = FontWeight.Bold,
            color = Color.Black /* Create color pallete @ Constants */)
        Text("State/Country code",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black)
        Text("15ºC",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray)
//        Icon(imageVector = , contentDescription = )
    }
}