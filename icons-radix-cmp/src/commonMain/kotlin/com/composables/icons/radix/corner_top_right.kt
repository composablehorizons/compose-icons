package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CornerTopRight: ImageVector
    get() {
        if (_CornerTopRight != null) return _CornerTopRight!!
        
        _CornerTopRight = ImageVector.Builder(
            name = "corner-top-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 3f)
                curveTo(3.22386f, 3f, 3f, 3.22386f, 3f, 3.5f)
                curveTo(3f, 3.77614f, 3.22386f, 4f, 3.5f, 4f)
                horizontalLineTo(5.09961f)
                curveTo(6.22796f, 4f, 7.0446f, 4.00029f, 7.68652f, 4.05273f)
                curveTo(8.32259f, 4.10471f, 8.74328f, 4.20575f, 9.08887f, 4.38184f)
                curveTo(9.74738f, 4.71738f, 10.2826f, 5.25262f, 10.6182f, 5.91113f)
                curveTo(10.7942f, 6.25672f, 10.8953f, 6.67741f, 10.9473f, 7.31348f)
                curveTo(10.9997f, 7.9554f, 11f, 8.77204f, 11f, 9.90039f)
                verticalLineTo(11.5f)
                curveTo(11f, 11.7761f, 11.2239f, 12f, 11.5f, 12f)
                curveTo(11.7761f, 12f, 12f, 11.7761f, 12f, 11.5f)
                verticalLineTo(9.90039f)
                curveTo(12f, 8.78869f, 11.9999f, 7.92447f, 11.9434f, 7.23242f)
                curveTo(11.8863f, 6.53453f, 11.7696f, 5.96707f, 11.5098f, 5.45703f)
                curveTo(11.0783f, 4.6103f, 10.3897f, 3.92166f, 9.54297f, 3.49023f)
                curveTo(9.03293f, 3.23038f, 8.46547f, 3.11366f, 7.76758f, 3.05664f)
                curveTo(7.07553f, 3.00012f, 6.21131f, 3f, 5.09961f, 3f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _CornerTopRight!!
    }

private var _CornerTopRight: ImageVector? = null

