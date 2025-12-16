package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DiffAdded: ImageVector
    get() {
        if (_DiffAdded != null) return _DiffAdded!!
        
        _DiffAdded = ImageVector.Builder(
            name = "diff-added",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.5f)
                curveTo(2f, 3.11929f, 3.11929f, 2f, 4.5f, 2f)
                horizontalLineTo(11.5f)
                curveTo(12.8807f, 2f, 14f, 3.11929f, 14f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.8807f, 12.8807f, 14f, 11.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.11929f, 14f, 2f, 12.8807f, 2f, 11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 3f)
                curveTo(3.67157f, 3f, 3f, 3.67157f, 3f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(3f, 12.3284f, 3.67157f, 13f, 4.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 13f, 13f, 12.3284f, 13f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(13f, 3.67157f, 12.3284f, 3f, 11.5f, 3f)
                horizontalLineTo(4.5f)
                close()
                moveTo(8f, 4.5f)
                curveTo(8.27614f, 4.5f, 8.5f, 4.72386f, 8.5f, 5f)
                verticalLineTo(7.5f)
                horizontalLineTo(11f)
                curveTo(11.2761f, 7.5f, 11.5f, 7.72386f, 11.5f, 8f)
                curveTo(11.5f, 8.27614f, 11.2761f, 8.5f, 11f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(11f)
                curveTo(8.5f, 11.2761f, 8.27614f, 11.5f, 8f, 11.5f)
                curveTo(7.72386f, 11.5f, 7.5f, 11.2761f, 7.5f, 11f)
                verticalLineTo(8.5f)
                horizontalLineTo(5f)
                curveTo(4.72386f, 8.5f, 4.5f, 8.27614f, 4.5f, 8f)
                curveTo(4.5f, 7.72386f, 4.72386f, 7.5f, 5f, 7.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(5f)
                curveTo(7.5f, 4.72386f, 7.72386f, 4.5f, 8f, 4.5f)
                close()
            }
        }.build()
        
        return _DiffAdded!!
    }

private var _DiffAdded: ImageVector? = null

