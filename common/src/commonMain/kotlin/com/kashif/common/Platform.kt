package com.kashif.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.koin.core.module.Module

expect fun platformModule(): Module

@Composable
expect fun VideoPlayer(modifier: Modifier, url: String)
