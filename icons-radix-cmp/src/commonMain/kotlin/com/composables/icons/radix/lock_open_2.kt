package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LockOpen2: ImageVector
    get() {
        if (_LockOpen2 != null) return _LockOpen2!!
        
        _LockOpen2 = ImageVector.Builder(
            name = "lock-open-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.501f, 7.62939E-6f)
                curveTo(12.6739f, 7.62939E-6f, 13.6392f, 0.389221f, 14.2627f, 1.19337f)
                lineTo(14.3535f, 1.31641f)
                curveTo(14.7916f, 1.94395f, 14.9999f, 2.74153f, 15f, 3.63282f)
                horizontalLineTo(14f)
                curveTo(13.9999f, 2.94151f, 13.8493f, 2.38801f, 13.5898f, 1.97462f)
                lineTo(13.4727f, 1.80665f)
                curveTo(13.0843f, 1.3058f, 12.4481f, 1.00001f, 11.501f, 1.00001f)
                curveTo(10.643f, 1.0001f, 10.0366f, 1.26538f, 9.6416f, 1.68653f)
                curveTo(9.24224f, 2.11237f, 9.00005f, 2.7604f, 9f, 3.63575f)
                verticalLineTo(6.00001f)
                horizontalLineTo(10f)
                curveTo(10.5523f, 6.00001f, 11f, 6.44772f, 11f, 7.00001f)
                verticalLineTo(13f)
                curveTo(11f, 13.5523f, 10.5523f, 14f, 10f, 14f)
                horizontalLineTo(1f)
                curveTo(0.447715f, 14f, 1.20798E-8f, 13.5523f, 0f, 13f)
                verticalLineTo(7.00001f)
                curveTo(1.12745E-6f, 6.44772f, 0.447716f, 6.00001f, 1f, 6.00001f)
                horizontalLineTo(8f)
                verticalLineTo(3.63575f)
                curveTo(8.00005f, 2.5812f, 8.29349f, 1.66147f, 8.91211f, 1.00196f)
                curveTo(9.53507f, 0.337846f, 10.4292f, 9.70384E-5f, 11.501f, 7.62939E-6f)
                close()
                moveTo(1f, 13f)
                horizontalLineTo(10f)
                verticalLineTo(7.00001f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _LockOpen2!!
    }

private var _LockOpen2: ImageVector? = null

