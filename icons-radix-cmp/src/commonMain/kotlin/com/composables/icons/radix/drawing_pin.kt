package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.DrawingPin: ImageVector
    get() {
        if (_DrawingPin != null) return _DrawingPin!!
        
        _DrawingPin = ImageVector.Builder(
            name = "drawing-pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.62103f, 1.13601f)
                curveTo(9.81625f, 0.940789f, 10.1328f, 0.940868f, 10.3281f, 1.13601f)
                lineTo(13.8642f, 4.67117f)
                curveTo(14.0593f, 4.86631f, 14.0591f, 5.18291f, 13.8642f, 5.3782f)
                curveTo(13.6689f, 5.57346f, 13.3524f, 5.57346f, 13.1572f, 5.3782f)
                lineTo(12.5038f, 4.72586f)
                lineTo(8.86712f, 9.57449f)
                lineTo(9.97454f, 10.6819f)
                curveTo(10.1698f, 10.8772f, 10.1698f, 11.1937f, 9.97454f, 11.3889f)
                curveTo(9.77928f, 11.5841f, 9.46275f, 11.5842f, 9.26751f, 11.3889f)
                lineTo(6.7929f, 8.91336f)
                verticalLineTo(8.91433f)
                lineTo(3.5224f, 12.1848f)
                curveTo(3.32718f, 12.3799f, 3.01058f, 12.3799f, 2.81536f, 12.1848f)
                curveTo(2.62016f, 11.9896f, 2.62028f, 11.6731f, 2.81536f, 11.4778f)
                lineTo(6.08587f, 8.2073f)
                verticalLineTo(8.20632f)
                lineTo(3.61126f, 5.73171f)
                curveTo(3.41601f, 5.53645f, 3.416f, 5.21994f, 3.61126f, 5.02468f)
                curveTo(3.80656f, 4.82984f, 4.12317f, 4.82956f, 4.31829f, 5.02468f)
                lineTo(5.42572f, 6.13308f)
                lineTo(10.2743f, 2.49636f)
                lineTo(9.62103f, 1.84304f)
                curveTo(9.42592f, 1.64781f, 9.42592f, 1.33124f, 9.62103f, 1.13601f)
                close()
                moveTo(6.13958f, 6.84695f)
                lineTo(8.15326f, 8.86062f)
                lineTo(11.79f, 4.01101f)
                lineTo(10.9882f, 3.21023f)
                lineTo(6.13958f, 6.84695f)
                close()
            }
        }.build()
        
        return _DrawingPin!!
    }

private var _DrawingPin: ImageVector? = null

