package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Badge: ImageVector
    get() {
        if (_Badge != null) return _Badge!!
        
        _Badge = ImageVector.Builder(
            name = "badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.7559f, 5.0127f)
                curveTo(13.0164f, 5.14082f, 14f, 6.20566f, 14f, 7.5f)
                curveTo(14f, 8.79434f, 13.0164f, 9.85918f, 11.7559f, 9.9873f)
                lineTo(11.5f, 10f)
                horizontalLineTo(3.5f)
                lineTo(3.24414f, 9.9873f)
                curveTo(1.98361f, 9.85918f, 1f, 8.79434f, 1f, 7.5f)
                curveTo(1f, 6.20566f, 1.98361f, 5.14082f, 3.24414f, 5.0127f)
                lineTo(3.5f, 5f)
                horizontalLineTo(11.5f)
                lineTo(11.7559f, 5.0127f)
                close()
                moveTo(3.5f, 6f)
                curveTo(2.67157f, 6f, 2f, 6.67157f, 2f, 7.5f)
                curveTo(2f, 8.32843f, 2.67157f, 9f, 3.5f, 9f)
                horizontalLineTo(11.5f)
                curveTo(12.3284f, 9f, 13f, 8.32843f, 13f, 7.5f)
                curveTo(13f, 6.67157f, 12.3284f, 6f, 11.5f, 6f)
                horizontalLineTo(3.5f)
                close()
                moveTo(10.5f, 7f)
                curveTo(10.7761f, 7f, 11f, 7.22386f, 11f, 7.5f)
                curveTo(11f, 7.77614f, 10.7761f, 8f, 10.5f, 8f)
                horizontalLineTo(4.5f)
                curveTo(4.22386f, 8f, 4f, 7.77614f, 4f, 7.5f)
                curveTo(4f, 7.22386f, 4.22386f, 7f, 4.5f, 7f)
                horizontalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Badge!!
    }

private var _Badge: ImageVector? = null

