package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Archive: ImageVector
    get() {
        if (_Archive != null) return _Archive!!
        
        _Archive = ImageVector.Builder(
            name = "archive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.6914f, 1f)
                curveTo(12.0699f, 1.00016f, 12.4156f, 1.21422f, 12.585f, 1.55273f)
                lineTo(13.9473f, 4.27637f)
                lineTo(13.9863f, 4.38477f)
                curveTo(13.9952f, 4.42241f, 14f, 4.46105f, 14f, 4.5f)
                verticalLineTo(13f)
                curveTo(14f, 13.5523f, 13.5523f, 14f, 13f, 14f)
                horizontalLineTo(2f)
                curveTo(1.44772f, 14f, 1f, 13.5523f, 1f, 13f)
                verticalLineTo(4.5f)
                curveTo(1f, 4.42238f, 1.01802f, 4.34579f, 1.05273f, 4.27637f)
                lineTo(2.41504f, 1.55273f)
                lineTo(2.48633f, 1.43164f)
                curveTo(2.6712f, 1.16394f, 2.97741f, 1.00014f, 3.30859f, 1f)
                horizontalLineTo(11.6914f)
                close()
                moveTo(2f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                close()
                moveTo(9.5f, 7f)
                curveTo(9.77614f, 7f, 10f, 7.22386f, 10f, 7.5f)
                curveTo(10f, 7.77614f, 9.77614f, 8f, 9.5f, 8f)
                horizontalLineTo(5.5f)
                curveTo(5.22386f, 8f, 5f, 7.77614f, 5f, 7.5f)
                curveTo(5f, 7.22386f, 5.22386f, 7f, 5.5f, 7f)
                horizontalLineTo(9.5f)
                close()
                moveTo(2.30859f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(3.30859f)
                lineTo(2.30859f, 4f)
                close()
                moveTo(8f, 4f)
                horizontalLineTo(12.6914f)
                lineTo(11.6914f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                close()
            }
        }.build()
        
        return _Archive!!
    }

private var _Archive: ImageVector? = null

