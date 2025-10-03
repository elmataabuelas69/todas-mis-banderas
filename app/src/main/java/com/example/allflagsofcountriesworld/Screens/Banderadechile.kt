package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.allflagsofcountriesworld.ui.theme.blue
import com.example.allflagsofcountriesworld.ui.theme.red
import com.example.allflagsofcountriesworld.ui.theme.white

@Composable
fun  banderadechile(modifier: Modifier =Modifier){
    Row(modifier= modifier){
        Box(modifier= Modifier.fillMaxWidth().weight(weight = 1f).background(color= white))
      Box(modifier= Modifier.fillMaxWidth().weight(weight = 1f).background(color= red))
    }
}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showbanderadec(){
    banderadechile(modifier = Modifier.fillMaxSize().background(Color.Green))
}