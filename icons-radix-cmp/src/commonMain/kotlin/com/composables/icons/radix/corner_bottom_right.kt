package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CornerBottomRight: ImageVector
    get() {
        if (_CornerBottomRight != null) return _CornerBottomRight!!
        
        _CornerBottomRight = ImageVector.Builder(
            name = "corner-bottom-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 12f)
                curveTo(3.22386f, 12f, 3f, 11.7761f, 3f, 11.5f)
                curveTo(3f, 11.2239f, 3.22386f, 11f, 3.5f, 11f)
                horizontalLineTo(5.09961f)
                curveTo(6.22796f, 11f, 7.0446f, 10.9997f, 7.68652f, 10.9473f)
                curveTo(8.32259f, 10.8953f, 8.74328f, 10.7942f, 9.08887f, 10.6182f)
                curveTo(9.74738f, 10.2826f, 10.2826f, 9.74738f, 10.6182f, 9.08887f)
                curveTo(10.7942f, 8.74328f, 10.8953f, 8.32259f, 10.9473f, 7.68652f)
                curveTo(10.9997f, 7.0446f, 11f, 6.22796f, 11f, 5.09961f)
                verticalLineTo(3.5f)
                curveTo(11f, 3.22386f, 11.2239f, 3f, 11.5f, 3f)
                curveTo(11.7761f, 3f, 12f, 3.22386f, 12f, 3.5f)
                verticalLineTo(5.09961f)
                curveTo(12f, 6.21131f, 11.9999f, 7.07553f, 11.9434f, 7.76758f)
                curveTo(11.8863f, 8.46547f, 11.7696f, 9.03293f, 11.5098f, 9.54297f)
                curveTo(11.0783f, 10.3897f, 10.3897f, 11.0783f, 9.54297f, 11.5098f)
                curveTo(9.03293f, 11.7696f, 8.46547f, 11.8863f, 7.76758f, 11.9434f)
                curveTo(7.07553f, 11.9999f, 6.21131f, 12f, 5.09961f, 12f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _CornerBottomRight!!
    }

private var _CornerBottomRight: ImageVector? = null

