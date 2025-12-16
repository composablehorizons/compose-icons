package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.StarFull: ImageVector
    get() {
        if (_StarFull != null) return _StarFull!!
        
        _StarFull = ImageVector.Builder(
            name = "star-full",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.022f, 7.25497f)
                lineTo(12.203f, 10.003f)
                lineTo(12.869f, 13.883f)
                curveTo(12.917f, 14.165f, 12.844f, 14.438f, 12.664f, 14.654f)
                curveTo(12.479f, 14.872f, 12.205f, 15.001f, 11.929f, 15.001f)
                curveTo(11.775f, 15.001f, 11.626f, 14.963f, 11.485f, 14.89f)
                lineTo(8.00101f, 13.057f)
                lineTo(4.51701f, 14.889f)
                curveTo(4.13401f, 15.093f, 3.62401f, 14.991f, 3.34001f, 14.657f)
                curveTo(3.15801f, 14.439f, 3.08501f, 14.165f, 3.13201f, 13.884f)
                lineTo(3.79801f, 10.004f)
                lineTo(0.979007f, 7.25597f)
                curveTo(0.714007f, 6.99797f, 0.624007f, 6.63297f, 0.737007f, 6.27997f)
                curveTo(0.853007f, 5.92497f, 1.14001f, 5.68197f, 1.50701f, 5.62797f)
                lineTo(5.40301f, 5.06197f)
                lineTo(7.14501f, 1.53197f)
                curveTo(7.47301f, 0.865971f, 8.52801f, 0.865971f, 8.85601f, 1.53197f)
                lineTo(10.598f, 5.06197f)
                lineTo(14.494f, 5.62797f)
                curveTo(14.862f, 5.68197f, 15.149f, 5.92397f, 15.264f, 6.27597f)
                curveTo(15.378f, 6.63197f, 15.286f, 6.99697f, 15.022f, 7.25497f)
                close()
            }
        }.build()
        
        return _StarFull!!
    }

private var _StarFull: ImageVector? = null

