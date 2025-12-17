package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bacon: ImageVector
    get() {
        if (_Bacon != null) return _Bacon!!
        
        _Bacon = ImageVector.Builder(
            name = "bacon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(218.92f, 336.39f)
                curveToRelative(34.89f, -34.89f, 44.2f, -59.7f, 54.05f, -86f)
                curveToRelative(10.61f, -28.29f, 21.59f, -57.54f, 61.37f, -97.34f)
                reflectiveCurveToRelative(69.05f, -50.77f, 97.35f, -61.38f)
                curveToRelative(23.88f, -9f, 46.64f, -17.68f, 76.79f, -45.37f)
                lineTo(470.81f, 8.91f)
                arcToRelative(31f, 31f, 0f, false, false, -40.18f, -2.83f)
                curveToRelative(-13.64f, 10.1f, -25.15f, 14.39f, -41f, 20.3f)
                curveTo(247f, 79.52f, 209.26f, 191.29f, 200.65f, 214.1f)
                curveToRelative(-29.75f, 78.83f, -89.55f, 94.68f, -98.72f, 98.09f)
                curveToRelative(-24.86f, 9.26f, -54.73f, 20.38f, -91.07f, 50.36f)
                curveTo(-3f, 374f, -3.63f, 395f, 9.07f, 407.61f)
                lineToRelative(35.76f, 35.51f)
                curveTo(80f, 410.52f, 107f, 400.15f, 133f, 390.39f)
                curveToRelative(26.27f, -9.84f, 51.06f, -19.12f, 85.92f, -54f)
                close()
                moveToRelative(348f, -232f)
                lineToRelative(-35.75f, -35.51f)
                curveToRelative(-35.19f, 32.63f, -62.18f, 43f, -88.25f, 52.79f)
                curveToRelative(-26.26f, 9.85f, -51.06f, 19.16f, -85.95f, 54f)
                reflectiveCurveToRelative(-44.19f, 59.69f, -54f, 86f)
                curveTo(292.33f, 290f, 281.34f, 319.22f, 241.55f, 359f)
                reflectiveCurveToRelative(-69f, 50.73f, -97.3f, 61.32f)
                curveToRelative(-23.86f, 9f, -46.61f, 17.66f, -76.72f, 45.33f)
                lineToRelative(37.68f, 37.43f)
                arcToRelative(31f, 31f, 0f, false, false, 40.18f, 2.82f)
                curveToRelative(13.6f, -10.06f, 25.09f, -14.34f, 40.94f, -20.24f)
                curveToRelative(142.2f, -53f, 180f, -164.1f, 188.94f, -187.69f)
                curveTo(405f, 219.18f, 464.8f, 203.3f, 474f, 199.86f)
                curveToRelative(24.87f, -9.27f, 54.74f, -20.4f, 91.11f, -50.41f)
                curveToRelative(13.89f, -11.4f, 14.52f, -32.45f, 1.82f, -45.05f)
                close()
            }
        }.build()
        
        return _Bacon!!
    }

private var _Bacon: ImageVector? = null

