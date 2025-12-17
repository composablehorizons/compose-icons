package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!
        
        _ChevronLeft = ImageVector.Builder(
            name = "chevron-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.3536f, 3.14645f)
                curveTo(10.5488f, 3.34171f, 10.5488f, 3.65829f, 10.3536f, 3.85355f)
                lineTo(6.20711f, 8f)
                lineTo(10.3536f, 12.1464f)
                curveTo(10.5488f, 12.3417f, 10.5488f, 12.6583f, 10.3536f, 12.8536f)
                curveTo(10.1583f, 13.0488f, 9.84171f, 13.0488f, 9.64645f, 12.8536f)
                lineTo(5.14645f, 8.35355f)
                curveTo(4.95118f, 8.15829f, 4.95118f, 7.84171f, 5.14645f, 7.64645f)
                lineTo(9.64645f, 3.14645f)
                curveTo(9.84171f, 2.95118f, 10.1583f, 2.95118f, 10.3536f, 3.14645f)
                close()
            }
        }.build()
        
        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

