package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.allflagsofcountriesworld.ui.theme.green
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white

@Composable
fun horizonatlflagOftheitaltwithlayouts(modifier: Modifier=Modifier){
    ConstraintLayout(modifier= modifier){
        val (box1, box2, box3)=createRefs()
        Box(modifier=Modifier.background(color= green).constrainAs(ref=box1){
        start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = parent.top)
            bottom.linkTo(anchor = box2.top)
            height= Dimension.fillToConstraints
                width= Dimension.fillToConstraints
        })
        Box(modifier=Modifier.background(color= white).constrainAs(ref=box2){
            start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = box1.bottom)
            bottom.linkTo(anchor = box3.top)
            height= Dimension.fillToConstraints
            width= Dimension.fillToConstraints
        })
        Box(modifier=Modifier.background(color = red).constrainAs(ref=box3){
            start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = box2.bottom)
            bottom.linkTo(anchor = parent.bottom)
            height= Dimension.fillToConstraints
            width= Dimension.fillToConstraints
        })
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showscreenmyflagwithlayout(){
horizonatlflagOftheitaltwithlayouts(modifier = Modifier.fillMaxSize().background(Color.Blue))
}