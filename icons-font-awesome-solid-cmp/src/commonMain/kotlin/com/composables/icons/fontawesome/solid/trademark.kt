package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Trademark: ImageVector
    get() {
        if (_Trademark != null) return _Trademark!!
        
        _Trademark = ImageVector.Builder(
            name = "trademark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260.6f, 96f)
                horizontalLineTo(12f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(43.1f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(85.1f)
                verticalLineTo(404f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(54.3f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineTo(163.1f)
                horizontalLineToRelative(85.1f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineTo(108f)
                curveToRelative(0.1f, -6.6f, -5.3f, -12f, -11.9f, -12f)
                close()
                moveTo(640f, 403f)
                lineToRelative(-24f, -296f)
                curveToRelative(-0.5f, -6.2f, -5.7f, -11f, -12f, -11f)
                horizontalLineToRelative(-65.4f)
                curveToRelative(-5.1f, 0f, -9.7f, 3.3f, -11.3f, 8.1f)
                lineToRelative(-43.8f, 127.1f)
                curveToRelative(-7.2f, 20.6f, -16.1f, 52.8f, -16.1f, 52.8f)
                horizontalLineToRelative(-0.9f)
                reflectiveCurveToRelative(-8.9f, -32.2f, -16.1f, -52.8f)
                lineToRelative(-43.8f, -127.1f)
                curveToRelative(-1.7f, -4.8f, -6.2f, -8.1f, -11.3f, -8.1f)
                horizontalLineToRelative(-65.4f)
                curveToRelative(-6.2f, 0f, -11.4f, 4.8f, -12f, 11f)
                lineToRelative(-24.4f, 296f)
                curveToRelative(-0.6f, 7f, 4.9f, 13f, 12f, 13f)
                horizontalLineTo(360f)
                curveToRelative(6.3f, 0f, 11.5f, -4.9f, 12f, -11.2f)
                lineToRelative(9.1f, -132.9f)
                curveToRelative(1.8f, -24.2f, 0f, -53.7f, 0f, -53.7f)
                horizontalLineToRelative(0.9f)
                reflectiveCurveToRelative(10.7f, 33.6f, 17.9f, 53.7f)
                lineToRelative(30.7f, 84.7f)
                curveToRelative(1.7f, 4.7f, 6.2f, 7.9f, 11.3f, 7.9f)
                horizontalLineToRelative(50.3f)
                curveToRelative(5.1f, 0f, 9.6f, -3.2f, 11.3f, -7.9f)
                lineToRelative(30.7f, -84.7f)
                curveToRelative(7.2f, -20.1f, 17.9f, -53.7f, 17.9f, -53.7f)
                horizontalLineToRelative(0.9f)
                reflectiveCurveToRelative(-1.8f, 29.5f, 0f, 53.7f)
                lineToRelative(9.1f, 132.9f)
                curveToRelative(0.4f, 6.3f, 5.7f, 11.2f, 12f, 11.2f)
                horizontalLineTo(628f)
                curveToRelative(7f, 0f, 12.5f, -6f, 12f, -13f)
                close()
            }
        }.build()
        
        return _Trademark!!
    }

private var _Trademark: ImageVector? = null

