package com.example.app_sebas.presentation.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Stepper
import androidx.wear.compose.material.StepperDefaults
import androidx.wear.compose.material.Text
import androidx.compose.ui.Modifier


@Composable

fun StepperExample(){
    var value by remember { mutableStateOf(5) }

    Column(
        Modifier.fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Stepper(
            value = value,
            onValueChange = {value = it},
            increaseIcon = {Icon(StepperDefaults.Increase, "Increase")},
            decreaseIcon ={Icon(StepperDefaults.Decrease, "Decrease")},
            valueProgression = 0..10
        ){
                Text("Value: $value") }
    }
}