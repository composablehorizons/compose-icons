package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowCircleRight: ImageVector
    get() {
        if (_ArrowCircleRight != null) return _ArrowCircleRight!!
        
        _ArrowCircleRight = ImageVector.Builder(
            name = "arrow-circle-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.85355f, 10.8536f)
                lineTo(11.3536f, 8.35355f)
                curveTo(11.5488f, 8.15829f, 11.5488f, 7.84171f, 11.3536f, 7.64645f)
                lineTo(8.85355f, 5.14645f)
                curveTo(8.65829f, 4.95118f, 8.34171f, 4.95118f, 8.14645f, 5.14645f)
                curveTo(7.95118f, 5.34171f, 7.95118f, 5.65829f, 8.14645f, 5.85355f)
                lineTo(9.79289f, 7.5f)
                horizontalLineTo(5f)
                curveTo(4.72386f, 7.5f, 4.5f, 7.72386f, 4.5f, 8f)
                curveTo(4.5f, 8.27614f, 4.72386f, 8.5f, 5f, 8.5f)
                horizontalLineTo(9.79289f)
                lineTo(8.14645f, 10.1464f)
                curveTo(7.95118f, 10.3417f, 7.95118f, 10.6583f, 8.14645f, 10.8536f)
                curveTo(8.34171f, 11.0488f, 8.65829f, 11.0488f, 8.85355f, 10.8536f)
                close()
                moveTo(15f, 8f)
                curveTo(15f, 11.866f, 11.866f, 15f, 8f, 15f)
                curveTo(4.13401f, 15f, 1f, 11.866f, 1f, 8f)
                curveTo(1f, 4.13401f, 4.13401f, 1f, 8f, 1f)
                curveTo(11.866f, 1f, 15f, 4.13401f, 15f, 8f)
                close()
                moveTo(8f, 14f)
                curveTo(11.3137f, 14f, 14f, 11.3137f, 14f, 8f)
                curveTo(14f, 4.68629f, 11.3137f, 2f, 8f, 2f)
                curveTo(4.68629f, 2f, 2f, 4.68629f, 2f, 8f)
                curveTo(2f, 11.3137f, 4.68629f, 14f, 8f, 14f)
                close()
            }
        }.build()
        
        return _ArrowCircleRight!!
    }

private var _ArrowCircleRight: ImageVector? = null

