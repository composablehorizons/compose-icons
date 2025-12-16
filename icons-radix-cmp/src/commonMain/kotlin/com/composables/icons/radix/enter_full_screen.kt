package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.EnterFullScreen: ImageVector
    get() {
        if (_EnterFullScreen != null) return _EnterFullScreen!!
        
        _EnterFullScreen = ImageVector.Builder(
            name = "enter-full-screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 9f)
                curveTo(2.77614f, 9f, 3f, 9.22386f, 3f, 9.5f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 12f, 6f, 12.2239f, 6f, 12.5f)
                curveTo(6f, 12.7761f, 5.77614f, 13f, 5.5f, 13f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 13f, 2f, 12.7761f, 2f, 12.5f)
                verticalLineTo(9.5f)
                curveTo(2f, 9.22386f, 2.22386f, 9f, 2.5f, 9f)
                close()
                moveTo(12.5f, 9f)
                curveTo(12.7761f, 9f, 13f, 9.22386f, 13f, 9.5f)
                verticalLineTo(12.5f)
                curveTo(13f, 12.7761f, 12.7761f, 13f, 12.5f, 13f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 13f, 9f, 12.7761f, 9f, 12.5f)
                curveTo(9f, 12.2239f, 9.22386f, 12f, 9.5f, 12f)
                horizontalLineTo(12f)
                verticalLineTo(9.5f)
                curveTo(12f, 9.22386f, 12.2239f, 9f, 12.5f, 9f)
                close()
                moveTo(5.5f, 2f)
                curveTo(5.77614f, 2f, 6f, 2.22386f, 6f, 2.5f)
                curveTo(6f, 2.77614f, 5.77614f, 3f, 5.5f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(5.5f)
                curveTo(3f, 5.77614f, 2.77614f, 6f, 2.5f, 6f)
                curveTo(2.22386f, 6f, 2f, 5.77614f, 2f, 5.5f)
                verticalLineTo(2.5f)
                lineTo(2.00977f, 2.39941f)
                curveTo(2.05629f, 2.17145f, 2.25829f, 2f, 2.5f, 2f)
                horizontalLineTo(5.5f)
                close()
                moveTo(12.6006f, 2.00977f)
                curveTo(12.8286f, 2.05629f, 13f, 2.25829f, 13f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(13f, 5.77614f, 12.7761f, 6f, 12.5f, 6f)
                curveTo(12.2239f, 6f, 12f, 5.77614f, 12f, 5.5f)
                verticalLineTo(3f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 3f, 9f, 2.77614f, 9f, 2.5f)
                curveTo(9f, 2.22386f, 9.22386f, 2f, 9.5f, 2f)
                horizontalLineTo(12.5f)
                lineTo(12.6006f, 2.00977f)
                close()
            }
        }.build()
        
        return _EnterFullScreen!!
    }

private var _EnterFullScreen: ImageVector? = null

