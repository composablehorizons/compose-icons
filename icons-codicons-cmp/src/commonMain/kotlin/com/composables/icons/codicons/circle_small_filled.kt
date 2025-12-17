package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CircleSmallFilled: ImageVector
    get() {
        if (_CircleSmallFilled != null) return _CircleSmallFilled!!
        
        _CircleSmallFilled = ImageVector.Builder(
            name = "circle-small-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.99999f, 7.99988f)
                curveTo(9.99999f, 8.39544f, 9.88272f, 8.78206f, 9.66295f, 9.11096f)
                curveTo(9.44319f, 9.43986f, 9.13082f, 9.69628f, 8.76537f, 9.84766f)
                curveTo(8.39992f, 9.99903f, 7.99781f, 10.0386f, 7.60985f, 9.96143f)
                curveTo(7.22189f, 9.88426f, 6.86551f, 9.69377f, 6.5858f, 9.41406f)
                curveTo(6.3061f, 9.13436f, 6.11561f, 8.77798f, 6.03844f, 8.39001f)
                curveTo(5.96127f, 8.00205f, 6.00084f, 7.59995f, 6.15221f, 7.2345f)
                curveTo(6.30359f, 6.86904f, 6.56001f, 6.55668f, 6.88891f, 6.33691f)
                curveTo(7.2178f, 6.11715f, 7.60443f, 5.99988f, 7.99999f, 5.99988f)
                curveTo(8.53042f, 5.99988f, 9.0391f, 6.21062f, 9.41417f, 6.58569f)
                curveTo(9.78925f, 6.96077f, 9.99999f, 7.46944f, 9.99999f, 7.99988f)
                close()
            }
        }.build()
        
        return _CircleSmallFilled!!
    }

private var _CircleSmallFilled: ImageVector? = null

