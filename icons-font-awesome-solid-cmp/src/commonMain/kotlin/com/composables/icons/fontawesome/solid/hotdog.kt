package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hotdog: ImageVector
    get() {
        if (_Hotdog != null) return _Hotdog!!
        
        _Hotdog = ImageVector.Builder(
            name = "hotdog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(488.56f, 23.44f)
                arcToRelative(80f, 80f, 0f, false, false, -113.12f, 0f)
                lineToRelative(-352f, 352f)
                arcToRelative(80f, 80f, 0f, true, false, 113.12f, 113.12f)
                lineToRelative(352f, -352f)
                arcToRelative(80f, 80f, 0f, false, false, 0f, -113.12f)
                close()
                moveToRelative(-49.93f, 95.19f)
                curveToRelative(-19.6f, 19.59f, -37.52f, 22.67f, -51.93f, 25.14f)
                curveTo(373.76f, 146f, 364.4f, 147.6f, 352f, 160f)
                reflectiveCurveToRelative(-14f, 21.76f, -16.23f, 34.71f)
                curveToRelative(-2.48f, 14.4f, -5.55f, 32.33f, -25.15f, 51.92f)
                reflectiveCurveToRelative(-37.52f, 22.67f, -51.92f, 25.15f)
                curveTo(245.75f, 274f, 236.4f, 275.6f, 224f, 288f)
                reflectiveCurveToRelative(-14f, 21.75f, -16.23f, 34.7f)
                curveToRelative(-2.47f, 14.4f, -5.54f, 32.33f, -25.14f, 51.92f)
                reflectiveCurveToRelative(-37.53f, 22.68f, -51.93f, 25.15f)
                curveTo(117.76f, 402f, 108.4f, 403.6f, 96f, 416f)
                arcToRelative(16f, 16f, 0f, false, true, -22.63f, -22.63f)
                curveToRelative(19.6f, -19.59f, 37.52f, -22.67f, 51.92f, -25.14f)
                curveToRelative(13f, -2.22f, 22.3f, -3.82f, 34.71f, -16.23f)
                reflectiveCurveToRelative(14f, -21.75f, 16.22f, -34.7f)
                curveToRelative(2.48f, -14.4f, 5.55f, -32.33f, 25.15f, -51.92f)
                reflectiveCurveToRelative(37.52f, -22.67f, 51.92f, -25.14f)
                curveToRelative(13f, -2.22f, 22.3f, -3.83f, 34.7f, -16.23f)
                reflectiveCurveToRelative(14f, -21.76f, 16.24f, -34.71f)
                curveToRelative(2.47f, -14.4f, 5.54f, -32.33f, 25.14f, -51.92f)
                reflectiveCurveToRelative(37.52f, -22.68f, 51.92f, -25.15f)
                curveTo(394.24f, 110f, 403.59f, 108.41f, 416f, 96f)
                arcToRelative(16f, 16f, 0f, false, true, 22.63f, 22.63f)
                close()
                moveTo(31.44f, 322.18f)
                lineTo(322.18f, 31.44f)
                lineToRelative(-11.54f, -11.55f)
                curveToRelative(-25f, -25f, -63.85f, -26.66f, -86.79f, -3.72f)
                lineTo(16.17f, 223.85f)
                curveToRelative(-22.94f, 22.94f, -21.27f, 61.79f, 3.72f, 86.78f)
                close()
                moveToRelative(449.12f, -132.36f)
                lineTo(189.82f, 480.56f)
                lineToRelative(11.54f, 11.55f)
                curveToRelative(25f, 25f, 63.85f, 26.66f, 86.79f, 3.72f)
                lineToRelative(207.68f, -207.68f)
                curveToRelative(22.94f, -22.94f, 21.27f, -61.79f, -3.72f, -86.79f)
                close()
            }
        }.build()
        
        return _Hotdog!!
    }

private var _Hotdog: ImageVector? = null

