package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Remove: ImageVector
    get() {
        if (_Remove != null) return _Remove!!
        
        _Remove = ImageVector.Builder(
            name = "remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 7.5f)
                curveTo(1f, 7.22386f, 1.22386f, 7f, 1.5f, 7f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 7f, 14f, 7.22386f, 14f, 7.5f)
                curveTo(14f, 7.77614f, 13.7761f, 8f, 13.5f, 8f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 8f, 1f, 7.77614f, 1f, 7.5f)
                close()
            }
        }.build()
        
        return _Remove!!
    }

private var _Remove: ImageVector? = null

