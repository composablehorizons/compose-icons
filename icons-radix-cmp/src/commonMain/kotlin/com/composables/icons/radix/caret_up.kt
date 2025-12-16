package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.CaretUp: ImageVector
    get() {
        if (_CaretUp != null) return _CaretUp!!
        
        _CaretUp = ImageVector.Builder(
            name = "caret-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.50022f, 5.04999f)
                curveTo(7.6195f, 5.05004f, 7.73423f, 5.09748f, 7.81858f, 5.18182f)
                lineTo(10.8186f, 8.18182f)
                curveTo(10.9941f, 8.35758f, 10.9942f, 8.64287f, 10.8186f, 8.81854f)
                curveTo(10.6429f, 8.99421f, 10.3576f, 8.99408f, 10.1819f, 8.81854f)
                lineTo(7.50022f, 6.1369f)
                lineTo(4.81858f, 8.81854f)
                lineTo(4.74827f, 8.87616f)
                curveTo(4.57365f, 8.99162f, 4.33571f, 8.97221f, 4.18186f, 8.81854f)
                curveTo(4.02803f, 8.66471f, 4.00876f, 8.42682f, 4.12424f, 8.25214f)
                lineTo(4.18186f, 8.18182f)
                lineTo(7.18186f, 5.18182f)
                curveTo(7.26625f, 5.09743f, 7.38087f, 5.04999f, 7.50022f, 5.04999f)
                close()
            }
        }.build()
        
        return _CaretUp!!
    }

private var _CaretUp: ImageVector? = null

