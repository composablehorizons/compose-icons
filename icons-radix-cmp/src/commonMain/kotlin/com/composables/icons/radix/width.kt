package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Width: ImageVector
    get() {
        if (_Width != null) return _Width!!
        
        _Width = ImageVector.Builder(
            name = "width",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.1817f, 4.68168f)
                curveTo(10.3356f, 4.52784f, 10.5734f, 4.50855f, 10.7481f, 4.62406f)
                lineTo(10.8184f, 4.68168f)
                lineTo(13.3184f, 7.18168f)
                lineTo(13.3761f, 7.25199f)
                curveTo(13.475f, 7.4018f, 13.4751f, 7.59833f, 13.3761f, 7.74809f)
                lineTo(13.3184f, 7.8184f)
                lineTo(10.8184f, 10.3184f)
                curveTo(10.6428f, 10.4941f, 10.3575f, 10.4939f, 10.1817f, 10.3184f)
                curveTo(10.006f, 10.1427f, 10.006f, 9.85742f, 10.1817f, 9.68168f)
                lineTo(11.9132f, 7.95024f)
                horizontalLineTo(3.08699f)
                lineTo(4.81844f, 9.68168f)
                lineTo(4.87606f, 9.75199f)
                curveTo(4.9914f, 9.92666f, 4.97222f, 10.1646f, 4.81844f, 10.3184f)
                curveTo(4.66466f, 10.4722f, 4.4267f, 10.4914f, 4.25203f, 10.376f)
                lineTo(4.18172f, 10.3184f)
                lineTo(1.68172f, 7.8184f)
                curveTo(1.50599f, 7.64266f, 1.50599f, 7.35742f, 1.68172f, 7.18168f)
                lineTo(4.18172f, 4.68168f)
                lineTo(4.25203f, 4.62406f)
                curveTo(4.42672f, 4.50858f, 4.66461f, 4.52785f, 4.81844f, 4.68168f)
                curveTo(4.9721f, 4.83553f, 4.99152f, 5.07347f, 4.87606f, 5.24809f)
                lineTo(4.81844f, 5.3184f)
                lineTo(3.08699f, 7.04984f)
                horizontalLineTo(11.9132f)
                lineTo(10.1817f, 5.3184f)
                lineTo(10.1241f, 5.24809f)
                curveTo(10.0086f, 5.07339f, 10.0279f, 4.83552f, 10.1817f, 4.68168f)
                close()
            }
        }.build()
        
        return _Width!!
    }

private var _Width: ImageVector? = null

