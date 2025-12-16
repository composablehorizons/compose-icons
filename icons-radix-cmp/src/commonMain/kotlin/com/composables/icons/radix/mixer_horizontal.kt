package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.MixerHorizontal: ImageVector
    get() {
        if (_MixerHorizontal != null) return _MixerHorizontal!!
        
        _MixerHorizontal = ImageVector.Builder(
            name = "mixer-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 8f)
                curveTo(10.7108f, 8f, 11.72f, 8.8609f, 11.9502f, 10.0039f)
                curveTo(11.9666f, 10.0023f, 11.9831f, 10f, 12f, 10f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 10f, 14f, 10.2239f, 14f, 10.5f)
                curveTo(14f, 10.7761f, 13.7761f, 11f, 13.5f, 11f)
                horizontalLineTo(12f)
                curveTo(11.9831f, 11f, 11.9667f, 10.9968f, 11.9502f, 10.9951f)
                curveTo(11.7204f, 12.1386f, 10.7112f, 13f, 9.5f, 13f)
                curveTo(8.28878f, 13f, 7.27856f, 12.1387f, 7.04883f, 10.9951f)
                curveTo(7.03268f, 10.9967f, 7.01656f, 11f, 7f, 11f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 11f, 1f, 10.7761f, 1f, 10.5f)
                curveTo(1f, 10.2239f, 1.22386f, 10f, 1.5f, 10f)
                horizontalLineTo(7f)
                curveTo(7.01653f, 10f, 7.03271f, 10.0023f, 7.04883f, 10.0039f)
                curveTo(7.27892f, 8.8608f, 8.28911f, 8f, 9.5f, 8f)
                close()
                moveTo(9.5f, 9f)
                curveTo(8.67157f, 9f, 8f, 9.67157f, 8f, 10.5f)
                curveTo(8f, 11.3284f, 8.67157f, 12f, 9.5f, 12f)
                curveTo(10.3284f, 12f, 11f, 11.3284f, 11f, 10.5f)
                curveTo(11f, 9.67157f, 10.3284f, 9f, 9.5f, 9f)
                close()
                moveTo(5.5f, 2f)
                curveTo(6.71082f, 2f, 7.72003f, 2.8609f, 7.9502f, 4.00391f)
                curveTo(7.96662f, 4.00228f, 7.98314f, 4f, 8f, 4f)
                horizontalLineTo(13.5f)
                lineTo(13.6006f, 4.00977f)
                curveTo(13.8286f, 4.05629f, 14f, 4.25829f, 14f, 4.5f)
                curveTo(14f, 4.74171f, 13.8286f, 4.94371f, 13.6006f, 4.99023f)
                lineTo(13.5f, 5f)
                horizontalLineTo(8f)
                curveTo(7.98311f, 5f, 7.96665f, 4.99675f, 7.9502f, 4.99512f)
                curveTo(7.72039f, 6.13859f, 6.71115f, 7f, 5.5f, 7f)
                curveTo(4.28878f, 7f, 3.27856f, 6.13869f, 3.04883f, 4.99512f)
                curveTo(3.03268f, 4.99669f, 3.01656f, 5f, 3f, 5f)
                horizontalLineTo(1.5f)
                curveTo(1.22386f, 5f, 1f, 4.77614f, 1f, 4.5f)
                curveTo(1f, 4.22386f, 1.22386f, 4f, 1.5f, 4f)
                horizontalLineTo(3f)
                curveTo(3.01653f, 4f, 3.03271f, 4.00234f, 3.04883f, 4.00391f)
                curveTo(3.27892f, 2.8608f, 4.28911f, 2f, 5.5f, 2f)
                close()
                moveTo(5.5f, 3f)
                curveTo(4.67157f, 3f, 4f, 3.67157f, 4f, 4.5f)
                curveTo(4f, 5.32843f, 4.67157f, 6f, 5.5f, 6f)
                curveTo(6.32843f, 6f, 7f, 5.32843f, 7f, 4.5f)
                curveTo(7f, 3.67157f, 6.32843f, 3f, 5.5f, 3f)
                close()
            }
        }.build()
        
        return _MixerHorizontal!!
    }

private var _MixerHorizontal: ImageVector? = null

