package no.hiof.danieljr.pokedex.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import no.hiof.danieljr.pokedex.R
import no.hiof.danieljr.pokedex.ui.Screens.Login
import no.hiof.danieljr.pokedex.ui.Screens.accountSetUp
import no.hiof.danieljr.pokedex.ui.Screens.home
import no.hiof.danieljr.pokedex.ui.theme.Screens.welcome

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LauchApp() {
    val navController = rememberNavController()
//TODO - Topbar and navbar(Buttonbar)-> not implemented yet, fix it. was thinging to use a poke-ball as a icon to home, look into colors.
    Scaffold(topBar = {
        TopAppBar(title = { "Gotta catch em all"})
    }) {innerPadding ->
        NavHost(navController = navController,
            startDestination = AppScreen.Welcome.name,
            Modifier.padding(innerPadding)) {

            composable(AppScreen.Welcome.name) {
                welcome(painer = painterResource(id = R.drawable.pok_dex_logo),
                click = { navController.navigate(AppScreen.Login.name)})
            }

            composable(AppScreen.Login.name) { Login(takeMeHome = { navController.navigate(AppScreen.Home.name)},
                account = { navController.navigate(AppScreen.account.name)})}

            composable(AppScreen.Home.name) { home()}

            composable(AppScreen.account.name) { accountSetUp()}


        }
    }



}