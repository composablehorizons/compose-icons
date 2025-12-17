package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChromeMinimize: ImageVector
    get() {
        if (_ChromeMinimize != null) return _ChromeMinimize!!
        
        _ChromeMinimize = ImageVector.Builder(
            name = "chrome-minimize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 8f)
                curveTo(3f, 7.72386f, 3.22386f, 7.5f, 3.5f, 7.5f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 7.5f, 13f, 7.72386f, 13f, 8f)
                curveTo(13f, 8.27614f, 12.7761f, 8.5f, 12.5f, 8.5f)
                horizontalLineTo(3.5f)
                curveTo(3.22386f, 8.5f, 3f, 8.27614f, 3f, 8f)
                close()
            }
        }.build()
        
        return _ChromeMinimize!!
    }

private var _ChromeMinimize: ImageVector? = null

