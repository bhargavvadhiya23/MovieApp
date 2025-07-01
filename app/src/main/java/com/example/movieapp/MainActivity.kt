package com.example.movieapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapp.model.Movie
import com.example.movieapp.navigation.MovieNavigation
import com.example.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp {

                MovieNavigation()

            }
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyApp(content: @Composable () -> Unit) {
    MovieAppTheme {

content()

    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(label:String) = TopAppBar(
    title = { Text(label, style = TextStyle(fontWeight = FontWeight(700), fontSize = 22.sp)) },
    colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.surfaceContainerHigh),
    navigationIcon = {
        Icon(painter = painterResource(R.drawable.moviex), contentDescription = "MovieIcon")
    }
)






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApp {
       MovieNavigation()
    }
}