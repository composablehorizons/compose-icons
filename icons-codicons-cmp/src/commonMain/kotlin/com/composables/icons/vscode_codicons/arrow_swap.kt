package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowSwap: ImageVector
    get() {
        if (_ArrowSwap != null) return _ArrowSwap!!
        
        _ArrowSwap = ImageVector.Builder(
            name = "arrow-swap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.3536f, 1.64645f)
                curveTo(11.1583f, 1.45118f, 10.8417f, 1.45118f, 10.6464f, 1.64645f)
                curveTo(10.4512f, 1.84171f, 10.4512f, 2.15829f, 10.6464f, 2.35355f)
                lineTo(12.2929f, 4f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 4f, 2f, 4.22386f, 2f, 4.5f)
                curveTo(2f, 4.77614f, 2.22386f, 5f, 2.5f, 5f)
                horizontalLineTo(12.2929f)
                lineTo(10.6464f, 6.64645f)
                curveTo(10.4512f, 6.84171f, 10.4512f, 7.15829f, 10.6464f, 7.35355f)
                curveTo(10.8417f, 7.54882f, 11.1583f, 7.54882f, 11.3536f, 7.35355f)
                lineTo(13.8536f, 4.85355f)
                curveTo(14.0488f, 4.65829f, 14.0488f, 4.34171f, 13.8536f, 4.14645f)
                lineTo(11.3536f, 1.64645f)
                close()
                moveTo(5.35355f, 9.35355f)
                curveTo(5.54882f, 9.15829f, 5.54882f, 8.84171f, 5.35355f, 8.64645f)
                curveTo(5.15829f, 8.45118f, 4.84171f, 8.45118f, 4.64645f, 8.64645f)
                lineTo(2.14645f, 11.1464f)
                curveTo(1.95118f, 11.3417f, 1.95118f, 11.6583f, 2.14645f, 11.8536f)
                lineTo(4.64645f, 14.3536f)
                curveTo(4.84171f, 14.5488f, 5.15829f, 14.5488f, 5.35355f, 14.3536f)
                curveTo(5.54882f, 14.1583f, 5.54882f, 13.8417f, 5.35355f, 13.6464f)
                lineTo(3.70711f, 12f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 12f, 14f, 11.7761f, 14f, 11.5f)
                curveTo(14f, 11.2239f, 13.7761f, 11f, 13.5f, 11f)
                horizontalLineTo(3.70711f)
                lineTo(5.35355f, 9.35355f)
                close()
            }
        }.build()
        
        return _ArrowSwap!!
    }

private var _ArrowSwap: ImageVector? = null

