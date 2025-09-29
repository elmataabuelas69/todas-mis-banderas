package com.example.allflagsofcountriesworld.Screens_of_the_italy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import com.example.allflagsofcountriesworld.ui.theme.green
import com.example.allflagsofcountriesworld.ui.theme.red

@Composable
fun thescreen_italy_with_(modifier: Modifier = Modifier){
Row(modifier= Modifier){
    Box(modifier=Modifier.fillMaxHeight().weight(1f).background(color=green))
    Spacer(modifier= Modifier.fillMaxHeight().weight(1f))
    Box(modifier=Modifier.fillMaxHeight().weight(1f).background(color=red))

}
}
