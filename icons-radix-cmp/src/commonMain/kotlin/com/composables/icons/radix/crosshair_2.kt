package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Crosshair2: ImageVector
    get() {
        if (_Crosshair2 != null) return _Crosshair2!!
        
        _Crosshair2 = ImageVector.Builder(
            name = "crosshair-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 0f)
                curveTo(7.77614f, 0f, 8f, 0.223858f, 8f, 0.5f)
                verticalLineTo(1.80762f)
                curveTo(10.6919f, 2.09438f, 12.8147f, 4.28034f, 13.0049f, 7f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 7f, 15f, 7.22386f, 15f, 7.5f)
                curveTo(15f, 7.77614f, 14.7761f, 8f, 14.5f, 8f)
                horizontalLineTo(12.9873f)
                curveTo(12.7077f, 10.624f, 10.624f, 12.7077f, 8f, 12.9873f)
                verticalLineTo(14.5f)
                curveTo(8f, 14.7761f, 7.77614f, 15f, 7.5f, 15f)
                curveTo(7.22386f, 15f, 7f, 14.7761f, 7f, 14.5f)
                verticalLineTo(13.0039f)
                curveTo(4.28041f, 12.8137f, 2.09539f, 10.6919f, 1.80859f, 8f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 8f, 0f, 7.77614f, 0f, 7.5f)
                curveTo(0f, 7.22386f, 0.223858f, 7f, 0.5f, 7f)
                horizontalLineTo(1.79102f)
                curveTo(1.98595f, 4.21179f, 4.21179f, 1.98595f, 7f, 1.79102f)
                verticalLineTo(0.5f)
                curveTo(7f, 0.223858f, 7.22386f, 0f, 7.5f, 0f)
                close()
                moveTo(7f, 2.74219f)
                curveTo(4.73667f, 2.93307f, 2.93409f, 4.73668f, 2.74316f, 7f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 7f, 6f, 7.22386f, 6f, 7.5f)
                curveTo(6f, 7.77614f, 5.77614f, 8f, 5.5f, 8f)
                horizontalLineTo(2.76465f)
                curveTo(3.0437f, 10.1665f, 4.8054f, 11.8667f, 7f, 12.0518f)
                verticalLineTo(9.5f)
                curveTo(7f, 9.22386f, 7.22386f, 9f, 7.5f, 9f)
                curveTo(7.77614f, 9f, 8f, 9.22386f, 8f, 9.5f)
                verticalLineTo(12.0303f)
                curveTo(10.0987f, 11.76f, 11.76f, 10.0987f, 12.0303f, 8f)
                horizontalLineTo(9.5f)
                curveTo(9.22386f, 8f, 9f, 7.77614f, 9f, 7.5f)
                curveTo(9f, 7.22386f, 9.22386f, 7f, 9.5f, 7f)
                horizontalLineTo(12.0518f)
                curveTo(11.8667f, 4.8054f, 10.1665f, 3.0437f, 8f, 2.76465f)
                verticalLineTo(5.5f)
                curveTo(8f, 5.77614f, 7.77614f, 6f, 7.5f, 6f)
                curveTo(7.22386f, 6f, 7f, 5.77614f, 7f, 5.5f)
                verticalLineTo(2.74219f)
                close()
            }
        }.build()
        
        return _Crosshair2!!
    }

private var _Crosshair2: ImageVector? = null

