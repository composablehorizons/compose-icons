package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Commit: ImageVector
    get() {
        if (_Commit != null) return _Commit!!
        
        _Commit = ImageVector.Builder(
            name = "commit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.67578f, 4.10498f)
                curveTo(9.30413f, 4.18798f, 10.63f, 5.41636f, 10.8633f, 7.00049f)
                horizontalLineTo(14.5f)
                lineTo(14.6006f, 7.01025f)
                curveTo(14.8285f, 7.05682f, 15f, 7.25881f, 15f, 7.50049f)
                curveTo(14.9998f, 7.74199f, 14.8284f, 7.94423f, 14.6006f, 7.99072f)
                lineTo(14.5f, 8.00049f)
                horizontalLineTo(10.8633f)
                curveTo(10.6212f, 9.64069f, 9.20738f, 10.8997f, 7.5f, 10.8999f)
                lineTo(7.3252f, 10.895f)
                curveTo(5.69695f, 10.8124f, 4.37142f, 9.58428f, 4.1377f, 8.00049f)
                horizontalLineTo(0.5f)
                curveTo(0.22402f, 8.00049f, 2.63701E-4f, 7.77641f, 0f, 7.50049f)
                curveTo(0f, 7.22435f, 0.223858f, 7.00049f, 0.5f, 7.00049f)
                horizontalLineTo(4.1377f)
                curveTo(4.3793f, 5.3598f, 5.79223f, 4.10028f, 7.5f, 4.1001f)
                lineTo(7.67578f, 4.10498f)
                close()
                moveTo(7.5f, 5.05029f)
                curveTo(6.14732f, 5.0505f, 5.05099f, 6.14683f, 5.05078f, 7.49951f)
                curveTo(5.05078f, 8.85237f, 6.14719f, 9.9495f, 7.5f, 9.94971f)
                curveTo(8.85276f, 9.94944f, 9.9502f, 8.85233f, 9.9502f, 7.49951f)
                curveTo(9.94999f, 6.14687f, 8.85263f, 5.05056f, 7.5f, 5.05029f)
                close()
            }
        }.build()
        
        return _Commit!!
    }

private var _Commit: ImageVector? = null

