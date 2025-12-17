package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VolumeUp: ImageVector
    get() {
        if (_VolumeUp != null) return _VolumeUp!!
        
        _VolumeUp = ImageVector.Builder(
            name = "volume-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(215.03f, 71.05f)
                lineTo(126.06f, 160f)
                horizontalLineTo(24f)
                curveToRelative(-13.26f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 13.25f, 10.74f, 24f, 24f, 24f)
                horizontalLineToRelative(102.06f)
                lineToRelative(88.97f, 88.95f)
                curveToRelative(15.03f, 15.03f, 40.97f, 4.47f, 40.97f, -16.97f)
                verticalLineTo(88.02f)
                curveToRelative(0f, -21.46f, -25.96f, -31.98f, -40.97f, -16.97f)
                close()
                moveToRelative(233.32f, -51.08f)
                curveToRelative(-11.17f, -7.33f, -26.18f, -4.24f, -33.51f, 6.95f)
                curveToRelative(-7.34f, 11.17f, -4.22f, 26.18f, 6.95f, 33.51f)
                curveToRelative(66.27f, 43.49f, 105.82f, 116.6f, 105.82f, 195.58f)
                curveToRelative(0f, 78.98f, -39.55f, 152.09f, -105.82f, 195.58f)
                curveToRelative(-11.17f, 7.32f, -14.29f, 22.34f, -6.95f, 33.5f)
                curveToRelative(7.04f, 10.71f, 21.93f, 14.56f, 33.51f, 6.95f)
                curveTo(528.27f, 439.58f, 576f, 351.33f, 576f, 256f)
                reflectiveCurveTo(528.27f, 72.43f, 448.35f, 19.97f)
                close()
                moveTo(480f, 256f)
                curveToRelative(0f, -63.53f, -32.06f, -121.94f, -85.77f, -156.24f)
                curveToRelative(-11.19f, -7.14f, -26.03f, -3.82f, -33.12f, 7.46f)
                reflectiveCurveToRelative(-3.78f, 26.21f, 7.41f, 33.36f)
                curveTo(408.27f, 165.97f, 432f, 209.11f, 432f, 256f)
                reflectiveCurveToRelative(-23.73f, 90.03f, -63.48f, 115.42f)
                curveToRelative(-11.19f, 7.14f, -14.5f, 22.07f, -7.41f, 33.36f)
                curveToRelative(6.51f, 10.36f, 21.12f, 15.14f, 33.12f, 7.46f)
                curveTo(447.94f, 377.94f, 480f, 319.54f, 480f, 256f)
                close()
                moveToRelative(-141.77f, -76.87f)
                curveToRelative(-11.58f, -6.33f, -26.19f, -2.16f, -32.61f, 9.45f)
                curveToRelative(-6.39f, 11.61f, -2.16f, 26.2f, 9.45f, 32.61f)
                curveTo(327.98f, 228.28f, 336f, 241.63f, 336f, 256f)
                curveToRelative(0f, 14.38f, -8.02f, 27.72f, -20.92f, 34.81f)
                curveToRelative(-11.61f, 6.41f, -15.84f, 21f, -9.45f, 32.61f)
                curveToRelative(6.43f, 11.66f, 21.05f, 15.8f, 32.61f, 9.45f)
                curveToRelative(28.23f, -15.55f, 45.77f, -45f, 45.77f, -76.88f)
                reflectiveCurveToRelative(-17.54f, -61.32f, -45.78f, -76.86f)
                close()
            }
        }.build()
        
        return _VolumeUp!!
    }

private var _VolumeUp: ImageVector? = null

