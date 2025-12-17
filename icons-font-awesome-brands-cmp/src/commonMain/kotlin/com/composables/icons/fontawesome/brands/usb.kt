package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Usb: ImageVector
    get() {
        if (_Usb != null) return _Usb!!
        
        _Usb = ImageVector.Builder(
            name = "usb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(641.5f, 256f)
                curveToRelative(0f, 3.1f, -1.7f, 6.1f, -4.5f, 7.5f)
                lineTo(547.9f, 317f)
                curveToRelative(-1.4f, 0.8f, -2.8f, 1.4f, -4.5f, 1.4f)
                curveToRelative(-1.4f, 0f, -3.1f, -0.3f, -4.5f, -1.1f)
                curveToRelative(-2.8f, -1.7f, -4.5f, -4.5f, -4.5f, -7.8f)
                verticalLineToRelative(-35.6f)
                horizontalLineTo(295.7f)
                curveToRelative(25.3f, 39.6f, 40.5f, 106.9f, 69.6f, 106.9f)
                horizontalLineTo(392f)
                verticalLineTo(354f)
                curveToRelative(0f, -5f, 3.9f, -8.9f, 8.9f, -8.9f)
                horizontalLineTo(490f)
                curveToRelative(5f, 0f, 8.9f, 3.9f, 8.9f, 8.9f)
                verticalLineToRelative(89.1f)
                curveToRelative(0f, 5f, -3.9f, 8.9f, -8.9f, 8.9f)
                horizontalLineToRelative(-89.1f)
                curveToRelative(-5f, 0f, -8.9f, -3.9f, -8.9f, -8.9f)
                verticalLineToRelative(-26.7f)
                horizontalLineToRelative(-26.7f)
                curveToRelative(-75.4f, 0f, -81.1f, -142.5f, -124.7f, -142.5f)
                horizontalLineTo(140.3f)
                curveToRelative(-8.1f, 30.6f, -35.9f, 53.5f, -69f, 53.5f)
                curveTo(32f, 327.3f, 0f, 295.3f, 0f, 256f)
                reflectiveCurveToRelative(32f, -71.3f, 71.3f, -71.3f)
                curveToRelative(33.1f, 0f, 61f, 22.8f, 69f, 53.5f)
                curveToRelative(39.1f, 0f, 43.9f, 9.5f, 74.6f, -60.4f)
                curveTo(255f, 88.7f, 273f, 95.7f, 323.8f, 95.7f)
                curveToRelative(7.5f, -20.9f, 27f, -35.6f, 50.4f, -35.6f)
                curveToRelative(29.5f, 0f, 53.5f, 23.9f, 53.5f, 53.5f)
                reflectiveCurveToRelative(-23.9f, 53.5f, -53.5f, 53.5f)
                curveToRelative(-23.4f, 0f, -42.9f, -14.8f, -50.4f, -35.6f)
                horizontalLineTo(294f)
                curveToRelative(-29.1f, 0f, -44.3f, 67.4f, -69.6f, 106.9f)
                horizontalLineToRelative(310.1f)
                verticalLineToRelative(-35.6f)
                curveToRelative(0f, -3.3f, 1.7f, -6.1f, 4.5f, -7.8f)
                curveToRelative(2.8f, -1.7f, 6.4f, -1.4f, 8.9f, 0.3f)
                lineToRelative(89.1f, 53.5f)
                curveToRelative(2.8f, 1.1f, 4.5f, 4.1f, 4.5f, 7.2f)
                close()
            }
        }.build()
        
        return _Usb!!
    }

private var _Usb: ImageVector? = null

