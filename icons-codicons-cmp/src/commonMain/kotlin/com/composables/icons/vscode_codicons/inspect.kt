package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Inspect: ImageVector
    get() {
        if (_Inspect != null) return _Inspect!!
        
        _Inspect = ImageVector.Builder(
            name = "inspect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4f)
                curveTo(1f, 2.89543f, 1.89543f, 2f, 3f, 2f)
                horizontalLineTo(13f)
                curveTo(14.1046f, 2f, 15f, 2.89543f, 15f, 4f)
                lineTo(15f, 10f)
                curveTo(15f, 10.8062f, 14.523f, 11.501f, 13.8358f, 11.8175f)
                curveTo(13.7656f, 11.6802f, 13.6736f, 11.5523f, 13.5607f, 11.4394f)
                lineTo(13.1148f, 10.9935f)
                curveTo(13.613f, 10.9366f, 14f, 10.5135f, 14f, 10f)
                lineTo(14f, 4f)
                curveTo(14f, 3.44772f, 13.5523f, 3f, 13f, 3f)
                horizontalLineTo(3f)
                curveTo(2.44772f, 3f, 2f, 3.44772f, 2f, 4f)
                lineTo(2f, 10f)
                curveTo(2f, 10.5523f, 2.44772f, 11f, 3f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                curveTo(1.89543f, 12f, 1f, 11.1046f, 1f, 10f)
                lineTo(1f, 4f)
                close()
                moveTo(8.85356f, 8.14645f)
                curveTo(8.71056f, 8.00345f, 8.4955f, 7.96067f, 8.30866f, 8.03806f)
                curveTo(8.12182f, 8.11545f, 8f, 8.29777f, 8f, 8.5f)
                verticalLineTo(14.5f)
                curveTo(8f, 14.7152f, 8.13772f, 14.9063f, 8.34189f, 14.9743f)
                curveTo(8.54606f, 15.0424f, 8.77087f, 14.9722f, 8.9f, 14.8f)
                lineTo(10.25f, 13f)
                horizontalLineTo(12.5f)
                curveTo(12.7022f, 13f, 12.8846f, 12.8782f, 12.9619f, 12.6913f)
                curveTo(13.0393f, 12.5045f, 12.9966f, 12.2894f, 12.8536f, 12.1464f)
                lineTo(8.85356f, 8.14645f)
                close()
                moveTo(9f, 13f)
                verticalLineTo(9.70711f)
                lineTo(11.2929f, 12f)
                horizontalLineTo(10f)
                curveTo(9.84262f, 12f, 9.69443f, 12.0741f, 9.6f, 12.2f)
                lineTo(9f, 13f)
                close()
            }
        }.build()
        
        return _Inspect!!
    }

private var _Inspect: ImageVector? = null

