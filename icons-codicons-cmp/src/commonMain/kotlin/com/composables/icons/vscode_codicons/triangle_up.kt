package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TriangleUp: ImageVector
    get() {
        if (_TriangleUp != null) return _TriangleUp!!
        
        _TriangleUp = ImageVector.Builder(
            name = "triangle-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.95693f, 10.9989f)
                curveTo(4.14924f, 10.9989f, 3.67479f, 10.0909f, 4.13603f, 9.42784f)
                lineTo(6.76866f, 5.64342f)
                curveTo(7.36545f, 4.78555f, 8.6346f, 4.78555f, 9.23138f, 5.64342f)
                lineTo(11.864f, 9.42784f)
                curveTo(12.3253f, 10.0909f, 11.8508f, 10.9989f, 11.0431f, 10.9989f)
                horizontalLineTo(4.95693f)
                close()
            }
        }.build()
        
        return _TriangleUp!!
    }

private var _TriangleUp: ImageVector? = null

