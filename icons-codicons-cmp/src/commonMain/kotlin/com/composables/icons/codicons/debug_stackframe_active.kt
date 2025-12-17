package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStackframeActive: ImageVector
    get() {
        if (_DebugStackframeActive != null) return _DebugStackframeActive!!
        
        _DebugStackframeActive = ImageVector.Builder(
            name = "debug-stackframe-active",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 8.01001f)
                curveTo(10f, 8.40601f, 9.88302f, 8.79201f, 9.66302f, 9.12101f)
                curveTo(9.44302f, 9.45001f, 9.13102f, 9.70601f, 8.76502f, 9.85801f)
                curveTo(8.40002f, 10.009f, 7.99702f, 10.049f, 7.60902f, 9.97201f)
                curveTo(7.22102f, 9.89501f, 6.86502f, 9.70401f, 6.58502f, 9.42501f)
                curveTo(6.30502f, 9.14501f, 6.11502f, 8.78901f, 6.03802f, 8.40101f)
                curveTo(5.96102f, 8.01301f, 6.00002f, 7.61101f, 6.15202f, 7.24501f)
                curveTo(6.30302f, 6.88001f, 6.56002f, 6.56701f, 6.88902f, 6.34701f)
                curveTo(7.21802f, 6.12701f, 7.60502f, 6.01001f, 8.00002f, 6.01001f)
                curveTo(8.53002f, 6.01001f, 9.03902f, 6.22101f, 9.41402f, 6.59601f)
                curveTo(9.78902f, 6.97101f, 10f, 7.48001f, 10f, 8.01001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.879f, 14f)
                horizontalLineTo(5f)
                curveTo(3.897f, 14f, 3f, 13.103f, 3f, 12f)
                verticalLineTo(4f)
                curveTo(3f, 2.897f, 3.897f, 2f, 5f, 2f)
                horizontalLineTo(8.879f)
                curveTo(9.405f, 2f, 9.921f, 2.213f, 10.293f, 2.586f)
                lineTo(14.505f, 6.798f)
                curveTo(14.826f, 7.119f, 15.003f, 7.546f, 15.003f, 8f)
                curveTo(15.003f, 8.454f, 14.826f, 8.881f, 14.505f, 9.202f)
                lineTo(10.293f, 13.414f)
                curveTo(9.921f, 13.787f, 9.405f, 14f, 8.879f, 14f)
                close()
                moveTo(5f, 3f)
                curveTo(4.449f, 3f, 4f, 3.449f, 4f, 4f)
                verticalLineTo(12f)
                curveTo(4f, 12.551f, 4.449f, 13f, 5f, 13f)
                horizontalLineTo(8.879f)
                curveTo(9.142f, 13f, 9.4f, 12.893f, 9.586f, 12.707f)
                lineTo(13.798f, 8.495f)
                curveTo(13.93f, 8.363f, 14.003f, 8.187f, 14.003f, 8f)
                curveTo(14.003f, 7.813f, 13.93f, 7.637f, 13.798f, 7.505f)
                lineTo(9.586f, 3.293f)
                curveTo(9.4f, 3.107f, 9.142f, 3f, 8.879f, 3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _DebugStackframeActive!!
    }

private var _DebugStackframeActive: ImageVector? = null

