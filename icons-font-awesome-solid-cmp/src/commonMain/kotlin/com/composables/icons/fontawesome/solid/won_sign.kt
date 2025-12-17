package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.WonSign: ImageVector
    get() {
        if (_WonSign != null) return _WonSign!!
        
        _WonSign = ImageVector.Builder(
            name = "won-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(564f, 192f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-48f)
                lineToRelative(18.6f, -80.6f)
                curveToRelative(1.7f, -7.5f, -4f, -14.7f, -11.7f, -14.7f)
                horizontalLineToRelative(-46.1f)
                curveToRelative(-5.7f, 0f, -10.6f, 4f, -11.7f, 9.5f)
                lineTo(450.7f, 128f)
                horizontalLineTo(340.8f)
                lineToRelative(-19.7f, -86f)
                curveToRelative(-1.3f, -5.5f, -6.1f, -9.3f, -11.7f, -9.3f)
                horizontalLineToRelative(-44f)
                curveToRelative(-5.6f, 0f, -10.4f, 3.8f, -11.7f, 9.3f)
                lineToRelative(-20f, 86f)
                horizontalLineTo(125f)
                lineToRelative(-17.5f, -85.7f)
                curveToRelative(-1.1f, -5.6f, -6.1f, -9.6f, -11.8f, -9.6f)
                horizontalLineTo(53.6f)
                curveToRelative(-7.7f, 0f, -13.4f, 7.1f, -11.7f, 14.6f)
                lineTo(60f, 128f)
                horizontalLineTo(12f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(62.3f)
                lineToRelative(7.2f, 32f)
                horizontalLineTo(12f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(83.9f)
                lineToRelative(40.9f, 182.6f)
                curveToRelative(1.2f, 5.5f, 6.1f, 9.4f, 11.7f, 9.4f)
                horizontalLineToRelative(56.8f)
                curveToRelative(5.6f, 0f, 10.4f, -3.9f, 11.7f, -9.3f)
                lineTo(259.3f, 288f)
                horizontalLineToRelative(55.1f)
                lineToRelative(42.4f, 182.7f)
                curveToRelative(1.3f, 5.4f, 6.1f, 9.3f, 11.7f, 9.3f)
                horizontalLineToRelative(56.8f)
                curveToRelative(5.6f, 0f, 10.4f, -3.9f, 11.7f, -9.3f)
                lineTo(479.1f, 288f)
                horizontalLineTo(564f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-70.1f)
                lineToRelative(7.4f, -32f)
                close()
                moveTo(183.8f, 342f)
                curveToRelative(-6.2f, 25.8f, -6.8f, 47.2f, -7.3f, 47.2f)
                horizontalLineToRelative(-1.1f)
                reflectiveCurveToRelative(-1.7f, -22f, -6.8f, -47.2f)
                lineToRelative(-11f, -54f)
                horizontalLineToRelative(38.8f)
                close()
                moveToRelative(27.5f, -118f)
                horizontalLineToRelative(-66.8f)
                lineToRelative(-6.5f, -32f)
                horizontalLineToRelative(80.8f)
                close()
                moveToRelative(62.9f, 0f)
                lineToRelative(2f, -8.6f)
                curveToRelative(1.9f, -8f, 3.5f, -16f, 4.8f, -23.4f)
                horizontalLineToRelative(11.8f)
                curveToRelative(1.3f, 7.4f, 2.9f, 15.4f, 4.8f, 23.4f)
                lineToRelative(2f, 8.6f)
                close()
                moveToRelative(130.9f, 118f)
                curveToRelative(-5.1f, 25.2f, -6.8f, 47.2f, -6.8f, 47.2f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-0.6f, 0f, -1.1f, -21.4f, -7.3f, -47.2f)
                lineToRelative(-12.4f, -54f)
                horizontalLineToRelative(39.1f)
                close()
                moveToRelative(25.2f, -118f)
                horizontalLineToRelative(-67.4f)
                lineToRelative(-7.3f, -32f)
                horizontalLineToRelative(81.6f)
                close()
            }
        }.build()
        
        return _WonSign!!
    }

private var _WonSign: ImageVector? = null

