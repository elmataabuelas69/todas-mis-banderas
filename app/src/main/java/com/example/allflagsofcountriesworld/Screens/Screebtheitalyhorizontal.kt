package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Flag_horizontal_italy(modifier:Modifier= Modifier){
    Column(modifier= Modifier){
        Box(modifier= Modifier.fillMaxWidth().weight(1f).background(Color.Green))
        Spacer(modifier=Modifier.fillMaxWidth().weight(1f))
        Box(modifier=Modifier.fillMaxWidth().weight(1f).background(Color.Red))

    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showmyflagh(){
    Flag_horizontal_italy(modifier=Modifier.fillMaxSize().background(Color.Black))
}