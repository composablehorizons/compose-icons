package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TriangleUp: ImageVector
    get() {
        if (_TriangleUp != null) return _TriangleUp!!
        
        _TriangleUp = ImageVector.Builder(
            name = "triangle-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 4.5f)
                lineTo(4f, 9f)
                horizontalLineTo(11f)
                lineTo(7.5f, 4.5f)
                close()
            }
        }.build()
        
        return _TriangleUp!!
    }

private var _TriangleUp: ImageVector? = null

