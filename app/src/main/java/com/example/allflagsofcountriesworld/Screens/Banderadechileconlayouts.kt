package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.text.style.LineHeightStyle

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.star
import androidx.graphics.shapes.toPath
import com.example.allflagsofcountriesworld.ui.theme.blue
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white

@Composable
fun screenofthechileflagwithlayouts(modifier: Modifier= Modifier){
    ConstraintLayout(modifier=modifier){
        val(boxblue,boxwhite,boxred)=createRefs()
        Box(modifier= Modifier.background(color= blue).constrainAs(ref=boxblue){
            start.linkTo(anchor = parent.start)
            end.linkTo(anchor=boxwhite.start)
            top.linkTo(anchor = parent.top)
            bottom.linkTo(anchor = boxred.top)
            width= Dimension.fillToConstraints
            height= Dimension.fillToConstraints
        }, contentAlignment = Alignment.Center) {
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
        Box(modifier= Modifier.background(color= white).constrainAs(ref=boxwhite){
            start.linkTo(anchor = boxblue.end)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = parent.top)
            bottom.linkTo(anchor = boxred.top)

            height= Dimension.fillToConstraints
        }.fillMaxWidth(0.6f))
        Box(modifier= Modifier.background(color= red).constrainAs(ref=boxred){
            start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = boxwhite.bottom)
            bottom.linkTo(anchor = parent.bottom)
            width= Dimension.fillToConstraints
            height= Dimension.fillToConstraints
        })
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showscreenchile(){
screenofthechileflagwithlayouts(modifier = Modifier.fillMaxSize().background(Color.Red))
}