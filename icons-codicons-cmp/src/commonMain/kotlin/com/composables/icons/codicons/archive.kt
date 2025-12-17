package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Archive: ImageVector
    get() {
        if (_Archive != null) return _Archive!!
        
        _Archive = ImageVector.Builder(
            name = "archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 8f)
                curveTo(6.22386f, 8f, 6f, 8.22386f, 6f, 8.5f)
                curveTo(6f, 8.77614f, 6.22386f, 9f, 6.5f, 9f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 9f, 10f, 8.77614f, 10f, 8.5f)
                curveTo(10f, 8.22386f, 9.77614f, 8f, 9.5f, 8f)
                horizontalLineTo(6.5f)
                close()
                moveTo(1f, 3.5f)
                curveTo(1f, 2.67157f, 1.67157f, 2f, 2.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(14.3284f, 2f, 15f, 2.67157f, 15f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(15f, 5.15311f, 14.5826f, 5.70873f, 14f, 5.91465f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.8807f, 12.8807f, 14f, 11.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.11929f, 14f, 2f, 12.8807f, 2f, 11.5f)
                verticalLineTo(5.91465f)
                curveTo(1.4174f, 5.70873f, 1f, 5.15311f, 1f, 4.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(2.5f, 3f)
                curveTo(2.22386f, 3f, 2f, 3.22386f, 2f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(2f, 4.77614f, 2.22386f, 5f, 2.5f, 5f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 5f, 14f, 4.77614f, 14f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(14f, 3.22386f, 13.7761f, 3f, 13.5f, 3f)
                horizontalLineTo(2.5f)
                close()
                moveTo(3f, 6f)
                verticalLineTo(11.5f)
                curveTo(3f, 12.3284f, 3.67157f, 13f, 4.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 13f, 13f, 12.3284f, 13f, 11.5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Archive!!
    }

private var _Archive: ImageVector? = null

