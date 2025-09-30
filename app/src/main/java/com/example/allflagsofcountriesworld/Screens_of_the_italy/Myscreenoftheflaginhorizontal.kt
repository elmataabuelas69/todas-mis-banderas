package com.example.allflagsofcountriesworld.Screens_of_the_italy

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.allflagsofcountriesworld.ui.theme.green
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white
import com.example.allflagsofcountriesworld.R

@Composable
fun flaginh(modifier: Modifier= Modifier){
    Column(modifier= Modifier)
    {
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background(color= green))
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background(color= white))
        {
            Image(
               painter=painterResource(id=R.drawable.aguilamexicana2),
                contentDescription="Imagen de aguila parada sobre un nopal de la bandera de Mexico",
                modifier=Modifier.fillMaxWidth(1f)
            )
        }
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background(color=red))
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun previewofscreen(){
flaginh(modifier=Modifier.fillMaxSize().background(Color.Blue))
}