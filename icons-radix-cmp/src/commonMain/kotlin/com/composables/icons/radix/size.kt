package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Size: ImageVector
    get() {
        if (_Size != null) return _Size!!
        
        _Size = ImageVector.Builder(
            name = "size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.591f, 3.05881f)
                curveTo(11.7959f, 3.10085f, 11.9503f, 3.28294f, 11.9504f, 3.50021f)
                verticalLineTo(7.49924f)
                lineTo(11.9406f, 7.59103f)
                curveTo(11.8985f, 7.79574f, 11.7173f, 7.94924f, 11.5002f, 7.94943f)
                curveTo(11.2828f, 7.94933f, 11.1007f, 7.79513f, 11.0588f, 7.59006f)
                lineTo(11.05f, 7.50021f)
                verticalLineTo(4.58615f)
                lineTo(4.58711f, 11.049f)
                lineTo(7.5002f, 11.05f)
                lineTo(7.59102f, 11.0588f)
                curveTo(7.79571f, 11.1008f, 7.94905f, 11.2822f, 7.94942f, 11.4992f)
                curveTo(7.94942f, 11.7478f, 7.74775f, 11.9494f, 7.49922f, 11.9494f)
                horizontalLineTo(3.5002f)
                curveTo(3.38087f, 11.9494f, 3.26622f, 11.902f, 3.18184f, 11.8176f)
                curveTo(3.09763f, 11.7332f, 3.05f, 11.6184f, 3.05f, 11.4992f)
                verticalLineTo(7.50021f)
                lineTo(3.05977f, 7.40939f)
                curveTo(3.1019f, 7.20457f, 3.28292f, 7.05004f, 3.5002f, 7.05002f)
                curveTo(3.71763f, 7.05014f, 3.89974f, 7.20431f, 3.9416f, 7.40939f)
                lineTo(3.95039f, 7.50021f)
                verticalLineTo(10.4143f)
                lineTo(10.4143f, 3.95041f)
                horizontalLineTo(7.5002f)
                curveTo(7.25181f, 3.9504f, 7.05023f, 3.74855f, 7.05f, 3.50021f)
                curveTo(7.05012f, 3.25179f, 7.25175f, 3.05003f, 7.5002f, 3.05002f)
                horizontalLineTo(11.5002f)
                lineTo(11.591f, 3.05881f)
                close()
            }
        }.build()
        
        return _Size!!
    }

private var _Size: ImageVector? = null

