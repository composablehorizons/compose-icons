package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TriangleDown: ImageVector
    get() {
        if (_TriangleDown != null) return _TriangleDown!!
        
        _TriangleDown = ImageVector.Builder(
            name = "triangle-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.95693f, 5f)
                curveTo(4.14924f, 5f, 3.67479f, 5.90803f, 4.13603f, 6.57107f)
                lineTo(6.76866f, 10.3555f)
                curveTo(7.36545f, 11.2134f, 8.6346f, 11.2133f, 9.23138f, 10.3555f)
                lineTo(11.864f, 6.57106f)
                curveTo(12.3253f, 5.90803f, 11.8508f, 5f, 11.0431f, 5f)
                horizontalLineTo(4.95693f)
                close()
            }
        }.build()
        
        return _TriangleDown!!
    }

private var _TriangleDown: ImageVector? = null

