package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.allflagsofcountriesworld.ui.theme.green
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white

@Composable
fun horizonatlflag_oftheitaltwithlayouts(modifier: Modifier=Modifier){
    ConstraintLayout(modifier= Modifier){
        val (box1, box2, box3)=createRefs()
        Box(modifier=Modifier.size(size=200.dp).background(color= green).constrainAs(ref=box1){
        start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = parent.top)
            bottom.linkTo(anchor = box2.top)
            height= Dimension.fillToConstraints
                width= Dimension.fillToConstraints
        })
        Box(modifier=Modifier.size(size=200.dp).background(color= white).constrainAs(ref=box2){
            start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = box1.bottom)
            bottom.linkTo(anchor = box3.top)
            height= Dimension.fillToConstraints
            width= Dimension.fillToConstraints
        })
        Box(modifier=Modifier.size(size=200.dp).background(color = red).constrainAs(ref=box3){
            start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = box2.bottom)
            bottom.linkTo(anchor = parent.top)
            height= Dimension.fillToConstraints
            width= Dimension.fillToConstraints
        })
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showscreenmyflagwithlayout(){

}