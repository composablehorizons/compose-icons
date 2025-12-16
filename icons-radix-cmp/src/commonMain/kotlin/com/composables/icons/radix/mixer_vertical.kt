package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.MixerVertical: ImageVector
    get() {
        if (_MixerVertical != null) return _MixerVertical!!
        
        _MixerVertical = ImageVector.Builder(
            name = "mixer-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 1f)
                curveTo(4.74171f, 1f, 4.94371f, 1.17145f, 4.99023f, 1.39941f)
                lineTo(5f, 1.5f)
                verticalLineTo(7f)
                curveTo(5f, 7.01656f, 4.99669f, 7.03268f, 4.99512f, 7.04883f)
                curveTo(6.13869f, 7.27856f, 7f, 8.28878f, 7f, 9.5f)
                curveTo(7f, 10.7112f, 6.13859f, 11.7204f, 4.99512f, 11.9502f)
                lineTo(5f, 12f)
                verticalLineTo(13.5f)
                lineTo(4.99023f, 13.6006f)
                curveTo(4.94371f, 13.8286f, 4.74171f, 14f, 4.5f, 14f)
                curveTo(4.25829f, 14f, 4.05629f, 13.8286f, 4.00977f, 13.6006f)
                lineTo(4f, 13.5f)
                verticalLineTo(12f)
                curveTo(4f, 11.9831f, 4.00228f, 11.9666f, 4.00391f, 11.9502f)
                curveTo(2.8609f, 11.72f, 2f, 10.7108f, 2f, 9.5f)
                curveTo(2f, 8.28911f, 2.8608f, 7.27892f, 4.00391f, 7.04883f)
                lineTo(4f, 7f)
                verticalLineTo(1.5f)
                curveTo(4f, 1.22386f, 4.22386f, 1f, 4.5f, 1f)
                close()
                moveTo(10.5f, 1f)
                curveTo(10.7417f, 1f, 10.9437f, 1.17145f, 10.9902f, 1.39941f)
                lineTo(11f, 1.5f)
                verticalLineTo(3f)
                lineTo(10.9951f, 3.04883f)
                curveTo(12.1387f, 3.27856f, 13f, 4.28878f, 13f, 5.5f)
                curveTo(13f, 6.71115f, 12.1386f, 7.72039f, 10.9951f, 7.9502f)
                lineTo(11f, 8f)
                verticalLineTo(13.5f)
                curveTo(11f, 13.7761f, 10.7761f, 14f, 10.5f, 14f)
                curveTo(10.2583f, 14f, 10.0563f, 13.8286f, 10.0098f, 13.6006f)
                lineTo(10f, 13.5f)
                verticalLineTo(8f)
                curveTo(10f, 7.98314f, 10.0023f, 7.96662f, 10.0039f, 7.9502f)
                curveTo(8.8609f, 7.72003f, 8f, 6.71082f, 8f, 5.5f)
                curveTo(8f, 4.28911f, 8.8608f, 3.27892f, 10.0039f, 3.04883f)
                lineTo(10f, 3f)
                verticalLineTo(1.5f)
                curveTo(10f, 1.22386f, 10.2239f, 1f, 10.5f, 1f)
                close()
                moveTo(4.5f, 8f)
                curveTo(3.67157f, 8f, 3f, 8.67157f, 3f, 9.5f)
                curveTo(3f, 10.3284f, 3.67157f, 11f, 4.5f, 11f)
                curveTo(5.32843f, 11f, 6f, 10.3284f, 6f, 9.5f)
                curveTo(6f, 8.67157f, 5.32843f, 8f, 4.5f, 8f)
                close()
                moveTo(10.5f, 4f)
                curveTo(9.67157f, 4f, 9f, 4.67157f, 9f, 5.5f)
                curveTo(9f, 6.32843f, 9.67157f, 7f, 10.5f, 7f)
                curveTo(11.3284f, 7f, 12f, 6.32843f, 12f, 5.5f)
                curveTo(12f, 4.67157f, 11.3284f, 4f, 10.5f, 4f)
                close()
            }
        }.build()
        
        return _MixerVertical!!
    }

private var _MixerVertical: ImageVector? = null

