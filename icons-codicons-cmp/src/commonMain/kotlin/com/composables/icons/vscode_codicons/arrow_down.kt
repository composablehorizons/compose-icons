package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) return _ArrowDown!!
        
        _ArrowDown = ImageVector.Builder(
            name = "arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 2.5f)
                curveTo(8.5f, 2.22386f, 8.27615f, 2f, 8f, 2f)
                curveTo(7.72386f, 2f, 7.5f, 2.22386f, 7.5f, 2.5f)
                verticalLineTo(12.197f)
                lineTo(3.87165f, 8.16552f)
                curveTo(3.68692f, 7.96026f, 3.37078f, 7.94362f, 3.16552f, 8.12835f)
                curveTo(2.96027f, 8.31308f, 2.94363f, 8.62923f, 3.12836f, 8.83448f)
                lineTo(7.62836f, 13.8345f)
                curveTo(7.72318f, 13.9398f, 7.85826f, 14f, 8f, 14f)
                curveTo(8.14175f, 14f, 8.27683f, 13.9398f, 8.37165f, 13.8345f)
                lineTo(12.8717f, 8.83448f)
                curveTo(13.0564f, 8.62923f, 13.0397f, 8.31308f, 12.8345f, 8.12835f)
                curveTo(12.6292f, 7.94362f, 12.3131f, 7.96026f, 12.1284f, 8.16552f)
                lineTo(8.5f, 12.197f)
                verticalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _ArrowDown!!
    }

private var _ArrowDown: ImageVector? = null

