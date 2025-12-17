package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tools: ImageVector
    get() {
        if (_Tools != null) return _Tools!!
        
        _Tools = ImageVector.Builder(
            name = "tools",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(501.1f, 395.7f)
                lineTo(384f, 278.6f)
                curveToRelative(-23.1f, -23.1f, -57.6f, -27.6f, -85.4f, -13.9f)
                lineTo(192f, 158.1f)
                verticalLineTo(96f)
                lineTo(64f, 0f)
                lineTo(0f, 64f)
                lineToRelative(96f, 128f)
                horizontalLineToRelative(62.1f)
                lineToRelative(106.6f, 106.6f)
                curveToRelative(-13.6f, 27.8f, -9.2f, 62.3f, 13.9f, 85.4f)
                lineToRelative(117.1f, 117.1f)
                curveToRelative(14.6f, 14.6f, 38.2f, 14.6f, 52.7f, 0f)
                lineToRelative(52.7f, -52.7f)
                curveToRelative(14.5f, -14.6f, 14.5f, -38.2f, 0f, -52.7f)
                close()
                moveTo(331.7f, 225f)
                curveToRelative(28.3f, 0f, 54.9f, 11f, 74.9f, 31f)
                lineToRelative(19.4f, 19.4f)
                curveToRelative(15.8f, -6.9f, 30.8f, -16.5f, 43.8f, -29.5f)
                curveToRelative(37.1f, -37.1f, 49.7f, -89.3f, 37.9f, -136.7f)
                curveToRelative(-2.2f, -9f, -13.5f, -12.1f, -20.1f, -5.5f)
                lineToRelative(-74.4f, 74.4f)
                lineToRelative(-67.9f, -11.3f)
                lineTo(334f, 98.9f)
                lineToRelative(74.4f, -74.4f)
                curveToRelative(6.6f, -6.6f, 3.4f, -17.9f, -5.7f, -20.2f)
                curveToRelative(-47.4f, -11.7f, -99.6f, 0.9f, -136.6f, 37.9f)
                curveToRelative(-28.5f, 28.5f, -41.9f, 66.1f, -41.2f, 103.6f)
                lineToRelative(82.1f, 82.1f)
                curveToRelative(8.1f, -1.9f, 16.5f, -2.9f, 24.7f, -2.9f)
                close()
                moveToRelative(-103.9f, 82f)
                lineToRelative(-56.7f, -56.7f)
                lineTo(18.7f, 402.8f)
                curveToRelative(-25f, 25f, -25f, 65.5f, 0f, 90.5f)
                reflectiveCurveToRelative(65.5f, 25f, 90.5f, 0f)
                lineToRelative(123.6f, -123.6f)
                curveToRelative(-7.6f, -19.9f, -9.9f, -41.6f, -5f, -62.7f)
                close()
                moveTo(64f, 472f)
                curveToRelative(-13.2f, 0f, -24f, -10.8f, -24f, -24f)
                curveToRelative(0f, -13.3f, 10.7f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.7f, 24f, 24f)
                curveToRelative(0f, 13.2f, -10.7f, 24f, -24f, 24f)
                close()
            }
        }.build()
        
        return _Tools!!
    }

private var _Tools: ImageVector? = null

