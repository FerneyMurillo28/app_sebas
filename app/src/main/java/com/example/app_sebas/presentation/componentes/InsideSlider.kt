package com.example.app_sebas.presentation.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.InlineSlider
import androidx.wear.compose.material.InlineSliderDefaults

@Composable
fun SliderExample() {
    var value by remember { mutableStateOf(4.5f) }

    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        InlineSlider(
            value = value,
            onValueChange = { value = it },
            increaseIcon = {Icon(InlineSliderDefaults.Increase, "Increase")  },
            decreaseIcon = {Icon(InlineSliderDefaults.Decrease, "Decrease")  },
            valueRange = 3f..6f,
            steps = 10,
            segmented = true
        )
    }
}