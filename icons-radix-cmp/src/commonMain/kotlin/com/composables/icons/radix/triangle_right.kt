package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TriangleRight: ImageVector
    get() {
        if (_TriangleRight != null) return _TriangleRight!!
        
        _TriangleRight = ImageVector.Builder(
            name = "triangle-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 7.5f)
                lineTo(6f, 11f)
                lineTo(6f, 4f)
                lineTo(10.5f, 7.5f)
                close()
            }
        }.build()
        
        return _TriangleRight!!
    }

private var _TriangleRight: ImageVector? = null

