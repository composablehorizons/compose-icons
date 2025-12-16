package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DotFilled: ImageVector
    get() {
        if (_DotFilled != null) return _DotFilled!!
        
        _DotFilled = ImageVector.Builder(
            name = "dot-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 5.125f)
                curveTo(8.81168f, 5.125f, 9.875f, 6.18832f, 9.875f, 7.5f)
                curveTo(9.875f, 8.81168f, 8.81168f, 9.875f, 7.5f, 9.875f)
                curveTo(6.18832f, 9.875f, 5.125f, 8.81168f, 5.125f, 7.5f)
                curveTo(5.125f, 6.18832f, 6.18832f, 5.125f, 7.5f, 5.125f)
                close()
            }
        }.build()
        
        return _DotFilled!!
    }

private var _DotFilled: ImageVector? = null

