package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.star
import androidx.graphics.shapes.toPath
import com.example.allflagsofcountriesworld.ui.theme.blue
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white

@Composable
fun  banderadechile(modifier: Modifier =Modifier) {

Column (modifier= Modifier) {
    Row(modifier = Modifier) {
        Box(
            modifier = Modifier

                .height(height = 425.dp)
                .weight(1.3f)
                .background(color = blue), contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                .drawWithCache {
                    val roundedPolygon = RoundedPolygon.star(
                        numVerticesPerRadius = 5,
                        radius = size.minDimension / 2,
                        innerRadius = size.minDimension / 4,
                        centerX = size.width / 2,
                        centerY = size.height / 2
                    )
                    val roundedPolygonPath = roundedPolygon.toPath().asComposePath()
                    onDrawBehind {
                        drawPath(roundedPolygonPath, color = Color.White)
                    }
                }
                .size(100.dp))
        }
        Box(
            modifier = Modifier

                .height(height = 425.dp)
                .weight(1.7f)
                .background(color = white)
        )

    }
    Box(
        modifier = Modifier

            .fillMaxWidth()
            .weight(1f)
            .background(color = red)
    )
    }
    }

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showbanderadec(){
    banderadechile(modifier = Modifier.fillMaxSize().background(Color.Green))
}