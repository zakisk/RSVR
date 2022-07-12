package com.example.rsvr.ui.profile_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.rsvr.ui.theme.LocalSpacing
import com.example.rsvr.util.cast
import com.example.rsvr.util.crew


@Composable
fun CastAndCrew() {
    val spacing = LocalSpacing.current
    Column(modifier = Modifier.padding(spacing.medium)) {
        Text(
            text = "Cast",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        LazyRow(
            modifier = Modifier.padding(
                horizontal = spacing.small,
                vertical = spacing.medium
            )
        ) {
            items(cast) { link ->
                CircleImage(link = link)
            }
        }
        Divider(thickness = 0.8.dp)
        Text(
            text = "Crew",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        LazyRow(
            modifier = Modifier.padding(
                horizontal = spacing.small,
                vertical = spacing.medium
            )
        ) {
            items(crew) { link ->
                CircleImage(link = link)
            }
        }
    }
}