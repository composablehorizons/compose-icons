package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircleSmall: ImageVector
    get() {
        if (_CircleSmall != null) return _CircleSmall!!
        
        _CircleSmall = ImageVector.Builder(
            name = "circle-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.83148f, 8.55539f)
                curveTo(8.72155f, 8.71992f, 8.56533f, 8.84812f, 8.38269f, 8.92378f)
                curveTo(8.20002f, 8.99944f, 7.99899f, 9.01924f, 7.80494f, 8.98064f)
                curveTo(7.61096f, 8.94205f, 7.43276f, 8.84681f, 7.29291f, 8.70696f)
                curveTo(7.15306f, 8.56711f, 7.05781f, 8.38891f, 7.01923f, 8.19492f)
                curveTo(6.98063f, 8.00088f, 7.00043f, 7.79984f, 7.07609f, 7.61718f)
                curveTo(7.15174f, 7.43454f, 7.27995f, 7.27832f, 7.44448f, 7.16838f)
                curveTo(7.60891f, 7.05851f, 7.80219f, 6.99988f, 7.99999f, 6.99988f)
                curveTo(8.26515f, 6.99988f, 8.51949f, 7.10523f, 8.70707f, 7.2928f)
                curveTo(8.89464f, 7.48037f, 8.99999f, 7.73471f, 8.99999f, 7.99988f)
                curveTo(8.99999f, 8.19767f, 8.94136f, 8.39095f, 8.83148f, 8.55539f)
                close()
                moveTo(9.66295f, 9.11096f)
                curveTo(9.88272f, 8.78206f, 9.99999f, 8.39544f, 9.99999f, 7.99988f)
                curveTo(9.99999f, 7.46944f, 9.78925f, 6.96077f, 9.41417f, 6.58569f)
                curveTo(9.0391f, 6.21062f, 8.53042f, 5.99988f, 7.99999f, 5.99988f)
                curveTo(7.60443f, 5.99988f, 7.2178f, 6.11715f, 6.88891f, 6.33691f)
                curveTo(6.56001f, 6.55668f, 6.30359f, 6.86904f, 6.15221f, 7.2345f)
                curveTo(6.00084f, 7.59995f, 5.96127f, 8.00205f, 6.03844f, 8.39001f)
                curveTo(6.11561f, 8.77798f, 6.3061f, 9.13436f, 6.5858f, 9.41406f)
                curveTo(6.86551f, 9.69377f, 7.22189f, 9.88426f, 7.60985f, 9.96143f)
                curveTo(7.99781f, 10.0386f, 8.39992f, 9.99903f, 8.76537f, 9.84766f)
                curveTo(9.13082f, 9.69628f, 9.44319f, 9.43986f, 9.66295f, 9.11096f)
                close()
            }
        }.build()
        
        return _CircleSmall!!
    }

private var _CircleSmall: ImageVector? = null

