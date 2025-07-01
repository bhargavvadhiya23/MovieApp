package com.example.movieapp.widget

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.movieapp.model.Movie
import com.example.movieapp.model.getMovies

@Composable
fun MovieRow(
    movie: Movie = getMovies()[0],
    isEnable: Boolean = false,
    onItemClick: (String) -> Unit = {},
    isEnabel: Boolean,
) {
    var isExpended = remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .padding(vertical = 5.dp, horizontal = 5.dp)
            .fillMaxWidth()
//            .height(250.dp)
            .clickable {
                onItemClick(movie.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Surface(
                Modifier
                    .padding(2.dp)
                    .width(130.dp)
                    .height(214.dp),
                shape = RoundedCornerShape(corner = CornerSize(14.dp)),
                shadowElevation = 1.dp
            ) {
                AsyncImage(
                    model = movie.poster,
                    contentDescription = "",
                    Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Column(modifier = Modifier.padding(4.dp)) {
                Text(
                    movie.title,
                    style = TextStyle(
                        fontSize = 25.sp,
                        fontWeight = FontWeight(200),
                        fontFamily = FontFamily.Serif
                    )
                )
                Spacer(Modifier.height(35.dp))

                Text(
                    "Realeased : " + movie.year,
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(190),
                        fontFamily = FontFamily.Default
                    )
                )
                Spacer(Modifier.height(15.dp))

                Row {
                    Text(
                        "Directed By : ",
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight(390),
                            fontFamily = FontFamily.Default
                        )
                    )

                    Text(
                        movie.director,
                        style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight(290),
                            fontFamily = FontFamily.Default
                        )
                    )

                }
                Spacer(Modifier.height(15.dp))


                AnimatedVisibility(visible = isExpended.value) {
                    Row {
                        Text(
                            "Actors : ",
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight(390),
                                fontFamily = FontFamily.Default
                            )
                        )

                        Text(
                            movie.actors,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight(290),
                                fontFamily = FontFamily.Default
                            )
                        )

                    }
                }
                Spacer(modifier = Modifier.height(7.dp))
                HorizontalDivider()
                Spacer(modifier = Modifier.height(7.dp))
                AnimatedVisibility(
                    enter = fadeIn() + expandVertically(),
                    exit = fadeOut() + shrinkVertically(),
                    visible = isExpended.value
                )
                {
                    Row(Modifier.padding(5.dp)) {
                        Text(
                            "Plot : ",
                            style = TextStyle(
                                fontSize = 15.sp,
                                fontWeight = FontWeight(390),
                                fontFamily = FontFamily.Default
                            )
                        )
                        Text(
                            movie.plot,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontWeight = FontWeight(290),
                                fontFamily = FontFamily.Default
                            )
                        )
                    }
                }

Row(horizontalArrangement = Arrangement.Absolute.Right, modifier = Modifier.fillMaxWidth()) {

    Icon(
        modifier = Modifier.clickable {
            isExpended.value = !isExpended.value

        }.size(45.dp),
        imageVector =
        if (isExpended.value) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
        contentDescription = "Down Arrow"
    )
}

            }
        }
        AnimatedVisibility(isEnabel and isExpended.value) {
            Column {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start) {
                    Text(
                        "Writer ", Modifier.padding(all = 5.dp), style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight(390),
                            fontFamily = FontFamily.Default
                        )
                    )

                    Text(
                        movie.writer, style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight(290),
                            fontFamily = FontFamily.Default
                        )
                    )

                }

                HorizontalDivider()
                Spacer(Modifier.height(15.dp))
                Text(
                    "Story Line : ", Modifier.padding(all = 5.dp), style = TextStyle(
                        fontSize = 13.sp,
                        fontWeight = FontWeight(390),
                        fontFamily = FontFamily.Default
                    )
                )
//            Spacer(Modifier.height(15.dp))
                Row(Modifier.padding(horizontal = 8.dp)) {
                    Text(
                        movie.storyline, style = TextStyle(
                            fontSize = 13.sp,
                            fontWeight = FontWeight(290),
                            fontFamily = FontFamily.Default
                        )
                    )
                }
            }
        }
    }
}