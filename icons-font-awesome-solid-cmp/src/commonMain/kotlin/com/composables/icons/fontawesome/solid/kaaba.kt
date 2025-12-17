package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Kaaba: ImageVector
    get() {
        if (_Kaaba != null) return _Kaaba!!
        
        _Kaaba = ImageVector.Builder(
            name = "kaaba",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(554.12f, 83.51f)
                lineTo(318.36f, 4.93f)
                arcToRelative(95.962f, 95.962f, 0f, false, false, -60.71f, 0f)
                lineTo(21.88f, 83.51f)
                arcTo(32.006f, 32.006f, 0f, false, false, 0f, 113.87f)
                verticalLineToRelative(49.01f)
                lineToRelative(265.02f, -79.51f)
                curveToRelative(15.03f, -4.5f, 30.92f, -4.5f, 45.98f, 0f)
                lineToRelative(265f, 79.51f)
                verticalLineToRelative(-49.01f)
                curveToRelative(0f, -13.77f, -8.81f, -26f, -21.88f, -30.36f)
                close()
                moveToRelative(-279.9f, 30.52f)
                lineTo(0f, 196.3f)
                verticalLineToRelative(228.38f)
                curveToRelative(0f, 15f, 10.42f, 27.98f, 25.06f, 31.24f)
                lineToRelative(242.12f, 53.8f)
                arcToRelative(95.937f, 95.937f, 0f, false, false, 41.65f, 0f)
                lineToRelative(242.12f, -53.8f)
                curveToRelative(14.64f, -3.25f, 25.06f, -16.24f, 25.06f, -31.24f)
                verticalLineTo(196.29f)
                lineToRelative(-274.2f, -82.26f)
                curveToRelative(-9.04f, -2.72f, -18.59f, -2.72f, -27.59f, 0f)
                close()
                moveTo(128f, 230.11f)
                curveToRelative(0f, 3.61f, -2.41f, 6.77f, -5.89f, 7.72f)
                lineToRelative(-80f, 21.82f)
                curveTo(37.02f, 261.03f, 32f, 257.2f, 32f, 251.93f)
                verticalLineToRelative(-16.58f)
                curveToRelative(0f, -3.61f, 2.41f, -6.77f, 5.89f, -7.72f)
                lineToRelative(80f, -21.82f)
                curveToRelative(5.09f, -1.39f, 10.11f, 2.44f, 10.11f, 7.72f)
                verticalLineToRelative(16.58f)
                close()
                moveToRelative(144f, -39.28f)
                curveToRelative(0f, 3.61f, -2.41f, 6.77f, -5.89f, 7.72f)
                lineToRelative(-96f, 26.18f)
                curveToRelative(-5.09f, 1.39f, -10.11f, -2.44f, -10.11f, -7.72f)
                verticalLineToRelative(-16.58f)
                curveToRelative(0f, -3.61f, 2.41f, -6.77f, 5.89f, -7.72f)
                lineToRelative(96f, -26.18f)
                curveToRelative(5.09f, -1.39f, 10.11f, 2.44f, 10.11f, 7.72f)
                verticalLineToRelative(16.58f)
                close()
                moveToRelative(176f, 22.7f)
                curveToRelative(0f, -5.28f, 5.02f, -9.11f, 10.11f, -7.72f)
                lineToRelative(80f, 21.82f)
                curveToRelative(3.48f, 0.95f, 5.89f, 4.11f, 5.89f, 7.72f)
                verticalLineToRelative(16.58f)
                curveToRelative(0f, 5.28f, -5.02f, 9.11f, -10.11f, 7.72f)
                lineToRelative(-80f, -21.82f)
                arcToRelative(7.997f, 7.997f, 0f, false, true, -5.89f, -7.72f)
                verticalLineToRelative(-16.58f)
                close()
                moveToRelative(-144f, -39.27f)
                curveToRelative(0f, -5.28f, 5.02f, -9.11f, 10.11f, -7.72f)
                lineToRelative(96f, 26.18f)
                curveToRelative(3.48f, 0.95f, 5.89f, 4.11f, 5.89f, 7.72f)
                verticalLineToRelative(16.58f)
                curveToRelative(0f, 5.28f, -5.02f, 9.11f, -10.11f, 7.72f)
                lineToRelative(-96f, -26.18f)
                arcToRelative(7.997f, 7.997f, 0f, false, true, -5.89f, -7.72f)
                verticalLineToRelative(-16.58f)
                close()
            }
        }.build()
        
        return _Kaaba!!
    }

private var _Kaaba: ImageVector? = null

