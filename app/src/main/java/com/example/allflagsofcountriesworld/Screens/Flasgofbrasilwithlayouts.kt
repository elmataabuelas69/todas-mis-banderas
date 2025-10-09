package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun brasilwithl(modifier: Modifier =Modifier){
    Column(modifier= Modifier) {
        Canvas(modifier = modifier.fillMaxSize()) {
            val centerX = size.width / 2
            val centerY = size.height / 2
            val radius = size.minDimension / 3
            val center = Offset(centerX, centerY)
            val rombo = Path().apply {
                moveTo(centerX, 0f)
                lineTo(size.width, centerY)
                lineTo(centerX, size.height)
                lineTo(0f, centerY)
                close()
            }
            drawPath(path = rombo, color = Color.Yellow, style = Fill)

            drawCircle(
                color = Color.Blue,
                radius = radius,
                center = center
            )

            val bandPath = Path().apply {
                val bandWidth = 20f

                val startX = centerX - radius * 0.9f
                val endX = centerX + radius * 0.9f

                val startY = centerY - radius * 0.3f
                val endY = centerY + radius * 0.3f

                moveTo(startX, startY)
                cubicTo(
                    centerX - radius * 0.5f, startY - radius * 0.4f,
                    centerX + radius * 0.5f, endY + radius * 0.4f,
                    endX, endY
                )
                lineTo(endX, endY + bandWidth)
                cubicTo(
                    centerX + radius * 0.5f, endY + radius * 0.4f + bandWidth,
                    centerX - radius * 0.5f, startY - radius * 0.4f + bandWidth,
                    startX, startY + bandWidth
                )
                close()
            }
            drawPath(path = bandPath, color = Color.White, style = Fill)

        }

    }
}

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showbrasilflagwithl(){
    brasilwithl(modifier=Modifier.fillMaxSize().background(Color.Green))
}
