package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Beaker: ImageVector
    get() {
        if (_Beaker != null) return _Beaker!!
        
        _Beaker = ImageVector.Builder(
            name = "beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 0.998993f)
                curveTo(12.276f, 0.998993f, 12.5f, 1.22299f, 12.5f, 1.49899f)
                curveTo(12.5f, 1.77499f, 12.276f, 1.99899f, 12f, 1.99899f)
                horizontalLineTo(11.004f)
                verticalLineTo(6.68299f)
                curveTo(11.004f, 7.26299f, 11.148f, 7.83299f, 11.423f, 8.34299f)
                lineTo(13.819f, 12.789f)
                curveTo(14.358f, 13.788f, 13.634f, 15.001f, 12.499f, 15.001f)
                horizontalLineTo(3.50101f)
                curveTo(2.36501f, 15.001f, 1.64301f, 13.788f, 2.18101f, 12.789f)
                lineTo(4.57501f, 8.34499f)
                curveTo(4.85001f, 7.83499f, 4.99401f, 7.26399f, 4.99401f, 6.68499f)
                verticalLineTo(1.99899f)
                horizontalLineTo(4.00001f)
                curveTo(3.72401f, 1.99899f, 3.50001f, 1.77499f, 3.50001f, 1.49899f)
                curveTo(3.50001f, 1.22299f, 3.72401f, 0.998993f, 4.00001f, 0.998993f)
                horizontalLineTo(12f)
                close()
                moveTo(5.99401f, 1.99899f)
                verticalLineTo(6.68599f)
                curveTo(5.99401f, 7.43099f, 5.80901f, 8.16399f, 5.45601f, 8.81999f)
                lineTo(4.82101f, 9.99899f)
                horizontalLineTo(11.18f)
                lineTo(10.543f, 8.81699f)
                curveTo(10.19f, 8.16099f, 10.005f, 7.42799f, 10.005f, 6.68199f)
                verticalLineTo(1.99899f)
                horizontalLineTo(5.99401f)
                close()
                moveTo(11.718f, 10.999f)
                horizontalLineTo(4.28201f)
                lineTo(3.06201f, 13.263f)
                curveTo(2.88201f, 13.597f, 3.12401f, 14f, 3.50201f, 14f)
                horizontalLineTo(12.499f)
                curveTo(12.877f, 14f, 13.119f, 13.596f, 12.939f, 13.263f)
                lineTo(11.718f, 10.999f)
                close()
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

