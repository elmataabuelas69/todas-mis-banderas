package com.example.allflagsofcountriesworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import com.example.allflagsofcountriesworld.ui.theme.color1
import com.example.allflagsofcountriesworld.ui.theme.color10
import com.example.allflagsofcountriesworld.ui.theme.color11
import com.example.allflagsofcountriesworld.ui.theme.color12
import com.example.allflagsofcountriesworld.ui.theme.color13
import com.example.allflagsofcountriesworld.ui.theme.color14
import com.example.allflagsofcountriesworld.ui.theme.color2
import com.example.allflagsofcountriesworld.ui.theme.color3
import com.example.allflagsofcountriesworld.ui.theme.color4
import com.example.allflagsofcountriesworld.ui.theme.color5
import com.example.allflagsofcountriesworld.ui.theme.color6
import com.example.allflagsofcountriesworld.ui.theme.color7
import com.example.allflagsofcountriesworld.ui.theme.color8
import com.example.allflagsofcountriesworld.ui.theme.color9

@Composable
fun miprimerpixel_art(modifier: Modifier= Modifier.fillMaxHeight()) {
    Column(modifier = Modifier) {
        Row(modifier = Modifier) {

            repeat(50) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(1.dp, Color.Black)

                )

            }

        }
        Row(modifier = Modifier) {
            repeat(24) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(1.dp, Color.Black)
                )

            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black)
                    .background(color = color1)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black)
                    .background(color = color2)
            )
            repeat(3) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(1.dp, Color.Black)
                        .background(color = black)
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black)
                    .background(color = color3)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .border(1.dp, Color.Black)
                    .background(color = color4)
            )
            repeat(19) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .border(1.dp, Color.Black)

                )
            }
        }
        Row(modifier = Modifier) {
            repeat(21) {
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            repeat(4) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = black)
                )
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color1)
            )
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color5)
            )
            repeat(2) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = color6)
                )
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color2)
            )
            repeat(4) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = black)
                )
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color2)
            )
            repeat(15) {
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }

        }
        Row(modifier = Modifier) {
            repeat(19) {
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            repeat(2) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = color2)
                )
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color6))
            repeat(11){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color8))
           repeat(3){
               Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
           }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color6))
            repeat(12){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
        }
        Row(modifier=Modifier) {
            repeat(18) {
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = black)
            )
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color6)
            )
            repeat(7) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = color7)
                )
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color9)
            )
            repeat(8) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = color7)
                )
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color1)
            )
            repeat(2) {
                Box(
                    modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                        .background(color = black)
                )
            }
            Box(
                modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black)
                    .background(color = color6)
            )
            repeat(10) {
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
        }
        Row(modifier=Modifier){
            repeat(17){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color10))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
           repeat(2){
               Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
           }
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            }
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(5){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color1))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color11))
         repeat(8){
             Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
         }
        }
        Row(modifier=Modifier){
            repeat(16){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color12))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
          repeat(2){
              Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
          }
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            }
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color6))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            repeat(7){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
        }
        Row(modifier=Modifier){
            repeat(12){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color4))
            repeat(4){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color4))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color12))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color13))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color12))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color13))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color12))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            repeat(6){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
        }
        Row(modifier=Modifier){
            repeat(11){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color14))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color13))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color1))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color2))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color12))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color1))
            repeat(5){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color1))
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            }
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color9))
            repeat(3){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color7))
            }
            Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = color12))
            repeat(2){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black).background(color = black))
            }
            repeat(5){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
        }
        Row(modifier=Modifier){
            repeat(10){
                Box(modifier = Modifier.weight(1f).aspectRatio(1f).border(1.dp, Color.Black))
            }
        }
    }
    }




@Preview(showBackground = false, showSystemUi = true)
@Composable
fun show_mifirst(){
    miprimerpixel_art(modifier= Modifier.fillMaxSize())
}