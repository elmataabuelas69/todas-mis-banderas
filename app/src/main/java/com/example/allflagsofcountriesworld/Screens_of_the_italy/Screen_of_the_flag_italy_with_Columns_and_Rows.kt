package com.example.allflagsofcountriesworld.Screens_of_the_italy

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.allflagsofcountriesworld.ui.theme.green
import com.example.allflagsofcountriesworld.ui.theme.red
import androidx.compose.foundation.Image
import com.example.allflagsofcountriesworld.R
import com.example.allflagsofcountriesworld.ui.theme.white

@Composable
fun thescreen_italy_with_(modifier: Modifier = Modifier){
Row(modifier= Modifier){
    Box(modifier=Modifier.fillMaxHeight().weight(1f).background(color=green))
    Box(modifier= Modifier.fillMaxHeight().weight(1f).background(color= white)
    )
    {
        Image(
            painter = painterResource(id = R.drawable.aguilamexicana),
                    contentDescription="Águila mexicana",
            modifier=Modifier.fillMaxSize()

            )
    }
    Box(modifier=Modifier.fillMaxHeight().weight(1f).background(color=red))

}
}
@Preview(showBackground = true, showSystemUi = false)
@Composable
fun AboutScreenPreview(){
    thescreen_italy_with_(modifier = Modifier.fillMaxSize().background(Color.Blue))

}
