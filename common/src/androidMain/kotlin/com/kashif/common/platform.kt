package com.kashif.common

import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import io.ktor.client.engine.android.*
import org.koin.dsl.module

actual fun platformModule() = module {
    single {
        Android.create()
    }
}

@Composable
actual fun VideoPlayer(modifier: Modifier, url: String){
    AndroidView(
        modifier = modifier,
        factory = { context ->
            VideoView(context).apply {
                setVideoPath(url)
                val mediaController = MediaController(context)
                mediaController.setAnchorView(this)
                setMediaController(mediaController)
                start()
            }
        },
        update = {})
}