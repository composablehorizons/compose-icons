package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointUnsupported: ImageVector
    get() {
        if (_DebugBreakpointUnsupported != null) return _DebugBreakpointUnsupported!!
        
        _DebugBreakpointUnsupported = ImageVector.Builder(
            name = "debug-breakpoint-unsupported",
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
                moveTo(7.5f, 5.5f)
                curveTo(7.5f, 5.367f, 7.553f, 5.24f, 7.646f, 5.146f)
                curveTo(7.74f, 5.052f, 7.867f, 5f, 8f, 5f)
                curveTo(8.133f, 5f, 8.26f, 5.053f, 8.354f, 5.146f)
                curveTo(8.448f, 5.24f, 8.5f, 5.367f, 8.5f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(8.5f, 8.633f, 8.447f, 8.76f, 8.354f, 8.854f)
                curveTo(8.261f, 8.948f, 8.133f, 9f, 8f, 9f)
                curveTo(7.867f, 9f, 7.74f, 8.947f, 7.646f, 8.854f)
                curveTo(7.552f, 8.761f, 7.5f, 8.633f, 7.5f, 8.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(8f, 11.125f)
                curveTo(7.655f, 11.125f, 7.375f, 10.845f, 7.375f, 10.5f)
                curveTo(7.375f, 10.155f, 7.655f, 9.875f, 8f, 9.875f)
                curveTo(8.345f, 9.875f, 8.625f, 10.155f, 8.625f, 10.5f)
                curveTo(8.625f, 10.845f, 8.345f, 11.125f, 8f, 11.125f)
                close()
            }
        }.build()
        
        return _DebugBreakpointUnsupported!!
    }

private var _DebugBreakpointUnsupported: ImageVector? = null

