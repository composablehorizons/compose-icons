package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FoldUp: ImageVector
    get() {
        if (_FoldUp != null) return _FoldUp!!
        
        _FoldUp = ImageVector.Builder(
            name = "fold-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.85355f, 8.35355f)
                curveTo(3.65829f, 8.54882f, 3.34171f, 8.54882f, 3.14645f, 8.35355f)
                curveTo(2.95118f, 8.15829f, 2.95118f, 7.84171f, 3.14645f, 7.64645f)
                lineTo(7.64645f, 3.14645f)
                curveTo(7.84171f, 2.95118f, 8.15829f, 2.95118f, 8.35355f, 3.14645f)
                lineTo(12.8536f, 7.64645f)
                curveTo(13.0488f, 7.84171f, 13.0488f, 8.15829f, 12.8536f, 8.35355f)
                curveTo(12.6583f, 8.54882f, 12.3417f, 8.54882f, 12.1464f, 8.35355f)
                lineTo(8f, 4.20711f)
                lineTo(3.85355f, 8.35355f)
                close()
                moveTo(3.85355f, 12.3536f)
                curveTo(3.65829f, 12.5488f, 3.34171f, 12.5488f, 3.14645f, 12.3536f)
                curveTo(2.95118f, 12.1583f, 2.95118f, 11.8417f, 3.14645f, 11.6464f)
                lineTo(7.64645f, 7.14645f)
                curveTo(7.84171f, 6.95118f, 8.15829f, 6.95118f, 8.35355f, 7.14645f)
                lineTo(12.8536f, 11.6464f)
                curveTo(13.0488f, 11.8417f, 13.0488f, 12.1583f, 12.8536f, 12.3536f)
                curveTo(12.6583f, 12.5488f, 12.3417f, 12.5488f, 12.1464f, 12.3536f)
                lineTo(8f, 8.20711f)
                lineTo(3.85355f, 12.3536f)
                close()
            }
        }.build()
        
        return _FoldUp!!
    }

private var _FoldUp: ImageVector? = null

