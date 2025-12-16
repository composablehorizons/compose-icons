package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.AlignCenterVertically: ImageVector
    get() {
        if (_AlignCenterVertically != null) return _AlignCenterVertically!!
        
        _AlignCenterVertically = ImageVector.Builder(
            name = "align-center-vertically",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.99988f, 1.00001f)
                curveTo(8.55216f, 1.00001f, 8.99988f, 1.44772f, 8.99988f, 2.00001f)
                verticalLineTo(7.00001f)
                horizontalLineTo(13.4999f)
                curveTo(13.776f, 7.00001f, 13.9999f, 7.22387f, 13.9999f, 7.50001f)
                curveTo(13.9999f, 7.77615f, 13.776f, 8.00001f, 13.4999f, 8.00001f)
                horizontalLineTo(8.99988f)
                verticalLineTo(13f)
                curveTo(8.99988f, 13.5523f, 8.55216f, 14f, 7.99988f, 14f)
                horizontalLineTo(6.99988f)
                curveTo(6.44759f, 14f, 5.99988f, 13.5523f, 5.99988f, 13f)
                verticalLineTo(8.00001f)
                horizontalLineTo(1.49988f)
                curveTo(1.22374f, 8.00001f, 0.999878f, 7.77615f, 0.999878f, 7.50001f)
                curveTo(0.999878f, 7.22387f, 1.22374f, 7.00001f, 1.49988f, 7.00001f)
                horizontalLineTo(5.99988f)
                verticalLineTo(2.00001f)
                curveTo(5.99988f, 1.44772f, 6.44759f, 1.00001f, 6.99988f, 1.00001f)
                horizontalLineTo(7.99988f)
                close()
            }
        }.build()
        
        return _AlignCenterVertically!!
    }

private var _AlignCenterVertically: ImageVector? = null

