package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugRestart: ImageVector
    get() {
        if (_DebugRestart != null) return _DebugRestart!!
        
        _DebugRestart = ImageVector.Builder(
            name = "debug-restart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 8f)
                curveTo(14f, 8.81f, 13.842f, 9.596f, 13.528f, 10.336f)
                curveTo(13.224f, 11.053f, 12.791f, 11.694f, 12.241f, 12.243f)
                curveTo(11.694f, 12.791f, 11.053f, 13.224f, 10.337f, 13.528f)
                curveTo(9.59602f, 13.841f, 8.81002f, 14f, 8.00002f, 14f)
                curveTo(7.19002f, 14f, 6.40402f, 13.842f, 5.66402f, 13.528f)
                curveTo(4.94702f, 13.224f, 4.30602f, 12.791f, 3.75702f, 12.242f)
                curveTo(3.20802f, 11.693f, 2.77602f, 11.053f, 2.47202f, 10.337f)
                curveTo(2.31002f, 9.956f, 2.48802f, 9.516f, 2.86902f, 9.354f)
                curveTo(3.25102f, 9.19f, 3.69002f, 9.37f, 3.85202f, 9.751f)
                curveTo(4.08102f, 10.288f, 4.40502f, 10.77f, 4.81802f, 11.181f)
                curveTo(5.23002f, 11.595f, 5.71202f, 11.919f, 6.24902f, 12.148f)
                curveTo(7.35602f, 12.615f, 8.64302f, 12.615f, 9.75202f, 12.148f)
                curveTo(10.288f, 11.919f, 10.77f, 11.595f, 11.181f, 11.183f)
                curveTo(11.595f, 10.77f, 11.919f, 10.288f, 12.148f, 9.751f)
                curveTo(12.381f, 9.197f, 12.501f, 8.608f, 12.501f, 8f)
                curveTo(12.501f, 7.392f, 12.382f, 6.803f, 12.148f, 6.248f)
                curveTo(11.919f, 5.712f, 11.595f, 5.23f, 11.182f, 4.819f)
                curveTo(10.77f, 4.405f, 10.288f, 4.081f, 9.75102f, 3.852f)
                curveTo(8.64402f, 3.385f, 7.35702f, 3.385f, 6.24802f, 3.852f)
                curveTo(5.71202f, 4.081f, 5.23002f, 4.405f, 4.81902f, 4.817f)
                curveTo(4.60802f, 5.027f, 4.42002f, 5.256f, 4.25702f, 5.5f)
                horizontalLineTo(6.24902f)
                curveTo(6.66302f, 5.5f, 6.99902f, 5.836f, 6.99902f, 6.25f)
                curveTo(6.99902f, 6.664f, 6.66302f, 7f, 6.24902f, 7f)
                horizontalLineTo(2.74902f)
                curveTo(2.33502f, 7f, 1.99902f, 6.664f, 1.99902f, 6.25f)
                verticalLineTo(2.75f)
                curveTo(1.99902f, 2.336f, 2.33502f, 2f, 2.74902f, 2f)
                curveTo(3.16302f, 2f, 3.49902f, 2.336f, 3.49902f, 2.75f)
                verticalLineTo(4.032f)
                curveTo(3.58202f, 3.938f, 3.66802f, 3.845f, 3.75802f, 3.757f)
                curveTo(4.30502f, 3.209f, 4.94602f, 2.776f, 5.66202f, 2.472f)
                curveTo(7.14402f, 1.845f, 8.85402f, 1.845f, 10.335f, 2.472f)
                curveTo(11.052f, 2.776f, 11.693f, 3.209f, 12.242f, 3.758f)
                curveTo(12.791f, 4.307f, 13.223f, 4.947f, 13.527f, 5.663f)
                curveTo(13.84f, 6.404f, 13.999f, 7.19f, 13.999f, 8f)
                horizontalLineTo(14f)
                close()
            }
        }.build()
        
        return _DebugRestart!!
    }

private var _DebugRestart: ImageVector? = null

