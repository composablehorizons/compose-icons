package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dungeon: ImageVector
    get() {
        if (_Dungeon != null) return _Dungeon!!
        
        _Dungeon = ImageVector.Builder(
            name = "dungeon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128.73f, 195.32f)
                lineToRelative(-82.81f, -51.76f)
                curveToRelative(-8.04f, -5.02f, -18.99f, -2.17f, -22.93f, 6.45f)
                arcTo(254.19f, 254.19f, 0f, false, false, 0.54f, 239.28f)
                curveTo(-0.05f, 248.37f, 7.59f, 256f, 16.69f, 256f)
                horizontalLineToRelative(97.13f)
                curveToRelative(7.96f, 0f, 14.08f, -6.25f, 15.01f, -14.16f)
                curveToRelative(1.09f, -9.33f, 3.24f, -18.33f, 6.24f, -26.94f)
                curveToRelative(2.56f, -7.34f, 0.25f, -15.46f, -6.34f, -19.58f)
                close()
                moveTo(319.03f, 8f)
                curveTo(298.86f, 2.82f, 277.77f, 0f, 256f, 0f)
                reflectiveCurveToRelative(-42.86f, 2.82f, -63.03f, 8f)
                curveToRelative(-9.17f, 2.35f, -13.91f, 12.6f, -10.39f, 21.39f)
                lineToRelative(37.47f, 104.03f)
                arcTo(16.003f, 16.003f, 0f, false, false, 235.1f, 144f)
                horizontalLineToRelative(41.8f)
                curveToRelative(6.75f, 0f, 12.77f, -4.23f, 15.05f, -10.58f)
                lineToRelative(37.47f, -104.03f)
                curveToRelative(3.52f, -8.79f, -1.22f, -19.03f, -10.39f, -21.39f)
                close()
                moveTo(112f, 288f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(96f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(0f, 128f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(96f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(77.31f, -283.67f)
                lineToRelative(-36.32f, -90.8f)
                curveToRelative(-3.53f, -8.83f, -14.13f, -12.99f, -22.42f, -8.31f)
                arcToRelative(257.308f, 257.308f, 0f, false, false, -71.61f, 59.89f)
                curveToRelative(-6.06f, 7.32f, -3.85f, 18.48f, 4.22f, 23.52f)
                lineToRelative(82.93f, 51.83f)
                curveToRelative(6.51f, 4.07f, 14.66f, 2.62f, 20.11f, -2.79f)
                curveToRelative(5.18f, -5.15f, 10.79f, -9.85f, 16.79f, -14.05f)
                curveToRelative(6.28f, -4.41f, 9.15f, -12.17f, 6.3f, -19.29f)
                close()
                moveTo(398.18f, 256f)
                horizontalLineToRelative(97.13f)
                curveToRelative(9.1f, 0f, 16.74f, -7.63f, 16.15f, -16.72f)
                arcToRelative(254.135f, 254.135f, 0f, false, false, -22.45f, -89.27f)
                curveToRelative(-3.94f, -8.62f, -14.89f, -11.47f, -22.93f, -6.45f)
                lineToRelative(-82.81f, 51.76f)
                curveToRelative(-6.59f, 4.12f, -8.9f, 12.24f, -6.34f, 19.58f)
                curveToRelative(3.01f, 8.61f, 5.15f, 17.62f, 6.24f, 26.94f)
                curveToRelative(0.93f, 7.91f, 7.05f, 14.16f, 15.01f, 14.16f)
                close()
                moveToRelative(54.85f, -162.89f)
                arcToRelative(257.308f, 257.308f, 0f, false, false, -71.61f, -59.89f)
                curveToRelative(-8.28f, -4.68f, -18.88f, -0.52f, -22.42f, 8.31f)
                lineToRelative(-36.32f, 90.8f)
                curveToRelative(-2.85f, 7.12f, 0.02f, 14.88f, 6.3f, 19.28f)
                curveToRelative(6f, 4.2f, 11.61f, 8.9f, 16.79f, 14.05f)
                curveToRelative(5.44f, 5.41f, 13.6f, 6.86f, 20.11f, 2.79f)
                lineToRelative(82.93f, -51.83f)
                curveToRelative(8.07f, -5.03f, 10.29f, -16.19f, 4.22f, -23.51f)
                close()
                moveTo(496f, 288f)
                horizontalLineToRelative(-96f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(96f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(0f, 128f)
                horizontalLineToRelative(-96f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(96f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveTo(240f, 177.62f)
                verticalLineTo(472f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineTo(177.62f)
                curveToRelative(-5.23f, -0.89f, -10.52f, -1.62f, -16f, -1.62f)
                reflectiveCurveToRelative(-10.77f, 0.73f, -16f, 1.62f)
                close()
                moveToRelative(-64f, 41.51f)
                verticalLineTo(472f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineTo(189.36f)
                curveToRelative(-12.78f, 7.45f, -23.84f, 17.47f, -32f, 29.77f)
                close()
                moveToRelative(128f, -29.77f)
                verticalLineTo(472f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineTo(219.13f)
                curveToRelative(-8.16f, -12.3f, -19.22f, -22.32f, -32f, -29.77f)
                close()
            }
        }.build()
        
        return _Dungeon!!
    }

private var _Dungeon: ImageVector? = null

