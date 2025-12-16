package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LightningBolt: ImageVector
    get() {
        if (_LightningBolt != null) return _LightningBolt!!
        
        _LightningBolt = ImageVector.Builder(
            name = "lightning-bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.15623f, 0.136828f)
                curveTo(8.29885f, 0.0017736f, 8.5108f, -0.038992f, 8.69627f, 0.0401498f)
                curveTo(8.90813f, 0.130807f, 9.03093f, 0.354826f, 8.99314f, 0.582135f)
                lineTo(8.08983f, 6.00004f)
                horizontalLineTo(12.4999f)
                curveTo(12.6893f, 6.00004f, 12.8625f, 6.10703f, 12.9472f, 6.2764f)
                curveTo(13.0318f, 6.44567f, 13.0137f, 6.64836f, 12.9003f, 6.79983f)
                lineTo(6.90039f, 14.7997f)
                curveTo(6.76218f, 14.984f, 6.51554f, 15.0503f, 6.30372f, 14.9599f)
                curveTo(6.09185f, 14.8692f, 5.96904f, 14.6452f, 6.00685f, 14.4179f)
                lineTo(6.91016f, 9f)
                horizontalLineTo(2.50005f)
                curveTo(2.31067f, 9f, 2.13749f, 8.89303f, 2.05279f, 8.72364f)
                curveTo(1.96818f, 8.55437f, 1.98625f, 8.35167f, 2.09967f, 8.20021f)
                lineTo(8.09959f, 0.200304f)
                lineTo(8.15623f, 0.136828f)
                close()
                moveTo(3.50004f, 8.00001f)
                horizontalLineTo(7.49999f)
                curveTo(7.64696f, 8.00001f, 7.78682f, 8.06464f, 7.88182f, 8.17677f)
                curveTo(7.9767f, 8.28885f, 8.01724f, 8.43718f, 7.99315f, 8.58204f)
                lineTo(7.33007f, 12.5586f)
                lineTo(11.4999f, 7.00003f)
                horizontalLineTo(7.49999f)
                curveTo(7.35302f, 7.00003f, 7.21316f, 6.93541f, 7.11816f, 6.82327f)
                curveTo(7.02329f, 6.71118f, 6.98274f, 6.56286f, 7.00683f, 6.418f)
                lineTo(7.66894f, 2.44051f)
                lineTo(3.50004f, 8.00001f)
                close()
            }
        }.build()
        
        return _LightningBolt!!
    }

private var _LightningBolt: ImageVector? = null

