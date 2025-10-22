package com.example.allflagsofcountriesworld.Screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun miplantillab(cantidad: Int, tipo:String, image: Painter) {
    Row(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ){
            Image(
                painter=image, contentDescription="Ni modo bro no se puede visualizar",modifier= Modifier

            )
        }
    }
}


@Preview(showBackground = false, showSystemUi = true)
@Composable
fun previewmyb(){

}