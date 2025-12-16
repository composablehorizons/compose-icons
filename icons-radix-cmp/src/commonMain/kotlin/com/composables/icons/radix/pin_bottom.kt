package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PinBottom: ImageVector
    get() {
        if (_PinBottom != null) return _PinBottom!!
        
        _PinBottom = ImageVector.Builder(
            name = "pin-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.7478f, 10.8757f)
                curveTo(7.59795f, 10.9748f, 7.40156f, 10.9749f, 7.25171f, 10.8757f)
                lineTo(7.1814f, 10.8181f)
                lineTo(3.9314f, 7.56811f)
                curveTo(3.75592f, 7.39236f, 3.75575f, 7.10704f, 3.9314f, 6.9314f)
                curveTo(4.10705f, 6.75584f, 4.39239f, 6.75595f, 4.56812f, 6.9314f)
                lineTo(7.04956f, 9.41284f)
                lineTo(7.04956f, 1.49976f)
                curveTo(7.04969f, 1.25139f, 7.25138f, 1.04965f, 7.49976f, 1.04956f)
                curveTo(7.74821f, 1.04956f, 7.94983f, 1.25133f, 7.94995f, 1.49976f)
                lineTo(7.94995f, 9.41284f)
                lineTo(10.4314f, 6.9314f)
                lineTo(10.5017f, 6.87378f)
                curveTo(10.6763f, 6.75837f, 10.9143f, 6.77781f, 11.0681f, 6.9314f)
                curveTo(11.2219f, 7.08519f, 11.2411f, 7.32313f, 11.1257f, 7.4978f)
                lineTo(11.0681f, 7.56811f)
                lineTo(7.81812f, 10.8181f)
                lineTo(7.7478f, 10.8757f)
                close()
                moveTo(1.49976f, 13.95f)
                curveTo(1.25132f, 13.9498f, 1.04956f, 13.7482f, 1.04956f, 13.4998f)
                curveTo(1.04967f, 13.2514f, 1.25138f, 13.0497f, 1.49976f, 13.0496f)
                lineTo(13.4998f, 13.0496f)
                curveTo(13.7482f, 13.0496f, 13.9498f, 13.2513f, 13.95f, 13.4998f)
                curveTo(13.95f, 13.7483f, 13.7483f, 13.95f, 13.4998f, 13.95f)
                lineTo(1.49976f, 13.95f)
                close()
            }
        }.build()
        
        return _PinBottom!!
    }

private var _PinBottom: ImageVector? = null

