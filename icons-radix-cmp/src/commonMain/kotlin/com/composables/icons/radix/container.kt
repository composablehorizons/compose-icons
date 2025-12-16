package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Container: ImageVector
    get() {
        if (_Container != null) return _Container!!
        
        _Container = ImageVector.Builder(
            name = "container",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 13f)
                curveTo(1.77614f, 13f, 2f, 13.2239f, 2f, 13.5f)
                curveTo(2f, 13.7761f, 1.77614f, 14f, 1.5f, 14f)
                curveTo(1.22386f, 14f, 1f, 13.7761f, 1f, 13.5f)
                curveTo(1f, 13.2239f, 1.22386f, 13f, 1.5f, 13f)
                close()
                moveTo(10.1025f, 1.00488f)
                curveTo(10.573f, 1.05278f, 10.9472f, 1.42703f, 10.9951f, 1.89746f)
                lineTo(11f, 2f)
                verticalLineTo(13f)
                lineTo(10.9951f, 13.1025f)
                curveTo(10.9472f, 13.573f, 10.573f, 13.9472f, 10.1025f, 13.9951f)
                lineTo(10f, 14f)
                horizontalLineTo(5f)
                curveTo(4.48232f, 14f, 4.05621f, 13.6067f, 4.00488f, 13.1025f)
                lineTo(4f, 13f)
                verticalLineTo(2f)
                lineTo(4.00488f, 1.89746f)
                curveTo(4.05621f, 1.39333f, 4.48232f, 1f, 5f, 1f)
                horizontalLineTo(10f)
                lineTo(10.1025f, 1.00488f)
                close()
                moveTo(13.5f, 13f)
                curveTo(13.7761f, 13f, 14f, 13.2239f, 14f, 13.5f)
                curveTo(14f, 13.7761f, 13.7761f, 14f, 13.5f, 14f)
                curveTo(13.2239f, 14f, 13f, 13.7761f, 13f, 13.5f)
                curveTo(13f, 13.2239f, 13.2239f, 13f, 13.5f, 13f)
                close()
                moveTo(5f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                close()
                moveTo(1.5f, 11f)
                curveTo(1.77614f, 11f, 2f, 11.2239f, 2f, 11.5f)
                curveTo(2f, 11.7761f, 1.77614f, 12f, 1.5f, 12f)
                curveTo(1.22386f, 12f, 1f, 11.7761f, 1f, 11.5f)
                curveTo(1f, 11.2239f, 1.22386f, 11f, 1.5f, 11f)
                close()
                moveTo(13.5f, 11f)
                curveTo(13.7761f, 11f, 14f, 11.2239f, 14f, 11.5f)
                curveTo(14f, 11.7761f, 13.7761f, 12f, 13.5f, 12f)
                curveTo(13.2239f, 12f, 13f, 11.7761f, 13f, 11.5f)
                curveTo(13f, 11.2239f, 13.2239f, 11f, 13.5f, 11f)
                close()
                moveTo(1.5f, 9f)
                curveTo(1.77614f, 9f, 2f, 9.22386f, 2f, 9.5f)
                curveTo(2f, 9.77614f, 1.77614f, 10f, 1.5f, 10f)
                curveTo(1.22386f, 10f, 1f, 9.77614f, 1f, 9.5f)
                curveTo(1f, 9.22386f, 1.22386f, 9f, 1.5f, 9f)
                close()
                moveTo(13.5f, 9f)
                curveTo(13.7761f, 9f, 14f, 9.22386f, 14f, 9.5f)
                curveTo(14f, 9.77614f, 13.7761f, 10f, 13.5f, 10f)
                curveTo(13.2239f, 10f, 13f, 9.77614f, 13f, 9.5f)
                curveTo(13f, 9.22386f, 13.2239f, 9f, 13.5f, 9f)
                close()
                moveTo(1.5f, 7f)
                curveTo(1.77614f, 7f, 2f, 7.22386f, 2f, 7.5f)
                curveTo(2f, 7.77614f, 1.77614f, 8f, 1.5f, 8f)
                curveTo(1.22386f, 8f, 1f, 7.77614f, 1f, 7.5f)
                curveTo(1f, 7.22386f, 1.22386f, 7f, 1.5f, 7f)
                close()
                moveTo(13.5f, 7f)
                curveTo(13.7761f, 7f, 14f, 7.22386f, 14f, 7.5f)
                curveTo(14f, 7.77614f, 13.7761f, 8f, 13.5f, 8f)
                curveTo(13.2239f, 8f, 13f, 7.77614f, 13f, 7.5f)
                curveTo(13f, 7.22386f, 13.2239f, 7f, 13.5f, 7f)
                close()
                moveTo(1.5f, 5f)
                curveTo(1.77614f, 5f, 2f, 5.22386f, 2f, 5.5f)
                curveTo(2f, 5.77614f, 1.77614f, 6f, 1.5f, 6f)
                curveTo(1.22386f, 6f, 1f, 5.77614f, 1f, 5.5f)
                curveTo(1f, 5.22386f, 1.22386f, 5f, 1.5f, 5f)
                close()
                moveTo(13.5f, 5f)
                curveTo(13.7761f, 5f, 14f, 5.22386f, 14f, 5.5f)
                curveTo(14f, 5.77614f, 13.7761f, 6f, 13.5f, 6f)
                curveTo(13.2239f, 6f, 13f, 5.77614f, 13f, 5.5f)
                curveTo(13f, 5.22386f, 13.2239f, 5f, 13.5f, 5f)
                close()
                moveTo(1.5f, 3f)
                curveTo(1.77614f, 3f, 2f, 3.22386f, 2f, 3.5f)
                curveTo(2f, 3.77614f, 1.77614f, 4f, 1.5f, 4f)
                curveTo(1.22386f, 4f, 1f, 3.77614f, 1f, 3.5f)
                curveTo(1f, 3.22386f, 1.22386f, 3f, 1.5f, 3f)
                close()
                moveTo(13.5f, 3f)
                curveTo(13.7761f, 3f, 14f, 3.22386f, 14f, 3.5f)
                curveTo(14f, 3.77614f, 13.7761f, 4f, 13.5f, 4f)
                curveTo(13.2239f, 4f, 13f, 3.77614f, 13f, 3.5f)
                curveTo(13f, 3.22386f, 13.2239f, 3f, 13.5f, 3f)
                close()
                moveTo(1.5f, 1f)
                curveTo(1.77614f, 1f, 2f, 1.22386f, 2f, 1.5f)
                curveTo(2f, 1.77614f, 1.77614f, 2f, 1.5f, 2f)
                curveTo(1.22386f, 2f, 1f, 1.77614f, 1f, 1.5f)
                curveTo(1f, 1.22386f, 1.22386f, 1f, 1.5f, 1f)
                close()
                moveTo(13.5f, 1f)
                curveTo(13.7761f, 1f, 14f, 1.22386f, 14f, 1.5f)
                curveTo(14f, 1.77614f, 13.7761f, 2f, 13.5f, 2f)
                curveTo(13.2239f, 2f, 13f, 1.77614f, 13f, 1.5f)
                curveTo(13f, 1.22386f, 13.2239f, 1f, 13.5f, 1f)
                close()
            }
        }.build()
        
        return _Container!!
    }

private var _Container: ImageVector? = null

