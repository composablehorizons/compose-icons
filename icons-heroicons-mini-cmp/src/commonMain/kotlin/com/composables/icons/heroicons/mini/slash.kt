package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Slash: ImageVector
    get() {
        if (_Slash != null) return _Slash!!
        
        _Slash = ImageVector.Builder(
            name = "slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.528f, 3.047f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.449f, 0.961f)
                lineTo(8.433f, 16.504f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.41f, -0.512f)
                lineToRelative(4.544f, -12.496f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.961f, -0.449f)
                close()
            }
        }.build()
        
        return _Slash!!
    }

private var _Slash: ImageVector? = null

