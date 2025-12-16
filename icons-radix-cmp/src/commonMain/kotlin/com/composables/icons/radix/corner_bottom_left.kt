package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CornerBottomLeft: ImageVector
    get() {
        if (_CornerBottomLeft != null) return _CornerBottomLeft!!
        
        _CornerBottomLeft = ImageVector.Builder(
            name = "corner-bottom-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 12f)
                curveTo(11.7761f, 12f, 12f, 11.7761f, 12f, 11.5f)
                curveTo(12f, 11.2239f, 11.7761f, 11f, 11.5f, 11f)
                horizontalLineTo(9.90039f)
                curveTo(8.77204f, 11f, 7.9554f, 10.9997f, 7.31348f, 10.9473f)
                curveTo(6.67741f, 10.8953f, 6.25672f, 10.7942f, 5.91113f, 10.6182f)
                curveTo(5.25262f, 10.2826f, 4.71738f, 9.74738f, 4.38184f, 9.08887f)
                curveTo(4.20575f, 8.74328f, 4.10471f, 8.32259f, 4.05273f, 7.68652f)
                curveTo(4.00029f, 7.0446f, 4f, 6.22796f, 4f, 5.09961f)
                verticalLineTo(3.5f)
                curveTo(4f, 3.22386f, 3.77614f, 3f, 3.5f, 3f)
                curveTo(3.22386f, 3f, 3f, 3.22386f, 3f, 3.5f)
                verticalLineTo(5.09961f)
                curveTo(3f, 6.21131f, 3.00012f, 7.07553f, 3.05664f, 7.76758f)
                curveTo(3.11366f, 8.46547f, 3.23038f, 9.03293f, 3.49023f, 9.54297f)
                curveTo(3.92166f, 10.3897f, 4.6103f, 11.0783f, 5.45703f, 11.5098f)
                curveTo(5.96707f, 11.7696f, 6.53453f, 11.8863f, 7.23242f, 11.9434f)
                curveTo(7.92447f, 11.9999f, 8.78869f, 12f, 9.90039f, 12f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()
        
        return _CornerBottomLeft!!
    }

private var _CornerBottomLeft: ImageVector? = null

