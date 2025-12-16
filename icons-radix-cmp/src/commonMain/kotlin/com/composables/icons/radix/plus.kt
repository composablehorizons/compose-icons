package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Plus: ImageVector
    get() {
        if (_Plus != null) return _Plus!!
        
        _Plus = ImageVector.Builder(
            name = "plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 2.25f)
                curveTo(7.77614f, 2.25f, 8f, 2.47386f, 8f, 2.75f)
                verticalLineTo(7f)
                horizontalLineTo(12.25f)
                curveTo(12.5261f, 7f, 12.75f, 7.22386f, 12.75f, 7.5f)
                curveTo(12.75f, 7.77614f, 12.5261f, 8f, 12.25f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(12.25f)
                curveTo(8f, 12.5261f, 7.77614f, 12.75f, 7.5f, 12.75f)
                curveTo(7.22386f, 12.75f, 7f, 12.5261f, 7f, 12.25f)
                verticalLineTo(8f)
                horizontalLineTo(2.75f)
                curveTo(2.47386f, 8f, 2.25f, 7.77614f, 2.25f, 7.5f)
                curveTo(2.25f, 7.22386f, 2.47386f, 7f, 2.75f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(2.75f)
                curveTo(7f, 2.47386f, 7.22386f, 2.25f, 7.5f, 2.25f)
                close()
            }
        }.build()
        
        return _Plus!!
    }

private var _Plus: ImageVector? = null

