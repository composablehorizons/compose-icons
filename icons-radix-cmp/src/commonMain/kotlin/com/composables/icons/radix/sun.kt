package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!
        
        _Sun = ImageVector.Builder(
            name = "sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 12f)
                curveTo(7.77614f, 12f, 8f, 12.2239f, 8f, 12.5f)
                verticalLineTo(14.5f)
                curveTo(8f, 14.7761f, 7.77614f, 15f, 7.5f, 15f)
                curveTo(7.22386f, 15f, 7f, 14.7761f, 7f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(7f, 12.2239f, 7.22386f, 12f, 7.5f, 12f)
                close()
                moveTo(3.61133f, 10.6816f)
                curveTo(3.80662f, 10.4868f, 4.12322f, 10.4865f, 4.31836f, 10.6816f)
                curveTo(4.5135f, 10.8768f, 4.51324f, 11.1934f, 4.31836f, 11.3887f)
                lineTo(2.90332f, 12.8037f)
                curveTo(2.70802f, 12.9985f, 2.3914f, 12.9988f, 2.19629f, 12.8037f)
                curveTo(2.00118f, 12.6086f, 2.00147f, 12.292f, 2.19629f, 12.0967f)
                lineTo(3.61133f, 10.6816f)
                close()
                moveTo(10.6816f, 10.6816f)
                curveTo(10.8768f, 10.4865f, 11.1934f, 10.4868f, 11.3887f, 10.6816f)
                lineTo(12.8037f, 12.0967f)
                curveTo(12.9985f, 12.292f, 12.9988f, 12.6086f, 12.8037f, 12.8037f)
                curveTo(12.6086f, 12.9988f, 12.292f, 12.9985f, 12.0967f, 12.8037f)
                lineTo(10.6816f, 11.3887f)
                curveTo(10.4868f, 11.1934f, 10.4865f, 10.8768f, 10.6816f, 10.6816f)
                close()
                moveTo(7.5f, 4.5f)
                curveTo(9.15685f, 4.5f, 10.5f, 5.84315f, 10.5f, 7.5f)
                curveTo(10.5f, 9.15685f, 9.15685f, 10.5f, 7.5f, 10.5f)
                curveTo(5.84315f, 10.5f, 4.5f, 9.15685f, 4.5f, 7.5f)
                curveTo(4.5f, 5.84315f, 5.84315f, 4.5f, 7.5f, 4.5f)
                close()
                moveTo(7.5f, 5.5f)
                curveTo(6.39543f, 5.5f, 5.5f, 6.39543f, 5.5f, 7.5f)
                curveTo(5.5f, 8.60457f, 6.39543f, 9.5f, 7.5f, 9.5f)
                curveTo(8.60457f, 9.5f, 9.5f, 8.60457f, 9.5f, 7.5f)
                curveTo(9.5f, 6.39543f, 8.60457f, 5.5f, 7.5f, 5.5f)
                close()
                moveTo(2.5f, 7f)
                curveTo(2.77614f, 7f, 3f, 7.22386f, 3f, 7.5f)
                curveTo(3f, 7.77614f, 2.77614f, 8f, 2.5f, 8f)
                horizontalLineTo(0.5f)
                curveTo(0.223858f, 8f, 0f, 7.77614f, 0f, 7.5f)
                curveTo(0f, 7.22386f, 0.223858f, 7f, 0.5f, 7f)
                horizontalLineTo(2.5f)
                close()
                moveTo(14.5f, 7f)
                curveTo(14.7761f, 7f, 15f, 7.22386f, 15f, 7.5f)
                curveTo(15f, 7.77614f, 14.7761f, 8f, 14.5f, 8f)
                horizontalLineTo(12.5f)
                curveTo(12.2239f, 8f, 12f, 7.77614f, 12f, 7.5f)
                curveTo(12f, 7.22386f, 12.2239f, 7f, 12.5f, 7f)
                horizontalLineTo(14.5f)
                close()
                moveTo(2.19629f, 2.19629f)
                curveTo(2.3914f, 2.00118f, 2.70802f, 2.00147f, 2.90332f, 2.19629f)
                lineTo(4.31836f, 3.61133f)
                curveTo(4.51324f, 3.80662f, 4.5135f, 4.12322f, 4.31836f, 4.31836f)
                curveTo(4.12322f, 4.5135f, 3.80662f, 4.51324f, 3.61133f, 4.31836f)
                lineTo(2.19629f, 2.90332f)
                curveTo(2.00147f, 2.70802f, 2.00118f, 2.3914f, 2.19629f, 2.19629f)
                close()
                moveTo(12.0967f, 2.19629f)
                curveTo(12.292f, 2.00147f, 12.6086f, 2.00118f, 12.8037f, 2.19629f)
                curveTo(12.9988f, 2.3914f, 12.9985f, 2.70802f, 12.8037f, 2.90332f)
                lineTo(11.3887f, 4.31836f)
                curveTo(11.1934f, 4.51324f, 10.8768f, 4.5135f, 10.6816f, 4.31836f)
                curveTo(10.4865f, 4.12322f, 10.4868f, 3.80662f, 10.6816f, 3.61133f)
                lineTo(12.0967f, 2.19629f)
                close()
                moveTo(7.5f, 0f)
                curveTo(7.77614f, 0f, 8f, 0.223858f, 8f, 0.5f)
                verticalLineTo(2.5f)
                curveTo(8f, 2.77614f, 7.77614f, 3f, 7.5f, 3f)
                curveTo(7.22386f, 3f, 7f, 2.77614f, 7f, 2.5f)
                verticalLineTo(0.5f)
                curveTo(7f, 0.223858f, 7.22386f, 0f, 7.5f, 0f)
                close()
            }
        }.build()
        
        return _Sun!!
    }

private var _Sun: ImageVector? = null

