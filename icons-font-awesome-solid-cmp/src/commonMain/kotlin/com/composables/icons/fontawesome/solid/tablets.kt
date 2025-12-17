package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tablets: ImageVector
    get() {
        if (_Tablets != null) return _Tablets!!
        
        _Tablets = ImageVector.Builder(
            name = "tablets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 192f)
                curveTo(78.9f, 192f, 12.5f, 250.5f, 0.1f, 326.7f)
                curveToRelative(-0.8f, 4.8f, 3.3f, 9.3f, 8.3f, 9.3f)
                horizontalLineToRelative(303.3f)
                curveToRelative(5f, 0f, 9.1f, -4.5f, 8.3f, -9.3f)
                curveTo(307.5f, 250.5f, 241.1f, 192f, 160f, 192f)
                close()
                moveToRelative(151.6f, 176f)
                horizontalLineTo(8.4f)
                curveToRelative(-5f, 0f, -9.1f, 4.5f, -8.3f, 9.3f)
                curveTo(12.5f, 453.5f, 78.9f, 512f, 160f, 512f)
                reflectiveCurveToRelative(147.5f, -58.5f, 159.9f, -134.7f)
                curveToRelative(0.8f, -4.8f, -3.3f, -9.3f, -8.3f, -9.3f)
                close()
                moveTo(593.4f, 46.6f)
                curveToRelative(-56.5f, -56.5f, -144.2f, -61.4f, -206.9f, -16f)
                curveToRelative(-4f, 2.9f, -4.3f, 8.9f, -0.8f, 12.3f)
                lineTo(597f, 254.3f)
                curveToRelative(3.5f, 3.5f, 9.5f, 3.2f, 12.3f, -0.8f)
                curveToRelative(45.5f, -62.7f, 40.6f, -150.4f, -15.9f, -206.9f)
                close()
                moveTo(363f, 65.7f)
                curveToRelative(-3.5f, -3.5f, -9.5f, -3.2f, -12.3f, 0.8f)
                curveToRelative(-45.4f, 62.7f, -40.5f, 150.4f, 15.9f, 206.9f)
                curveToRelative(56.5f, 56.5f, 144.2f, 61.4f, 206.9f, 15.9f)
                curveToRelative(4f, -2.9f, 4.3f, -8.9f, 0.8f, -12.3f)
                lineTo(363f, 65.7f)
                close()
            }
        }.build()
        
        return _Tablets!!
    }

private var _Tablets: ImageVector? = null

