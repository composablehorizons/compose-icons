package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugPause: ImageVector
    get() {
        if (_DebugPause != null) return _DebugPause!!
        
        _DebugPause = ImageVector.Builder(
            name = "debug-pause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(5.5f, 13.664f, 5.164f, 14f, 4.75f, 14f)
                curveTo(4.336f, 14f, 4f, 13.664f, 4f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(4f, 2.336f, 4.336f, 2f, 4.75f, 2f)
                curveTo(5.164f, 2f, 5.5f, 2.336f, 5.5f, 2.75f)
                close()
                moveTo(11.25f, 2f)
                curveTo(10.836f, 2f, 10.5f, 2.336f, 10.5f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(10.5f, 13.664f, 10.836f, 14f, 11.25f, 14f)
                curveTo(11.664f, 14f, 12f, 13.664f, 12f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(12f, 2.336f, 11.664f, 2f, 11.25f, 2f)
                close()
            }
        }.build()
        
        return _DebugPause!!
    }

private var _DebugPause: ImageVector? = null

