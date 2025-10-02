package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun horizonatlflag_oftheitaltwithlayouts(modifier: Modifier=Modifier){
    ConstraintLayout(modifier= Modifier){
        val (box1, box2, box3)=createRefs()
        Box(modifier=Modifier.size(size=200.dp).constrainAs(ref=box1){
        start.linkTo(anchor = parent.start)
            end.linkTo(anchor=parent.end)
            top.linkTo(anchor = parent.top)
            bottom.linkTo(anchor = parent.top)
            height= Dimension.fillToConstrains()
                width=
        })
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showscreenmyflagwithlayout(){

}