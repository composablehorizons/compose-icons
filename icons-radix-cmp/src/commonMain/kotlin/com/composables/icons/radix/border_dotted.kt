package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderDotted: ImageVector
    get() {
        if (_BorderDotted != null) return _BorderDotted!!
        
        _BorderDotted = ImageVector.Builder(
            name = "border-dotted",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 6.625f)
                curveTo(1.98325f, 6.625f, 2.375f, 7.01675f, 2.375f, 7.5f)
                curveTo(2.375f, 7.98325f, 1.98325f, 8.375f, 1.5f, 8.375f)
                curveTo(1.01675f, 8.375f, 0.625f, 7.98325f, 0.625f, 7.5f)
                curveTo(0.625f, 7.01675f, 1.01675f, 6.625f, 1.5f, 6.625f)
                close()
                moveTo(5.5f, 6.625f)
                curveTo(5.98325f, 6.625f, 6.375f, 7.01675f, 6.375f, 7.5f)
                curveTo(6.375f, 7.98325f, 5.98325f, 8.375f, 5.5f, 8.375f)
                curveTo(5.01675f, 8.375f, 4.625f, 7.98325f, 4.625f, 7.5f)
                curveTo(4.625f, 7.01675f, 5.01675f, 6.625f, 5.5f, 6.625f)
                close()
                moveTo(9.5f, 6.625f)
                curveTo(9.98325f, 6.625f, 10.375f, 7.01675f, 10.375f, 7.5f)
                curveTo(10.375f, 7.98325f, 9.98325f, 8.375f, 9.5f, 8.375f)
                curveTo(9.01675f, 8.375f, 8.625f, 7.98325f, 8.625f, 7.5f)
                curveTo(8.625f, 7.01675f, 9.01675f, 6.625f, 9.5f, 6.625f)
                close()
                moveTo(13.5f, 6.625f)
                curveTo(13.9832f, 6.625f, 14.375f, 7.01675f, 14.375f, 7.5f)
                curveTo(14.375f, 7.98325f, 13.9832f, 8.375f, 13.5f, 8.375f)
                curveTo(13.0168f, 8.375f, 12.625f, 7.98325f, 12.625f, 7.5f)
                curveTo(12.625f, 7.01675f, 13.0168f, 6.625f, 13.5f, 6.625f)
                close()
            }
        }.build()
        
        return _BorderDotted!!
    }

private var _BorderDotted: ImageVector? = null

