package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.TerminalTmux: ImageVector
    get() {
        if (_TerminalTmux != null) return _TerminalTmux!!
        
        _TerminalTmux = ImageVector.Builder(
            name = "terminal-tmux",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                horizontalLineTo(2f)
                curveTo(1.448f, 1f, 1f, 1.448f, 1f, 2f)
                verticalLineTo(14f)
                curveTo(1f, 14.552f, 1.448f, 15f, 2f, 15f)
                horizontalLineTo(14f)
                curveTo(14.552f, 15f, 15f, 14.552f, 15f, 14f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                close()
                moveTo(14f, 1f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(2f)
                curveTo(15f, 1.448f, 14.552f, 1f, 14f, 1f)
                close()
            }
        }.build()
        
        return _TerminalTmux!!
    }

private var _TerminalTmux: ImageVector? = null

