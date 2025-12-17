package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointConditional: ImageVector
    get() {
        if (_DebugBreakpointConditional != null) return _DebugBreakpointConditional!!
        
        _DebugBreakpointConditional = ImageVector.Builder(
            name = "debug-breakpoint-conditional",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
                curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
                curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
                curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
                close()
                moveTo(9.5f, 10f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 10f, 6f, 9.776f, 6f, 9.5f)
                curveTo(6f, 9.224f, 6.224f, 9f, 6.5f, 9f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 9f, 10f, 9.224f, 10f, 9.5f)
                curveTo(10f, 9.776f, 9.776f, 10f, 9.5f, 10f)
                close()
                moveTo(9.5f, 7f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 7f, 6f, 6.776f, 6f, 6.5f)
                curveTo(6f, 6.224f, 6.224f, 6f, 6.5f, 6f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 6f, 10f, 6.224f, 10f, 6.5f)
                curveTo(10f, 6.776f, 9.776f, 7f, 9.5f, 7f)
                close()
            }
        }.build()
        
        return _DebugBreakpointConditional!!
    }

private var _DebugBreakpointConditional: ImageVector? = null

