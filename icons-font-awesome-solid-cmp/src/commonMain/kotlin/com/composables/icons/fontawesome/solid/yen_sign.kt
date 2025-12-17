package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.YenSign: ImageVector
    get() {
        if (_YenSign != null) return _YenSign!!
        
        _YenSign = ImageVector.Builder(
            name = "yen-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(351.2f, 32f)
                horizontalLineToRelative(-65.3f)
                curveToRelative(-4.6f, 0f, -8.8f, 2.6f, -10.8f, 6.7f)
                lineToRelative(-55.4f, 113.2f)
                curveToRelative(-14.5f, 34.7f, -27.1f, 71.9f, -27.1f, 71.9f)
                horizontalLineToRelative(-1.3f)
                reflectiveCurveToRelative(-12.6f, -37.2f, -27.1f, -71.9f)
                lineTo(108.8f, 38.7f)
                curveToRelative(-2f, -4.1f, -6.2f, -6.7f, -10.8f, -6.7f)
                horizontalLineTo(32.8f)
                curveToRelative(-9.1f, 0f, -14.8f, 9.7f, -10.6f, 17.6f)
                lineTo(102.3f, 200f)
                horizontalLineTo(44f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(88.2f)
                lineToRelative(19.8f, 37.2f)
                verticalLineTo(320f)
                horizontalLineTo(44f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(108f)
                verticalLineToRelative(92f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(56f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-92f)
                horizontalLineToRelative(108f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineTo(232f)
                verticalLineToRelative(-26.8f)
                lineToRelative(19.8f, -37.2f)
                horizontalLineTo(340f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-58.3f)
                lineToRelative(80.1f, -150.4f)
                curveToRelative(4.3f, -7.9f, -1.5f, -17.6f, -10.6f, -17.6f)
                close()
            }
        }.build()
        
        return _YenSign!!
    }

private var _YenSign: ImageVector? = null

