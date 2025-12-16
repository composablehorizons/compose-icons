package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ComponentInstance: ImageVector
    get() {
        if (_ComponentInstance != null) return _ComponentInstance!!
        
        _ComponentInstance = ImageVector.Builder(
            name = "component-instance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22405f, 1.42516f)
                curveTo(7.41815f, 1.29686f, 7.68302f, 1.3187f, 7.85393f, 1.48961f)
                lineTo(13.5102f, 7.14684f)
                lineTo(13.5746f, 7.22399f)
                curveTo(13.7029f, 7.41809f, 13.6811f, 7.68295f, 13.5102f, 7.85387f)
                lineTo(7.85393f, 13.5101f)
                curveTo(7.6587f, 13.7054f, 7.34217f, 13.7053f, 7.1469f, 13.5101f)
                lineTo(1.48968f, 7.85387f)
                curveTo(1.29448f, 7.65867f, 1.2946f, 7.34212f, 1.48968f, 7.14684f)
                lineTo(7.1469f, 1.48961f)
                lineTo(7.22405f, 1.42516f)
                close()
                moveTo(2.55022f, 7.50036f)
                lineTo(7.50042f, 12.4496f)
                lineTo(12.4496f, 7.50036f)
                lineTo(7.50042f, 2.55016f)
                lineTo(2.55022f, 7.50036f)
                close()
            }
        }.build()
        
        return _ComponentInstance!!
    }

private var _ComponentInstance: ImageVector? = null

