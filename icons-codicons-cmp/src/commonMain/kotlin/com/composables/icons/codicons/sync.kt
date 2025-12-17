package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Sync: ImageVector
    get() {
        if (_Sync != null) return _Sync!!
        
        _Sync = ImageVector.Builder(
            name = "sync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.14645f, 0.646447f)
                curveTo(7.34171f, 0.451184f, 7.65829f, 0.451184f, 7.85355f, 0.646447f)
                lineTo(9.35355f, 2.14645f)
                curveTo(9.54882f, 2.34171f, 9.54882f, 2.65829f, 9.35355f, 2.85355f)
                lineTo(7.85355f, 4.35355f)
                curveTo(7.65829f, 4.54882f, 7.34171f, 4.54882f, 7.14645f, 4.35355f)
                curveTo(6.95118f, 4.15829f, 6.95118f, 3.84171f, 7.14645f, 3.64645f)
                lineTo(7.7885f, 3.00439f)
                curveTo(5.12517f, 3.11522f, 3f, 5.30943f, 3f, 8f)
                curveTo(3f, 9.56799f, 3.72118f, 10.9672f, 4.85185f, 11.8847f)
                curveTo(5.06627f, 12.0587f, 5.09904f, 12.3736f, 4.92503f, 12.588f)
                curveTo(4.75103f, 12.8024f, 4.43615f, 12.8352f, 4.22172f, 12.6612f)
                curveTo(2.86712f, 11.5619f, 2f, 9.88205f, 2f, 8f)
                curveTo(2f, 4.75447f, 4.57689f, 2.1108f, 7.79629f, 2.00339f)
                lineTo(7.14645f, 1.35355f)
                curveTo(6.95118f, 1.15829f, 6.95118f, 0.841709f, 7.14645f, 0.646447f)
                close()
                moveTo(11.075f, 3.41199f)
                curveTo(11.249f, 3.19756f, 11.5639f, 3.1648f, 11.7783f, 3.3388f)
                curveTo(13.1329f, 4.43806f, 14f, 6.11795f, 14f, 8f)
                curveTo(14f, 11.2455f, 11.4231f, 13.8892f, 8.20371f, 13.9966f)
                lineTo(8.85355f, 14.6464f)
                curveTo(9.04882f, 14.8417f, 9.04882f, 15.1583f, 8.85355f, 15.3536f)
                curveTo(8.65829f, 15.5488f, 8.34171f, 15.5488f, 8.14645f, 15.3536f)
                lineTo(6.64645f, 13.8536f)
                curveTo(6.55268f, 13.7598f, 6.5f, 13.6326f, 6.5f, 13.5f)
                curveTo(6.5f, 13.3674f, 6.55268f, 13.2402f, 6.64645f, 13.1464f)
                lineTo(8.14645f, 11.6464f)
                curveTo(8.34171f, 11.4512f, 8.65829f, 11.4512f, 8.85355f, 11.6464f)
                curveTo(9.04882f, 11.8417f, 9.04882f, 12.1583f, 8.85355f, 12.3536f)
                lineTo(8.2115f, 12.9956f)
                curveTo(10.8748f, 12.8848f, 13f, 10.6906f, 13f, 8f)
                curveTo(13f, 6.43201f, 12.2788f, 5.03283f, 11.1482f, 4.1153f)
                curveTo(10.9337f, 3.94129f, 10.901f, 3.62641f, 11.075f, 3.41199f)
                close()
            }
        }.build()
        
        return _Sync!!
    }

private var _Sync: ImageVector? = null

