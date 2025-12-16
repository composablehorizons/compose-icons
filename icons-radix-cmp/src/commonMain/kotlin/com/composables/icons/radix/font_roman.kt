package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FontRoman: ImageVector
    get() {
        if (_FontRoman != null) return _FontRoman!!
        
        _FontRoman = ImageVector.Builder(
            name = "font-roman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.75018f, 3.05016f)
                curveTo(9.99862f, 3.05027f, 10.2004f, 3.2519f, 10.2004f, 3.50036f)
                curveTo(10.2003f, 3.74873f, 9.99856f, 3.95045f, 9.75018f, 3.95055f)
                horizontalLineTo(8.09979f)
                verticalLineTo(11.0502f)
                horizontalLineTo(9.75018f)
                curveTo(9.99863f, 11.0503f, 10.2004f, 11.2519f, 10.2004f, 11.5004f)
                curveTo(10.2002f, 11.7487f, 9.99852f, 11.9495f, 9.75018f, 11.9496f)
                horizontalLineTo(5.25018f)
                curveTo(5.00176f, 11.9496f, 4.80016f, 11.7487f, 4.79999f, 11.5004f)
                curveTo(4.79999f, 11.2518f, 5.00165f, 11.0502f, 5.25018f, 11.0502f)
                horizontalLineTo(6.8996f)
                verticalLineTo(3.95055f)
                horizontalLineTo(5.25018f)
                curveTo(5.00172f, 3.95055f, 4.80009f, 3.7488f, 4.79999f, 3.50036f)
                curveTo(4.79999f, 3.25183f, 5.00165f, 3.05016f, 5.25018f, 3.05016f)
                horizontalLineTo(9.75018f)
                close()
            }
        }.build()
        
        return _FontRoman!!
    }

private var _FontRoman: ImageVector? = null

