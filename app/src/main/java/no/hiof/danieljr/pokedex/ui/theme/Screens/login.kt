package no.hiof.danieljr.pokedex.ui.theme.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter


@Composable
fun login (painer: Painter){

    Column() {
        Image(painter = painer, contentDescription = "pokedex logo")
    }
}