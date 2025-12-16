package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TriangleLeft: ImageVector
    get() {
        if (_TriangleLeft != null) return _TriangleLeft!!
        
        _TriangleLeft = ImageVector.Builder(
            name = "triangle-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7.5f)
                lineTo(9f, 4f)
                lineTo(9f, 11f)
                lineTo(4.5f, 7.5f)
                close()
            }
        }.build()
        
        return _TriangleLeft!!
    }

private var _TriangleLeft: ImageVector? = null

