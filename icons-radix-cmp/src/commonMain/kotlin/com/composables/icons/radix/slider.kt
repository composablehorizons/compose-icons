package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Slider: ImageVector
    get() {
        if (_Slider != null) return _Slider!!
        
        _Slider = ImageVector.Builder(
            name = "slider",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.78027f, 4.76407f)
                curveTo(10.0011f, 4.88786f, 10.9854f, 5.81016f, 11.2041f, 7.0004f)
                horizontalLineTo(14.5f)
                lineTo(14.6006f, 7.01016f)
                curveTo(14.8285f, 7.05672f, 15f, 7.25871f, 15f, 7.5004f)
                curveTo(14.9998f, 7.74193f, 14.8284f, 7.94413f, 14.6006f, 7.99063f)
                lineTo(14.5f, 8.0004f)
                horizontalLineTo(11.2031f)
                curveTo(10.9678f, 9.2802f, 9.84783f, 10.2502f, 8.5f, 10.2504f)
                lineTo(8.21875f, 10.2357f)
                curveTo(6.99829f, 10.1118f, 6.01467f, 9.19024f, 5.7959f, 8.0004f)
                horizontalLineTo(0.5f)
                curveTo(0.22399f, 8.0004f, 2.14414E-4f, 7.77636f, 0f, 7.5004f)
                curveTo(0f, 7.22425f, 0.223858f, 7.0004f, 0.5f, 7.0004f)
                horizontalLineTo(5.79688f)
                curveTo(6.03222f, 5.72027f, 7.15198f, 4.74959f, 8.5f, 4.74942f)
                lineTo(8.78027f, 4.76407f)
                close()
                moveTo(8.5f, 5.69962f)
                curveTo(7.50578f, 5.69981f, 6.69922f, 6.50613f, 6.69922f, 7.5004f)
                curveTo(6.69948f, 8.49444f, 7.50594f, 9.30001f, 8.5f, 9.3002f)
                curveTo(9.494f, 9.29994f, 10.2995f, 8.4944f, 10.2998f, 7.5004f)
                curveTo(10.2998f, 6.50617f, 9.49416f, 5.69988f, 8.5f, 5.69962f)
                close()
            }
        }.build()
        
        return _Slider!!
    }

private var _Slider: ImageVector? = null

