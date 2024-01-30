package no.hiof.danieljr.pokedex.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import no.hiof.danieljr.pokedex.R


@Composable
fun login(painter : Painter, takeMeHome: () -> Unit, account: () -> Unit) {

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
            Image(painter = painter, contentDescription = stringResource(R.string.logo),
                modifier = Modifier)

            Spacer(modifier = Modifier.height(65.dp))
        
            Row(verticalAlignment = Alignment.CenterVertically) {
                buttons(unitFun = takeMeHome, string = "login" )
                Spacer(modifier = Modifier.height(5.dp))
                buttons(unitFun = { account() }, string = "create")
            }

        }
}

@Composable
fun buttons(unitFun : () -> Unit, string: String){
    Button(onClick = { unitFun() },
        modifier = Modifier.padding(120.dp)) {
        Text(text = string)
    }
}