package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Code: ImageVector
    get() {
        if (_Code != null) return _Code!!
        
        _Code = ImageVector.Builder(
            name = "code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.03606f, 2.31408f)
                curveTo(9.13865f, 2.05778f, 9.42913f, 1.93325f, 9.68548f, 2.03576f)
                curveTo(9.94183f, 2.1383f, 10.0663f, 2.42881f, 9.9638f, 2.68517f)
                lineTo(5.9638f, 12.6852f)
                curveTo(5.86124f, 12.9416f, 5.57077f, 13.066f, 5.31438f, 12.9635f)
                curveTo(5.05802f, 12.8609f, 4.93351f, 12.5705f, 5.03606f, 12.3141f)
                lineTo(9.03606f, 2.31408f)
                close()
                moveTo(11.1464f, 5.14611f)
                curveTo(11.3173f, 4.97532f, 11.5813f, 4.95355f, 11.7753f, 5.08166f)
                lineTo(11.8534f, 5.14611f)
                lineTo(13.8534f, 7.14611f)
                lineTo(13.9179f, 7.22423f)
                curveTo(14.046f, 7.41829f, 14.0242f, 7.68227f, 13.8534f, 7.85314f)
                lineTo(11.8534f, 9.85314f)
                curveTo(11.6582f, 10.0484f, 11.3417f, 10.0484f, 11.1464f, 9.85314f)
                curveTo(10.9512f, 9.65787f, 10.9512f, 9.34135f, 11.1464f, 9.14611f)
                lineTo(12.7929f, 7.49962f)
                lineTo(11.1464f, 5.85314f)
                lineTo(11.082f, 5.77501f)
                curveTo(10.9539f, 5.58094f, 10.9756f, 5.31695f, 11.1464f, 5.14611f)
                close()
                moveTo(3.14641f, 5.14611f)
                curveTo(3.34166f, 4.95094f, 3.6582f, 4.95094f, 3.85344f, 5.14611f)
                curveTo(4.04868f, 5.34135f, 4.04864f, 5.65787f, 3.85344f, 5.85314f)
                lineTo(2.20696f, 7.49962f)
                lineTo(3.85344f, 9.14611f)
                lineTo(3.9179f, 9.22423f)
                curveTo(4.04605f, 9.41829f, 4.02425f, 9.68227f, 3.85344f, 9.85314f)
                curveTo(3.68258f, 10.024f, 3.41862f, 10.0458f, 3.22454f, 9.91759f)
                lineTo(3.14641f, 9.85314f)
                lineTo(1.14641f, 7.85314f)
                curveTo(0.951218f, 7.65787f, 0.951173f, 7.34135f, 1.14641f, 7.14611f)
                lineTo(3.14641f, 5.14611f)
                close()
            }
        }.build()
        
        return _Code!!
    }

private var _Code: ImageVector? = null

