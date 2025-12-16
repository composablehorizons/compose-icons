package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FigmaLogo: ImageVector
    get() {
        if (_FigmaLogo != null) return _FigmaLogo!!
        
        _FigmaLogo = ImageVector.Builder(
            name = "figma-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.72778f, 1.0627f)
                curveTo(10.9758f, 1.18928f, 11.9502f, 2.24321f, 11.9504f, 3.52461f)
                lineTo(11.9377f, 3.77852f)
                curveTo(11.8662f, 4.48137f, 11.4989f, 5.09527f, 10.9641f, 5.49922f)
                curveTo(11.5625f, 5.95094f, 11.9503f, 6.66735f, 11.9504f, 7.47481f)
                lineTo(11.9377f, 7.72871f)
                curveTo(11.8107f, 8.9764f, 10.756f, 9.95029f, 9.47485f, 9.95039f)
                lineTo(9.22192f, 9.9377f)
                curveTo(8.76645f, 9.8914f, 8.34868f, 9.7195f, 8.00024f, 9.46016f)
                verticalLineTo(11.425f)
                lineTo(7.98755f, 11.6789f)
                curveTo(7.86042f, 12.9265f, 6.80585f, 13.9006f, 5.52466f, 13.9006f)
                lineTo(5.27173f, 13.8879f)
                curveTo(4.10729f, 13.7695f, 3.18139f, 12.8433f, 3.06274f, 11.6789f)
                lineTo(3.05005f, 11.425f)
                curveTo(3.05017f, 10.6178f, 3.43642f, 9.90018f, 4.03442f, 9.44844f)
                curveTo(3.50058f, 9.04448f, 3.13423f, 8.43083f, 3.06274f, 7.72871f)
                lineTo(3.05005f, 7.47481f)
                curveTo(3.05017f, 6.66753f, 3.43726f, 5.95095f, 4.0354f, 5.49922f)
                curveTo(3.50096f, 5.09524f, 3.13423f, 4.48115f, 3.06274f, 3.77852f)
                lineTo(3.05005f, 3.52461f)
                curveTo(3.05025f, 2.2434f, 4.02394f, 1.18955f, 5.27173f, 1.0627f)
                lineTo(5.52466f, 1.05f)
                horizontalLineTo(9.47485f)
                lineTo(9.72778f, 1.0627f)
                close()
                moveTo(5.52466f, 9.95039f)
                curveTo(4.71035f, 9.9506f, 4.05026f, 10.6107f, 4.05005f, 11.425f)
                curveTo(4.05026f, 12.2393f, 4.71035f, 12.9004f, 5.52466f, 12.9006f)
                curveTo(6.33915f, 12.9006f, 7.00003f, 12.2394f, 7.00024f, 11.425f)
                verticalLineTo(9.95039f)
                horizontalLineTo(5.52466f)
                close()
                moveTo(5.52466f, 6.0002f)
                curveTo(4.71035f, 6.00041f, 4.05026f, 6.6605f, 4.05005f, 7.47481f)
                curveTo(4.05015f, 8.28921f, 4.71028f, 8.95018f, 5.52466f, 8.95039f)
                horizontalLineTo(7.00024f)
                verticalLineTo(6.0002f)
                horizontalLineTo(5.52466f)
                close()
                moveTo(9.47485f, 6.0002f)
                curveTo(8.66054f, 6.00041f, 8.00045f, 6.6605f, 8.00024f, 7.47481f)
                curveTo(8.00034f, 8.28921f, 8.66047f, 8.95018f, 9.47485f, 8.95039f)
                curveTo(10.2893f, 8.95029f, 10.9503f, 8.28928f, 10.9504f, 7.47481f)
                curveTo(10.9502f, 6.66043f, 10.2893f, 6.0003f, 9.47485f, 6.0002f)
                close()
                moveTo(8.00024f, 5.0002f)
                horizontalLineTo(9.47485f)
                curveTo(10.2895f, 5.0002f, 10.9504f, 4.33923f, 10.9504f, 3.52461f)
                curveTo(10.9502f, 2.71017f, 10.2893f, 2.05f, 9.47485f, 2.05f)
                horizontalLineTo(8.00024f)
                verticalLineTo(5.0002f)
                close()
                moveTo(5.52466f, 2.05f)
                curveTo(4.71035f, 2.05021f, 4.05026f, 2.7103f, 4.05005f, 3.52461f)
                curveTo(4.05005f, 4.3391f, 4.71022f, 4.99999f, 5.52466f, 5.0002f)
                horizontalLineTo(7.00024f)
                verticalLineTo(2.05f)
                horizontalLineTo(5.52466f)
                close()
            }
        }.build()
        
        return _FigmaLogo!!
    }

private var _FigmaLogo: ImageVector? = null

