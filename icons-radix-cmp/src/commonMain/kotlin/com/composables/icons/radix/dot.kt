package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Dot: ImageVector
    get() {
        if (_Dot != null) return _Dot!!
        
        _Dot = ImageVector.Builder(
            name = "dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 4.875f)
                curveTo(8.94975f, 4.875f, 10.125f, 6.05025f, 10.125f, 7.5f)
                curveTo(10.125f, 8.94975f, 8.94975f, 10.125f, 7.5f, 10.125f)
                curveTo(6.05025f, 10.125f, 4.875f, 8.94975f, 4.875f, 7.5f)
                curveTo(4.875f, 6.05025f, 6.05025f, 4.875f, 7.5f, 4.875f)
                close()
                moveTo(7.5f, 5.875f)
                curveTo(6.60254f, 5.875f, 5.875f, 6.60254f, 5.875f, 7.5f)
                curveTo(5.875f, 8.39746f, 6.60254f, 9.125f, 7.5f, 9.125f)
                curveTo(8.39746f, 9.125f, 9.125f, 8.39746f, 9.125f, 7.5f)
                curveTo(9.125f, 6.60254f, 8.39746f, 5.875f, 7.5f, 5.875f)
                close()
            }
        }.build()
        
        return _Dot!!
    }

private var _Dot: ImageVector? = null

