package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowUp: ImageVector
    get() {
        if (_ArrowUp != null) return _ArrowUp!!
        
        _ArrowUp = ImageVector.Builder(
            name = "arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 13.5f)
                curveTo(7.5f, 13.7761f, 7.72386f, 14f, 8f, 14f)
                curveTo(8.27614f, 14f, 8.5f, 13.7761f, 8.5f, 13.5f)
                verticalLineTo(3.80298f)
                lineTo(12.1284f, 7.83448f)
                curveTo(12.3131f, 8.03974f, 12.6292f, 8.05638f, 12.8345f, 7.87165f)
                curveTo(13.0397f, 7.68692f, 13.0564f, 7.37077f, 12.8716f, 7.16552f)
                lineTo(8.37165f, 2.16552f)
                curveTo(8.27683f, 2.06016f, 8.14174f, 2f, 8f, 2f)
                curveTo(7.85826f, 2f, 7.72317f, 2.06016f, 7.62835f, 2.16552f)
                lineTo(3.12836f, 7.16552f)
                curveTo(2.94363f, 7.37077f, 2.96027f, 7.68692f, 3.16552f, 7.87165f)
                curveTo(3.37078f, 8.05638f, 3.68692f, 8.03974f, 3.87165f, 7.83448f)
                lineTo(7.5f, 3.80298f)
                verticalLineTo(13.5f)
                close()
            }
        }.build()
        
        return _ArrowUp!!
    }

private var _ArrowUp: ImageVector? = null

