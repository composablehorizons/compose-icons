package com.composables.icons

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.composables.icons.lucide.AppWindow
import com.composables.icons.lucide.Lucide
import com.composeunstyled.Icon

@Composable
fun App() {
    Icon(
        Lucide.AppWindow,
        contentDescription = "iconId",
        tint = Color.Red,
        modifier = Modifier.size(95.dp),
    )
}
