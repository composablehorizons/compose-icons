package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Shuffle: ImageVector
    get() {
        if (_Shuffle != null) return _Shuffle!!
        
        _Shuffle = ImageVector.Builder(
            name = "shuffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.08984f, 8.12814f)
                curveTo(8.58453f, 8.79296f, 9.05295f, 9.39787f, 9.56543f, 9.88986f)
                curveTo(10.2892f, 10.5846f, 11.0465f, 11.0002f, 12f, 11.0002f)
                horizontalLineTo(12.793f)
                lineTo(11.6465f, 9.85372f)
                lineTo(11.582f, 9.7756f)
                curveTo(11.4539f, 9.58152f, 11.4756f, 9.31756f, 11.6465f, 9.14669f)
                curveTo(11.8173f, 8.97583f, 12.0813f, 8.95407f, 12.2754f, 9.08224f)
                lineTo(12.3535f, 9.14669f)
                lineTo(14.3535f, 11.1467f)
                curveTo(14.5488f, 11.342f, 14.5488f, 11.6585f, 14.3535f, 11.8537f)
                lineTo(12.3535f, 13.8537f)
                curveTo(12.1583f, 14.049f, 11.8417f, 14.049f, 11.6465f, 13.8537f)
                curveTo(11.4512f, 13.6585f, 11.4512f, 13.342f, 11.6465f, 13.1467f)
                lineTo(12.793f, 12.0002f)
                horizontalLineTo(12f)
                curveTo(10.7037f, 12.0002f, 9.7107f, 11.4156f, 8.87207f, 10.6106f)
                curveTo(8.37205f, 10.1305f, 7.90974f, 9.55042f, 7.45801f, 8.95138f)
                curveTo(7.64654f, 8.71441f, 7.8276f, 8.48007f, 8f, 8.25021f)
                curveTo(8.03055f, 8.20947f, 8.05987f, 8.16831f, 8.08984f, 8.12814f)
                close()
                moveTo(11.6465f, 1.14669f)
                curveTo(11.8173f, 0.975828f, 12.0813f, 0.954074f, 12.2754f, 1.08224f)
                lineTo(12.3535f, 1.14669f)
                lineTo(14.3535f, 3.14669f)
                lineTo(14.418f, 3.22482f)
                curveTo(14.5461f, 3.4189f, 14.5244f, 3.68286f, 14.3535f, 3.85372f)
                lineTo(12.3535f, 5.85372f)
                curveTo(12.1583f, 6.04899f, 11.8417f, 6.04899f, 11.6465f, 5.85372f)
                curveTo(11.4512f, 5.65846f, 11.4512f, 5.34195f, 11.6465f, 5.14669f)
                lineTo(12.793f, 4.00021f)
                horizontalLineTo(12f)
                curveTo(11.0465f, 4.00021f, 10.2892f, 4.41586f, 9.56543f, 5.11056f)
                curveTo(8.82263f, 5.82365f, 8.17078f, 6.7728f, 7.40039f, 7.80001f)
                curveTo(5.89165f, 9.81166f, 4.00963f, 12.0002f, 0.5f, 12.0002f)
                curveTo(0.223858f, 12.0002f, 0f, 11.7764f, 0f, 11.5002f)
                curveTo(0f, 11.2241f, 0.223858f, 11.0002f, 0.5f, 11.0002f)
                curveTo(3.49021f, 11.0002f, 5.10841f, 9.18863f, 6.59961f, 7.2004f)
                curveTo(7.329f, 6.22788f, 8.05261f, 5.17665f, 8.87207f, 4.38986f)
                curveTo(9.7107f, 3.58478f, 10.7037f, 3.00021f, 12f, 3.00021f)
                horizontalLineTo(12.793f)
                lineTo(11.6465f, 1.85372f)
                lineTo(11.582f, 1.7756f)
                curveTo(11.4539f, 1.58152f, 11.4756f, 1.31756f, 11.6465f, 1.14669f)
                close()
                moveTo(0.5f, 3.00021f)
                curveTo(3.35242f, 3.00021f, 5.1293f, 4.44621f, 6.50488f, 6.06759f)
                curveTo(6.3319f, 6.30165f, 6.16402f, 6.53151f, 6f, 6.75021f)
                curveTo(5.96377f, 6.79852f, 5.92681f, 6.846f, 5.89062f, 6.89376f)
                curveTo(4.57223f, 5.29373f, 3.0261f, 4.00021f, 0.5f, 4.00021f)
                curveTo(0.223858f, 4.00021f, 0f, 3.77635f, 0f, 3.50021f)
                curveTo(0f, 3.22406f, 0.223858f, 3.00021f, 0.5f, 3.00021f)
                close()
            }
        }.build()
        
        return _Shuffle!!
    }

private var _Shuffle: ImageVector? = null

