package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderDashed: ImageVector
    get() {
        if (_BorderDashed != null) return _BorderDashed!!
        
        _BorderDashed = ImageVector.Builder(
            name = "border-dashed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 7f)
                curveTo(3.27614f, 7f, 3.5f, 7.22386f, 3.5f, 7.5f)
                curveTo(3.5f, 7.77614f, 3.27614f, 8f, 3f, 8f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 8f, 0f, 7.77614f, 0f, 7.5f)
                curveTo(0f, 7.22386f, 0.223858f, 7f, 0.5f, 7f)
                horizontalLineTo(3f)
                close()
                moveTo(8.75f, 7f)
                curveTo(9.02614f, 7f, 9.25f, 7.22386f, 9.25f, 7.5f)
                curveTo(9.25f, 7.77614f, 9.02614f, 8f, 8.75f, 8f)
                horizontalLineTo(6.25f)
                curveTo(5.97386f, 8f, 5.75f, 7.77614f, 5.75f, 7.5f)
                curveTo(5.75f, 7.22386f, 5.97386f, 7f, 6.25f, 7f)
                horizontalLineTo(8.75f)
                close()
                moveTo(14.5f, 7f)
                curveTo(14.7761f, 7f, 15f, 7.22386f, 15f, 7.5f)
                curveTo(15f, 7.77614f, 14.7761f, 8f, 14.5f, 8f)
                horizontalLineTo(12f)
                curveTo(11.7239f, 8f, 11.5f, 7.77614f, 11.5f, 7.5f)
                curveTo(11.5f, 7.22386f, 11.7239f, 7f, 12f, 7f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()
        
        return _BorderDashed!!
    }

private var _BorderDashed: ImageVector? = null

