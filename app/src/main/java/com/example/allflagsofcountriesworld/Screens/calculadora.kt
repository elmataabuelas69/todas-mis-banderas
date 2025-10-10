package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun mycalc(modifier: Modifier= Modifier){
   value: TextFieldValue,
   miValueChange:(TextFieldValue)
}

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showmic(){
    mycalc(modifier = Modifier.fillMaxSize().background(Color.Red))
}