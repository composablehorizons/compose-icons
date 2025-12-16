package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PinLeft: ImageVector
    get() {
        if (_PinLeft != null) return _PinLeft!!
        
        _PinLeft = ImageVector.Builder(
            name = "pin-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.12427f, 7.7478f)
                curveTo(5.02515f, 7.59795f, 5.02515f, 7.40156f, 5.12427f, 7.25171f)
                lineTo(5.18189f, 7.1814f)
                lineTo(8.43189f, 3.9314f)
                curveTo(8.60764f, 3.75592f, 8.89296f, 3.75575f, 9.0686f, 3.9314f)
                curveTo(9.24416f, 4.10705f, 9.24405f, 4.39239f, 9.0686f, 4.56812f)
                lineTo(6.58716f, 7.04956f)
                lineTo(14.5002f, 7.04956f)
                curveTo(14.7486f, 7.04969f, 14.9503f, 7.25138f, 14.9504f, 7.49976f)
                curveTo(14.9504f, 7.74821f, 14.7487f, 7.94983f, 14.5002f, 7.94995f)
                lineTo(6.58716f, 7.94995f)
                lineTo(9.0686f, 10.4314f)
                lineTo(9.12622f, 10.5017f)
                curveTo(9.24163f, 10.6763f, 9.22219f, 10.9143f, 9.0686f, 11.0681f)
                curveTo(8.91481f, 11.2219f, 8.67687f, 11.2411f, 8.5022f, 11.1257f)
                lineTo(8.43189f, 11.0681f)
                lineTo(5.18189f, 7.81812f)
                lineTo(5.12427f, 7.7478f)
                close()
                moveTo(2.05005f, 1.49976f)
                curveTo(2.05016f, 1.25132f, 2.25178f, 1.04956f, 2.50025f, 1.04956f)
                curveTo(2.74862f, 1.04967f, 2.95034f, 1.25138f, 2.95044f, 1.49976f)
                lineTo(2.95044f, 13.4998f)
                curveTo(2.95044f, 13.7482f, 2.74868f, 13.9498f, 2.50024f, 13.95f)
                curveTo(2.25172f, 13.95f, 2.05005f, 13.7483f, 2.05005f, 13.4998f)
                lineTo(2.05005f, 1.49976f)
                close()
            }
        }.build()
        
        return _PinLeft!!
    }

private var _PinLeft: ImageVector? = null

