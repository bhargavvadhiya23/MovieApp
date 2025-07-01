package com.example.movieapp.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.TopBar
import com.example.movieapp.model.Movie
import com.example.movieapp.model.getMovies
import com.example.movieapp.navigation.MovieScreens
import com.example.movieapp.widget.MovieRow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(topBar = { TopBar("Movies") }) {
        MainContent(navController=navController)
    }
}
@Composable
fun MainContent(
    navController: NavController,
    moviesList: List<Movie> = getMovies(),
) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .padding(12.dp)
    ) {
        LazyColumn {
            items(items = moviesList) {
                MovieRow(it, onItemClick = { movie ->
                    navController.navigate(MovieScreens.DetailsScreen.name+"/$movie")
                }, isEnabel = false)
            }
        }
    }

}