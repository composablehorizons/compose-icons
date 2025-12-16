package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.FoldDown: ImageVector
    get() {
        if (_FoldDown != null) return _FoldDown!!
        
        _FoldDown = ImageVector.Builder(
            name = "fold-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.1464f, 7.14645f)
                curveTo(12.3417f, 6.95119f, 12.6583f, 6.95119f, 12.8536f, 7.14645f)
                curveTo(13.0488f, 7.34171f, 13.0488f, 7.65829f, 12.8536f, 7.85355f)
                lineTo(8.35355f, 12.3536f)
                curveTo(8.15829f, 12.5488f, 7.84171f, 12.5488f, 7.64645f, 12.3536f)
                lineTo(3.14645f, 7.85355f)
                curveTo(2.95118f, 7.65829f, 2.95118f, 7.34171f, 3.14645f, 7.14645f)
                curveTo(3.34171f, 6.95118f, 3.65829f, 6.95118f, 3.85355f, 7.14645f)
                lineTo(8f, 11.2929f)
                lineTo(12.1464f, 7.14645f)
                close()
                moveTo(12.1464f, 3.14645f)
                curveTo(12.3417f, 2.95119f, 12.6583f, 2.95119f, 12.8536f, 3.14645f)
                curveTo(13.0488f, 3.34171f, 13.0488f, 3.65829f, 12.8536f, 3.85355f)
                lineTo(8.35355f, 8.35355f)
                curveTo(8.15829f, 8.54882f, 7.84171f, 8.54882f, 7.64645f, 8.35355f)
                lineTo(3.14645f, 3.85355f)
                curveTo(2.95118f, 3.65829f, 2.95118f, 3.34171f, 3.14645f, 3.14645f)
                curveTo(3.34171f, 2.95118f, 3.65829f, 2.95118f, 3.85355f, 3.14645f)
                lineTo(8f, 7.29289f)
                lineTo(12.1464f, 3.14645f)
                close()
            }
        }.build()
        
        return _FoldDown!!
    }

private var _FoldDown: ImageVector? = null

