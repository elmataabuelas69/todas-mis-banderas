package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun screenofthejhor(modifier: Modifier = Modifier){
    Row(modifier= Modifier) {
        Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center)
        {
            Canvas(modifier = Modifier.size(size = 200.dp)) {

                drawCircle(
                    color = Color.Red,
                    radius = 300f,
                    center = Offset(size.width / 2, size.height / 2),
                    style = Fill,

                    )
            }
        }
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun shows(){
    screenofthejhor(modifier = Modifier.fillMaxSize().background(Color.Green))
}