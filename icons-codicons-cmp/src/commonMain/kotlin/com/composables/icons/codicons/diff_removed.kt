package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DiffRemoved: ImageVector
    get() {
        if (_DiffRemoved != null) return _DiffRemoved!!
        
        _DiffRemoved = ImageVector.Builder(
            name = "diff-removed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 7.5f)
                curveTo(5.22386f, 7.5f, 5f, 7.72386f, 5f, 8f)
                curveTo(5f, 8.27614f, 5.22386f, 8.5f, 5.5f, 8.5f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 8.5f, 11f, 8.27614f, 11f, 8f)
                curveTo(11f, 7.72386f, 10.7761f, 7.5f, 10.5f, 7.5f)
                horizontalLineTo(5.5f)
                close()
                moveTo(4.5f, 2f)
                curveTo(3.11929f, 2f, 2f, 3.11929f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.8807f, 3.11929f, 14f, 4.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.8807f, 14f, 14f, 12.8807f, 14f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.11929f, 12.8807f, 2f, 11.5f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveTo(3f, 4.5f)
                curveTo(3f, 3.67157f, 3.67157f, 3f, 4.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 3f, 13f, 3.67157f, 13f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(13f, 12.3284f, 12.3284f, 13f, 11.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(3.67157f, 13f, 3f, 12.3284f, 3f, 11.5f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _DiffRemoved!!
    }

private var _DiffRemoved: ImageVector? = null

