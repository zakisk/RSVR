package com.example.rsvr.ui.profile_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.rsvr.ui.profile_screen.components.DetailCard
import com.example.rsvr.ui.profile_screen.components.MainImage
import com.example.rsvr.ui.profile_screen.components.SimilarMovies


@Composable
fun ProfileScreen() {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.DarkGray)
    ) {
        item {
            MainImage()
            DetailCard()
            SimilarMovies()
        }
    }
}