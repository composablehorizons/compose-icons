package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointFunctionUnverified: ImageVector
    get() {
        if (_DebugBreakpointFunctionUnverified != null) return _DebugBreakpointFunctionUnverified!!
        
        _DebugBreakpointFunctionUnverified = ImageVector.Builder(
            name = "debug-breakpoint-function-unverified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.055f, 12f)
                horizontalLineTo(3.94499f)
                curveTo(3.76599f, 12f, 3.60099f, 11.904f, 3.51099f, 11.75f)
                curveTo(3.42199f, 11.595f, 3.42199f, 11.404f, 3.51099f, 11.249f)
                lineTo(7.56599f, 4.24899f)
                curveTo(7.74599f, 3.93999f, 8.25199f, 3.93999f, 8.43099f, 4.24899f)
                lineTo(12.486f, 11.249f)
                curveTo(12.576f, 11.404f, 12.576f, 11.595f, 12.486f, 11.75f)
                curveTo(12.396f, 11.904f, 12.231f, 12f, 12.052f, 12f)
                horizontalLineTo(12.055f)
                close()
                moveTo(4.81199f, 11f)
                horizontalLineTo(11.187f)
                lineTo(7.99899f, 5.49799f)
                lineTo(4.81199f, 11f)
                close()
            }
        }.build()
        
        return _DebugBreakpointFunctionUnverified!!
    }

private var _DebugBreakpointFunctionUnverified: ImageVector? = null

