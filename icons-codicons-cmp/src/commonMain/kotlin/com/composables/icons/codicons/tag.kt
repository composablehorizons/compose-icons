package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 6f)
                curveTo(10.4477f, 6f, 10f, 5.55228f, 10f, 5f)
                curveTo(10f, 4.44772f, 10.4477f, 4f, 11f, 4f)
                curveTo(11.5523f, 4f, 12f, 4.44772f, 12f, 5f)
                curveTo(12f, 5.55228f, 11.5523f, 6f, 11f, 6f)
                close()
                moveTo(2.58722f, 10.1357f)
                curveTo(1.80426f, 9.3566f, 1.80426f, 8.0934f, 2.58722f, 7.31428f)
                lineTo(7.32688f, 2.59785f)
                curveTo(7.70082f, 2.22574f, 8.20735f, 2.01572f, 8.73617f, 2.01353f)
                lineTo(11.9867f, 2.00002f)
                curveTo(13.1029f, 1.99538f, 14.008f, 2.89877f, 13.9999f, 4.00947f)
                lineTo(13.9755f, 7.3725f)
                curveTo(13.9717f, 7.89662f, 13.7608f, 8.3982f, 13.3884f, 8.76882f)
                lineTo(8.71865f, 13.4157f)
                curveTo(7.93569f, 14.1948f, 6.66627f, 14.1948f, 5.88331f, 13.4157f)
                lineTo(2.58722f, 10.1357f)
                close()
                moveTo(3.29605f, 8.01964f)
                curveTo(2.90458f, 8.4092f, 2.90458f, 9.0408f, 3.29606f, 9.43036f)
                lineTo(6.59214f, 12.7103f)
                curveTo(6.98362f, 13.0999f, 7.61834f, 13.0999f, 8.00982f, 12.7103f)
                lineTo(12.6795f, 8.06346f)
                curveTo(12.8658f, 7.87815f, 12.9712f, 7.62736f, 12.9731f, 7.3653f)
                lineTo(12.9975f, 4.00227f)
                curveTo(13.0016f, 3.44692f, 12.549f, 2.99522f, 11.9909f, 2.99754f)
                lineTo(8.74036f, 3.01105f)
                curveTo(8.47595f, 3.01215f, 8.22268f, 3.11716f, 8.03571f, 3.30321f)
                lineTo(3.29605f, 8.01964f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

