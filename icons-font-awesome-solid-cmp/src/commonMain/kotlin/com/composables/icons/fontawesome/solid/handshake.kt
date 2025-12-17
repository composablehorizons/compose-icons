package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Handshake: ImageVector
    get() {
        if (_Handshake != null) return _Handshake!!
        
        _Handshake = ImageVector.Builder(
            name = "handshake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(434.7f, 64f)
                horizontalLineToRelative(-85.9f)
                curveToRelative(-8f, 0f, -15.7f, 3f, -21.6f, 8.4f)
                lineToRelative(-98.3f, 90f)
                curveToRelative(-0.1f, 0.1f, -0.2f, 0.3f, -0.3f, 0.4f)
                curveToRelative(-16.6f, 15.6f, -16.3f, 40.5f, -2.1f, 56f)
                curveToRelative(12.7f, 13.9f, 39.4f, 17.6f, 56.1f, 2.7f)
                curveToRelative(0.1f, -0.1f, 0.3f, -0.1f, 0.4f, -0.2f)
                lineToRelative(79.9f, -73.2f)
                curveToRelative(6.5f, -5.9f, 16.7f, -5.5f, 22.6f, 1f)
                curveToRelative(6f, 6.5f, 5.5f, 16.6f, -1f, 22.6f)
                lineToRelative(-26.1f, 23.9f)
                lineTo(504f, 313.8f)
                curveToRelative(2.9f, 2.4f, 5.5f, 5f, 7.9f, 7.7f)
                verticalLineTo(128f)
                lineToRelative(-54.6f, -54.6f)
                curveToRelative(-5.9f, -6f, -14.1f, -9.4f, -22.6f, -9.4f)
                close()
                moveTo(544f, 128.2f)
                verticalLineToRelative(223.9f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(64f)
                verticalLineTo(128.2f)
                horizontalLineToRelative(-96f)
                close()
                moveToRelative(48f, 223.9f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
                moveTo(0f, 384f)
                horizontalLineToRelative(64f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineTo(128.2f)
                horizontalLineTo(0f)
                verticalLineTo(384f)
                close()
                moveToRelative(48f, -63.9f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.2f, -16f, -16f)
                curveToRelative(0f, -8.9f, 7.2f, -16f, 16f, -16f)
                close()
                moveToRelative(435.9f, 18.6f)
                lineTo(334.6f, 217.5f)
                lineToRelative(-30f, 27.5f)
                curveToRelative(-29.7f, 27.1f, -75.2f, 24.5f, -101.7f, -4.4f)
                curveToRelative(-26.9f, -29.4f, -24.8f, -74.9f, 4.4f, -101.7f)
                lineTo(289.1f, 64f)
                horizontalLineToRelative(-83.8f)
                curveToRelative(-8.5f, 0f, -16.6f, 3.4f, -22.6f, 9.4f)
                lineTo(128f, 128f)
                verticalLineToRelative(223.9f)
                horizontalLineToRelative(18.3f)
                lineToRelative(90.5f, 81.9f)
                curveToRelative(27.4f, 22.3f, 67.7f, 18.1f, 90f, -9.3f)
                lineToRelative(0.2f, -0.2f)
                lineToRelative(17.9f, 15.5f)
                curveToRelative(15.9f, 13f, 39.4f, 10.5f, 52.3f, -5.4f)
                lineToRelative(31.4f, -38.6f)
                lineToRelative(5.4f, 4.4f)
                curveToRelative(13.7f, 11.1f, 33.9f, 9.1f, 45f, -4.7f)
                lineToRelative(9.5f, -11.7f)
                curveToRelative(11.2f, -13.8f, 9.1f, -33.9f, -4.6f, -45.1f)
                close()
            }
        }.build()
        
        return _Handshake!!
    }

private var _Handshake: ImageVector? = null

