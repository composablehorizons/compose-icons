package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ZoomIn: ImageVector
    get() {
        if (_ZoomIn != null) return _ZoomIn!!
        
        _ZoomIn = ImageVector.Builder(
            name = "zoom-in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 4f)
                curveTo(6.77614f, 4f, 7f, 4.22386f, 7f, 4.5f)
                verticalLineTo(6f)
                horizontalLineTo(8.5f)
                curveTo(8.77614f, 6f, 9f, 6.22386f, 9f, 6.5f)
                curveTo(9f, 6.77614f, 8.77614f, 7f, 8.5f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(8.5f)
                curveTo(7f, 8.77614f, 6.77614f, 9f, 6.5f, 9f)
                curveTo(6.22386f, 9f, 6f, 8.77614f, 6f, 8.5f)
                verticalLineTo(7f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 7f, 4f, 6.77614f, 4f, 6.5f)
                curveTo(4f, 6.22386f, 4.22386f, 6f, 4.5f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(4.5f)
                curveTo(6f, 4.22386f, 6.22386f, 4f, 6.5f, 4f)
                close()
                moveTo(6.5f, 1f)
                curveTo(9.53757f, 1f, 12f, 3.46243f, 12f, 6.5f)
                curveTo(12f, 7.83875f, 11.5216f, 9.06578f, 10.7266f, 10.0195f)
                lineTo(13.8535f, 13.1465f)
                curveTo(14.0488f, 13.3417f, 14.0488f, 13.6583f, 13.8535f, 13.8535f)
                curveTo(13.6583f, 14.0488f, 13.3417f, 14.0488f, 13.1465f, 13.8535f)
                lineTo(10.0195f, 10.7266f)
                curveTo(9.06578f, 11.5216f, 7.83875f, 12f, 6.5f, 12f)
                curveTo(3.46243f, 12f, 1f, 9.53757f, 1f, 6.5f)
                curveTo(1f, 3.46243f, 3.46243f, 1f, 6.5f, 1f)
                close()
                moveTo(6.5f, 2f)
                curveTo(4.01472f, 2f, 2f, 4.01472f, 2f, 6.5f)
                curveTo(2f, 8.98528f, 4.01472f, 11f, 6.5f, 11f)
                curveTo(8.98528f, 11f, 11f, 8.98528f, 11f, 6.5f)
                curveTo(11f, 4.01472f, 8.98528f, 2f, 6.5f, 2f)
                close()
            }
        }.build()
        
        return _ZoomIn!!
    }

private var _ZoomIn: ImageVector? = null

