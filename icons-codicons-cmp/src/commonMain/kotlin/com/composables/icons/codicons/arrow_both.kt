package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowBoth: ImageVector
    get() {
        if (_ArrowBoth != null) return _ArrowBoth!!
        
        _ArrowBoth = ImageVector.Builder(
            name = "arrow-both",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.14645f, 8.85355f)
                curveTo(0.951184f, 8.65829f, 0.951184f, 8.34171f, 1.14645f, 8.14645f)
                lineTo(4.14645f, 5.14645f)
                curveTo(4.34171f, 4.95118f, 4.65829f, 4.95118f, 4.85355f, 5.14645f)
                curveTo(5.04882f, 5.34171f, 5.04882f, 5.65829f, 4.85355f, 5.85355f)
                lineTo(2.70711f, 8f)
                lineTo(13.2929f, 8f)
                lineTo(11.1464f, 5.85355f)
                curveTo(10.9512f, 5.65829f, 10.9512f, 5.34171f, 11.1464f, 5.14645f)
                curveTo(11.3417f, 4.95118f, 11.6583f, 4.95118f, 11.8536f, 5.14645f)
                lineTo(14.8536f, 8.14645f)
                curveTo(15.0488f, 8.34171f, 15.0488f, 8.65829f, 14.8536f, 8.85355f)
                lineTo(11.8536f, 11.8536f)
                curveTo(11.6583f, 12.0488f, 11.3417f, 12.0488f, 11.1464f, 11.8536f)
                curveTo(10.9512f, 11.6583f, 10.9512f, 11.3417f, 11.1464f, 11.1464f)
                lineTo(13.2929f, 9f)
                lineTo(2.70711f, 9f)
                lineTo(4.85355f, 11.1464f)
                curveTo(5.04882f, 11.3417f, 5.04882f, 11.6583f, 4.85355f, 11.8536f)
                curveTo(4.65829f, 12.0488f, 4.34171f, 12.0488f, 4.14645f, 11.8536f)
                lineTo(1.14645f, 8.85355f)
                close()
            }
        }.build()
        
        return _ArrowBoth!!
    }

private var _ArrowBoth: ImageVector? = null

