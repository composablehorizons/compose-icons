package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.17683f, 1.11898f)
                curveTo(1.32953f, 0.989634f, 1.54464f, 0.963786f, 1.72363f, 1.05328f)
                lineTo(14.7236f, 7.55328f)
                curveTo(14.893f, 7.63797f, 15f, 7.8111f, 15f, 8.00049f)
                curveTo(15f, 8.18987f, 14.893f, 8.36301f, 14.7236f, 8.4477f)
                lineTo(1.72363f, 14.9477f)
                curveTo(1.54464f, 15.0372f, 1.32953f, 15.0113f, 1.17683f, 14.882f)
                curveTo(1.02414f, 14.7526f, 0.96328f, 14.5447f, 1.02213f, 14.3534f)
                lineTo(2.97688f, 8.00049f)
                lineTo(1.02213f, 1.64754f)
                curveTo(0.96328f, 1.45627f, 1.02414f, 1.24833f, 1.17683f, 1.11898f)
                close()
                moveTo(3.8693f, 8.50049f)
                lineTo(2.32155f, 13.5307f)
                lineTo(13.382f, 8.00049f)
                lineTo(2.32155f, 2.47027f)
                lineTo(3.8693f, 7.50049f)
                horizontalLineTo(9.50001f)
                curveTo(9.77615f, 7.50049f, 10f, 7.72435f, 10f, 8.00049f)
                curveTo(10f, 8.27663f, 9.77615f, 8.50049f, 9.50001f, 8.50049f)
                horizontalLineTo(3.8693f)
                close()
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

