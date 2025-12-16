package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CaretRight: ImageVector
    get() {
        if (_CaretRight != null) return _CaretRight!!
        
        _CaretRight = ImageVector.Builder(
            name = "caret-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.95012f, 7.50023f)
                curveTo(9.95007f, 7.61951f, 9.90263f, 7.73425f, 9.81828f, 7.81859f)
                lineTo(6.81828f, 10.8186f)
                curveTo(6.64253f, 10.9941f, 6.35724f, 10.9943f, 6.18156f, 10.8186f)
                curveTo(6.00589f, 10.6429f, 6.00602f, 10.3576f, 6.18156f, 10.1819f)
                lineTo(8.8632f, 7.50023f)
                lineTo(6.18156f, 4.81859f)
                lineTo(6.12395f, 4.74828f)
                curveTo(6.00848f, 4.57366f, 6.0279f, 4.33572f, 6.18156f, 4.18188f)
                curveTo(6.33539f, 4.02805f, 6.57328f, 4.00878f, 6.74797f, 4.12426f)
                lineTo(6.81828f, 4.18188f)
                lineTo(9.81828f, 7.18188f)
                curveTo(9.90267f, 7.26627f, 9.95012f, 7.38089f, 9.95012f, 7.50023f)
                close()
            }
        }.build()
        
        return _CaretRight!!
    }

private var _CaretRight: ImageVector? = null

