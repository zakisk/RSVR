package com.example.rsvr.ui.profile_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.example.rsvr.ui.theme.LocalCustomShapes
import com.example.rsvr.ui.theme.LocalSpacing


@Composable
fun PosterImage(
    link: String,
    modifier: Modifier,
    showPlayIcon: Boolean = true,
    contentScale: ContentScale = ContentScale.FillBounds
) {
    val spacing = LocalSpacing.current
    val oval = LocalCustomShapes.current.ovalShape
    Box(
        modifier = modifier
            .padding(spacing.small)
    ) {
        AsyncImage(
            modifier = modifier,
            model = link,
            contentDescription = null,
            filterQuality = FilterQuality.High,
            contentScale = contentScale
        )

        if (showPlayIcon) {
            Icon(
                modifier = Modifier
                    .align(Alignment.Center)
                    .background(color = Color.LightGray.copy(alpha = 0.2f), shape = oval)
                    .padding(spacing.medium),
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = null,
                tint = Color.LightGray
            )
        }
    }
}