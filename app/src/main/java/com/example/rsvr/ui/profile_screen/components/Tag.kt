package com.example.rsvr.ui.profile_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.example.rsvr.ui.theme.LocalCustomShapes
import com.example.rsvr.ui.theme.LocalSpacing


@Composable
fun Tag(text: String, withIcon: Boolean = false, color: Color) {
    val spacing = LocalSpacing.current
    val shape = LocalCustomShapes.current.smallShape
    var size by remember { mutableStateOf(Size.Zero) }
    val height: @Composable () -> Dp = { with(LocalDensity.current) { size.height.toDp() } }
    Row(
        modifier = Modifier
            .padding(spacing.extraSmall)
            .background(color = color, shape = shape)
    ) {
        Text(
            text = text,
            fontWeight = if (withIcon) FontWeight.Bold else FontWeight.Normal,
            fontSize = 10.sp,
            color = if (withIcon) Color.Black else Color.White,
            modifier = Modifier
                .padding(spacing.small)
                .onGloballyPositioned { size = it.size.toSize() }
        )
        if (withIcon) {
            Icon(
                imageVector = Icons.Filled.Star,
                contentDescription = null,
                tint = if (withIcon) Color.Black else Color.White,
                modifier = Modifier.padding(spacing.small).size(height()),
            )
        }
    }
}