package com.example.rsvr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.rsvr.ui.profile_screen.ProfileScreen
import com.example.rsvr.ui.theme.MyApp
import com.example.rsvr.ui.theme.RSVRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                ProfileScreen()
            }
        }
    }
}