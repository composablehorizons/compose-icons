package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) return _EyeSlash!!
        
        _EyeSlash = ImageVector.Builder(
            name = "eye-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(634f, 471f)
                lineTo(36f, 3.51f)
                arcTo(16f, 16f, 0f, false, false, 13.51f, 6f)
                lineToRelative(-10f, 12.49f)
                arcTo(16f, 16f, 0f, false, false, 6f, 41f)
                lineToRelative(598f, 467.49f)
                arcToRelative(16f, 16f, 0f, false, false, 22.49f, -2.49f)
                lineToRelative(10f, -12.49f)
                arcTo(16f, 16f, 0f, false, false, 634f, 471f)
                close()
                moveTo(296.79f, 146.47f)
                lineToRelative(134.79f, 105.38f)
                curveTo(429.36f, 191.91f, 380.48f, 144f, 320f, 144f)
                arcToRelative(112.26f, 112.26f, 0f, false, false, -23.21f, 2.47f)
                close()
                moveToRelative(46.42f, 219.07f)
                lineTo(208.42f, 260.16f)
                curveTo(210.65f, 320.09f, 259.53f, 368f, 320f, 368f)
                arcToRelative(113f, 113f, 0f, false, false, 23.21f, -2.46f)
                close()
                moveTo(320f, 112f)
                curveToRelative(98.65f, 0f, 189.09f, 55f, 237.93f, 144f)
                arcToRelative(285.53f, 285.53f, 0f, false, true, -44f, 60.2f)
                lineToRelative(37.74f, 29.5f)
                arcToRelative(333.7f, 333.7f, 0f, false, false, 52.9f, -75.11f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, -29.19f)
                curveTo(550.29f, 135.59f, 442.93f, 64f, 320f, 64f)
                curveToRelative(-36.7f, 0f, -71.71f, 7f, -104.63f, 18.81f)
                lineToRelative(46.41f, 36.29f)
                curveToRelative(18.94f, -4.3f, 38.34f, -7.1f, 58.22f, -7.1f)
                close()
                moveToRelative(0f, 288f)
                curveToRelative(-98.65f, 0f, -189.08f, -55f, -237.93f, -144f)
                arcToRelative(285.47f, 285.47f, 0f, false, true, 44.05f, -60.19f)
                lineToRelative(-37.74f, -29.5f)
                arcToRelative(333.6f, 333.6f, 0f, false, false, -52.89f, 75.1f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, 29.19f)
                curveTo(89.72f, 376.41f, 197.08f, 448f, 320f, 448f)
                curveToRelative(36.7f, 0f, 71.71f, -7.05f, 104.63f, -18.81f)
                lineToRelative(-46.41f, -36.28f)
                curveTo(359.28f, 397.2f, 339.89f, 400f, 320f, 400f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null

