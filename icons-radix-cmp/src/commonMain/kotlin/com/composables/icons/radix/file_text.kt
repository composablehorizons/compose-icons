package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FileText: ImageVector
    get() {
        if (_FileText != null) return _FileText!!
        
        _FileText = ImageVector.Builder(
            name = "file-text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.08594f, 1f)
                curveTo(9.48371f, 1.00004f, 9.86522f, 1.15818f, 10.1465f, 1.43945f)
                lineTo(12.5605f, 3.85352f)
                lineTo(12.6602f, 3.96387f)
                curveTo(12.8788f, 4.23073f, 13f, 4.56606f, 13f, 4.91406f)
                verticalLineTo(12.5f)
                curveTo(13f, 13.3284f, 12.3284f, 14f, 11.5f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 14f, 2f, 13.3284f, 2f, 12.5f)
                verticalLineTo(2.5f)
                curveTo(2f, 1.67157f, 2.67157f, 1f, 3.5f, 1f)
                horizontalLineTo(9.08594f)
                close()
                moveTo(3.5f, 2f)
                curveTo(3.22386f, 2f, 3f, 2.22386f, 3f, 2.5f)
                verticalLineTo(12.5f)
                curveTo(3f, 12.7761f, 3.22386f, 13f, 3.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 13f, 12f, 12.7761f, 12f, 12.5f)
                verticalLineTo(4.91406f)
                curveTo(12f, 4.81464f, 11.9704f, 4.71823f, 11.916f, 4.63672f)
                lineTo(11.8535f, 4.56055f)
                lineTo(9.43945f, 2.14648f)
                curveTo(9.34572f, 2.05275f, 9.21849f, 2.00004f, 9.08594f, 2f)
                horizontalLineTo(3.5f)
                close()
                moveTo(10.5f, 10f)
                curveTo(10.7761f, 10f, 11f, 10.2239f, 11f, 10.5f)
                curveTo(11f, 10.7761f, 10.7761f, 11f, 10.5f, 11f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 11f, 4f, 10.7761f, 4f, 10.5f)
                curveTo(4f, 10.2239f, 4.22386f, 10f, 4.5f, 10f)
                horizontalLineTo(10.5f)
                close()
                moveTo(10.5f, 7f)
                curveTo(10.7761f, 7f, 11f, 7.22386f, 11f, 7.5f)
                curveTo(11f, 7.77614f, 10.7761f, 8f, 10.5f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8f, 4f, 7.77614f, 4f, 7.5f)
                curveTo(4f, 7.22386f, 4.22386f, 7f, 4.5f, 7f)
                horizontalLineTo(10.5f)
                close()
                moveTo(7.5f, 4f)
                curveTo(7.77614f, 4f, 8f, 4.22386f, 8f, 4.5f)
                curveTo(8f, 4.77614f, 7.77614f, 5f, 7.5f, 5f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 5f, 4f, 4.77614f, 4f, 4.5f)
                curveTo(4f, 4.22386f, 4.22386f, 4f, 4.5f, 4f)
                horizontalLineTo(7.5f)
                close()
            }
        }.build()
        
        return _FileText!!
    }

private var _FileText: ImageVector? = null

