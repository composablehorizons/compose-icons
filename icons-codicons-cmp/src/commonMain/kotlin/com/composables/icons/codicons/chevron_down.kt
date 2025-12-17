package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) return _ChevronDown!!
        
        _ChevronDown = ImageVector.Builder(
            name = "chevron-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.14645f, 5.64645f)
                curveTo(3.34171f, 5.45118f, 3.65829f, 5.45118f, 3.85355f, 5.64645f)
                lineTo(8f, 9.79289f)
                lineTo(12.1464f, 5.64645f)
                curveTo(12.3417f, 5.45118f, 12.6583f, 5.45118f, 12.8536f, 5.64645f)
                curveTo(13.0488f, 5.84171f, 13.0488f, 6.15829f, 12.8536f, 6.35355f)
                lineTo(8.35355f, 10.8536f)
                curveTo(8.15829f, 11.0488f, 7.84171f, 11.0488f, 7.64645f, 10.8536f)
                lineTo(3.14645f, 6.35355f)
                curveTo(2.95118f, 6.15829f, 2.95118f, 5.84171f, 3.14645f, 5.64645f)
                close()
            }
        }.build()
        
        return _ChevronDown!!
    }

private var _ChevronDown: ImageVector? = null

