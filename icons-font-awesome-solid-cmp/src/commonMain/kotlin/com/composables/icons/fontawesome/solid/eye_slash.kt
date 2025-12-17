package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.EyeSlash: ImageVector
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
                moveTo(320f, 400f)
                curveToRelative(-75.85f, 0f, -137.25f, -58.71f, -142.9f, -133.11f)
                lineTo(72.2f, 185.82f)
                curveToRelative(-13.79f, 17.3f, -26.48f, 35.59f, -36.72f, 55.59f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, 29.19f)
                curveTo(89.71f, 376.41f, 197.07f, 448f, 320f, 448f)
                curveToRelative(26.91f, 0f, 52.87f, -4f, 77.89f, -10.46f)
                lineTo(346f, 397.39f)
                arcToRelative(144.13f, 144.13f, 0f, false, true, -26f, 2.61f)
                close()
                moveToRelative(313.82f, 58.1f)
                lineToRelative(-110.55f, -85.44f)
                arcToRelative(331.25f, 331.25f, 0f, false, false, 81.25f, -102.07f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, -29.19f)
                curveTo(550.29f, 135.59f, 442.93f, 64f, 320f, 64f)
                arcToRelative(308.15f, 308.15f, 0f, false, false, -147.32f, 37.7f)
                lineTo(45.46f, 3.37f)
                arcTo(16f, 16f, 0f, false, false, 23f, 6.18f)
                lineTo(3.37f, 31.45f)
                arcTo(16f, 16f, 0f, false, false, 6.18f, 53.9f)
                lineToRelative(588.36f, 454.73f)
                arcToRelative(16f, 16f, 0f, false, false, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                arcToRelative(16f, 16f, 0f, false, false, -2.82f, -22.45f)
                close()
                moveToRelative(-183.72f, -142f)
                lineToRelative(-39.3f, -30.38f)
                arcTo(94.75f, 94.75f, 0f, false, false, 416f, 256f)
                arcToRelative(94.76f, 94.76f, 0f, false, false, -121.31f, -92.21f)
                arcTo(47.65f, 47.65f, 0f, false, true, 304f, 192f)
                arcToRelative(46.64f, 46.64f, 0f, false, true, -1.54f, 10f)
                lineToRelative(-73.61f, -56.89f)
                arcTo(142.31f, 142.31f, 0f, false, true, 320f, 112f)
                arcToRelative(143.92f, 143.92f, 0f, false, true, 144f, 144f)
                curveToRelative(0f, 21.63f, -5.29f, 41.79f, -13.9f, 60.11f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null

