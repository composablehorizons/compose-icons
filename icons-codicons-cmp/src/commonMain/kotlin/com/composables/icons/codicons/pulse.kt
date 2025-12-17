package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Pulse: ImageVector
    get() {
        if (_Pulse != null) return _Pulse!!
        
        _Pulse = ImageVector.Builder(
            name = "pulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.76002f, 2.49999f)
                curveTo(5.98102f, 2.50399f, 6.17302f, 2.65399f, 6.23202f, 2.86699f)
                lineTo(8.52102f, 11.19f)
                lineTo(10.271f, 5.35599f)
                curveTo(10.332f, 5.15399f, 10.513f, 5.01099f, 10.724f, 4.99999f)
                curveTo(10.935f, 4.98899f, 11.13f, 5.11199f, 11.211f, 5.30699f)
                lineTo(12.333f, 7.99899f)
                horizontalLineTo(14f)
                curveTo(14.276f, 7.99899f, 14.5f, 8.22299f, 14.5f, 8.49899f)
                curveTo(14.5f, 8.77499f, 14.276f, 8.99899f, 14f, 8.99899f)
                horizontalLineTo(12f)
                curveTo(11.798f, 8.99899f, 11.616f, 8.87799f, 11.538f, 8.69099f)
                lineTo(10.826f, 6.98299f)
                lineTo(8.97802f, 13.142f)
                curveTo(8.91402f, 13.356f, 8.71602f, 13.501f, 8.49302f, 13.498f)
                curveTo(8.27002f, 13.495f, 8.07602f, 13.346f, 8.01702f, 13.131f)
                lineTo(5.71402f, 4.75699f)
                lineTo(4.47502f, 8.64999f)
                curveTo(4.40902f, 8.85799f, 4.21602f, 8.99799f, 3.99902f, 8.99799f)
                horizontalLineTo(1.99902f)
                curveTo(1.72302f, 8.99799f, 1.49902f, 8.77399f, 1.49902f, 8.49799f)
                curveTo(1.49902f, 8.22199f, 1.72302f, 7.99799f, 1.99902f, 7.99799f)
                horizontalLineTo(3.63302f)
                lineTo(5.27202f, 2.84599f)
                curveTo(5.33902f, 2.63499f, 5.53702f, 2.49299f, 5.75802f, 2.49799f)
                lineTo(5.76002f, 2.49999f)
                close()
            }
        }.build()
        
        return _Pulse!!
    }

private var _Pulse: ImageVector? = null

