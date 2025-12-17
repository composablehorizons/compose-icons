package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Reply: ImageVector
    get() {
        if (_Reply != null) return _Reply!!
        
        _Reply = ImageVector.Builder(
            name = "reply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.35355f, 3.64645f)
                curveTo(6.54882f, 3.84171f, 6.54882f, 4.15829f, 6.35355f, 4.35355f)
                lineTo(3.70711f, 7f)
                horizontalLineTo(8.5f)
                curveTo(11.5376f, 7f, 14f, 9.46243f, 14f, 12.5f)
                curveTo(14f, 12.7761f, 13.7761f, 13f, 13.5f, 13f)
                curveTo(13.2239f, 13f, 13f, 12.7761f, 13f, 12.5f)
                curveTo(13f, 10.0147f, 10.9853f, 8f, 8.5f, 8f)
                horizontalLineTo(3.70711f)
                lineTo(6.35355f, 10.6464f)
                curveTo(6.54882f, 10.8417f, 6.54882f, 11.1583f, 6.35355f, 11.3536f)
                curveTo(6.15829f, 11.5488f, 5.84171f, 11.5488f, 5.64645f, 11.3536f)
                lineTo(2.14645f, 7.85355f)
                curveTo(1.95118f, 7.65829f, 1.95118f, 7.34171f, 2.14645f, 7.14645f)
                lineTo(5.64645f, 3.64645f)
                curveTo(5.84171f, 3.45118f, 6.15829f, 3.45118f, 6.35355f, 3.64645f)
                close()
            }
        }.build()
        
        return _Reply!!
    }

private var _Reply: ImageVector? = null

