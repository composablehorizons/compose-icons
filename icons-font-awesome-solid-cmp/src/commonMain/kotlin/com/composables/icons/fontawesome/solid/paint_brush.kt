package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) return _PaintBrush!!
        
        _PaintBrush = ImageVector.Builder(
            name = "paint-brush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(167.02f, 309.34f)
                curveToRelative(-40.12f, 2.58f, -76.53f, 17.86f, -97.19f, 72.3f)
                curveToRelative(-2.35f, 6.21f, -8f, 9.98f, -14.59f, 9.98f)
                curveToRelative(-11.11f, 0f, -45.46f, -27.67f, -55.25f, -34.35f)
                curveTo(0f, 439.62f, 37.93f, 512f, 128f, 512f)
                curveToRelative(75.86f, 0f, 128f, -43.77f, 128f, -120.19f)
                curveToRelative(0f, -3.11f, -0.65f, -6.08f, -0.97f, -9.13f)
                lineToRelative(-88.01f, -73.34f)
                close()
                moveTo(457.89f, 0f)
                curveToRelative(-15.16f, 0f, -29.37f, 6.71f, -40.21f, 16.45f)
                curveTo(213.27f, 199.05f, 192f, 203.34f, 192f, 257.09f)
                curveToRelative(0f, 13.7f, 3.25f, 26.76f, 8.73f, 38.7f)
                lineToRelative(63.82f, 53.18f)
                curveToRelative(7.21f, 1.8f, 14.64f, 3.03f, 22.39f, 3.03f)
                curveToRelative(62.11f, 0f, 98.11f, -45.47f, 211.16f, -256.46f)
                curveToRelative(7.38f, -14.35f, 13.9f, -29.85f, 13.9f, -45.99f)
                curveTo(512f, 20.64f, 486f, 0f, 457.89f, 0f)
                close()
            }
        }.build()
        
        return _PaintBrush!!
    }

private var _PaintBrush: ImageVector? = null

