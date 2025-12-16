package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.TrackPrevious: ImageVector
    get() {
        if (_TrackPrevious != null) return _TrackPrevious!!
        
        _TrackPrevious = ImageVector.Builder(
            name = "track-previous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.50006f, 2.19987f)
                curveTo(2.19637f, 2.19987f, 1.95036f, 2.44601f, 1.95026f, 2.74968f)
                verticalLineTo(12.2497f)
                curveTo(1.95026f, 12.5534f, 2.1963f, 12.7995f, 2.50006f, 12.7995f)
                curveTo(2.80371f, 12.7994f, 3.04987f, 12.5534f, 3.04987f, 12.2497f)
                verticalLineTo(7.7155f)
                curveTo(3.09541f, 7.81069f, 3.17002f, 7.89103f, 3.26666f, 7.94206f)
                lineTo(12.2667f, 12.6921f)
                curveTo(12.4216f, 12.7738f, 12.6078f, 12.7679f, 12.7579f, 12.6774f)
                curveTo(12.9079f, 12.5869f, 13.0001f, 12.4249f, 13.0001f, 12.2497f)
                verticalLineTo(2.74968f)
                curveTo(13f, 2.57453f, 12.9079f, 2.41239f, 12.7579f, 2.32195f)
                curveTo(12.6079f, 2.23159f, 12.4216f, 2.22563f, 12.2667f, 2.3073f)
                lineTo(3.26666f, 7.0573f)
                curveTo(3.17011f, 7.10825f, 3.09545f, 7.18882f, 3.04987f, 7.28386f)
                verticalLineTo(2.74968f)
                curveTo(3.04976f, 2.44609f, 2.80364f, 2.20001f, 2.50006f, 2.19987f)
                close()
                moveTo(12.0001f, 11.4196f)
                lineTo(4.57233f, 7.49968f)
                lineTo(12.0001f, 3.57878f)
                verticalLineTo(11.4196f)
                close()
            }
        }.build()
        
        return _TrackPrevious!!
    }

private var _TrackPrevious: ImageVector? = null

