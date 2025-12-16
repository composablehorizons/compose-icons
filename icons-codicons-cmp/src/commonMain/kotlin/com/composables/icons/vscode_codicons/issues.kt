package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Issues: ImageVector
    get() {
        if (_Issues != null) return _Issues!!
        
        _Issues = ImageVector.Builder(
            name = "issues",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 8f)
                curveTo(9f, 8.55228f, 8.55228f, 9f, 8f, 9f)
                curveTo(7.44772f, 9f, 7f, 8.55228f, 7f, 8f)
                curveTo(7f, 7.44772f, 7.44772f, 7f, 8f, 7f)
                curveTo(8.55228f, 7f, 9f, 7.44772f, 9f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                curveTo(1f, 11.859f, 4.14f, 15f, 8f, 15f)
                curveTo(11.86f, 15f, 15f, 11.859f, 15f, 8f)
                curveTo(15f, 4.141f, 11.86f, 1f, 8f, 1f)
                curveTo(4.14f, 1f, 1f, 4.141f, 1f, 8f)
                close()
                moveTo(2f, 8f)
                curveTo(2f, 4.691f, 4.691f, 2f, 8f, 2f)
                curveTo(11.309f, 2f, 14f, 4.691f, 14f, 8f)
                curveTo(14f, 11.309f, 11.309f, 14f, 8f, 14f)
                curveTo(4.691f, 14f, 2f, 11.309f, 2f, 8f)
                close()
            }
        }.build()
        
        return _Issues!!
    }

private var _Issues: ImageVector? = null

