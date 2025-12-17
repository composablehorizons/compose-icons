package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ArrowCircleLeft: ImageVector
    get() {
        if (_ArrowCircleLeft != null) return _ArrowCircleLeft!!
        
        _ArrowCircleLeft = ImageVector.Builder(
            name = "arrow-circle-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.14645f, 10.8536f)
                lineTo(4.64645f, 8.35355f)
                curveTo(4.45118f, 8.15829f, 4.45118f, 7.84171f, 4.64645f, 7.64645f)
                lineTo(7.14645f, 5.14645f)
                curveTo(7.34171f, 4.95118f, 7.65829f, 4.95118f, 7.85355f, 5.14645f)
                curveTo(8.04882f, 5.34171f, 8.04882f, 5.65829f, 7.85355f, 5.85355f)
                lineTo(6.20711f, 7.5f)
                horizontalLineTo(11f)
                curveTo(11.2761f, 7.5f, 11.5f, 7.72386f, 11.5f, 8f)
                curveTo(11.5f, 8.27614f, 11.2761f, 8.5f, 11f, 8.5f)
                horizontalLineTo(6.20711f)
                lineTo(7.85355f, 10.1464f)
                curveTo(8.04882f, 10.3417f, 8.04882f, 10.6583f, 7.85355f, 10.8536f)
                curveTo(7.65829f, 11.0488f, 7.34171f, 11.0488f, 7.14645f, 10.8536f)
                close()
                moveTo(1f, 8f)
                curveTo(1f, 11.866f, 4.13401f, 15f, 8f, 15f)
                curveTo(11.866f, 15f, 15f, 11.866f, 15f, 8f)
                curveTo(15f, 4.13401f, 11.866f, 1f, 8f, 1f)
                curveTo(4.13401f, 1f, 1f, 4.13401f, 1f, 8f)
                close()
                moveTo(8f, 14f)
                curveTo(4.68629f, 14f, 2f, 11.3137f, 2f, 8f)
                curveTo(2f, 4.68629f, 4.68629f, 2f, 8f, 2f)
                curveTo(11.3137f, 2f, 14f, 4.68629f, 14f, 8f)
                curveTo(14f, 11.3137f, 11.3137f, 14f, 8f, 14f)
                close()
            }
        }.build()
        
        return _ArrowCircleLeft!!
    }

private var _ArrowCircleLeft: ImageVector? = null

