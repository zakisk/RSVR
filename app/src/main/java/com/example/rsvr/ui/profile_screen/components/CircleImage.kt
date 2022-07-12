package com.example.rsvr.ui.profile_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.rsvr.ui.theme.LocalSpacing


@Composable
fun CircleImage(link: String) {
    val spacing = LocalSpacing.current
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = link,
            contentDescription = null,
            modifier = Modifier
                .size(96.dp)
                .padding(spacing.small)
                .clip(CircleShape),
            contentScale = ContentScale.Fit
        )
        ImageText(text = "Cartoon")
        ImageText(text = "Character")
    }
}

@Composable
fun ImageText(text: String) {
    Text(
        text = text,
        color = Color.LightGray,
        style = MaterialTheme.typography.overline
    )
}