package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TriangleDown: ImageVector
    get() {
        if (_TriangleDown != null) return _TriangleDown!!
        
        _TriangleDown = ImageVector.Builder(
            name = "triangle-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 10.5f)
                lineTo(4f, 6f)
                horizontalLineTo(11f)
                lineTo(7.5f, 10.5f)
                close()
            }
        }.build()
        
        return _TriangleDown!!
    }

private var _TriangleDown: ImageVector? = null

