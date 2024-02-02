package no.hiof.danieljr.pokedex.ui.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import no.hiof.danieljr.pokedex.Models.PathsToImages
import no.hiof.danieljr.pokedex.Models.loadImage

import no.hiof.danieljr.pokedex.R


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun home() {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

                PokeCard(path = PathsToImages().diglett, height = 350 , width = 250, "Diglett")


        }
    



    }

@Composable
fun PokeCard(path : String, height : Int, width : Int, name: String) {
    Card(modifier = Modifier
        .clickable { }
        .padding(30.dp)
    ) {

        loadImage(path = path, height, width = width)
        Text(text = name, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
    }
    }



