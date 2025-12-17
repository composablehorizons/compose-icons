package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointLog: ImageVector
    get() {
        if (_DebugBreakpointLog != null) return _DebugBreakpointLog!!
        
        _DebugBreakpointLog = ImageVector.Builder(
            name = "debug-breakpoint-log",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.854f, 7.64601f)
                lineTo(8.35401f, 3.14601f)
                curveTo(8.15901f, 2.95101f, 7.84201f, 2.95101f, 7.64701f, 3.14601f)
                lineTo(3.14601f, 7.64601f)
                curveTo(2.95101f, 7.84101f, 2.95101f, 8.15801f, 3.14601f, 8.35301f)
                lineTo(7.64601f, 12.853f)
                curveTo(7.74401f, 12.951f, 7.87201f, 12.999f, 8.00001f, 12.999f)
                curveTo(8.12801f, 12.999f, 8.25601f, 12.95f, 8.35401f, 12.853f)
                lineTo(12.854f, 8.35301f)
                curveTo(13.049f, 8.15801f, 13.049f, 7.84101f, 12.854f, 7.64601f)
                close()
            }
        }.build()
        
        return _DebugBreakpointLog!!
    }

private var _DebugBreakpointLog: ImageVector? = null

