package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignCenterHorizontally: ImageVector
    get() {
        if (_AlignCenterHorizontally != null) return _AlignCenterHorizontally!!
        
        _AlignCenterHorizontally = ImageVector.Builder(
            name = "align-center-horizontally",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.9999f, 8.00001f)
                curveTo(13.9999f, 8.55229f, 13.5522f, 9.00001f, 12.9999f, 9.00001f)
                lineTo(7.99988f, 9.00001f)
                lineTo(7.99988f, 13.5f)
                curveTo(7.99988f, 13.7761f, 7.77602f, 14f, 7.49988f, 14f)
                curveTo(7.22374f, 14f, 6.99988f, 13.7761f, 6.99988f, 13.5f)
                lineTo(6.99988f, 9.00001f)
                lineTo(1.99988f, 9.00001f)
                curveTo(1.44759f, 9.00001f, 0.999878f, 8.55229f, 0.999878f, 8.00001f)
                lineTo(0.999878f, 7.00001f)
                curveTo(0.999878f, 6.44772f, 1.44759f, 6.00001f, 1.99988f, 6.00001f)
                lineTo(6.99988f, 6.00001f)
                lineTo(6.99988f, 1.50001f)
                curveTo(6.99988f, 1.22387f, 7.22374f, 1.00001f, 7.49988f, 1.00001f)
                curveTo(7.77602f, 1.00001f, 7.99988f, 1.22387f, 7.99988f, 1.50001f)
                lineTo(7.99988f, 6.00001f)
                lineTo(12.9999f, 6.00001f)
                curveTo(13.5522f, 6.00001f, 13.9999f, 6.44772f, 13.9999f, 7.00001f)
                lineTo(13.9999f, 8.00001f)
                close()
            }
        }.build()
        
        return _AlignCenterHorizontally!!
    }

private var _AlignCenterHorizontally: ImageVector? = null

