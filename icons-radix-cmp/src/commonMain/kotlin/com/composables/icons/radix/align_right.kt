package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) return _AlignRight!!
        
        _AlignRight = ImageVector.Builder(
            name = "align-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.9999f, 13.5f)
                curveTo(14.9999f, 13.7761f, 14.776f, 14f, 14.4999f, 14f)
                curveTo(14.2237f, 14f, 13.9999f, 13.7761f, 13.9999f, 13.5f)
                lineTo(13.9999f, 9f)
                lineTo(2.99988f, 9f)
                curveTo(2.44759f, 9f, 1.99988f, 8.55228f, 1.99988f, 8f)
                lineTo(1.99988f, 7f)
                curveTo(1.99988f, 6.44771f, 2.44759f, 6f, 2.99988f, 6f)
                lineTo(13.9999f, 6f)
                lineTo(13.9999f, 1.5f)
                curveTo(13.9999f, 1.22386f, 14.2237f, 1f, 14.4999f, 1f)
                curveTo(14.776f, 1f, 14.9999f, 1.22386f, 14.9999f, 1.5f)
                lineTo(14.9999f, 13.5f)
                close()
            }
        }.build()
        
        return _AlignRight!!
    }

private var _AlignRight: ImageVector? = null

