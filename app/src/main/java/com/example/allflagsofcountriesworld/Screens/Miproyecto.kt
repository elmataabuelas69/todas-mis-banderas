package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.allflagsofcountriesworld.ui.theme.black

@Composable
fun miprimerpixel_art(modifier: Modifier= Modifier.fillMaxSize()){
Row(modifier=Modifier) {
    repeat(41) {
        Box(
            modifier = Modifier
                .weight(1f) // Cada Box ocupa el mismo ancho
                .aspectRatio(1f) // Mantiene forma cuadrada
                .border(1.dp, Color.Black)
        )
    }

}
}

@Preview(showBackground = false, showSystemUi = true)
@Composable
fun show_mifirst(){
    miprimerpixel_art(modifier= Modifier.fillMaxSize())
}