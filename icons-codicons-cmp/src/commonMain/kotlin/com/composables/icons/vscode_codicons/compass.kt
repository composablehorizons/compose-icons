package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Compass: ImageVector
    get() {
        if (_Compass != null) return _Compass!!
        
        _Compass = ImageVector.Builder(
            name = "compass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.47854f, 5.13086f)
                curveTo(5.61226f, 4.68207f, 4.68182f, 5.61251f, 5.13063f, 6.47879f)
                lineTo(6.11941f, 8.38733f)
                curveTo(6.45099f, 9.02734f, 6.97209f, 9.54937f, 7.61152f, 9.88209f)
                lineTo(9.53337f, 10.8821f)
                curveTo(10.4005f, 11.3334f, 11.3333f, 10.4005f, 10.882f, 9.53339f)
                lineTo(9.88189f, 7.61161f)
                curveTo(9.54916f, 6.97225f, 9.02715f, 6.4512f, 8.38717f, 6.11965f)
                lineTo(6.47854f, 5.13086f)
                close()
                moveTo(6.01854f, 6.01877f)
                lineTo(7.92717f, 7.00757f)
                curveTo(8.3843f, 7.24439f, 8.75716f, 7.61657f, 8.99483f, 8.07325f)
                lineTo(9.99496f, 9.99504f)
                lineTo(8.07311f, 8.995f)
                curveTo(7.61638f, 8.75735f, 7.24417f, 8.38447f, 7.00732f, 7.92731f)
                lineTo(6.01854f, 6.01877f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8.00049f)
                curveTo(1f, 4.1345f, 4.13401f, 1.00049f, 8f, 1.00049f)
                curveTo(11.866f, 1.00049f, 15f, 4.1345f, 15f, 8.00049f)
                curveTo(15f, 11.8665f, 11.866f, 15.0005f, 8f, 15.0005f)
                curveTo(4.13401f, 15.0005f, 1f, 11.8665f, 1f, 8.00049f)
                close()
                moveTo(8f, 2.00049f)
                curveTo(4.68629f, 2.00049f, 2f, 4.68678f, 2f, 8.00049f)
                curveTo(2f, 11.3142f, 4.68629f, 14.0005f, 8f, 14.0005f)
                curveTo(11.3137f, 14.0005f, 14f, 11.3142f, 14f, 8.00049f)
                curveTo(14f, 4.68678f, 11.3137f, 2.00049f, 8f, 2.00049f)
                close()
            }
        }.build()
        
        return _Compass!!
    }

private var _Compass: ImageVector? = null

