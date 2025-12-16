package com.composables.icons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composables.icons.codicons.Codicons
import com.composables.icons.codicons.TerminalTmux
import com.composables.icons.codicons.ThreeBars
import com.composables.icons.feather.Feather
import com.composables.icons.feather.Star
import com.composables.icons.lucide.AppWindow
import com.composables.icons.lucide.Lucide
import com.composables.icons.radix.Radix
import com.composables.icons.radix.Timer
import com.composeunstyled.Icon

@Composable
fun App() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = Lucide.AppWindow,
            contentDescription = "App Window",
        )
        Icon(
            imageVector = Feather.Star,
            contentDescription = "Star",
        )
        Icon(
            imageVector = Radix.Timer,
            contentDescription = "Star",
        )
        Icon(
            imageVector = Codicons.TerminalTmux,
            contentDescription = "Star",
        )
    }
}
