package com.example.allflagsofcountriesworld.Screens_of_the_italy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun flaginh(modifier: Modifier= Modifier){
    Column(modifier= Modifier)
    {
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background())
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background())
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background())
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun previewofscreen(){
flaginh(modifier=Modifier.fillMaxSize().background(Color.Blue))
}