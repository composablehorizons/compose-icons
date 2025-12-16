package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointData: ImageVector
    get() {
        if (_DebugBreakpointData != null) return _DebugBreakpointData!!
        
        _DebugBreakpointData = ImageVector.Builder(
            name = "debug-breakpoint-data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.33f, 8.5f)
                lineTo(10.598f, 11.5f)
                curveTo(10.419f, 11.809f, 10.089f, 12f, 9.73202f, 12f)
                horizontalLineTo(6.26802f)
                curveTo(5.91102f, 12f, 5.58102f, 11.809f, 5.40202f, 11.5f)
                lineTo(3.67002f, 8.5f)
                curveTo(3.49102f, 8.191f, 3.49102f, 7.809f, 3.67002f, 7.5f)
                lineTo(5.40202f, 4.5f)
                curveTo(5.58102f, 4.191f, 5.91102f, 4f, 6.26802f, 4f)
                horizontalLineTo(9.73202f)
                curveTo(10.089f, 4f, 10.419f, 4.191f, 10.598f, 4.5f)
                lineTo(12.33f, 7.5f)
                curveTo(12.509f, 7.809f, 12.509f, 8.191f, 12.33f, 8.5f)
                close()
            }
        }.build()
        
        return _DebugBreakpointData!!
    }

private var _DebugBreakpointData: ImageVector? = null

