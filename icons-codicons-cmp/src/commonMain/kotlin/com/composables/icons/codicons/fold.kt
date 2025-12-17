package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Fold: ImageVector
    get() {
        if (_Fold != null) return _Fold!!
        
        _Fold = ImageVector.Builder(
            name = "fold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.8536f, 3.35355f)
                lineTo(8.35355f, 6.85355f)
                curveTo(8.15829f, 7.04882f, 7.84171f, 7.04882f, 7.64645f, 6.85355f)
                lineTo(4.14645f, 3.35355f)
                curveTo(3.95118f, 3.15829f, 3.95118f, 2.84171f, 4.14645f, 2.64645f)
                curveTo(4.34171f, 2.45118f, 4.65829f, 2.45118f, 4.85355f, 2.64645f)
                lineTo(8f, 5.79289f)
                lineTo(11.1464f, 2.64645f)
                curveTo(11.3417f, 2.45118f, 11.6583f, 2.45118f, 11.8536f, 2.64645f)
                curveTo(12.0488f, 2.84171f, 12.0488f, 3.15829f, 11.8536f, 3.35355f)
                close()
                moveTo(11.8536f, 12.6464f)
                lineTo(8.35355f, 9.14645f)
                curveTo(8.15829f, 8.95118f, 7.84171f, 8.95118f, 7.64645f, 9.14645f)
                lineTo(4.14645f, 12.6464f)
                curveTo(3.95118f, 12.8417f, 3.95118f, 13.1583f, 4.14645f, 13.3536f)
                curveTo(4.34171f, 13.5488f, 4.65829f, 13.5488f, 4.85355f, 13.3536f)
                lineTo(8f, 10.2071f)
                lineTo(11.1464f, 13.3536f)
                curveTo(11.3417f, 13.5488f, 11.6583f, 13.5488f, 11.8536f, 13.3536f)
                curveTo(12.0488f, 13.1583f, 12.0488f, 12.8417f, 11.8536f, 12.6464f)
                close()
            }
        }.build()
        
        return _Fold!!
    }

private var _Fold: ImageVector? = null

