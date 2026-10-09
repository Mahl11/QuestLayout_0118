package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

@Composable
fun AdvanceLayout(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.background_umy),
            contentDescription = " \Background\\,
 contentScale = ContentScale.Crop,
 modifier = Modifier.fillMaxSize()
 )
 Column(
 modifier = Modifier
 .fillMaxSize()
 .padding(16.dp),
 horizontalAlignment = Alignment.CenterHorizontally,
 verticalArrangement = Arrangement.Center
 ) {
 Card(
 modifier = Modifier.fillMaxWidth().padding(16.dp),
 colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
 ) {
 Row(
 modifier = Modifier.padding(16.dp),
 verticalAlignment = Alignment.CenterVertically
 ) {
 Image(
 painter = painterResource(id = R.drawable.logo_umy),
 contentDescription = \\Logo\\,
 modifier = Modifier.size(70.dp).clip(CircleShape)
 )
 Spacer(modifier = Modifier.width(16.dp))
 Column {
 Text(
 text = stringResource(id = R.string.nama),
 fontSize = 20.sp,
 color = Color.White
 )`n Text(
 text = stringResource(id = R.string.prodi),
 fontSize = 14.sp,
 color = Color.Yellow
 )
 }
 }
 }
 }
 }
}
