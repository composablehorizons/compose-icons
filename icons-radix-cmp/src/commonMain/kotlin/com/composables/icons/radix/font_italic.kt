package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FontItalic: ImageVector
    get() {
        if (_FontItalic != null) return _FontItalic!!
        
        _FontItalic = ImageVector.Builder(
            name = "font-italic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.6252f, 3.05018f)
                curveTo(10.8736f, 3.05028f, 11.0754f, 3.25191f, 11.0754f, 3.50037f)
                curveTo(11.0753f, 3.74875f, 10.8736f, 3.95047f, 10.6252f, 3.95057f)
                horizontalLineTo(9.00604f)
                lineTo(7.23065f, 11.0502f)
                horizontalLineTo(8.87518f)
                curveTo(9.12362f, 11.0503f, 9.32538f, 11.2519f, 9.32538f, 11.5004f)
                curveTo(9.32521f, 11.7487f, 9.12352f, 11.9495f, 8.87518f, 11.9496f)
                horizontalLineTo(4.37518f)
                curveTo(4.12676f, 11.9496f, 3.92516f, 11.7488f, 3.92499f, 11.5004f)
                curveTo(3.92499f, 11.2518f, 4.12665f, 11.0502f, 4.37518f, 11.0502f)
                horizontalLineTo(5.99432f)
                lineTo(7.76971f, 3.95057f)
                horizontalLineTo(6.12518f)
                curveTo(5.87672f, 3.95057f, 5.67509f, 3.74881f, 5.67499f, 3.50037f)
                curveTo(5.67499f, 3.25185f, 5.87665f, 3.05018f, 6.12518f, 3.05018f)
                horizontalLineTo(10.6252f)
                close()
            }
        }.build()
        
        return _FontItalic!!
    }

private var _FontItalic: ImageVector? = null

