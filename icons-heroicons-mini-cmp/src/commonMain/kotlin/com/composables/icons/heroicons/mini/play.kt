package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Play: ImageVector
    get() {
        if (_Play != null) return _Play!!
        
        _Play = ImageVector.Builder(
            name = "play",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.3f, 2.84f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 4.11f)
                verticalLineToRelative(11.78f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 2.3f, 1.27f)
                lineToRelative(9.344f, -5.891f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -2.538f)
                lineTo(6.3f, 2.841f)
                close()
            }
        }.build()
        
        return _Play!!
    }

private var _Play: ImageVector? = null

