package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChevronRight: ImageVector
    get() {
        if (_ChevronRight != null) return _ChevronRight!!
        
        _ChevronRight = ImageVector.Builder(
            name = "chevron-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.64645f, 3.14645f)
                curveTo(5.45118f, 3.34171f, 5.45118f, 3.65829f, 5.64645f, 3.85355f)
                lineTo(9.79289f, 8f)
                lineTo(5.64645f, 12.1464f)
                curveTo(5.45118f, 12.3417f, 5.45118f, 12.6583f, 5.64645f, 12.8536f)
                curveTo(5.84171f, 13.0488f, 6.15829f, 13.0488f, 6.35355f, 12.8536f)
                lineTo(10.8536f, 8.35355f)
                curveTo(11.0488f, 8.15829f, 11.0488f, 7.84171f, 10.8536f, 7.64645f)
                lineTo(6.35355f, 3.14645f)
                curveTo(6.15829f, 2.95118f, 5.84171f, 2.95118f, 5.64645f, 3.14645f)
                close()
            }
        }.build()
        
        return _ChevronRight!!
    }

private var _ChevronRight: ImageVector? = null

