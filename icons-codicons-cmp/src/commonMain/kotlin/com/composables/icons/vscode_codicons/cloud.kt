package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                curveTo(6.34315f, 3f, 5f, 4.34315f, 5f, 6f)
                curveTo(5f, 6.27614f, 4.77614f, 6.5f, 4.5f, 6.5f)
                horizontalLineTo(4.25f)
                curveTo(3.00736f, 6.5f, 2f, 7.50736f, 2f, 8.75f)
                curveTo(2f, 9.99264f, 3.00736f, 11f, 4.25f, 11f)
                horizontalLineTo(11.75f)
                curveTo(12.9926f, 11f, 14f, 9.99264f, 14f, 8.75f)
                curveTo(14f, 7.50736f, 12.9926f, 6.5f, 11.75f, 6.5f)
                horizontalLineTo(11.5f)
                curveTo(11.2239f, 6.5f, 11f, 6.27614f, 11f, 6f)
                curveTo(11f, 4.34315f, 9.65685f, 3f, 8f, 3f)
                close()
                moveTo(4.03004f, 5.50733f)
                curveTo(4.27283f, 3.53062f, 5.95767f, 2f, 8f, 2f)
                curveTo(10.0423f, 2f, 11.7272f, 3.53063f, 11.97f, 5.50733f)
                curveTo(13.6623f, 5.62043f, 15f, 7.029f, 15f, 8.75f)
                curveTo(15f, 10.5449f, 13.5449f, 12f, 11.75f, 12f)
                horizontalLineTo(4.25f)
                curveTo(2.45507f, 12f, 1f, 10.5449f, 1f, 8.75f)
                curveTo(1f, 7.029f, 2.33769f, 5.62043f, 4.03004f, 5.50733f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

