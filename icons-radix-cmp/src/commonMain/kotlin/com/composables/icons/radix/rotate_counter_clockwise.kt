package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.RotateCounterClockwise: ImageVector
    get() {
        if (_RotateCounterClockwise != null) return _RotateCounterClockwise!!
        
        _RotateCounterClockwise = ImageVector.Builder(
            name = "rotate-counter-clockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.65332f, 4.00808f)
                curveTo(10.4097f, 4.08488f, 11f, 4.72361f, 11f, 5.50027f)
                verticalLineTo(12.5003f)
                lineTo(10.9922f, 12.6536f)
                curveTo(10.9205f, 13.3596f, 10.3593f, 13.9208f, 9.65332f, 13.9925f)
                lineTo(9.5f, 14.0003f)
                horizontalLineTo(2.5f)
                lineTo(2.34668f, 13.9925f)
                curveTo(1.64071f, 13.9208f, 1.07952f, 13.3596f, 1.00781f, 12.6536f)
                lineTo(1f, 12.5003f)
                verticalLineTo(5.50027f)
                curveTo(1f, 4.72361f, 1.59028f, 4.08488f, 2.34668f, 4.00808f)
                lineTo(2.5f, 4.00027f)
                horizontalLineTo(9.5f)
                lineTo(9.65332f, 4.00808f)
                close()
                moveTo(2.5f, 5.00027f)
                curveTo(2.22386f, 5.00027f, 2f, 5.22413f, 2f, 5.50027f)
                verticalLineTo(12.5003f)
                curveTo(2.00003f, 12.7764f, 2.22388f, 13.0003f, 2.5f, 13.0003f)
                horizontalLineTo(9.5f)
                curveTo(9.77612f, 13.0003f, 9.99997f, 12.7764f, 10f, 12.5003f)
                verticalLineTo(5.50027f)
                curveTo(10f, 5.22413f, 9.77614f, 5.00027f, 9.5f, 5.00027f)
                horizontalLineTo(2.5f)
                close()
                moveTo(7.59668f, 0.0637466f)
                curveTo(7.76077f, -0.0636113f, 7.99965f, 0.0533557f, 8f, 0.261012f)
                verticalLineTo(1.00027f)
                lineTo(8.37988f, 1.00418f)
                curveTo(10.2476f, 1.04836f, 11.6658f, 1.43172f, 12.6172f, 2.38308f)
                curveTo(13.632f, 3.39793f, 14f, 4.94411f, 14f, 7.00027f)
                curveTo(14f, 7.27638f, 13.7761f, 7.50027f, 13.5f, 7.50027f)
                curveTo(13.2239f, 7.50027f, 13f, 7.27638f, 13f, 7.00027f)
                curveTo(13f, 5.01892f, 12.6359f, 3.81588f, 11.9102f, 3.09011f)
                curveTo(11.2297f, 2.40969f, 10.1298f, 2.04681f, 8.3623f, 2.00418f)
                lineTo(8f, 2.00027f)
                verticalLineTo(2.73953f)
                curveTo(7.99971f, 2.94726f, 7.76079f, 3.06422f, 7.59668f, 2.93679f)
                lineTo(6.00391f, 1.69754f)
                curveTo(5.87524f, 1.59744f, 5.87523f, 1.40309f, 6.00391f, 1.303f)
                lineTo(7.59668f, 0.0637466f)
                close()
            }
        }.build()
        
        return _RotateCounterClockwise!!
    }

private var _RotateCounterClockwise: ImageVector? = null

