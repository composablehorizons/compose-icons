package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ScreenFull: ImageVector
    get() {
        if (_ScreenFull != null) return _ScreenFull!!
        
        _ScreenFull = ImageVector.Builder(
            name = "screen-full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.75f, 3f)
                curveTo(3.33579f, 3f, 3f, 3.33579f, 3f, 3.75f)
                verticalLineTo(5.5f)
                curveTo(3f, 5.77614f, 2.77614f, 6f, 2.5f, 6f)
                curveTo(2.22386f, 6f, 2f, 5.77614f, 2f, 5.5f)
                verticalLineTo(3.75f)
                curveTo(2f, 2.7835f, 2.7835f, 2f, 3.75f, 2f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 2f, 6f, 2.22386f, 6f, 2.5f)
                curveTo(6f, 2.77614f, 5.77614f, 3f, 5.5f, 3f)
                horizontalLineTo(3.75f)
                close()
                moveTo(10f, 2.5f)
                curveTo(10f, 2.22386f, 10.2239f, 2f, 10.5f, 2f)
                horizontalLineTo(12.25f)
                curveTo(13.2165f, 2f, 14f, 2.7835f, 14f, 3.75f)
                verticalLineTo(5.5f)
                curveTo(14f, 5.77614f, 13.7761f, 6f, 13.5f, 6f)
                curveTo(13.2239f, 6f, 13f, 5.77614f, 13f, 5.5f)
                verticalLineTo(3.75f)
                curveTo(13f, 3.33579f, 12.6642f, 3f, 12.25f, 3f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 3f, 10f, 2.77614f, 10f, 2.5f)
                close()
                moveTo(2.5f, 10f)
                curveTo(2.77614f, 10f, 3f, 10.2239f, 3f, 10.5f)
                verticalLineTo(12.25f)
                curveTo(3f, 12.6642f, 3.33579f, 13f, 3.75f, 13f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 13f, 6f, 13.2239f, 6f, 13.5f)
                curveTo(6f, 13.7761f, 5.77614f, 14f, 5.5f, 14f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 14f, 2f, 13.2165f, 2f, 12.25f)
                verticalLineTo(10.5f)
                curveTo(2f, 10.2239f, 2.22386f, 10f, 2.5f, 10f)
                close()
                moveTo(13.5f, 10f)
                curveTo(13.7761f, 10f, 14f, 10.2239f, 14f, 10.5f)
                verticalLineTo(12.25f)
                curveTo(14f, 13.2165f, 13.2165f, 14f, 12.25f, 14f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 14f, 10f, 13.7761f, 10f, 13.5f)
                curveTo(10f, 13.2239f, 10.2239f, 13f, 10.5f, 13f)
                horizontalLineTo(12.25f)
                curveTo(12.6642f, 13f, 13f, 12.6642f, 13f, 12.25f)
                verticalLineTo(10.5f)
                curveTo(13f, 10.2239f, 13.2239f, 10f, 13.5f, 10f)
                close()
            }
        }.build()
        
        return _ScreenFull!!
    }

private var _ScreenFull: ImageVector? = null

