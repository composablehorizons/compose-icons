package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.NotionLogo: ImageVector
    get() {
        if (_NotionLogo != null) return _NotionLogo!!
        
        _NotionLogo = ImageVector.Builder(
            name = "notion-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.32544f, 0.781257f)
                curveTo(10.2448f, 0.702402f, 10.482f, 0.755043f, 11.0598f, 1.17481f)
                lineTo(13.4495f, 2.8545f)
                curveTo(13.8434f, 3.14304f, 13.9747f, 3.22173f, 13.9749f, 3.53614f)
                verticalLineTo(12.749f)
                curveTo(13.9749f, 13.3264f, 13.7648f, 13.6684f, 13.0295f, 13.7207f)
                lineTo(4.33521f, 14.2451f)
                curveTo(3.7832f, 14.2715f, 3.5198f, 14.1929f, 3.23071f, 13.8252f)
                lineTo(1.47095f, 11.542f)
                curveTo(1.15567f, 11.1218f, 1.02471f, 10.8073f, 1.02466f, 10.4395f)
                verticalLineTo(2.25001f)
                curveTo(1.02478f, 1.77803f, 1.23559f, 1.38431f, 1.83911f, 1.33204f)
                lineTo(9.32544f, 0.781257f)
                close()
                moveTo(4.12427f, 4.32423f)
                curveTo(3.80923f, 4.3507f, 3.70435f, 4.50848f, 3.70435f, 4.84962f)
                verticalLineTo(12.6699f)
                curveTo(3.70435f, 13.0903f, 3.91419f, 13.2477f, 4.38696f, 13.2217f)
                lineTo(12.5559f, 12.749f)
                curveTo(13.0289f, 12.723f, 13.0823f, 12.4342f, 13.0823f, 12.0928f)
                verticalLineTo(4.32423f)
                curveTo(13.0823f, 3.98339f, 12.9508f, 3.79905f, 12.6614f, 3.8252f)
                lineTo(4.12427f, 4.32423f)
                close()
                moveTo(11.7688f, 5.26856f)
                curveTo(11.8212f, 5.50502f, 11.7684f, 5.74101f, 11.5315f, 5.76758f)
                lineTo(11.1379f, 5.84669f)
                verticalLineTo(11.6201f)
                curveTo(10.7963f, 11.8037f, 10.4815f, 11.9091f, 10.219f, 11.9092f)
                curveTo(9.79864f, 11.9092f, 9.69295f, 11.7781f, 9.37817f, 11.3848f)
                lineTo(6.80298f, 7.34278f)
                verticalLineTo(11.2529f)
                lineTo(7.61841f, 11.4375f)
                curveTo(7.61819f, 11.4543f, 7.60603f, 11.909f, 6.96118f, 11.9092f)
                lineTo(5.14868f, 12.0147f)
                curveTo(5.09607f, 11.9096f, 5.14878f, 11.6475f, 5.33228f, 11.5947f)
                lineTo(5.80591f, 11.4629f)
                verticalLineTo(6.29298f)
                lineTo(5.14868f, 6.24024f)
                curveTo(5.09606f, 6.00389f, 5.2273f, 5.66344f, 5.59497f, 5.63673f)
                lineTo(7.53931f, 5.50489f)
                lineTo(10.219f, 9.59962f)
                verticalLineTo(5.97755f)
                lineTo(9.5354f, 5.89942f)
                curveTo(9.48299f, 5.61051f, 9.69281f, 5.40024f, 9.95532f, 5.37403f)
                lineTo(11.7688f, 5.26856f)
                close()
                moveTo(9.64087f, 1.51563f)
                lineTo(2.44263f, 2.04102f)
                curveTo(2.18055f, 2.06716f, 2.12818f, 2.19857f, 2.23267f, 2.30372f)
                lineTo(3.25806f, 3.11719f)
                curveTo(3.67766f, 3.45799f, 3.83535f, 3.43148f, 4.62329f, 3.37891f)
                lineTo(12.0569f, 2.93262f)
                curveTo(12.214f, 2.93262f, 12.0844f, 2.77691f, 12.0315f, 2.75001f)
                lineTo(10.7961f, 1.85743f)
                curveTo(10.5596f, 1.67381f, 10.2448f, 1.46305f, 9.64087f, 1.51563f)
                close()
            }
        }.build()
        
        return _NotionLogo!!
    }

private var _NotionLogo: ImageVector? = null

