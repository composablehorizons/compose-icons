package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Move: ImageVector
    get() {
        if (_Move != null) return _Move!!
        
        _Move = ImageVector.Builder(
            name = "move",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.35355f, 1.14645f)
                curveTo(8.15829f, 0.951184f, 7.84171f, 0.951184f, 7.64645f, 1.14645f)
                lineTo(5.64645f, 3.14645f)
                curveTo(5.45118f, 3.34171f, 5.45118f, 3.65829f, 5.64645f, 3.85355f)
                curveTo(5.84171f, 4.04882f, 6.15829f, 4.04882f, 6.35355f, 3.85355f)
                lineTo(7.5f, 2.70711f)
                verticalLineTo(5.5f)
                curveTo(7.5f, 5.77614f, 7.72386f, 6f, 8f, 6f)
                curveTo(8.27614f, 6f, 8.5f, 5.77614f, 8.5f, 5.5f)
                verticalLineTo(2.70711f)
                lineTo(9.64645f, 3.85355f)
                curveTo(9.84171f, 4.04882f, 10.1583f, 4.04882f, 10.3536f, 3.85355f)
                curveTo(10.5488f, 3.65829f, 10.5488f, 3.34171f, 10.3536f, 3.14645f)
                lineTo(8.35355f, 1.14645f)
                close()
                moveTo(3.85355f, 5.64645f)
                curveTo(4.04882f, 5.84171f, 4.04882f, 6.15829f, 3.85355f, 6.35355f)
                lineTo(2.70711f, 7.5f)
                horizontalLineTo(5.5f)
                curveTo(5.77614f, 7.5f, 6f, 7.72386f, 6f, 8f)
                curveTo(6f, 8.27614f, 5.77614f, 8.5f, 5.5f, 8.5f)
                horizontalLineTo(2.70711f)
                lineTo(3.85355f, 9.64645f)
                curveTo(4.04882f, 9.84171f, 4.04882f, 10.1583f, 3.85355f, 10.3536f)
                curveTo(3.65829f, 10.5488f, 3.34171f, 10.5488f, 3.14645f, 10.3536f)
                lineTo(1.14645f, 8.35355f)
                curveTo(0.951184f, 8.15829f, 0.951184f, 7.84171f, 1.14645f, 7.64645f)
                lineTo(3.14645f, 5.64645f)
                curveTo(3.34171f, 5.45118f, 3.65829f, 5.45118f, 3.85355f, 5.64645f)
                close()
                moveTo(7.5f, 13.2929f)
                lineTo(6.35355f, 12.1464f)
                curveTo(6.15829f, 11.9512f, 5.84171f, 11.9512f, 5.64645f, 12.1464f)
                curveTo(5.45118f, 12.3417f, 5.45118f, 12.6583f, 5.64645f, 12.8536f)
                lineTo(7.64645f, 14.8536f)
                curveTo(7.84171f, 15.0488f, 8.15829f, 15.0488f, 8.35355f, 14.8536f)
                lineTo(10.3536f, 12.8536f)
                curveTo(10.5488f, 12.6583f, 10.5488f, 12.3417f, 10.3536f, 12.1464f)
                curveTo(10.1583f, 11.9512f, 9.84171f, 11.9512f, 9.64645f, 12.1464f)
                lineTo(8.5f, 13.2929f)
                verticalLineTo(10.5f)
                curveTo(8.5f, 10.2239f, 8.27614f, 10f, 8f, 10f)
                curveTo(7.72386f, 10f, 7.5f, 10.2239f, 7.5f, 10.5f)
                verticalLineTo(13.2929f)
                close()
                moveTo(12.1464f, 5.64645f)
                curveTo(12.3417f, 5.45118f, 12.6583f, 5.45118f, 12.8536f, 5.64645f)
                lineTo(14.8536f, 7.64645f)
                curveTo(15.0488f, 7.84171f, 15.0488f, 8.15829f, 14.8536f, 8.35355f)
                lineTo(12.8536f, 10.3536f)
                curveTo(12.6583f, 10.5488f, 12.3417f, 10.5488f, 12.1464f, 10.3536f)
                curveTo(11.9512f, 10.1583f, 11.9512f, 9.84171f, 12.1464f, 9.64645f)
                lineTo(13.2929f, 8.5f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 8.5f, 10f, 8.27614f, 10f, 8f)
                curveTo(10f, 7.72386f, 10.2239f, 7.5f, 10.5f, 7.5f)
                horizontalLineTo(13.2929f)
                lineTo(12.1464f, 6.35355f)
                curveTo(11.9512f, 6.15829f, 11.9512f, 5.84171f, 12.1464f, 5.64645f)
                close()
            }
        }.build()
        
        return _Move!!
    }

private var _Move: ImageVector? = null

