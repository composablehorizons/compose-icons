package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Edit: ImageVector
    get() {
        if (_Edit != null) return _Edit!!
        
        _Edit = ImageVector.Builder(
            name = "edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.236f, 1.76386f)
                curveTo(13.2123f, 0.740172f, 11.5525f, 0.740171f, 10.5289f, 1.76386f)
                lineTo(2.65722f, 9.63549f)
                curveTo(2.28304f, 10.0097f, 2.01623f, 10.4775f, 1.88467f, 10.99f)
                lineTo(1.01571f, 14.3755f)
                curveTo(0.971767f, 14.5467f, 1.02148f, 14.7284f, 1.14646f, 14.8534f)
                curveTo(1.27144f, 14.9783f, 1.45312f, 15.028f, 1.62432f, 14.9841f)
                lineTo(5.00978f, 14.1151f)
                curveTo(5.52234f, 13.9836f, 5.99015f, 13.7168f, 6.36433f, 13.3426f)
                lineTo(14.236f, 5.47097f)
                curveTo(15.2596f, 4.44728f, 15.2596f, 2.78755f, 14.236f, 1.76386f)
                close()
                moveTo(11.236f, 2.47097f)
                curveTo(11.8691f, 1.8378f, 12.8957f, 1.8378f, 13.5288f, 2.47097f)
                curveTo(14.162f, 3.10413f, 14.162f, 4.1307f, 13.5288f, 4.76386f)
                lineTo(12.75f, 5.54269f)
                lineTo(10.4571f, 3.24979f)
                lineTo(11.236f, 2.47097f)
                close()
                moveTo(9.75002f, 3.9569f)
                lineTo(12.0429f, 6.24979f)
                lineTo(5.65722f, 12.6355f)
                curveTo(5.40969f, 12.883f, 5.10023f, 13.0595f, 4.76117f, 13.1465f)
                lineTo(2.19447f, 13.8053f)
                lineTo(2.85327f, 11.2386f)
                curveTo(2.9403f, 10.8996f, 3.1168f, 10.5901f, 3.36433f, 10.3426f)
                lineTo(9.75002f, 3.9569f)
                close()
            }
        }.build()
        
        return _Edit!!
    }

private var _Edit: ImageVector? = null

