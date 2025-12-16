package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ListFilter: ImageVector
    get() {
        if (_ListFilter != null) return _ListFilter!!
        
        _ListFilter = ImageVector.Builder(
            name = "list-filter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                curveTo(2f, 3.22386f, 2.22386f, 3f, 2.5f, 3f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 3f, 14f, 3.22386f, 14f, 3.5f)
                curveTo(14f, 3.77614f, 13.7761f, 4f, 13.5f, 4f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 4f, 2f, 3.77614f, 2f, 3.5f)
                close()
                moveTo(4f, 7.5f)
                curveTo(4f, 7.22386f, 4.22386f, 7f, 4.5f, 7f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 7f, 12f, 7.22386f, 12f, 7.5f)
                curveTo(12f, 7.77614f, 11.7761f, 8f, 11.5f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8f, 4f, 7.77614f, 4f, 7.5f)
                close()
                moveTo(6f, 11.5f)
                curveTo(6f, 11.2239f, 6.22386f, 11f, 6.5f, 11f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 11f, 10f, 11.2239f, 10f, 11.5f)
                curveTo(10f, 11.7761f, 9.77614f, 12f, 9.5f, 12f)
                horizontalLineTo(6.5f)
                curveTo(6.22386f, 12f, 6f, 11.7761f, 6f, 11.5f)
                close()
            }
        }.build()
        
        return _ListFilter!!
    }

private var _ListFilter: ImageVector? = null

