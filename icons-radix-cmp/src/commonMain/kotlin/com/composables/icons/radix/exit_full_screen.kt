package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ExitFullScreen: ImageVector
    get() {
        if (_ExitFullScreen != null) return _ExitFullScreen!!
        
        _ExitFullScreen = ImageVector.Builder(
            name = "exit-full-screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 9f)
                curveTo(5.77614f, 9f, 6f, 9.22386f, 6f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(6f, 12.7761f, 5.77614f, 13f, 5.5f, 13f)
                curveTo(5.22386f, 13f, 5f, 12.7761f, 5f, 12.5f)
                verticalLineTo(10f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 10f, 2f, 9.77614f, 2f, 9.5f)
                curveTo(2f, 9.22386f, 2.22386f, 9f, 2.5f, 9f)
                horizontalLineTo(5.5f)
                close()
                moveTo(12.5f, 9f)
                curveTo(12.7761f, 9f, 13f, 9.22386f, 13f, 9.5f)
                curveTo(13f, 9.77614f, 12.7761f, 10f, 12.5f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(12.5f)
                curveTo(10f, 12.7761f, 9.77614f, 13f, 9.5f, 13f)
                curveTo(9.22386f, 13f, 9f, 12.7761f, 9f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(9f, 9.22386f, 9.22386f, 9f, 9.5f, 9f)
                horizontalLineTo(12.5f)
                close()
                moveTo(5.5f, 2f)
                curveTo(5.77614f, 2f, 6f, 2.22386f, 6f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(6f, 5.77614f, 5.77614f, 6f, 5.5f, 6f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 6f, 2f, 5.77614f, 2f, 5.5f)
                curveTo(2f, 5.22386f, 2.22386f, 5f, 2.5f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(2.5f)
                curveTo(5f, 2.22386f, 5.22386f, 2f, 5.5f, 2f)
                close()
                moveTo(9.5f, 2f)
                curveTo(9.77614f, 2f, 10f, 2.22386f, 10f, 2.5f)
                verticalLineTo(5f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 5f, 13f, 5.22386f, 13f, 5.5f)
                curveTo(13f, 5.77614f, 12.7761f, 6f, 12.5f, 6f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 6f, 9f, 5.77614f, 9f, 5.5f)
                verticalLineTo(2.5f)
                curveTo(9f, 2.22386f, 9.22386f, 2f, 9.5f, 2f)
                close()
            }
        }.build()
        
        return _ExitFullScreen!!
    }

private var _ExitFullScreen: ImageVector? = null

