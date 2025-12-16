package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DebugReverseContinue: ImageVector
    get() {
        if (_DebugReverseContinue != null) return _DebugReverseContinue!!
        
        _DebugReverseContinue = ImageVector.Builder(
            name = "debug-reverse-continue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.99688f, 2f)
                curveTo(8.80188f, 2f, 8.60288f, 2.058f, 8.42188f, 2.186f)
                lineTo(1.42188f, 7.149f)
                curveTo(0.861882f, 7.546f, 0.858882f, 8.376f, 1.41588f, 8.776f)
                lineTo(8.41588f, 13.814f)
                curveTo(8.59788f, 13.945f, 8.79988f, 14.004f, 8.99688f, 14.004f)
                curveTo(9.51588f, 14.004f, 10.0009f, 13.593f, 10.0009f, 13.002f)
                verticalLineTo(3.002f)
                curveTo(10.0009f, 2.412f, 9.51688f, 2f, 8.99788f, 2f)
                horizontalLineTo(8.99688f)
                close()
                moveTo(8.49988f, 12.027f)
                lineTo(2.85988f, 7.968f)
                lineTo(8.49988f, 3.969f)
                verticalLineTo(12.027f)
                close()
                moveTo(13.9999f, 2.75f)
                verticalLineTo(13.25f)
                curveTo(13.9999f, 13.664f, 13.6639f, 14f, 13.2499f, 14f)
                curveTo(12.8359f, 14f, 12.4999f, 13.664f, 12.4999f, 13.25f)
                verticalLineTo(2.75f)
                curveTo(12.4999f, 2.336f, 12.8359f, 2f, 13.2499f, 2f)
                curveTo(13.6639f, 2f, 13.9999f, 2.336f, 13.9999f, 2.75f)
                close()
            }
        }.build()
        
        return _DebugReverseContinue!!
    }

private var _DebugReverseContinue: ImageVector? = null

