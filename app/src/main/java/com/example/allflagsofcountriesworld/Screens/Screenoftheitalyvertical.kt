package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Flag_of_the_italy(modifier:Modifier= Modifier){
Row(modifier= Modifier){
    Box(modifier= Modifier.fillMaxHeight().weight(1f).background(Color.Green))
    Spacer(modifier=Modifier.fillMaxHeight().weight(1f))
    Box(modifier=Modifier.fillMaxHeight().weight(1f).background(Color.Red))

}
}
@Preview
@Composable
fun showmyflag(){
    Flag_of_the_italy(modifier=Modifier.fillMaxSize().background(Color.Black))
}