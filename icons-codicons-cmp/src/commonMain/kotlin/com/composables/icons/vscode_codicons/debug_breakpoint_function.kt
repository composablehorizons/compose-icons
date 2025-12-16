package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugBreakpointFunction: ImageVector
    get() {
        if (_DebugBreakpointFunction != null) return _DebugBreakpointFunction!!
        
        _DebugBreakpointFunction = ImageVector.Builder(
            name = "debug-breakpoint-function",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.487f, 11.249f)
                lineTo(8.43199f, 4.24899f)
                curveTo(8.25199f, 3.93999f, 7.74599f, 3.93999f, 7.56699f, 4.24899f)
                lineTo(3.51199f, 11.249f)
                curveTo(3.42199f, 11.404f, 3.42199f, 11.595f, 3.51199f, 11.75f)
                curveTo(3.60199f, 11.904f, 3.76699f, 12f, 3.94599f, 12f)
                horizontalLineTo(12.055f)
                curveTo(12.234f, 12f, 12.399f, 11.904f, 12.489f, 11.75f)
                curveTo(12.578f, 11.595f, 12.578f, 11.404f, 12.489f, 11.249f)
                horizontalLineTo(12.487f)
                close()
            }
        }.build()
        
        return _DebugBreakpointFunction!!
    }

private var _DebugBreakpointFunction: ImageVector? = null

