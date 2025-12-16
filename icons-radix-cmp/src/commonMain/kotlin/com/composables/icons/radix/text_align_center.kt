package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextAlignCenter: ImageVector
    get() {
        if (_TextAlignCenter != null) return _TextAlignCenter!!
        
        _TextAlignCenter = ImageVector.Builder(
            name = "text-align-center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 10f)
                curveTo(11.7761f, 10f, 12f, 10.2239f, 12f, 10.5f)
                curveTo(12f, 10.7761f, 11.7761f, 11f, 11.5f, 11f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 11f, 3f, 10.7761f, 3f, 10.5f)
                curveTo(3f, 10.2239f, 3.22386f, 10f, 3.5f, 10f)
                horizontalLineTo(11.5f)
                close()
                moveTo(10.5f, 7f)
                curveTo(10.7761f, 7f, 11f, 7.22386f, 11f, 7.5f)
                curveTo(11f, 7.77614f, 10.7761f, 8f, 10.5f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8f, 4f, 7.77614f, 4f, 7.5f)
                curveTo(4f, 7.22386f, 4.22386f, 7f, 4.5f, 7f)
                horizontalLineTo(10.5f)
                close()
                moveTo(12.5f, 4f)
                curveTo(12.7761f, 4f, 13f, 4.22386f, 13f, 4.5f)
                curveTo(13f, 4.77614f, 12.7761f, 5f, 12.5f, 5f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 5f, 2f, 4.77614f, 2f, 4.5f)
                curveTo(2f, 4.22386f, 2.22386f, 4f, 2.5f, 4f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _TextAlignCenter!!
    }

private var _TextAlignCenter: ImageVector? = null

