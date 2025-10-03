package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun screenofthejh(modifier: Modifier = Modifier){
    Row(modifier= Modifier) {
        Box(modifier = Modifier.fillMaxHeight().weight(weight = 3f).background(Color.White))
        Canvas(modifier= Modifier.size(size=200.dp)) {

            drawCircle(
                color=Color.Red,
                radius=200f,
                center = Offset(size.width/2, size.height/2),
                style = Fill,
                contentAlignment = Alignment.Center
            )
        }
    }
}