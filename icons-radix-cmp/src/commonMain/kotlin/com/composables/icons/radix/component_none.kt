package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.ComponentNone: ImageVector
    get() {
        if (_ComponentNone != null) return _ComponentNone!!
        
        _ComponentNone = ImageVector.Builder(
            name = "component-none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.22405f, 1.42518f)
                curveTo(7.41815f, 1.29688f, 7.68302f, 1.31871f, 7.85393f, 1.48963f)
                lineTo(10.3285f, 3.96424f)
                lineTo(12.6469f, 1.64686f)
                curveTo(12.8422f, 1.45162f, 13.1587f, 1.4516f, 13.3539f, 1.64686f)
                curveTo(13.5488f, 1.84214f, 13.549f, 2.15875f, 13.3539f, 2.35389f)
                lineTo(11.0356f, 4.67127f)
                lineTo(13.5102f, 7.14686f)
                lineTo(13.5746f, 7.224f)
                curveTo(13.7029f, 7.4181f, 13.6811f, 7.68297f, 13.5102f, 7.85389f)
                lineTo(7.85393f, 13.5101f)
                curveTo(7.65869f, 13.7054f, 7.34217f, 13.7053f, 7.1469f, 13.5101f)
                lineTo(4.67132f, 11.0355f)
                lineTo(2.35393f, 13.3539f)
                curveTo(2.1588f, 13.549f, 1.84219f, 13.5488f, 1.6469f, 13.3539f)
                curveTo(1.45164f, 13.1586f, 1.45164f, 12.8421f, 1.6469f, 12.6469f)
                lineTo(3.96428f, 10.3285f)
                lineTo(1.48967f, 7.85389f)
                curveTo(1.29448f, 7.65869f, 1.2946f, 7.34213f, 1.48967f, 7.14686f)
                lineTo(7.1469f, 1.48963f)
                lineTo(7.22405f, 1.42518f)
                close()
                moveTo(5.37835f, 10.3285f)
                lineTo(7.50042f, 12.4496f)
                lineTo(12.4496f, 7.50037f)
                lineTo(10.3285f, 5.3783f)
                lineTo(5.37835f, 10.3285f)
                close()
                moveTo(2.55022f, 7.50037f)
                lineTo(4.67132f, 9.62147f)
                lineTo(9.62151f, 4.67127f)
                lineTo(7.50042f, 2.55018f)
                lineTo(2.55022f, 7.50037f)
                close()
            }
        }.build()
        
        return _ComponentNone!!
    }

private var _ComponentNone: ImageVector? = null

