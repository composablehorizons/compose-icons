package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SmokingBan: ImageVector
    get() {
        if (_SmokingBan != null) return _SmokingBan!!
        
        _SmokingBan = ImageVector.Builder(
            name = "smoking-ban",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 304f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(117.5f)
                lineToRelative(-96f, -96f)
                horizontalLineTo(112f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(64f)
                close()
                moveTo(256f, 0f)
                curveTo(114.6f, 0f, 0f, 114.6f, 0f, 256f)
                reflectiveCurveToRelative(114.6f, 256f, 256f, 256f)
                reflectiveCurveToRelative(256f, -114.6f, 256f, -256f)
                reflectiveCurveTo(397.4f, 0f, 256f, 0f)
                close()
                moveToRelative(0f, 448f)
                curveToRelative(-105.9f, 0f, -192f, -86.1f, -192f, -192f)
                curveToRelative(0f, -41.4f, 13.3f, -79.7f, 35.7f, -111.1f)
                lineToRelative(267.4f, 267.4f)
                curveTo(335.7f, 434.7f, 297.4f, 448f, 256f, 448f)
                close()
                moveToRelative(45.2f, -192f)
                horizontalLineTo(384f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-50.8f)
                lineToRelative(-32f, -32f)
                close()
                moveToRelative(111.1f, 111.1f)
                lineTo(365.2f, 320f)
                horizontalLineTo(400f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(269.2f)
                lineTo(144.9f, 99.7f)
                curveTo(176.3f, 77.3f, 214.6f, 64f, 256f, 64f)
                curveToRelative(105.9f, 0f, 192f, 86.1f, 192f, 192f)
                curveToRelative(0f, 41.4f, -13.3f, 79.7f, -35.7f, 111.1f)
                close()
                moveTo(320.6f, 128f)
                curveToRelative(-15.6f, 0f, -28.6f, -11.2f, -31.4f, -25.9f)
                curveToRelative(-0.7f, -3.6f, -4f, -6.1f, -7.7f, -6.1f)
                horizontalLineToRelative(-16.2f)
                curveToRelative(-5f, 0f, -8.7f, 4.5f, -8f, 9.4f)
                curveToRelative(4.6f, 30.9f, 31.2f, 54.6f, 63.3f, 54.6f)
                curveToRelative(15.6f, 0f, 28.6f, 11.2f, 31.4f, 25.9f)
                curveToRelative(0.7f, 3.6f, 4f, 6.1f, 7.7f, 6.1f)
                horizontalLineToRelative(16.2f)
                curveToRelative(5f, 0f, 8.7f, -4.5f, 8f, -9.4f)
                curveToRelative(-4.6f, -30.9f, -31.2f, -54.6f, -63.3f, -54.6f)
                close()
            }
        }.build()
        
        return _SmokingBan!!
    }

private var _SmokingBan: ImageVector? = null

