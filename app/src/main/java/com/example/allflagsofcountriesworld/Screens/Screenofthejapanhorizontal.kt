package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun screenofthejapanhorizontal(modifier:Modifier= Modifier){
    ConstraintLayout(modifier=modifier){
        val (box1, circle)=createRefs()
        Box(modifier= Modifier.background(Color.White).constrainAs(ref=box1){
            start.linkTo(parent.start)
            end.linkTo((parent.end))
            top.linkTo((parent.top))
            bottom.linkTo((parent.bottom))
            width= Dimension.fillToConstraints
            height= Dimension.fillToConstraints
        })
        Canvas(modifier = Modifier.size(200.dp).constrainAs(ref=circle){
            start.linkTo(parent.start)
            end.linkTo((parent.end))
            top.linkTo((parent.top))
            bottom.linkTo((parent.bottom))
        }) {
            drawCircle(
                color = Color.Red,
                radius = 280f,
                center = Offset(size.width / 2, size.height / 2),
                style = Fill
            )
        }


    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showscreen(){
    screenofthejapanhorizontal(modifier = Modifier.fillMaxSize().background(Color.Green))
}