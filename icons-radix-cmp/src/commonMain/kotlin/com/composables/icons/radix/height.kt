package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Height: ImageVector
    get() {
        if (_Height != null) return _Height!!
        
        _Height = ImageVector.Builder(
            name = "height",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.2517f, 1.62423f)
                curveTo(7.42639f, 1.50875f, 7.66428f, 1.52802f, 7.81811f, 1.68185f)
                lineTo(10.3181f, 4.18185f)
                lineTo(10.3757f, 4.25216f)
                curveTo(10.4911f, 4.42683f, 10.4719f, 4.66479f, 10.3181f, 4.81856f)
                curveTo(10.1643f, 4.97234f, 9.92637f, 4.99153f, 9.7517f, 4.87618f)
                lineTo(9.68139f, 4.81856f)
                lineTo(7.94995f, 3.08712f)
                verticalLineTo(11.9133f)
                lineTo(9.68139f, 10.1818f)
                curveTo(9.85713f, 10.0061f, 10.1424f, 10.0061f, 10.3181f, 10.1818f)
                curveTo(10.4936f, 10.3576f, 10.4938f, 10.6429f, 10.3181f, 10.8186f)
                lineTo(7.81811f, 13.3186f)
                curveTo(7.73376f, 13.4029f, 7.61903f, 13.4503f, 7.49975f, 13.4504f)
                curveTo(7.38049f, 13.4504f, 7.26576f, 13.4028f, 7.18139f, 13.3186f)
                lineTo(4.68139f, 10.8186f)
                lineTo(4.62377f, 10.7483f)
                curveTo(4.50826f, 10.5736f, 4.52755f, 10.3357f, 4.68139f, 10.1818f)
                curveTo(4.83523f, 10.028f, 5.0731f, 10.0087f, 5.2478f, 10.1242f)
                lineTo(5.31811f, 10.1818f)
                lineTo(7.04955f, 11.9133f)
                verticalLineTo(3.08712f)
                lineTo(5.31811f, 4.81856f)
                curveTo(5.14244f, 4.99423f, 4.85714f, 4.9941f, 4.68139f, 4.81856f)
                curveTo(4.50565f, 4.64283f, 4.50565f, 4.35758f, 4.68139f, 4.18185f)
                lineTo(7.18139f, 1.68185f)
                lineTo(7.2517f, 1.62423f)
                close()
            }
        }.build()
        
        return _Height!!
    }

private var _Height: ImageVector? = null

