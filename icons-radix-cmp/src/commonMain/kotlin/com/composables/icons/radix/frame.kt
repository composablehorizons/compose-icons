package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Frame: ImageVector
    get() {
        if (_Frame != null) return _Frame!!
        
        _Frame = ImageVector.Builder(
            name = "frame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1f)
                curveTo(10.7761f, 1f, 11f, 1.22386f, 11f, 1.5f)
                verticalLineTo(4f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 4.00977f)
                curveTo(13.8286f, 4.05629f, 14f, 4.25829f, 14f, 4.5f)
                curveTo(14f, 4.74171f, 13.8286f, 4.94371f, 13.6006f, 4.99023f)
                lineTo(13.5f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 10.0098f)
                curveTo(13.8286f, 10.0563f, 14f, 10.2583f, 14f, 10.5f)
                curveTo(14f, 10.7417f, 13.8286f, 10.9437f, 13.6006f, 10.9902f)
                lineTo(13.5f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13.5f)
                lineTo(10.9902f, 13.6006f)
                curveTo(10.9437f, 13.8286f, 10.7417f, 14f, 10.5f, 14f)
                curveTo(10.2583f, 14f, 10.0563f, 13.8286f, 10.0098f, 13.6006f)
                lineTo(10f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13.5f)
                curveTo(5f, 13.7761f, 4.77614f, 14f, 4.5f, 14f)
                curveTo(4.22386f, 14f, 4f, 13.7761f, 4f, 13.5f)
                verticalLineTo(11f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 11f, 1f, 10.7761f, 1f, 10.5f)
                curveTo(1f, 10.2239f, 1.22386f, 10f, 1.5f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 5f, 1f, 4.77614f, 1f, 4.5f)
                curveTo(1f, 4.22386f, 1.22386f, 4f, 1.5f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(1.5f)
                curveTo(4f, 1.22386f, 4.22386f, 1f, 4.5f, 1f)
                curveTo(4.77614f, 1f, 5f, 1.22386f, 5f, 1.5f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(1.5f)
                curveTo(10f, 1.22386f, 10.2239f, 1f, 10.5f, 1f)
                close()
                moveTo(5f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _Frame!!
    }

private var _Frame: ImageVector? = null

