package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Preview: ImageVector
    get() {
        if (_Preview != null) return _Preview!!
        
        _Preview = ImageVector.Builder(
            name = "preview",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                curveTo(2.11929f, 2f, 1f, 3.11929f, 1f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(1f, 12.8807f, 2.11929f, 14f, 3.5f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 14f, 15f, 12.8807f, 15f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(15f, 3.11929f, 13.8807f, 2f, 12.5f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(2f, 4.5f)
                curveTo(2f, 3.67157f, 2.67157f, 3f, 3.5f, 3f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 3f, 14f, 3.67157f, 14f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.3284f, 13.3284f, 13f, 12.5f, 13f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 13f, 2f, 12.3284f, 2f, 11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(3f, 5f)
                curveTo(3f, 4.44772f, 3.44772f, 4f, 4f, 4f)
                horizontalLineTo(12f)
                curveTo(12.5523f, 4f, 13f, 4.44772f, 13f, 5f)
                verticalLineTo(6f)
                curveTo(13f, 6.55228f, 12.5523f, 7f, 12f, 7f)
                horizontalLineTo(4f)
                curveTo(3.44772f, 7f, 3f, 6.55229f, 3f, 6f)
                verticalLineTo(5f)
                close()
                moveTo(12f, 5f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                close()
                moveTo(8f, 9f)
                curveTo(8f, 8.44772f, 8.44772f, 8f, 9f, 8f)
                horizontalLineTo(12f)
                curveTo(12.5523f, 8f, 13f, 8.44772f, 13f, 9f)
                verticalLineTo(11f)
                curveTo(13f, 11.5523f, 12.5523f, 12f, 12f, 12f)
                horizontalLineTo(9f)
                curveTo(8.44772f, 12f, 8f, 11.5523f, 8f, 11f)
                verticalLineTo(9f)
                close()
                moveTo(12f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                close()
                moveTo(3.5f, 8f)
                curveTo(3.22386f, 8f, 3f, 8.22386f, 3f, 8.5f)
                curveTo(3f, 8.77614f, 3.22386f, 9f, 3.5f, 9f)
                horizontalLineTo(6.5f)
                curveTo(6.77614f, 9f, 7f, 8.77614f, 7f, 8.5f)
                curveTo(7f, 8.22386f, 6.77614f, 8f, 6.5f, 8f)
                horizontalLineTo(3.5f)
                close()
                moveTo(3f, 10.5f)
                curveTo(3f, 10.2239f, 3.22386f, 10f, 3.5f, 10f)
                horizontalLineTo(6.5f)
                curveTo(6.77614f, 10f, 7f, 10.2239f, 7f, 10.5f)
                curveTo(7f, 10.7761f, 6.77614f, 11f, 6.5f, 11f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 11f, 3f, 10.7761f, 3f, 10.5f)
                close()
            }
        }.build()
        
        return _Preview!!
    }

private var _Preview: ImageVector? = null

