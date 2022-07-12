package com.example.rsvr.ui.profile_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rsvr.ui.theme.LocalSpacing
import com.example.rsvr.util.similarMovies


@Composable
fun SimilarMovies() {
    val spacing = LocalSpacing.current
    val modifier = Modifier
        .height(250.dp)
        .width(160.dp)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(spacing.medium)
    ) {
        Text(
            text = "Similar Movies",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.White
        )

        LazyRow {
            items(similarMovies) { link ->
                PosterImage(
                    link = link,
                    modifier = modifier,
                    showPlayIcon = false,
                    contentScale = ContentScale.FillHeight
                )
            }
        }
    }
}