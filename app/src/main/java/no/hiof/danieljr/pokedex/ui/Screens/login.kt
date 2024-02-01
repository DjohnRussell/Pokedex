package no.hiof.danieljr.pokedex.ui.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import no.hiof.danieljr.pokedex.Models.loadImage
import no.hiof.danieljr.pokedex.R


@Composable
fun login( takeMeHome: () -> Unit, account: () -> Unit) {

    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {



        loadImage(path = "https://cdn.pixabay.com/photo/2016/08/15/00/50/pokeball-1594373_1280.png",
            450, 250)




        Spacer(modifier = Modifier.height(200.dp))

            Row(verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                buttons(unitFun = takeMeHome, string = "login" )
                buttons(unitFun = { account() }, string = "Create")
            }
        }
}


//Making a general button, that takes a Unit function as a param -> to navigate to home/account<- to make an account
@Composable
fun buttons(unitFun : () -> Unit, string: String){
    Button(onClick = { unitFun() },
        modifier = Modifier) {
        Text(text = string)
    }
}



