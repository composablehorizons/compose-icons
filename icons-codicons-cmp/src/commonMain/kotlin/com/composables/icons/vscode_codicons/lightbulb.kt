package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.156f, 4.70198f)
                curveTo(11.93f, 4.16898f, 11.598f, 3.68698f, 11.182f, 3.28498f)
                curveTo(10.33f, 2.45798f, 9.188f, 1.99698f, 8f, 1.99998f)
                curveTo(7.411f, 1.99598f, 6.828f, 2.10998f, 6.284f, 2.33498f)
                curveTo(5.74f, 2.55998f, 5.247f, 2.89198f, 4.833f, 3.30998f)
                curveTo(3.995f, 4.17998f, 3.518f, 5.33598f, 3.5f, 6.54398f)
                verticalLineTo(6.58198f)
                curveTo(3.625f, 7.91098f, 4.245f, 9.14398f, 5.237f, 10.037f)
                lineTo(5.466f, 11f)
                lineTo(5.937f, 12.978f)
                lineTo(5.945f, 13f)
                curveTo(6.043f, 13.289f, 6.23f, 13.54f, 6.479f, 13.717f)
                curveTo(6.736f, 13.901f, 7.045f, 14f, 7.362f, 14f)
                horizontalLineTo(8.766f)
                curveTo(9.075f, 13.974f, 9.368f, 13.854f, 9.606f, 13.655f)
                curveTo(9.845f, 13.456f, 10.014f, 13.185f, 10.087f, 12.882f)
                lineTo(10.581f, 11f)
                lineTo(10.887f, 9.83198f)
                curveTo(11.38f, 9.40098f, 11.778f, 8.87198f, 12.055f, 8.27898f)
                curveTo(12.333f, 7.68598f, 12.484f, 7.04198f, 12.5f, 6.38698f)
                curveTo(12.5f, 5.80798f, 12.383f, 5.23498f, 12.156f, 4.70198f)
                close()
                moveTo(9.118f, 12.628f)
                verticalLineTo(12.641f)
                curveTo(9.096f, 12.735f, 9.043f, 12.82f, 8.968f, 12.881f)
                curveTo(8.893f, 12.947f, 8.799f, 12.988f, 8.7f, 13f)
                horizontalLineTo(7.361f)
                curveTo(7.253f, 12.999f, 7.148f, 12.964f, 7.061f, 12.9f)
                curveTo(6.989f, 12.85f, 6.933f, 12.781f, 6.9f, 12.7f)
                lineTo(6.733f, 12f)
                horizontalLineTo(9.282f)
                lineTo(9.118f, 12.628f)
                close()
                moveTo(11.104f, 7.94098f)
                curveTo(10.862f, 8.42498f, 10.52f, 8.85098f, 10.1f, 9.19198f)
                lineTo(9.992f, 9.29198f)
                lineTo(9.543f, 11f)
                horizontalLineTo(6.494f)
                lineTo(6.145f, 9.53598f)
                lineTo(6.045f, 9.43598f)
                curveTo(5.185f, 8.70598f, 4.633f, 7.67698f, 4.5f, 6.55598f)
                curveTo(4.514f, 5.60698f, 4.887f, 4.69898f, 5.543f, 4.01298f)
                curveTo(5.864f, 3.68798f, 6.247f, 3.43198f, 6.669f, 3.25798f)
                curveTo(7.091f, 3.08398f, 7.544f, 2.99598f, 8f, 2.99998f)
                curveTo(8.927f, 2.99598f, 9.82f, 3.35398f, 10.486f, 3.99998f)
                curveTo(10.807f, 4.30898f, 11.062f, 4.67998f, 11.236f, 5.08998f)
                curveTo(11.41f, 5.49998f, 11.5f, 5.94098f, 11.5f, 6.38698f)
                curveTo(11.48f, 6.92698f, 11.345f, 7.45698f, 11.104f, 7.94098f)
                close()
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

