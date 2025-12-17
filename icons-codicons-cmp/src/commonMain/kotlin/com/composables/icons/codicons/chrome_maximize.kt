package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChromeMaximize: ImageVector
    get() {
        if (_ChromeMaximize != null) return _ChromeMaximize!!
        
        _ChromeMaximize = ImageVector.Builder(
            name = "chrome-maximize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.5f)
                curveTo(2f, 3.11929f, 3.11929f, 2f, 4.5f, 2f)
                horizontalLineTo(11.5f)
                curveTo(12.8807f, 2f, 14f, 3.11929f, 14f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(14f, 12.8807f, 12.8807f, 14f, 11.5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.11929f, 14f, 2f, 12.8807f, 2f, 11.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 3f)
                curveTo(3.67157f, 3f, 3f, 3.67157f, 3f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(3f, 12.3284f, 3.67157f, 13f, 4.5f, 13f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 13f, 13f, 12.3284f, 13f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(13f, 3.67157f, 12.3284f, 3f, 11.5f, 3f)
                horizontalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _ChromeMaximize!!
    }

private var _ChromeMaximize: ImageVector? = null

