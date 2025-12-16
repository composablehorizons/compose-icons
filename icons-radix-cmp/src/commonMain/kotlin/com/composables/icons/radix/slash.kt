package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Slash: ImageVector
    get() {
        if (_Slash != null) return _Slash!!
        
        _Slash = ImageVector.Builder(
            name = "slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.46033f, 14f)
                horizontalLineTo(4.10779f)
                lineTo(9.46521f, 1f)
                horizontalLineTo(10.8177f)
                lineTo(5.46033f, 14f)
                close()
            }
        }.build()
        
        return _Slash!!
    }

private var _Slash: ImageVector? = null

