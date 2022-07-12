package com.example.rsvr.ui.profile_screen.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rsvr.R
import com.example.rsvr.ui.theme.LightRed
import com.example.rsvr.ui.theme.LocalSpacing


@Composable
fun DetailCard() {
    val spacing = LocalSpacing.current
    var showDetails by remember { mutableStateOf(false) }
    var buttonText by remember { mutableStateOf("Read More") }
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Card(
            modifier = Modifier
                .padding(horizontal = spacing.medium, vertical = spacing.large)
                .background(color = Color.White, shape = RectangleShape),
            elevation = 0.dp
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {

                Text(
                    text = "Deadpool 2",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(spacing.small)
                )

                Row(modifier = Modifier.fillMaxWidth()) {
                    Tag(text = "IMOB", color = Color.Yellow, withIcon = true)
                    Tag(text = "Action", color = Color.Red.copy(alpha = 0.7f))
                    Tag(text = "Comedy", color = Color.Magenta)
                }

                Tag(text = "Science Fiction", color = Color.Red.copy(alpha = 0.2f))

                Text(
                    text = stringResource(id = R.string.detail_text),
                    modifier = Modifier.padding(horizontal = spacing.small),
                    style = MaterialTheme.typography.caption
                )

                Row(modifier = Modifier.padding(spacing.small)) {
                    Tag(text = "Post Production", color = Color.Blue.copy(alpha = 0.4f))
                    Text(
                        text = "May 15th, 2018",
                        modifier = Modifier.padding(start = spacing.large, top = spacing.medium),
                        style = MaterialTheme.typography.body2
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(spacing.small),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = buttonText,
                        color = Color.Blue,
                        textDecoration = TextDecoration.Underline,
                        style = MaterialTheme.typography.body2,
                        modifier = Modifier.clickable(
                            interactionSource = MutableInteractionSource(),
                            indication = null
                        ) {
                            if (showDetails) {
                                buttonText = "Read More"
                                showDetails = false
                            } else {
                                buttonText = "Read Less"
                                showDetails = true
                            }
                        }
                    )
                }
                AnimatedVisibility(
                    visible = showDetails,
                    enter = expandVertically(),
                    exit = shrinkVertically()
                ) {
                    CastAndCrew()
                }
            }
        }

        IconButton(
            onClick = { },
            modifier = Modifier
                .padding(end = spacing.large)
                .background(
                    color = Color.LightRed,
                    shape = CircleShape
                )
                .align(Alignment.TopEnd)
        ) {
            Icon(
                imageVector = Icons.Filled.Favorite,
                contentDescription = null,
                tint = Color.White
            )
        }
    }
}