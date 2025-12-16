package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CountdownTimer: ImageVector
    get() {
        if (_CountdownTimer != null) return _CountdownTimer!!
        
        _CountdownTimer = ImageVector.Builder(
            name = "countdown-timer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 0.849976f)
                curveTo(11.5626f, 0.850176f, 14.1504f, 4.18587f, 14.1504f, 7.50037f)
                curveTo(14.1502f, 10.8147f, 11.5624f, 14.1496f, 7.5f, 14.1498f)
                curveTo(5.55651f, 14.1497f, 3.93833f, 13.3806f, 2.78613f, 12.2084f)
                lineTo(2.56055f, 11.9681f)
                curveTo(2.12341f, 11.4767f, 1.76418f, 10.9246f, 1.48926f, 10.3373f)
                lineTo(1.3584f, 10.0404f)
                curveTo(1.25353f, 9.78512f, 1.3756f, 9.49311f, 1.63086f, 9.38806f)
                curveTo(1.8541f, 9.29648f, 2.10559f, 9.37801f, 2.23535f, 9.57068f)
                lineTo(2.2832f, 9.66052f)
                curveTo(2.5289f, 10.2574f, 2.87436f, 10.8159f, 3.30762f, 11.3031f)
                lineTo(3.49902f, 11.5072f)
                curveTo(4.47075f, 12.4959f, 5.83522f, 13.1497f, 7.5f, 13.1498f)
                curveTo(10.9398f, 13.1496f, 13.1502f, 10.3355f, 13.1504f, 7.50037f)
                curveTo(13.1504f, 4.66507f, 10.94f, 1.85018f, 7.5f, 1.84998f)
                curveTo(4.88974f, 1.85016f, 3.52024f, 3.66593f, 2.87891f, 4.79236f)
                lineTo(2.76758f, 5.00037f)
                horizontalLineTo(4.5f)
                curveTo(4.77614f, 5.00037f, 5f, 5.22422f, 5f, 5.50037f)
                curveTo(4.99979f, 5.77633f, 4.77601f, 6.00037f, 4.5f, 6.00037f)
                horizontalLineTo(1.5f)
                curveTo(1.22399f, 6.00037f, 1.00021f, 5.77633f, 1f, 5.50037f)
                verticalLineTo(2.50037f)
                curveTo(1f, 2.22422f, 1.22386f, 2.00037f, 1.5f, 2.00037f)
                curveTo(1.77614f, 2.00037f, 2f, 2.22422f, 2f, 2.50037f)
                verticalLineTo(4.31189f)
                lineTo(2.00098f, 4.31091f)
                curveTo(2.70613f, 3.06863f, 4.3361f, 0.850158f, 7.5f, 0.849976f)
                close()
                moveTo(8f, 10.0004f)
                horizontalLineTo(7f)
                verticalLineTo(5.00037f)
                horizontalLineTo(8f)
                verticalLineTo(10.0004f)
                close()
            }
        }.build()
        
        return _CountdownTimer!!
    }

private var _CountdownTimer: ImageVector? = null

