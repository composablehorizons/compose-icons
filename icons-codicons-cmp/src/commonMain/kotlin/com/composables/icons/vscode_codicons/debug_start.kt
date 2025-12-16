package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStart: ImageVector
    get() {
        if (_DebugStart != null) return _DebugStart!!
        
        _DebugStart = ImageVector.Builder(
            name = "debug-start",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.506f, 3.50305f)
                lineTo(12.501f, 8.00005f)
                lineTo(4.501f, 12.5f)
                lineTo(4.506f, 3.50305f)
                close()
                moveTo(4.502f, 1.99805f)
                curveTo(3.718f, 1.99805f, 3f, 2.62605f, 3f, 3.50005f)
                verticalLineTo(12.5f)
                curveTo(3f, 13.374f, 3.718f, 14.002f, 4.502f, 14.002f)
                curveTo(4.747f, 14.002f, 4.998f, 13.941f, 5.235f, 13.807f)
                lineTo(13.235f, 9.30705f)
                curveTo(14.254f, 8.73405f, 14.254f, 7.26605f, 13.235f, 6.69205f)
                lineTo(5.235f, 2.19305f)
                curveTo(4.997f, 2.05905f, 4.746f, 1.99805f, 4.502f, 1.99805f)
                close()
            }
        }.build()
        
        return _DebugStart!!
    }

private var _DebugStart: ImageVector? = null

