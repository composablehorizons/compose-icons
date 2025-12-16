package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.FramerLogo: ImageVector
    get() {
        if (_FramerLogo != null) return _FramerLogo!!
        
        _FramerLogo = ImageVector.Builder(
            name = "framer-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.6006f, 1.00706f)
                curveTo(11.8285f, 1.05359f, 12f, 1.25559f, 12f, 1.4973f)
                verticalLineTo(5.50023f)
                curveTo(11.9999f, 5.77627f, 11.7761f, 6.00022f, 11.5f, 6.00023f)
                horizontalLineTo(8.63574f)
                lineTo(11.5293f, 9.16234f)
                lineTo(11.5742f, 9.21996f)
                curveTo(11.6695f, 9.3609f, 11.6871f, 9.54261f, 11.6172f, 9.7014f)
                curveTo(11.5373f, 9.88272f, 11.3583f, 10.0001f, 11.1602f, 10.0002f)
                horizontalLineTo(8f)
                verticalLineTo(13.5002f)
                curveTo(7.99991f, 13.7024f, 7.87818f, 13.8848f, 7.69141f, 13.9621f)
                curveTo(7.50462f, 14.0395f, 7.28948f, 13.9967f, 7.14648f, 13.8537f)
                lineTo(3.14648f, 9.85374f)
                curveTo(3.05277f, 9.76003f, 3.00006f, 9.63276f, 3f, 9.50023f)
                verticalLineTo(5.50023f)
                lineTo(3.00977f, 5.39964f)
                curveTo(3.05621f, 5.17157f, 3.25821f, 5.00023f, 3.5f, 5.00023f)
                horizontalLineTo(6.36523f)
                lineTo(3.4707f, 1.83421f)
                curveTo(3.33737f, 1.68805f, 3.30313f, 1.47723f, 3.38281f, 1.29613f)
                curveTo(3.46269f, 1.11485f, 3.64175f, 0.99738f, 3.83984f, 0.997299f)
                horizontalLineTo(11.5f)
                lineTo(11.6006f, 1.00706f)
                close()
                moveTo(7f, 12.2932f)
                verticalLineTo(10.0002f)
                horizontalLineTo(4.70703f)
                lineTo(7f, 12.2932f)
                close()
                moveTo(4f, 9.00023f)
                horizontalLineTo(10.0254f)
                lineTo(7.28027f, 6.00023f)
                horizontalLineTo(4f)
                verticalLineTo(9.00023f)
                close()
                moveTo(7.7207f, 5.00023f)
                horizontalLineTo(11f)
                verticalLineTo(1.9973f)
                horizontalLineTo(4.97461f)
                lineTo(7.7207f, 5.00023f)
                close()
            }
        }.build()
        
        return _FramerLogo!!
    }

private var _FramerLogo: ImageVector? = null

