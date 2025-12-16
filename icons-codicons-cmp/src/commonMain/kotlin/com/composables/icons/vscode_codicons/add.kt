package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Add: ImageVector
    get() {
        if (_Add != null) return _Add!!
        
        _Add = ImageVector.Builder(
            name = "add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.5f)
                curveTo(8f, 1.22386f, 7.77614f, 1f, 7.5f, 1f)
                curveTo(7.22386f, 1f, 7f, 1.22386f, 7f, 1.5f)
                verticalLineTo(7f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 7f, 1f, 7.22386f, 1f, 7.5f)
                curveTo(1f, 7.77614f, 1.22386f, 8f, 1.5f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(13.5f)
                curveTo(7f, 13.7761f, 7.22386f, 14f, 7.5f, 14f)
                curveTo(7.77614f, 14f, 8f, 13.7761f, 8f, 13.5f)
                verticalLineTo(8f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 8f, 14f, 7.77614f, 14f, 7.5f)
                curveTo(14f, 7.22386f, 13.7761f, 7f, 13.5f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(1.5f)
                close()
            }
        }.build()
        
        return _Add!!
    }

private var _Add: ImageVector? = null

