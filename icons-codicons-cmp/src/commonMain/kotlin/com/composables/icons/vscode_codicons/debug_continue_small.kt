package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugContinueSmall: ImageVector
    get() {
        if (_DebugContinueSmall != null) return _DebugContinueSmall!!
        
        _DebugContinueSmall = ImageVector.Builder(
            name = "debug-continue-small",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2.5f)
                curveTo(3f, 2.22386f, 2.77614f, 2f, 2.5f, 2f)
                curveTo(2.22386f, 2f, 2f, 2.22386f, 2f, 2.5f)
                verticalLineTo(13.5f)
                curveTo(2f, 13.7761f, 2.22386f, 14f, 2.5f, 14f)
                curveTo(2.77614f, 14f, 3f, 13.7761f, 3f, 13.5f)
                verticalLineTo(2.5f)
                close()
                moveTo(5f, 3.00176f)
                curveTo(5f, 2.19f, 5.91615f, 1.71648f, 6.57836f, 2.18598f)
                lineTo(13.5788f, 7.14908f)
                curveTo(14.1385f, 7.54593f, 14.1414f, 8.37575f, 13.5845f, 8.77653f)
                lineTo(6.58411f, 13.8142f)
                curveTo(5.9226f, 14.2903f, 5f, 13.8175f, 5f, 13.0026f)
                verticalLineTo(3.00176f)
                close()
                moveTo(13.0004f, 7.96486f)
                lineTo(6f, 3.00175f)
                lineTo(6f, 13.0026f)
                lineTo(13.0004f, 7.96486f)
                close()
            }
        }.build()
        
        return _DebugContinueSmall!!
    }

private var _DebugContinueSmall: ImageVector? = null

