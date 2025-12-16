package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ListUnordered: ImageVector
    get() {
        if (_ListUnordered != null) return _ListUnordered!!
        
        _ListUnordered = ImageVector.Builder(
            name = "list-unordered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.5f)
                curveTo(2.55228f, 4.5f, 3f, 4.05228f, 3f, 3.5f)
                curveTo(3f, 2.94772f, 2.55228f, 2.5f, 2f, 2.5f)
                curveTo(1.44772f, 2.5f, 1f, 2.94772f, 1f, 3.5f)
                curveTo(1f, 4.05228f, 1.44772f, 4.5f, 2f, 4.5f)
                close()
                moveTo(2f, 9f)
                curveTo(2.55228f, 9f, 3f, 8.55228f, 3f, 8f)
                curveTo(3f, 7.44772f, 2.55228f, 7f, 2f, 7f)
                curveTo(1.44772f, 7f, 1f, 7.44772f, 1f, 8f)
                curveTo(1f, 8.55228f, 1.44772f, 9f, 2f, 9f)
                close()
                moveTo(3f, 12.5f)
                curveTo(3f, 13.0523f, 2.55228f, 13.5f, 2f, 13.5f)
                curveTo(1.44772f, 13.5f, 1f, 13.0523f, 1f, 12.5f)
                curveTo(1f, 11.9477f, 1.44772f, 11.5f, 2f, 11.5f)
                curveTo(2.55228f, 11.5f, 3f, 11.9477f, 3f, 12.5f)
                close()
                moveTo(5.5f, 3f)
                curveTo(5.22386f, 3f, 5f, 3.22386f, 5f, 3.5f)
                curveTo(5f, 3.77614f, 5.22386f, 4f, 5.5f, 4f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 4f, 15f, 3.77614f, 15f, 3.5f)
                curveTo(15f, 3.22386f, 14.7761f, 3f, 14.5f, 3f)
                horizontalLineTo(5.5f)
                close()
                moveTo(5f, 8f)
                curveTo(5f, 7.72386f, 5.22386f, 7.5f, 5.5f, 7.5f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 7.5f, 15f, 7.72386f, 15f, 8f)
                curveTo(15f, 8.27614f, 14.7761f, 8.5f, 14.5f, 8.5f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 8.5f, 5f, 8.27614f, 5f, 8f)
                close()
                moveTo(5.5f, 12f)
                curveTo(5.22386f, 12f, 5f, 12.2239f, 5f, 12.5f)
                curveTo(5f, 12.7761f, 5.22386f, 13f, 5.5f, 13f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 13f, 15f, 12.7761f, 15f, 12.5f)
                curveTo(15f, 12.2239f, 14.7761f, 12f, 14.5f, 12f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _ListUnordered!!
    }

private var _ListUnordered: ImageVector? = null

