package com.example.rsvr.ui.theme

import androidx.compose.runtime.Composable


@Composable
fun MyApp(content: @Composable () -> Unit) {
    RSVRTheme {
        content()
    }
}