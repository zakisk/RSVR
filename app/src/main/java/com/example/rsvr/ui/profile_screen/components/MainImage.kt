package com.example.rsvr.ui.profile_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.rsvr.ui.theme.LocalSpacing
import com.example.rsvr.util.posters


@Composable
fun MainImage() {
    val spacing = LocalSpacing.current
    val modifier = Modifier
            .height(160.dp)
            .width(250.dp)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .padding(spacing.small)
    ) {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            model = "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/04eafb25626631.5634844b7293f.jpg",
            contentDescription = null,
            filterQuality = FilterQuality.High,
            contentScale = ContentScale.Crop
        )

        LazyRow(modifier = Modifier.align(Alignment.BottomCenter)) {
            items(posters) { link ->
                PosterImage(link = link, modifier = modifier)
            }
        }
    }
}