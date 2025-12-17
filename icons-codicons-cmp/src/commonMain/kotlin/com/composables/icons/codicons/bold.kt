package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Bold: ImageVector
    get() {
        if (_Bold != null) return _Bold!!
        
        _Bold = ImageVector.Builder(
            name = "bold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 3.1f)
                curveTo(4f, 2.5f, 4.5f, 2f, 5.1f, 2f)
                horizontalLineTo(8.1f)
                curveTo(10.2f, 2f, 11.5f, 3.4f, 11.5f, 5.4f)
                curveTo(11.5f, 6.3f, 11.2f, 7.4f, 10.8f, 8f)
                curveTo(11.6f, 8.6f, 12.2f, 9.2f, 12.2f, 10.5f)
                curveTo(12.2f, 13.2f, 10.1f, 14f, 8.6f, 14f)
                horizontalLineTo(5.1f)
                curveTo(4.5f, 14f, 4f, 13.5f, 4f, 12.9f)
                verticalLineTo(3.1f)
                close()
                moveTo(6f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(8.4f)
                curveTo(9.1f, 12f, 9.9f, 11.5f, 9.9f, 10.5f)
                curveTo(9.9f, 9.5f, 9.1f, 9f, 8.4f, 9f)
                horizontalLineTo(6f)
                close()
                moveTo(6f, 7f)
                horizontalLineTo(8.2f)
                curveTo(9.1f, 7f, 9.7f, 6.3f, 9.7f, 5.5f)
                curveTo(9.7f, 4.7f, 9.1f, 4f, 8.3f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Bold!!
    }

private var _Bold: ImageVector? = null

