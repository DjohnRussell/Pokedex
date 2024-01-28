package no.hiof.danieljr.pokedex.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import no.hiof.danieljr.pokedex.R


@Composable
fun login(painter : Painter) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
            Image(painter = painter, contentDescription = stringResource(R.string.logo),
                modifier = Modifier.padding(70.dp))

            Spacer(modifier = Modifier.height(45.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = stringResource(R.string.login))
            }
        }
}