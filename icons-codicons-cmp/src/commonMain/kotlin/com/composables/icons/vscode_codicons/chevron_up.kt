package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ChevronUp: ImageVector
    get() {
        if (_ChevronUp != null) return _ChevronUp!!
        
        _ChevronUp = ImageVector.Builder(
            name = "chevron-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.14645f, 10.3536f)
                curveTo(3.34171f, 10.5488f, 3.65829f, 10.5488f, 3.85355f, 10.3536f)
                lineTo(8f, 6.20711f)
                lineTo(12.1464f, 10.3536f)
                curveTo(12.3417f, 10.5488f, 12.6583f, 10.5488f, 12.8536f, 10.3536f)
                curveTo(13.0488f, 10.1583f, 13.0488f, 9.84171f, 12.8536f, 9.64645f)
                lineTo(8.35355f, 5.14645f)
                curveTo(8.15829f, 4.95118f, 7.84171f, 4.95118f, 7.64645f, 5.14645f)
                lineTo(3.14645f, 9.64645f)
                curveTo(2.95118f, 9.84171f, 2.95118f, 10.1583f, 3.14645f, 10.3536f)
                close()
            }
        }.build()
        
        return _ChevronUp!!
    }

private var _ChevronUp: ImageVector? = null

