package com.example.app_sebas.presentation.componentes

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.*
import com.example.app_sebas.R

@Composable

fun ToggleChipExample(){
    val imagen3 = painterResource(id = R.drawable.llamar)
    var checked by remember { mutableStateOf(true) }

    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
        ToggleChip(
            label = {
                Text(text = "Tilin", maxLines = 1, overflow = TextOverflow.Ellipsis)
            },
            checked = checked,
            //
        colors = ToggleChipDefaults.toggleChipColors(
            uncheckedToggleControlColor = ToggleChipDefaults.SwitchUncheckedIconColor
        ),
            toggleControl = {
                Switch(
                    checked = checked,
                    enabled = true,
                    modifier = Modifier.semantics{
                        this.contentDescription =
                            if(checked) "On" else "Off"
                    }
                )
            },
            onCheckedChange = {checked = it },
            appIcon = {
               Icon(
                   painter = imagen3,
                   contentDescription = "call",
                   modifier = Modifier
                       .size(24.dp)
                       .wrapContentSize(align = Alignment.Center),
               )
            },
            enabled = true,
        )
    }
}