package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.BellDot: ImageVector
    get() {
        if (_BellDot != null) return _BellDot!!
        
        _BellDot = ImageVector.Builder(
            name = "bell-dot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 9.90099f)
                verticalLineTo(7.87299f)
                curveTo(12.68f, 7.95599f, 12.345f, 7.99899f, 12f, 7.99899f)
                verticalLineTo(9.99699f)
                curveTo(12f, 10.061f, 12.012f, 10.124f, 12.036f, 10.183f)
                lineTo(12.762f, 12f)
                horizontalLineTo(3.238f)
                lineTo(3.964f, 10.183f)
                curveTo(3.988f, 10.124f, 4f, 10.061f, 4f, 9.99699f)
                verticalLineTo(5.99899f)
                curveTo(4f, 3.79299f, 5.794f, 1.99899f, 8f, 1.99899f)
                curveTo(8.175f, 1.99899f, 8.34799f, 2.00999f, 8.51799f, 2.03199f)
                curveTo(8.70299f, 1.70499f, 8.934f, 1.40599f, 9.2f, 1.14499f)
                curveTo(8.81499f, 1.04999f, 8.413f, 0.998993f, 8f, 0.998993f)
                curveTo(5.243f, 0.998993f, 3f, 3.24199f, 3f, 5.99899f)
                verticalLineTo(9.89999f)
                lineTo(2.036f, 12.313f)
                curveTo(1.974f, 12.467f, 1.993f, 12.641f, 2.086f, 12.779f)
                curveTo(2.179f, 12.916f, 2.334f, 12.999f, 2.5f, 12.999f)
                horizontalLineTo(5.99999f)
                curveTo(5.99999f, 14.107f, 6.892f, 14.999f, 8f, 14.999f)
                curveTo(9.108f, 14.999f, 10f, 14.107f, 10f, 12.999f)
                horizontalLineTo(13.5f)
                curveTo(13.666f, 12.999f, 13.821f, 12.917f, 13.914f, 12.779f)
                curveTo(14.007f, 12.642f, 14.026f, 12.467f, 13.964f, 12.313f)
                lineTo(13f, 9.89999f)
                verticalLineTo(9.90099f)
                close()
                moveTo(8f, 14f)
                curveTo(7.444f, 14f, 7f, 13.556f, 7f, 13f)
                horizontalLineTo(9f)
                curveTo(9f, 13.556f, 8.55599f, 14f, 8f, 14f)
                close()
                moveTo(15f, 3.99999f)
                curveTo(15f, 5.65699f, 13.657f, 6.99999f, 12f, 6.99999f)
                curveTo(10.343f, 6.99999f, 9f, 5.65699f, 9f, 3.99999f)
                curveTo(9f, 2.34299f, 10.343f, 0.999993f, 12f, 0.999993f)
                curveTo(13.657f, 0.999993f, 15f, 2.34299f, 15f, 3.99999f)
                close()
            }
        }.build()
        
        return _BellDot!!
    }

private var _BellDot: ImageVector? = null

