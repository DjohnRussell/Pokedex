package no.hiof.danieljr.pokedex.ui.theme.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import no.hiof.danieljr.pokedex.R


@Composable
fun welcome (painer: Painter, click: () -> Unit){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painer, contentDescription = stringResource(R.string.pokedex_logo),
            modifier = Modifier
                .fillMaxSize()
                .clickable {click()})
    }

    }
