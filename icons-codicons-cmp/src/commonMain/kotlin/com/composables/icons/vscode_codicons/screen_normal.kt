package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ScreenNormal: ImageVector
    get() {
        if (_ScreenNormal != null) return _ScreenNormal!!
        
        _ScreenNormal = ImageVector.Builder(
            name = "screen-normal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 4f)
                curveTo(11f, 4.55228f, 11.4477f, 5f, 12f, 5f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 5f, 14f, 5.22386f, 14f, 5.5f)
                curveTo(14f, 5.77614f, 13.7761f, 6f, 13.5f, 6f)
                horizontalLineTo(12f)
                curveTo(10.8954f, 6f, 10f, 5.10457f, 10f, 4f)
                verticalLineTo(2.5f)
                curveTo(10f, 2.22386f, 10.2239f, 2f, 10.5f, 2f)
                curveTo(10.7761f, 2f, 11f, 2.22386f, 11f, 2.5f)
                verticalLineTo(4f)
                close()
                moveTo(11f, 12f)
                curveTo(11f, 11.4477f, 11.4477f, 11f, 12f, 11f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 11f, 14f, 10.7761f, 14f, 10.5f)
                curveTo(14f, 10.2239f, 13.7761f, 10f, 13.5f, 10f)
                horizontalLineTo(12f)
                curveTo(10.8954f, 10f, 10f, 10.8954f, 10f, 12f)
                verticalLineTo(13.5f)
                curveTo(10f, 13.7761f, 10.2239f, 14f, 10.5f, 14f)
                curveTo(10.7761f, 14f, 11f, 13.7761f, 11f, 13.5f)
                verticalLineTo(12f)
                close()
                moveTo(4f, 11f)
                curveTo(4.55228f, 11f, 5f, 11.4477f, 5f, 12f)
                verticalLineTo(13.5f)
                curveTo(5f, 13.7761f, 5.22386f, 14f, 5.5f, 14f)
                curveTo(5.77614f, 14f, 6f, 13.7761f, 6f, 13.5f)
                verticalLineTo(12f)
                curveTo(6f, 10.8954f, 5.10457f, 10f, 4f, 10f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 10f, 2f, 10.2239f, 2f, 10.5f)
                curveTo(2f, 10.7761f, 2.22386f, 11f, 2.5f, 11f)
                horizontalLineTo(4f)
                close()
                moveTo(5f, 4f)
                curveTo(5f, 4.55228f, 4.55228f, 5f, 4f, 5f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 5f, 2f, 5.22386f, 2f, 5.5f)
                curveTo(2f, 5.77614f, 2.22386f, 6f, 2.5f, 6f)
                horizontalLineTo(4f)
                curveTo(5.10457f, 6f, 6f, 5.10457f, 6f, 4f)
                verticalLineTo(2.5f)
                curveTo(6f, 2.22386f, 5.77614f, 2f, 5.5f, 2f)
                curveTo(5.22386f, 2f, 5f, 2.22386f, 5f, 2.5f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _ScreenNormal!!
    }

private var _ScreenNormal: ImageVector? = null

