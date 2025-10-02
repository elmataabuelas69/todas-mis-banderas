package com.example.allflagsofcountriesworld.Screens_of_the_italy

import android.R.attr.end
import android.R.attr.start
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.allflagsofcountriesworld.ui.theme.green
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white
import com.example.allflagsofcountriesworld.R

@Composable
fun myflagwithlayouthorizontal(modifier:Modifier= Modifier){
    ConstraintLayout (modifier=modifier) {
        val (box1, box2, box3, image) = createRefs()
        Box(
            modifier = Modifier.fillMaxWidth().background(color = green).size(size = 150.dp)
                .constrainAs(ref = box1) {
                    start.linkTo(anchor = parent.start)
                    end.linkTo(anchor = parent.end)
                    top.linkTo(anchor = parent.top)
                    bottom.linkTo(anchor = box2.top)
                    width= Dimension.fillToConstraints
                    height= Dimension.fillToConstraints

                })

        Box(
            modifier = Modifier.fillMaxWidth().background(color = white).size(size = 150.dp)
                .constrainAs(ref = box2) {
                    start.linkTo(anchor = parent.start)
                    end.linkTo(anchor = parent.end)
                    top.linkTo(anchor = box1.bottom)
                    bottom.linkTo(anchor = box3.top)
                    width= Dimension.fillToConstraints
                    height= Dimension.fillToConstraints
                })
        Image(
            painter=painterResource(id=R.drawable.aguilamexicana2),
            contentDescription="Imagen del aguila de la bandera de Mexico",
            modifier=Modifier.size(size = 200.dp).constrainAs(ref=image){
                start.linkTo(anchor = parent.start, margin = 5.dp)
                end.linkTo(anchor = parent.end, margin = 5.dp)
                top.linkTo(anchor = box1.bottom, margin = 5.dp)
                bottom.linkTo(anchor = box3.top, margin = 5.dp)
            }
        )
        Box(
            modifier = Modifier.fillMaxWidth().background(color = red).size(size = 150.dp)
                .constrainAs(ref = box3) {
                    start.linkTo(anchor = parent.start)
                    end.linkTo(anchor = parent.end)
                    top.linkTo(anchor = box2.bottom)
                    bottom.linkTo(anchor = parent.bottom)
                    width= Dimension.fillToConstraints
                    height= Dimension.fillToConstraints
                })

    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showmyscreen(){
    myflagwithlayouthorizontal(modifier = Modifier.fillMaxSize().background(Color.Blue))
}