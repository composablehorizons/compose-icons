package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointDataUnverified: ImageVector
    get() {
        if (_DebugBreakpointDataUnverified != null) return _DebugBreakpointDataUnverified!!
        
        _DebugBreakpointDataUnverified = ImageVector.Builder(
            name = "debug-breakpoint-data-unverified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.73199f, 5f)
                lineTo(11.464f, 8f)
                lineTo(9.73199f, 11f)
                horizontalLineTo(6.26799f)
                lineTo(4.53599f, 8f)
                lineTo(6.26799f, 5f)
                horizontalLineTo(9.73199f)
                close()
                moveTo(9.73199f, 4f)
                horizontalLineTo(6.26799f)
                curveTo(5.91099f, 4f, 5.58099f, 4.191f, 5.40199f, 4.5f)
                lineTo(3.66999f, 7.5f)
                curveTo(3.49099f, 7.809f, 3.49099f, 8.191f, 3.66999f, 8.5f)
                lineTo(5.40199f, 11.5f)
                curveTo(5.58099f, 11.809f, 5.91099f, 12f, 6.26799f, 12f)
                horizontalLineTo(9.73199f)
                curveTo(10.089f, 12f, 10.419f, 11.809f, 10.598f, 11.5f)
                lineTo(12.33f, 8.5f)
                curveTo(12.509f, 8.191f, 12.509f, 7.809f, 12.33f, 7.5f)
                lineTo(10.598f, 4.5f)
                curveTo(10.419f, 4.191f, 10.089f, 4f, 9.73199f, 4f)
                close()
            }
        }.build()
        
        return _DebugBreakpointDataUnverified!!
    }

private var _DebugBreakpointDataUnverified: ImageVector? = null

