package com.hoseinvand.jetpack.myapplication.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hoseinvand.jetpack.myapplication.data.DataModel

@Composable
fun DetailScreen(
    myData: List<DataModel>,
    imageCount: Int,
    modifier: Modifier = Modifier,

) {

    Column(modifier.fillMaxSize().padding(30.dp), verticalArrangement = Arrangement.spacedBy(15.dp)) {
        Box(modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Image(painter = painterResource(myData[imageCount].image),myData[imageCount].name,modifier.clip(
                RoundedCornerShape(12.dp)
            ))

        }

        Text(text = myData[imageCount].name, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = myData[imageCount].material, fontSize = 20.sp)
    }

}