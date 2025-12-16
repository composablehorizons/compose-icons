package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.PinRight: ImageVector
    get() {
        if (_PinRight != null) return _PinRight!!
        
        _PinRight = ImageVector.Builder(
            name = "pin-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.87573f, 7.2522f)
                curveTo(9.97485f, 7.40205f, 9.97485f, 7.59844f, 9.87573f, 7.74829f)
                lineTo(9.81811f, 7.8186f)
                lineTo(6.56811f, 11.0686f)
                curveTo(6.39236f, 11.2441f, 6.10705f, 11.2443f, 5.9314f, 11.0686f)
                curveTo(5.75584f, 10.8929f, 5.75595f, 10.6076f, 5.9314f, 10.4319f)
                lineTo(8.41284f, 7.95044f)
                lineTo(0.499756f, 7.95044f)
                curveTo(0.251389f, 7.95031f, 0.0496518f, 7.74862f, 0.0495603f, 7.50024f)
                curveTo(0.0495603f, 7.25179f, 0.251333f, 7.05017f, 0.499756f, 7.05005f)
                lineTo(8.41284f, 7.05005f)
                lineTo(5.9314f, 4.5686f)
                lineTo(5.87378f, 4.49829f)
                curveTo(5.75837f, 4.3237f, 5.77781f, 4.08572f, 5.9314f, 3.93188f)
                curveTo(6.08519f, 3.77809f, 6.32313f, 3.75888f, 6.4978f, 3.87427f)
                lineTo(6.56812f, 3.93188f)
                lineTo(9.81811f, 7.18188f)
                lineTo(9.87573f, 7.2522f)
                close()
                moveTo(12.95f, 13.5002f)
                curveTo(12.9498f, 13.7487f, 12.7482f, 13.9504f, 12.4998f, 13.9504f)
                curveTo(12.2514f, 13.9503f, 12.0497f, 13.7486f, 12.0496f, 13.5002f)
                lineTo(12.0496f, 1.50024f)
                curveTo(12.0496f, 1.25178f, 12.2513f, 1.05015f, 12.4998f, 1.05005f)
                curveTo(12.7483f, 1.05005f, 12.95f, 1.25172f, 12.95f, 1.50024f)
                lineTo(12.95f, 13.5002f)
                close()
            }
        }.build()
        
        return _PinRight!!
    }

private var _PinRight: ImageVector? = null

