package com.kashif.common

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun App(platform: String) {
    var text by remember { mutableStateOf("Hello, World!") }

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround) {
                VideoPlayer(
                    modifier = Modifier.fillMaxWidth().height(400.dp),
                    url =
                        "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4")

                Button(onClick = { text = "Hello, $platform" }) { Text(text) }
            }
    }
}
