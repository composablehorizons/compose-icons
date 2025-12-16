package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointLogUnverified: ImageVector
    get() {
        if (_DebugBreakpointLogUnverified != null) return _DebugBreakpointLogUnverified!!
        
        _DebugBreakpointLogUnverified = ImageVector.Builder(
            name = "debug-breakpoint-log-unverified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.00001f, 13f)
                curveTo(7.87201f, 13f, 7.74401f, 12.951f, 7.64601f, 12.854f)
                lineTo(3.14601f, 8.35401f)
                curveTo(2.95101f, 8.15901f, 2.95101f, 7.84201f, 3.14601f, 7.64701f)
                lineTo(7.64601f, 3.14601f)
                curveTo(7.84101f, 2.95101f, 8.15801f, 2.95101f, 8.35301f, 3.14601f)
                lineTo(12.853f, 7.64601f)
                curveTo(13.048f, 7.84101f, 13.048f, 8.15801f, 12.853f, 8.35301f)
                lineTo(8.35301f, 12.853f)
                curveTo(8.25501f, 12.951f, 8.12701f, 12.999f, 7.99901f, 12.999f)
                lineTo(8.00001f, 13f)
                close()
                moveTo(4.20701f, 8.00001f)
                lineTo(8.00001f, 11.793f)
                lineTo(11.793f, 8.00001f)
                lineTo(8.00001f, 4.20701f)
                lineTo(4.20701f, 8.00001f)
                close()
            }
        }.build()
        
        return _DebugBreakpointLogUnverified!!
    }

private var _DebugBreakpointLogUnverified: ImageVector? = null

