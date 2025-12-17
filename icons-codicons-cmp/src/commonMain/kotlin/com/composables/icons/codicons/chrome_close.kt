package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChromeClose: ImageVector
    get() {
        if (_ChromeClose != null) return _ChromeClose!!
        
        _ChromeClose = ImageVector.Builder(
            name = "chrome-close",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.58859f, 2.71569f)
                lineTo(2.64645f, 2.64645f)
                curveTo(2.82001f, 2.47288f, 3.08944f, 2.4536f, 3.28431f, 2.58859f)
                lineTo(3.35355f, 2.64645f)
                lineTo(8f, 7.293f)
                lineTo(12.6464f, 2.64645f)
                curveTo(12.8417f, 2.45118f, 13.1583f, 2.45118f, 13.3536f, 2.64645f)
                curveTo(13.5488f, 2.84171f, 13.5488f, 3.15829f, 13.3536f, 3.35355f)
                lineTo(8.707f, 8f)
                lineTo(13.3536f, 12.6464f)
                curveTo(13.5271f, 12.82f, 13.5464f, 13.0894f, 13.4114f, 13.2843f)
                lineTo(13.3536f, 13.3536f)
                curveTo(13.18f, 13.5271f, 12.9106f, 13.5464f, 12.7157f, 13.4114f)
                lineTo(12.6464f, 13.3536f)
                lineTo(8f, 8.707f)
                lineTo(3.35355f, 13.3536f)
                curveTo(3.15829f, 13.5488f, 2.84171f, 13.5488f, 2.64645f, 13.3536f)
                curveTo(2.45118f, 13.1583f, 2.45118f, 12.8417f, 2.64645f, 12.6464f)
                lineTo(7.293f, 8f)
                lineTo(2.64645f, 3.35355f)
                curveTo(2.47288f, 3.17999f, 2.4536f, 2.91056f, 2.58859f, 2.71569f)
                lineTo(2.64645f, 2.64645f)
                lineTo(2.58859f, 2.71569f)
                close()
            }
        }.build()
        
        return _ChromeClose!!
    }

private var _ChromeClose: ImageVector? = null

