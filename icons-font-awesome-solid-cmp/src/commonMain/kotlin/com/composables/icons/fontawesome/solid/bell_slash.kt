package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(633.82f, 458.1f)
                lineToRelative(-90.62f, -70.05f)
                curveToRelative(0.19f, -1.38f, 0.8f, -2.66f, 0.8f, -4.06f)
                curveToRelative(0.05f, -7.55f, -2.61f, -15.27f, -8.61f, -21.71f)
                curveToRelative(-19.32f, -20.76f, -55.47f, -51.99f, -55.47f, -154.29f)
                curveToRelative(0f, -77.7f, -54.48f, -139.9f, -127.94f, -155.16f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.32f, -32f, -31.98f, -32f)
                reflectiveCurveToRelative(-31.98f, 14.33f, -31.98f, 32f)
                verticalLineToRelative(20.84f)
                curveToRelative(-40.33f, 8.38f, -74.66f, 31.07f, -97.59f, 62.57f)
                lineTo(45.47f, 3.37f)
                curveTo(38.49f, -2.05f, 28.43f, -0.8f, 23.01f, 6.18f)
                lineTo(3.37f, 31.45f)
                curveTo(-2.05f, 38.42f, -0.8f, 48.47f, 6.18f, 53.9f)
                lineToRelative(588.35f, 454.73f)
                curveToRelative(6.98f, 5.43f, 17.03f, 4.17f, 22.46f, -2.81f)
                lineToRelative(19.64f, -25.27f)
                curveToRelative(5.42f, -6.97f, 4.17f, -17.02f, -2.81f, -22.45f)
                close()
                moveTo(157.23f, 251.54f)
                curveToRelative(-8.61f, 67.96f, -36.41f, 93.33f, -52.62f, 110.75f)
                curveToRelative(-6f, 6.45f, -8.66f, 14.16f, -8.61f, 21.71f)
                curveToRelative(0.11f, 16.4f, 12.98f, 32f, 32.1f, 32f)
                horizontalLineToRelative(241.92f)
                lineTo(157.23f, 251.54f)
                close()
                moveTo(320f, 512f)
                curveToRelative(35.32f, 0f, 63.97f, -28.65f, 63.97f, -64f)
                horizontalLineTo(256.03f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 63.97f, 64f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

