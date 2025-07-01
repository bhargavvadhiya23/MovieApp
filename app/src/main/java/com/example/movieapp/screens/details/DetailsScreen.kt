package com.example.movieapp.screens.details

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.movieapp.model.getMovies
import com.example.movieapp.widget.MovieRow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, movieData: String? = "0") {
    var movie = getMovies()

    var id = movieData?.toInt()!! - 1;

    Scaffold(topBar = {
        TopAppBar(
            title = {
                Text(
                    "Movie Details",
                    style = TextStyle(fontWeight = FontWeight(700), fontSize = 22.sp)
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surfaceContainerHigh),
            navigationIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back Arrow",
                    modifier = Modifier
                        .clickable {
                            navController.popBackStack()
                        }
                        .padding(horizontal = 10.dp)
                )
            }
        )
    })
    {
        Surface(modifier = Modifier) {
            Column(
                modifier = Modifier.padding(top = 114.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                MovieRow(movie = getMovies()[id],isEnabel = true)

                Spacer(Modifier.height(15.dp))

                Divider()
                LazyRow {
                    items(getMovies()[id].images) { image ->
                        Card(
                            modifier = Modifier
                                .padding(12.dp),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .background(Color.Gray)
                                    .padding(vertical = 5.dp)
                            ) {

                                AsyncImage(
                                    model = image,
                                    contentDescription = "Movie Sc",
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }
                    }
                }

            }
        }
    }
}


