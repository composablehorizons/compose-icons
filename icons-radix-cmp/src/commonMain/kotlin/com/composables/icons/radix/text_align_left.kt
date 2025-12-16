package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TextAlignLeft: ImageVector
    get() {
        if (_TextAlignLeft != null) return _TextAlignLeft!!
        
        _TextAlignLeft = ImageVector.Builder(
            name = "text-align-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 10f)
                curveTo(10.7761f, 10f, 11f, 10.2239f, 11f, 10.5f)
                curveTo(11f, 10.7761f, 10.7761f, 11f, 10.5f, 11f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 11f, 2f, 10.7761f, 2f, 10.5f)
                curveTo(2f, 10.2239f, 2.22386f, 10f, 2.5f, 10f)
                horizontalLineTo(10.5f)
                close()
                moveTo(7.5f, 7f)
                curveTo(7.77614f, 7f, 8f, 7.22386f, 8f, 7.5f)
                curveTo(8f, 7.77614f, 7.77614f, 8f, 7.5f, 8f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 8f, 2f, 7.77614f, 2f, 7.5f)
                curveTo(2f, 7.22386f, 2.22386f, 7f, 2.5f, 7f)
                horizontalLineTo(7.5f)
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
        
        return _TextAlignLeft!!
    }

private var _TextAlignLeft: ImageVector? = null

