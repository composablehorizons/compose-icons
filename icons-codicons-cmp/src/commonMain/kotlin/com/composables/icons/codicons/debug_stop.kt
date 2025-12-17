package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugStop: ImageVector
    get() {
        if (_DebugStop != null) return _DebugStop!!
        
        _DebugStop = ImageVector.Builder(
            name = "debug-stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 3.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(12.5f)
                close()
                moveTo(12.5f, 2f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 14f, 14f, 13.328f, 14f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
                close()
            }
        }.build()
        
        return _DebugStop!!
    }

private var _DebugStop: ImageVector? = null

