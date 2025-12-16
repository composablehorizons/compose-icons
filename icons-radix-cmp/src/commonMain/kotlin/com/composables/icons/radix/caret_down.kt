package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CaretDown: ImageVector
    get() {
        if (_CaretDown != null) return _CaretDown!!
        
        _CaretDown = ImageVector.Builder(
            name = "caret-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50022f, 9.95001f)
                curveTo(7.6195f, 9.94996f, 7.73423f, 9.90252f, 7.81858f, 9.81818f)
                lineTo(10.8186f, 6.81818f)
                curveTo(10.9941f, 6.64242f, 10.9942f, 6.35713f, 10.8186f, 6.18146f)
                curveTo(10.6429f, 6.00579f, 10.3576f, 6.00592f, 10.1819f, 6.18146f)
                lineTo(7.50022f, 8.8631f)
                lineTo(4.81858f, 6.18146f)
                lineTo(4.74827f, 6.12384f)
                curveTo(4.57365f, 6.00838f, 4.33571f, 6.02779f, 4.18186f, 6.18146f)
                curveTo(4.02803f, 6.33529f, 4.00876f, 6.57318f, 4.12424f, 6.74786f)
                lineTo(4.18186f, 6.81818f)
                lineTo(7.18186f, 9.81818f)
                curveTo(7.26625f, 9.90257f, 7.38087f, 9.95001f, 7.50022f, 9.95001f)
                close()
            }
        }.build()
        
        return _CaretDown!!
    }

private var _CaretDown: ImageVector? = null

