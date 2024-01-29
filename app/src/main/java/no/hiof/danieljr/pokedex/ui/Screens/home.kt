package no.hiof.danieljr.pokedex.ui.Screens

import androidx.compose.runtime.Composable
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun home() {
        //ToDo - fix the pics. and make logic to desplay diffrent pokemon based on seartches
    GlideImage(model = "https://www.pngegg.com/en/png-cygki", contentDescription = "Blastoise pic")



    }
