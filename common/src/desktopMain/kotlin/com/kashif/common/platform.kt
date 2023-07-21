package com.kashif.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.ktor.client.engine.java.*
import org.koin.dsl.module

actual fun platformModule() = module { single { Java.create() } }

@Composable
actual fun VideoPlayer(modifier: Modifier, url: String) {


    Column {
        VideoPlayerImpl(
            url = url,
            modifier = Modifier.fillMaxWidth().height(400.dp))
    }
}
