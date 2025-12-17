package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugContinue: ImageVector
    get() {
        if (_DebugContinue != null) return _DebugContinue!!
        
        _DebugContinue = ImageVector.Builder(
            name = "debug-continue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.578f, 7.149f)
                lineTo(7.578f, 2.186f)
                curveTo(7.397f, 2.058f, 7.198f, 2f, 7.003f, 2f)
                curveTo(6.484f, 2f, 6f, 2.411f, 6f, 3.002f)
                verticalLineTo(13.003f)
                curveTo(6f, 13.594f, 6.485f, 14.005f, 7.004f, 14.005f)
                curveTo(7.201f, 14.005f, 7.403f, 13.946f, 7.585f, 13.815f)
                lineTo(14.585f, 8.777f)
                curveTo(15.142f, 8.376f, 15.139f, 7.546f, 14.579f, 7.15f)
                lineTo(14.578f, 7.149f)
                close()
                moveTo(7.5f, 12.027f)
                verticalLineTo(3.969f)
                lineTo(13.14f, 7.968f)
                lineTo(7.5f, 12.027f)
                close()
                moveTo(3.5f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(3.5f, 13.664f, 3.164f, 14f, 2.75f, 14f)
                curveTo(2.336f, 14f, 2f, 13.664f, 2f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(2f, 2.336f, 2.336f, 2f, 2.75f, 2f)
                curveTo(3.164f, 2f, 3.5f, 2.336f, 3.5f, 2.75f)
                close()
            }
        }.build()
        
        return _DebugContinue!!
    }

private var _DebugContinue: ImageVector? = null

