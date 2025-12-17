package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ChargingStation: ImageVector
    get() {
        if (_ChargingStation != null) return _ChargingStation!!
        
        _ChargingStation = ImageVector.Builder(
            name = "charging-station",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336f, 448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(320f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(208f, -320f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-32f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.16f, -16f, 16f)
                verticalLineToRelative(48f)
                horizontalLineToRelative(-16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 35.76f, 23.62f, 65.69f, 56f, 75.93f)
                verticalLineToRelative(118.49f)
                curveToRelative(0f, 13.95f, -9.5f, 26.92f, -23.26f, 29.19f)
                curveTo(431.22f, 402.5f, 416f, 388.99f, 416f, 372f)
                verticalLineToRelative(-28f)
                curveToRelative(0f, -48.6f, -39.4f, -88f, -88f, -88f)
                horizontalLineToRelative(-8f)
                verticalLineTo(64f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                horizontalLineTo(96f)
                curveTo(60.65f, 0f, 32f, 28.65f, 32f, 64f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(288f)
                verticalLineTo(304f)
                horizontalLineToRelative(8f)
                curveToRelative(22.09f, 0f, 40f, 17.91f, 40f, 40f)
                verticalLineToRelative(24.61f)
                curveToRelative(0f, 39.67f, 28.92f, 75.16f, 68.41f, 79.01f)
                curveTo(481.71f, 452.05f, 520f, 416.41f, 520f, 372f)
                verticalLineTo(251.93f)
                curveToRelative(32.38f, -10.24f, 56f, -40.17f, 56f, -75.93f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-16f)
                close()
                moveToRelative(-283.91f, 47.76f)
                lineToRelative(-93.7f, 139f)
                curveToRelative(-2.2f, 3.33f, -6.21f, 5.24f, -10.39f, 5.24f)
                curveToRelative(-7.67f, 0f, -13.47f, -6.28f, -11.67f, -12.92f)
                lineTo(167.35f, 224f)
                horizontalLineTo(108f)
                curveToRelative(-7.25f, 0f, -12.85f, -5.59f, -11.89f, -11.89f)
                lineToRelative(16f, -107f)
                curveTo(112.9f, 99.9f, 117.98f, 96f, 124f, 96f)
                horizontalLineToRelative(68f)
                curveToRelative(7.88f, 0f, 13.62f, 6.54f, 11.6f, 13.21f)
                lineTo(192f, 160f)
                horizontalLineToRelative(57.7f)
                curveToRelative(9.24f, 0f, 15.01f, 8.78f, 10.39f, 15.76f)
                close()
            }
        }.build()
        
        return _ChargingStation!!
    }

private var _ChargingStation: ImageVector? = null

