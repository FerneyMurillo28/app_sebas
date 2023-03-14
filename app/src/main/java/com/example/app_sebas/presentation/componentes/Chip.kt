package com.example.app_sebas.presentation.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon


import androidx.wear.compose.material.Text
import com.example.app_sebas.R

@Composable

fun ChipExample(){
    val imagen2 = painterResource(id = R.drawable.llamar )
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Chip( onClick = { /*TODO*/ },
        enabled = true,
            label = {
                Text(
                    text = "Denis Lopez",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            },
            secondaryLabel = {
                Text(text = "Call", maxLines = 1 , overflow = TextOverflow.Ellipsis)
            } ,
            icon = {
             Icon(
                 painter =imagen2 ,
                 contentDescription ="",
             modifier = Modifier
                 .size(ChipDefaults.IconSize)
                 .wrapContentSize(align = Alignment.Center),
                 )
            }, colors = ChipDefaults.imageBackgroundChipColors(
                backgroundImagePainter = painterResource(R.drawable.monte)
            )
        )

    }
}