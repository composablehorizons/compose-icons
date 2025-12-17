package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ColorMode: ImageVector
    get() {
        if (_ColorMode != null) return _ColorMode!!
        
        _ColorMode = ImageVector.Builder(
            name = "color-mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1.00195f)
                curveTo(6.61553f, 1.00195f, 5.26216f, 1.4125f, 4.11101f, 2.18167f)
                curveTo(2.95987f, 2.95084f, 2.06266f, 4.04409f, 1.53285f, 5.32317f)
                curveTo(1.00303f, 6.60225f, 0.86441f, 8.00972f, 1.13451f, 9.36759f)
                curveTo(1.4046f, 10.7255f, 2.07129f, 11.9727f, 3.05026f, 12.9517f)
                curveTo(4.02922f, 13.9307f, 5.27651f, 14.5974f, 6.63437f, 14.8675f)
                curveTo(7.99224f, 15.1375f, 9.3997f, 14.9989f, 10.6788f, 14.4691f)
                curveTo(11.9579f, 13.9393f, 13.0511f, 13.0421f, 13.8203f, 11.8909f)
                curveTo(14.5895f, 10.7398f, 15f, 9.38642f, 15f, 8.00195f)
                curveTo(15f, 6.14544f, 14.2625f, 4.36496f, 12.9498f, 3.05221f)
                curveTo(11.637f, 1.73945f, 9.85652f, 1.00195f, 8f, 1.00195f)
                close()
                moveTo(8f, 14.002f)
                verticalLineTo(2.00195f)
                curveTo(9.5913f, 2.00195f, 11.1174f, 2.63409f, 12.2426f, 3.75931f)
                curveTo(13.3679f, 4.88453f, 14f, 6.41065f, 14f, 8.00195f)
                curveTo(14f, 9.59325f, 13.3679f, 11.1194f, 12.2426f, 12.2446f)
                curveTo(11.1174f, 13.3698f, 9.5913f, 14.002f, 8f, 14.002f)
                close()
            }
        }.build()
        
        return _ColorMode!!
    }

private var _ColorMode: ImageVector? = null

