package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ZoomIn: ImageVector
    get() {
        if (_ZoomIn != null) return _ZoomIn!!
        
        _ZoomIn = ImageVector.Builder(
            name = "zoom-in",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 2f)
                curveTo(8.98528f, 2f, 11f, 4.01472f, 11f, 6.5f)
                curveTo(11f, 7.56246f, 10.6304f, 8.5378f, 10.0146f, 9.30762f)
                lineTo(12.8535f, 12.1465f)
                lineTo(12.918f, 12.2246f)
                curveTo(13.0461f, 12.4187f, 13.0244f, 12.6827f, 12.8535f, 12.8535f)
                curveTo(12.6827f, 13.0244f, 12.4187f, 13.0461f, 12.2246f, 12.918f)
                lineTo(12.1465f, 12.8535f)
                lineTo(9.30762f, 10.0146f)
                curveTo(8.5378f, 10.6304f, 7.56246f, 11f, 6.5f, 11f)
                curveTo(4.01472f, 11f, 2f, 8.98528f, 2f, 6.5f)
                curveTo(2f, 4.01472f, 4.01472f, 2f, 6.5f, 2f)
                close()
                moveTo(6.5f, 3f)
                curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
                curveTo(3f, 8.433f, 4.567f, 10f, 6.5f, 10f)
                curveTo(8.433f, 10f, 10f, 8.433f, 10f, 6.5f)
                curveTo(10f, 4.567f, 8.433f, 3f, 6.5f, 3f)
                close()
                moveTo(6.5f, 4.25f)
                curveTo(6.77614f, 4.25f, 7f, 4.47386f, 7f, 4.75f)
                verticalLineTo(6f)
                horizontalLineTo(8.25f)
                lineTo(8.35059f, 6.00977f)
                curveTo(8.57855f, 6.05629f, 8.75f, 6.25829f, 8.75f, 6.5f)
                curveTo(8.75f, 6.74171f, 8.57855f, 6.94371f, 8.35059f, 6.99023f)
                lineTo(8.25f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(8.25f)
                curveTo(7f, 8.52614f, 6.77614f, 8.75f, 6.5f, 8.75f)
                curveTo(6.22386f, 8.75f, 6f, 8.52614f, 6f, 8.25f)
                verticalLineTo(7f)
                horizontalLineTo(4.75f)
                curveTo(4.47386f, 7f, 4.25f, 6.77614f, 4.25f, 6.5f)
                curveTo(4.25f, 6.22386f, 4.47386f, 6f, 4.75f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(4.75f)
                curveTo(6f, 4.47386f, 6.22386f, 4.25f, 6.5f, 4.25f)
                close()
            }
        }.build()
        
        return _ZoomIn!!
    }

private var _ZoomIn: ImageVector? = null

