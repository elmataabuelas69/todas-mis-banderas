package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Canvas
import androidx.compose.ui.Alignment
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke

@Composable
fun brasil(modifier: Modifier =Modifier){
    Column(modifier= Modifier) {

        Canvas(modifier = modifier.fillMaxSize(), ) {
            val centerX = size.width / 2
            val centerY = size.height / 2
            val halfWidth = size.width / 2
            val halfHeight = size.height / 2

            val path = Path().apply {
                moveTo(centerX, 0f)
                lineTo(size.width, centerY)
                lineTo(centerX, size.height)
                lineTo(0f, centerY)
                close()
            }

            drawPath(
                path,
                color = Color.Yellow,
                style = Fill
            )
                drawCircle(
                    color = Color.Blue,
                    radius = size.minDimension / 3,
                    center = Offset(size.width / 3, size.height / 3),

                )
            }


    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showbrasilflag(){
    brasil(modifier=Modifier.fillMaxSize().background(Color.Green))
}
