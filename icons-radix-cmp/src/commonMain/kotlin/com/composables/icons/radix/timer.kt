package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Timer: ImageVector
    get() {
        if (_Timer != null) return _Timer!!
        
        _Timer = ImageVector.Builder(
            name = "timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50037f, 0.849976f)
                curveTo(11.1729f, 0.850187f, 14.1498f, 3.8278f, 14.1498f, 7.50037f)
                curveTo(14.1496f, 11.1727f, 11.1727f, 14.1496f, 7.50037f, 14.1498f)
                curveTo(3.8278f, 14.1498f, 0.850187f, 11.1729f, 0.849976f, 7.50037f)
                curveTo(0.849976f, 5.86069f, 1.44404f, 4.35792f, 2.4281f, 3.19861f)
                lineTo(2.50134f, 3.1283f)
                curveTo(2.68432f, 2.98499f, 2.94906f, 2.98471f, 3.13318f, 3.14099f)
                curveTo(3.34359f, 3.31969f, 3.36942f, 3.63558f, 3.1908f, 3.84607f)
                lineTo(3.03748f, 4.03357f)
                curveTo(2.2928f, 4.9907f, 1.84998f, 6.19353f, 1.84998f, 7.50037f)
                curveTo(1.85019f, 10.6206f, 4.38009f, 13.1498f, 7.50037f, 13.1498f)
                curveTo(10.6205f, 13.1496f, 13.1496f, 10.6205f, 13.1498f, 7.50037f)
                curveTo(13.1498f, 4.54863f, 10.8863f, 2.12674f, 8.00037f, 1.87341f)
                verticalLineTo(3.52185f)
                curveTo(8.00037f, 3.79786f, 7.77633f, 4.02164f, 7.50037f, 4.02185f)
                curveTo(7.22422f, 4.02185f, 7.00037f, 3.79799f, 7.00037f, 3.52185f)
                verticalLineTo(1.34998f)
                lineTo(7.01013f, 1.24939f)
                curveTo(7.05669f, 1.02146f, 7.25868f, 0.849976f, 7.50037f, 0.849976f)
                close()
                moveTo(4.25037f, 4.25037f)
                curveTo(4.33688f, 4.16386f, 4.47322f, 4.15268f, 4.57263f, 4.224f)
                lineTo(8.08044f, 6.7406f)
                curveTo(8.56201f, 7.08607f, 8.61866f, 7.7805f, 8.19958f, 8.19958f)
                curveTo(7.7805f, 8.61867f, 7.08608f, 8.56202f, 6.7406f, 8.08044f)
                lineTo(4.224f, 4.57263f)
                curveTo(4.15268f, 4.47322f, 4.16385f, 4.33688f, 4.25037f, 4.25037f)
                close()
            }
        }.build()
        
        return _Timer!!
    }

private var _Timer: ImageVector? = null

