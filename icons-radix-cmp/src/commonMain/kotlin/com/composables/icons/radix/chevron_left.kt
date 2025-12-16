package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!
        
        _ChevronLeft = ImageVector.Builder(
            name = "chevron-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.21192f, 3.09155f)
                curveTo(8.40164f, 2.95736f, 8.66555f, 2.96958f, 8.8418f, 3.13452f)
                curveTo(9.01806f, 3.29976f, 9.04853f, 3.56338f, 8.92676f, 3.76148f)
                lineTo(8.86524f, 3.84155f)
                lineTo(5.43555f, 7.49976f)
                lineTo(8.86524f, 11.158f)
                lineTo(8.92676f, 11.238f)
                curveTo(9.04853f, 11.4361f, 9.01806f, 11.6998f, 8.8418f, 11.865f)
                curveTo(8.66555f, 12.0299f, 8.40164f, 12.0422f, 8.21192f, 11.908f)
                lineTo(8.13477f, 11.8416f)
                lineTo(4.38477f, 7.84155f)
                curveTo(4.20487f, 7.64932f, 4.20487f, 7.35019f, 4.38477f, 7.15796f)
                lineTo(8.13477f, 3.15796f)
                lineTo(8.21192f, 3.09155f)
                close()
            }
        }.build()
        
        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

