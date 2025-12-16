package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ClipboardCopy: ImageVector
    get() {
        if (_ClipboardCopy != null) return _ClipboardCopy!!
        
        _ClipboardCopy = ImageVector.Builder(
            name = "clipboard-copy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 14f)
                curveTo(8.77614f, 14f, 9f, 14.2239f, 9f, 14.5f)
                curveTo(9f, 14.7761f, 8.77614f, 15f, 8.5f, 15f)
                curveTo(8.22386f, 15f, 8f, 14.7761f, 8f, 14.5f)
                curveTo(8f, 14.2239f, 8.22386f, 14f, 8.5f, 14f)
                close()
                moveTo(10.5f, 14f)
                curveTo(10.7761f, 14f, 11f, 14.2239f, 11f, 14.5f)
                curveTo(11f, 14.7761f, 10.7761f, 15f, 10.5f, 15f)
                curveTo(10.2239f, 15f, 10f, 14.7761f, 10f, 14.5f)
                curveTo(10f, 14.2239f, 10.2239f, 14f, 10.5f, 14f)
                close()
                moveTo(12.5f, 14f)
                curveTo(12.7761f, 14f, 13f, 14.2239f, 13f, 14.5f)
                curveTo(13f, 14.7761f, 12.7761f, 15f, 12.5f, 15f)
                curveTo(12.2239f, 15f, 12f, 14.7761f, 12f, 14.5f)
                curveTo(12f, 14.2239f, 12.2239f, 14f, 12.5f, 14f)
                close()
                moveTo(14.5f, 14f)
                curveTo(14.7761f, 14f, 15f, 14.2239f, 15f, 14.5f)
                curveTo(15f, 14.7761f, 14.7761f, 15f, 14.5f, 15f)
                curveTo(14.2239f, 15f, 14f, 14.7761f, 14f, 14.5f)
                curveTo(14f, 14.2239f, 14.2239f, 14f, 14.5f, 14f)
                close()
                moveTo(10.25f, 0f)
                curveTo(10.6642f, 0f, 11f, 0.335786f, 11f, 0.75f)
                verticalLineTo(1f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 1f, 13f, 1.67157f, 13f, 2.5f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22386f, 11.7761f, 2f, 11.5f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(2.25f)
                curveTo(11f, 2.66421f, 10.6642f, 3f, 10.25f, 3f)
                horizontalLineTo(4.75f)
                curveTo(4.33579f, 3f, 4f, 2.66421f, 4f, 2.25f)
                verticalLineTo(2f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 2f, 3f, 2.22386f, 3f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.7761f, 3.22386f, 13f, 3.5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 1.67157f, 2.67157f, 1f, 3.5f, 1f)
                horizontalLineTo(4f)
                verticalLineTo(0.75f)
                curveTo(4f, 0.335786f, 4.33579f, 9.39539E-9f, 4.75f, 0f)
                horizontalLineTo(10.25f)
                close()
                moveTo(8.5f, 12f)
                curveTo(8.77614f, 12f, 9f, 12.2239f, 9f, 12.5f)
                curveTo(9f, 12.7761f, 8.77614f, 13f, 8.5f, 13f)
                curveTo(8.22386f, 13f, 8f, 12.7761f, 8f, 12.5f)
                curveTo(8f, 12.2239f, 8.22386f, 12f, 8.5f, 12f)
                close()
                moveTo(14.5f, 12f)
                curveTo(14.7761f, 12f, 15f, 12.2239f, 15f, 12.5f)
                curveTo(15f, 12.7761f, 14.7761f, 13f, 14.5f, 13f)
                curveTo(14.2239f, 13f, 14f, 12.7761f, 14f, 12.5f)
                curveTo(14f, 12.2239f, 14.2239f, 12f, 14.5f, 12f)
                close()
                moveTo(8.5f, 10f)
                curveTo(8.77614f, 10f, 9f, 10.2239f, 9f, 10.5f)
                curveTo(9f, 10.7761f, 8.77614f, 11f, 8.5f, 11f)
                curveTo(8.22386f, 11f, 8f, 10.7761f, 8f, 10.5f)
                curveTo(8f, 10.2239f, 8.22386f, 10f, 8.5f, 10f)
                close()
                moveTo(14.5f, 10f)
                curveTo(14.7761f, 10f, 15f, 10.2239f, 15f, 10.5f)
                curveTo(15f, 10.7761f, 14.7761f, 11f, 14.5f, 11f)
                curveTo(14.2239f, 11f, 14f, 10.7761f, 14f, 10.5f)
                curveTo(14f, 10.2239f, 14.2239f, 10f, 14.5f, 10f)
                close()
                moveTo(8.5f, 8f)
                curveTo(8.77614f, 8f, 9f, 8.22386f, 9f, 8.5f)
                curveTo(9f, 8.77614f, 8.77614f, 9f, 8.5f, 9f)
                curveTo(8.22386f, 9f, 8f, 8.77614f, 8f, 8.5f)
                curveTo(8f, 8.22386f, 8.22386f, 8f, 8.5f, 8f)
                close()
                moveTo(10.5f, 8f)
                curveTo(10.7761f, 8f, 11f, 8.22386f, 11f, 8.5f)
                curveTo(11f, 8.77614f, 10.7761f, 9f, 10.5f, 9f)
                curveTo(10.2239f, 9f, 10f, 8.77614f, 10f, 8.5f)
                curveTo(10f, 8.22386f, 10.2239f, 8f, 10.5f, 8f)
                close()
                moveTo(12.5f, 8f)
                curveTo(12.7761f, 8f, 13f, 8.22386f, 13f, 8.5f)
                curveTo(13f, 8.77614f, 12.7761f, 9f, 12.5f, 9f)
                curveTo(12.2239f, 9f, 12f, 8.77614f, 12f, 8.5f)
                curveTo(12f, 8.22386f, 12.2239f, 8f, 12.5f, 8f)
                close()
                moveTo(14.5f, 8f)
                curveTo(14.7761f, 8f, 15f, 8.22386f, 15f, 8.5f)
                curveTo(15f, 8.77614f, 14.7761f, 9f, 14.5f, 9f)
                curveTo(14.2239f, 9f, 14f, 8.77614f, 14f, 8.5f)
                curveTo(14f, 8.22386f, 14.2239f, 8f, 14.5f, 8f)
                close()
                moveTo(5f, 2f)
                horizontalLineTo(10f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _ClipboardCopy!!
    }

private var _ClipboardCopy: ImageVector? = null

