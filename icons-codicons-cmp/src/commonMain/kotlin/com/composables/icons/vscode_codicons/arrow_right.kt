package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowRight: ImageVector
    get() {
        if (_ArrowRight != null) return _ArrowRight!!
        
        _ArrowRight = ImageVector.Builder(
            name = "arrow-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 7.5f)
                curveTo(2.22386f, 7.5f, 2f, 7.72386f, 2f, 8f)
                curveTo(2f, 8.27614f, 2.22386f, 8.5f, 2.5f, 8.5f)
                lineTo(12.197f, 8.5f)
                lineTo(8.16552f, 12.1283f)
                curveTo(7.96026f, 12.3131f, 7.94362f, 12.6292f, 8.12835f, 12.8345f)
                curveTo(8.31308f, 13.0397f, 8.62923f, 13.0564f, 8.83448f, 12.8716f)
                lineTo(13.8345f, 8.37164f)
                curveTo(13.9398f, 8.27682f, 14f, 8.14174f, 14f, 8f)
                curveTo(14f, 7.85825f, 13.9398f, 7.72317f, 13.8345f, 7.62835f)
                lineTo(8.83448f, 3.12835f)
                curveTo(8.62923f, 2.94362f, 8.31308f, 2.96026f, 8.12835f, 3.16551f)
                curveTo(7.94362f, 3.37077f, 7.96026f, 3.68691f, 8.16552f, 3.87164f)
                lineTo(12.197f, 7.5f)
                lineTo(2.5f, 7.5f)
                close()
            }
        }.build()
        
        return _ArrowRight!!
    }

private var _ArrowRight: ImageVector? = null

