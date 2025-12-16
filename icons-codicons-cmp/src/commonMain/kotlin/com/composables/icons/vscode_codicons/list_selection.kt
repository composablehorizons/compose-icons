package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ListSelection: ImageVector
    get() {
        if (_ListSelection != null) return _ListSelection!!
        
        _ListSelection = ImageVector.Builder(
            name = "list-selection",
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
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 3f, 11f, 3.22386f, 11f, 3.5f)
                curveTo(11f, 3.77614f, 10.7761f, 4f, 10.5f, 4f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 4f, 2f, 3.77614f, 2f, 3.5f)
                close()
                moveTo(2f, 11.5f)
                curveTo(2f, 11.2239f, 2.22386f, 11f, 2.5f, 11f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 11f, 10f, 11.2239f, 10f, 11.5f)
                curveTo(10f, 11.7761f, 9.77614f, 12f, 9.5f, 12f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 12f, 2f, 11.7761f, 2f, 11.5f)
                close()
                moveTo(2.5f, 7f)
                curveTo(2.22386f, 7f, 2f, 7.22386f, 2f, 7.5f)
                curveTo(2f, 7.77614f, 2.22386f, 8f, 2.5f, 8f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 8f, 14f, 7.77614f, 14f, 7.5f)
                curveTo(14f, 7.22386f, 13.7761f, 7f, 13.5f, 7f)
                horizontalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _ListSelection!!
    }

private var _ListSelection: ImageVector? = null

