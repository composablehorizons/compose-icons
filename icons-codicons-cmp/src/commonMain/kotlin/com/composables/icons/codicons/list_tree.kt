package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ListTree: ImageVector
    get() {
        if (_ListTree != null) return _ListTree!!
        
        _ListTree = ImageVector.Builder(
            name = "list-tree",
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
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 6f, 14f, 6.22386f, 14f, 6.5f)
                curveTo(14f, 6.77614f, 13.7761f, 7f, 13.5f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 9f, 14f, 9.22386f, 14f, 9.5f)
                curveTo(14f, 9.77614f, 13.7761f, 10f, 13.5f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 12f, 14f, 12.2239f, 14f, 12.5f)
                curveTo(14f, 12.7761f, 13.7761f, 13f, 13.5f, 13f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 13f, 5f, 12.7761f, 5f, 12.5f)
                verticalLineTo(4f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 4f, 2f, 3.77614f, 2f, 3.5f)
                close()
            }
        }.build()
        
        return _ListTree!!
    }

private var _ListTree: ImageVector? = null

