package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Star: ImageVector
    get() {
        if (_Star != null) return _Star!!
        
        _Star = ImageVector.Builder(
            name = "star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.868f, 2.884f)
                curveToRelative(-0.321f, -0.772f, -1.415f, -0.772f, -1.736f, 0f)
                lineToRelative(-1.83f, 4.401f)
                lineToRelative(-4.753f, 0.381f)
                curveToRelative(-0.833f, 0.067f, -1.171f, 1.107f, -0.536f, 1.651f)
                lineToRelative(3.62f, 3.102f)
                lineToRelative(-1.106f, 4.637f)
                curveToRelative(-0.194f, 0.813f, 0.691f, 1.456f, 1.405f, 1.02f)
                lineTo(10f, 15.591f)
                lineToRelative(4.069f, 2.485f)
                curveToRelative(0.713f, 0.436f, 1.598f, -0.207f, 1.404f, -1.02f)
                lineToRelative(-1.106f, -4.637f)
                lineToRelative(3.62f, -3.102f)
                curveToRelative(0.635f, -0.544f, 0.297f, -1.584f, -0.536f, -1.65f)
                lineToRelative(-4.752f, -0.382f)
                lineToRelative(-1.831f, -4.401f)
                close()
            }
        }.build()
        
        return _Star!!
    }

private var _Star: ImageVector? = null

