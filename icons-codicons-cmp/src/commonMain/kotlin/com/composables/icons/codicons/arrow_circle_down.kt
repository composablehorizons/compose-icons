package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowCircleDown: ImageVector
    get() {
        if (_ArrowCircleDown != null) return _ArrowCircleDown!!
        
        _ArrowCircleDown = ImageVector.Builder(
            name = "arrow-circle-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.14645f, 8.85355f)
                lineTo(7.64645f, 11.3536f)
                curveTo(7.84171f, 11.5488f, 8.15829f, 11.5488f, 8.35355f, 11.3536f)
                lineTo(10.8536f, 8.85355f)
                curveTo(11.0488f, 8.65829f, 11.0488f, 8.34171f, 10.8536f, 8.14645f)
                curveTo(10.6583f, 7.95118f, 10.3417f, 7.95118f, 10.1464f, 8.14645f)
                lineTo(8.5f, 9.79289f)
                verticalLineTo(5f)
                curveTo(8.5f, 4.72386f, 8.27614f, 4.5f, 8f, 4.5f)
                curveTo(7.72386f, 4.5f, 7.5f, 4.72386f, 7.5f, 5f)
                verticalLineTo(9.79289f)
                lineTo(5.85355f, 8.14645f)
                curveTo(5.65829f, 7.95118f, 5.34171f, 7.95118f, 5.14645f, 8.14645f)
                curveTo(4.95118f, 8.34171f, 4.95118f, 8.65829f, 5.14645f, 8.85355f)
                close()
                moveTo(8f, 15f)
                curveTo(4.13401f, 15f, 1f, 11.866f, 1f, 8f)
                curveTo(1f, 4.13401f, 4.13401f, 1f, 8f, 1f)
                curveTo(11.866f, 1f, 15f, 4.13401f, 15f, 8f)
                curveTo(15f, 11.866f, 11.866f, 15f, 8f, 15f)
                close()
                moveTo(2f, 8f)
                curveTo(2f, 11.3137f, 4.68629f, 14f, 8f, 14f)
                curveTo(11.3137f, 14f, 14f, 11.3137f, 14f, 8f)
                curveTo(14f, 4.68629f, 11.3137f, 2f, 8f, 2f)
                curveTo(4.68629f, 2f, 2f, 4.68629f, 2f, 8f)
                close()
            }
        }.build()
        
        return _ArrowCircleDown!!
    }

private var _ArrowCircleDown: ImageVector? = null

