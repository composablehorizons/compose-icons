package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Minus: ImageVector
    get() {
        if (_Minus != null) return _Minus!!
        
        _Minus = ImageVector.Builder(
            name = "minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.25f, 7f)
                curveTo(12.5261f, 7f, 12.75f, 7.22386f, 12.75f, 7.5f)
                curveTo(12.75f, 7.77614f, 12.5261f, 8f, 12.25f, 8f)
                horizontalLineTo(2.75f)
                curveTo(2.47386f, 8f, 2.25f, 7.77614f, 2.25f, 7.5f)
                curveTo(2.25f, 7.22386f, 2.47386f, 7f, 2.75f, 7f)
                horizontalLineTo(12.25f)
                close()
            }
        }.build()
        
        return _Minus!!
    }

private var _Minus: ImageVector? = null

