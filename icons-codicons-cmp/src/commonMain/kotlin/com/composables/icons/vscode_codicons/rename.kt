package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Rename: ImageVector
    get() {
        if (_Rename != null) return _Rename!!
        
        _Rename = ImageVector.Builder(
            name = "rename",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 2f)
                curveTo(6.22386f, 2f, 6f, 2.22386f, 6f, 2.5f)
                curveTo(6f, 2.77614f, 6.22386f, 3f, 6.5f, 3f)
                horizontalLineTo(7.5f)
                verticalLineTo(13f)
                horizontalLineTo(6.5f)
                curveTo(6.22386f, 13f, 6f, 13.2239f, 6f, 13.5f)
                curveTo(6f, 13.7761f, 6.22386f, 14f, 6.5f, 14f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 14f, 10f, 13.7761f, 10f, 13.5f)
                curveTo(10f, 13.2239f, 9.77614f, 13f, 9.5f, 13f)
                horizontalLineTo(8.5f)
                verticalLineTo(3f)
                horizontalLineTo(9.5f)
                curveTo(9.77614f, 3f, 10f, 2.77614f, 10f, 2.5f)
                curveTo(10f, 2.22386f, 9.77614f, 2f, 9.5f, 2f)
                horizontalLineTo(6.5f)
                close()
                moveTo(4f, 4f)
                horizontalLineTo(6.5f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                curveTo(3.44771f, 5f, 3f, 5.44771f, 3f, 6f)
                verticalLineTo(9.99726f)
                curveTo(3f, 10.5495f, 3.44772f, 10.9973f, 4f, 10.9973f)
                horizontalLineTo(6.5f)
                verticalLineTo(11.9973f)
                horizontalLineTo(4f)
                curveTo(2.89543f, 11.9973f, 2f, 11.1018f, 2f, 9.99726f)
                verticalLineTo(6f)
                curveTo(2f, 4.89543f, 2.89543f, 4f, 4f, 4f)
                close()
                moveTo(12f, 10.9973f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.9973f)
                horizontalLineTo(12f)
                curveTo(13.1046f, 11.9973f, 14f, 11.1018f, 14f, 9.99727f)
                verticalLineTo(6f)
                curveTo(14f, 4.89543f, 13.1046f, 4f, 12f, 4f)
                horizontalLineTo(9.5f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                curveTo(12.5523f, 5f, 13f, 5.44772f, 13f, 6f)
                verticalLineTo(9.99727f)
                curveTo(13f, 10.5496f, 12.5523f, 10.9973f, 12f, 10.9973f)
                close()
            }
        }.build()
        
        return _Rename!!
    }

private var _Rename: ImageVector? = null

