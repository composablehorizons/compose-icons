package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Exit: ImageVector
    get() {
        if (_Exit != null) return _Exit!!
        
        _Exit = ImageVector.Builder(
            name = "exit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.4998f, 0.999984f)
                curveTo(10.776f, 0.999984f, 10.9998f, 1.22384f, 10.9998f, 1.49998f)
                curveTo(10.9998f, 1.77611f, 10.776f, 1.99997f, 10.4998f, 1.99997f)
                horizontalLineTo(2.99995f)
                verticalLineTo(12.9998f)
                horizontalLineTo(10.4998f)
                curveTo(10.776f, 12.9998f, 10.9998f, 13.2236f, 10.9998f, 13.4998f)
                curveTo(10.9998f, 13.7759f, 10.776f, 13.9998f, 10.4998f, 13.9998f)
                horizontalLineTo(2.99995f)
                curveTo(2.44768f, 13.9998f, 1.99997f, 13.5521f, 1.99997f, 12.9998f)
                verticalLineTo(1.99997f)
                curveTo(1.99997f, 1.44769f, 2.44768f, 0.999984f, 2.99995f, 0.999984f)
                horizontalLineTo(10.4998f)
                close()
                moveTo(11.8963f, 4.8964f)
                curveTo(12.0672f, 4.72554f, 12.3311f, 4.70379f, 12.5252f, 4.83195f)
                lineTo(12.6033f, 4.8964f)
                lineTo(14.8533f, 7.14637f)
                lineTo(14.9177f, 7.22449f)
                curveTo(15.0459f, 7.41857f, 15.0241f, 7.68253f, 14.8533f, 7.85339f)
                lineTo(12.6033f, 10.1034f)
                curveTo(12.4081f, 10.2986f, 12.0915f, 10.2986f, 11.8963f, 10.1034f)
                curveTo(11.701f, 9.90809f, 11.701f, 9.59159f, 11.8963f, 9.39633f)
                lineTo(13.2928f, 7.99987f)
                horizontalLineTo(6.49989f)
                curveTo(6.22376f, 7.99987f, 5.9999f, 7.77602f, 5.9999f, 7.49988f)
                curveTo(5.9999f, 7.22374f, 6.22376f, 6.99989f, 6.49989f, 6.99989f)
                horizontalLineTo(13.2928f)
                lineTo(11.8963f, 5.60342f)
                lineTo(11.8318f, 5.5253f)
                curveTo(11.7037f, 5.33122f, 11.7254f, 5.06727f, 11.8963f, 4.8964f)
                close()
            }
        }.build()
        
        return _Exit!!
    }

private var _Exit: ImageVector? = null

