package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TrackNext: ImageVector
    get() {
        if (_TrackNext != null) return _TrackNext!!
        
        _TrackNext = ImageVector.Builder(
            name = "track-next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.4999f, 2.19987f)
                curveTo(12.8036f, 2.19987f, 13.0496f, 2.44601f, 13.0497f, 2.74968f)
                verticalLineTo(12.2497f)
                curveTo(13.0497f, 12.5534f, 12.8037f, 12.7995f, 12.4999f, 12.7995f)
                curveTo(12.1963f, 12.7994f, 11.9501f, 12.5534f, 11.9501f, 12.2497f)
                verticalLineTo(7.7155f)
                curveTo(11.9046f, 7.81069f, 11.83f, 7.89103f, 11.7333f, 7.94206f)
                lineTo(2.73334f, 12.6921f)
                curveTo(2.57839f, 12.7738f, 2.39217f, 12.7679f, 2.24213f, 12.6774f)
                curveTo(2.09212f, 12.5869f, 1.99994f, 12.4249f, 1.99994f, 12.2497f)
                verticalLineTo(2.74968f)
                curveTo(2.00003f, 2.57453f, 2.09212f, 2.41239f, 2.24213f, 2.32195f)
                curveTo(2.39212f, 2.23159f, 2.57845f, 2.22563f, 2.73334f, 2.3073f)
                lineTo(11.7333f, 7.0573f)
                curveTo(11.8299f, 7.10825f, 11.9046f, 7.18882f, 11.9501f, 7.28386f)
                verticalLineTo(2.74968f)
                curveTo(11.9502f, 2.44609f, 12.1964f, 2.20001f, 12.4999f, 2.19987f)
                close()
                moveTo(2.99994f, 11.4196f)
                lineTo(10.4277f, 7.49968f)
                lineTo(2.99994f, 3.57878f)
                verticalLineTo(11.4196f)
                close()
            }
        }.build()
        
        return _TrackNext!!
    }

private var _TrackNext: ImageVector? = null

