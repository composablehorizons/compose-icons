package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PinTop: ImageVector
    get() {
        if (_PinTop != null) return _PinTop!!
        
        _PinTop = ImageVector.Builder(
            name = "pin-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.2522f, 4.12427f)
                curveTo(7.40205f, 4.02515f, 7.59844f, 4.02515f, 7.74829f, 4.12427f)
                lineTo(7.8186f, 4.18188f)
                lineTo(11.0686f, 7.43188f)
                curveTo(11.2441f, 7.60764f, 11.2443f, 7.89295f, 11.0686f, 8.0686f)
                curveTo(10.8929f, 8.24416f, 10.6076f, 8.24405f, 10.4319f, 8.0686f)
                lineTo(7.95044f, 5.58716f)
                verticalLineTo(13.5002f)
                curveTo(7.95032f, 13.7486f, 7.74862f, 13.9503f, 7.50024f, 13.9504f)
                curveTo(7.25179f, 13.9504f, 7.05017f, 13.7487f, 7.05005f, 13.5002f)
                verticalLineTo(5.58716f)
                lineTo(4.5686f, 8.0686f)
                lineTo(4.49829f, 8.12622f)
                curveTo(4.3237f, 8.24163f, 4.08572f, 8.22219f, 3.93188f, 8.0686f)
                curveTo(3.77809f, 7.91481f, 3.75888f, 7.67687f, 3.87427f, 7.5022f)
                lineTo(3.93188f, 7.43188f)
                lineTo(7.18188f, 4.18188f)
                lineTo(7.2522f, 4.12427f)
                close()
                moveTo(13.5002f, 1.05005f)
                curveTo(13.7487f, 1.05015f, 13.9504f, 1.25178f, 13.9504f, 1.50024f)
                curveTo(13.9503f, 1.74862f, 13.7486f, 1.95033f, 13.5002f, 1.95044f)
                horizontalLineTo(1.50024f)
                curveTo(1.25178f, 1.95044f, 1.05015f, 1.74868f, 1.05005f, 1.50024f)
                curveTo(1.05005f, 1.25172f, 1.25172f, 1.05005f, 1.50024f, 1.05005f)
                horizontalLineTo(13.5002f)
                close()
            }
        }.build()
        
        return _PinTop!!
    }

private var _PinTop: ImageVector? = null

