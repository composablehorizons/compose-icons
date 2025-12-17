package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FileText: ImageVector
    get() {
        if (_FileText != null) return _FileText!!
        
        _FileText = ImageVector.Builder(
            name = "file-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3f)
                curveTo(3f, 1.89543f, 3.89543f, 1f, 5f, 1f)
                horizontalLineTo(8.58579f)
                curveTo(8.98361f, 1f, 9.36514f, 1.15804f, 9.64645f, 1.43934f)
                lineTo(12.5607f, 4.35355f)
                curveTo(12.842f, 4.63486f, 13f, 5.01639f, 13f, 5.41421f)
                verticalLineTo(13f)
                curveTo(13f, 14.1046f, 12.1046f, 15f, 11f, 15f)
                horizontalLineTo(5f)
                curveTo(3.89543f, 15f, 3f, 14.1046f, 3f, 13f)
                verticalLineTo(3f)
                close()
                moveTo(5f, 2f)
                curveTo(4.44772f, 2f, 4f, 2.44772f, 4f, 3f)
                verticalLineTo(13f)
                curveTo(4f, 13.5523f, 4.44772f, 14f, 5f, 14f)
                horizontalLineTo(11f)
                curveTo(11.5523f, 14f, 12f, 13.5523f, 12f, 13f)
                verticalLineTo(6f)
                horizontalLineTo(9.5f)
                curveTo(8.67157f, 6f, 8f, 5.32843f, 8f, 4.5f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                close()
                moveTo(9.5f, 5f)
                horizontalLineTo(11.7929f)
                lineTo(9f, 2.20711f)
                verticalLineTo(4.5f)
                curveTo(9f, 4.77614f, 9.22386f, 5f, 9.5f, 5f)
                close()
                moveTo(5.5f, 8f)
                curveTo(5.22386f, 8f, 5f, 8.22386f, 5f, 8.5f)
                curveTo(5f, 8.77614f, 5.22386f, 9f, 5.5f, 9f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 9f, 11f, 8.77614f, 11f, 8.5f)
                curveTo(11f, 8.22386f, 10.7761f, 8f, 10.5f, 8f)
                horizontalLineTo(5.5f)
                close()
                moveTo(5f, 10.5f)
                curveTo(5f, 10.2239f, 5.22386f, 10f, 5.5f, 10f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 10f, 11f, 10.2239f, 11f, 10.5f)
                curveTo(11f, 10.7761f, 10.7761f, 11f, 10.5f, 11f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 11f, 5f, 10.7761f, 5f, 10.5f)
                close()
                moveTo(5.5f, 12f)
                curveTo(5.22386f, 12f, 5f, 12.2239f, 5f, 12.5f)
                curveTo(5f, 12.7761f, 5.22386f, 13f, 5.5f, 13f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 13f, 11f, 12.7761f, 11f, 12.5f)
                curveTo(11f, 12.2239f, 10.7761f, 12f, 10.5f, 12f)
                horizontalLineTo(5.5f)
                close()
            }
        }.build()
        
        return _FileText!!
    }

private var _FileText: ImageVector? = null

