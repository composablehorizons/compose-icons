package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CornerTopLeft: ImageVector
    get() {
        if (_CornerTopLeft != null) return _CornerTopLeft!!
        
        _CornerTopLeft = ImageVector.Builder(
            name = "corner-top-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 3f)
                curveTo(11.7761f, 3f, 12f, 3.22386f, 12f, 3.5f)
                curveTo(12f, 3.77614f, 11.7761f, 4f, 11.5f, 4f)
                horizontalLineTo(9.90039f)
                curveTo(8.77204f, 4f, 7.9554f, 4.00029f, 7.31348f, 4.05273f)
                curveTo(6.67741f, 4.10471f, 6.25672f, 4.20575f, 5.91113f, 4.38184f)
                curveTo(5.25262f, 4.71738f, 4.71738f, 5.25262f, 4.38184f, 5.91113f)
                curveTo(4.20575f, 6.25672f, 4.10471f, 6.67741f, 4.05273f, 7.31348f)
                curveTo(4.00029f, 7.9554f, 4f, 8.77204f, 4f, 9.90039f)
                verticalLineTo(11.5f)
                curveTo(4f, 11.7761f, 3.77614f, 12f, 3.5f, 12f)
                curveTo(3.22386f, 12f, 3f, 11.7761f, 3f, 11.5f)
                verticalLineTo(9.90039f)
                curveTo(3f, 8.78869f, 3.00012f, 7.92447f, 3.05664f, 7.23242f)
                curveTo(3.11366f, 6.53453f, 3.23038f, 5.96707f, 3.49023f, 5.45703f)
                curveTo(3.92166f, 4.6103f, 4.6103f, 3.92166f, 5.45703f, 3.49023f)
                curveTo(5.96707f, 3.23038f, 6.53453f, 3.11366f, 7.23242f, 3.05664f)
                curveTo(7.92447f, 3.00012f, 8.78869f, 3f, 9.90039f, 3f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()
        
        return _CornerTopLeft!!
    }

private var _CornerTopLeft: ImageVector? = null

