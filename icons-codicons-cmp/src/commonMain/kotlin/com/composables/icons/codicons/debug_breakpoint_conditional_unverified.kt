package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointConditionalUnverified: ImageVector
    get() {
        if (_DebugBreakpointConditionalUnverified != null) return _DebugBreakpointConditionalUnverified!!
        
        _DebugBreakpointConditionalUnverified = ImageVector.Builder(
            name = "debug-breakpoint-conditional-unverified",
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
                moveTo(8f, 11f)
                curveTo(6.346f, 11f, 5f, 9.654f, 5f, 8f)
                curveTo(5f, 6.346f, 6.346f, 5f, 8f, 5f)
                curveTo(9.654f, 5f, 11f, 6.346f, 11f, 8f)
                curveTo(11f, 9.654f, 9.654f, 11f, 8f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 6f)
                horizontalLineTo(7f)
                curveTo(6.724f, 6f, 6.5f, 6.224f, 6.5f, 6.5f)
                curveTo(6.5f, 6.776f, 6.724f, 7f, 7f, 7f)
                horizontalLineTo(9f)
                curveTo(9.276f, 7f, 9.5f, 6.776f, 9.5f, 6.5f)
                curveTo(9.5f, 6.224f, 9.276f, 6f, 9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 9f)
                horizontalLineTo(7f)
                curveTo(6.724f, 9f, 6.5f, 9.224f, 6.5f, 9.5f)
                curveTo(6.5f, 9.776f, 6.724f, 10f, 7f, 10f)
                horizontalLineTo(9f)
                curveTo(9.276f, 10f, 9.5f, 9.776f, 9.5f, 9.5f)
                curveTo(9.5f, 9.224f, 9.276f, 9f, 9f, 9f)
                close()
            }
        }.build()
        
        return _DebugBreakpointConditionalUnverified!!
    }

private var _DebugBreakpointConditionalUnverified: ImageVector? = null

