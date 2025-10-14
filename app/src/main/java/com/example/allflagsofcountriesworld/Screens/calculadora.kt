package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.Dimension.Companion.value
var numero1 by rememberSaveable() { mutableSetOf("") }
@Composable
fun mycalc(modifier: Modifier= Modifier){


}

@Composable
fun numeros(modifier: Modifier= Modifier){

}
@Preview(showBackground = false, showSystemUi = true)
@Composable
fun showmic(){
    mycalc(modifier = Modifier.fillMaxSize().background(Color.Red))
}