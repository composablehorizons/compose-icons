package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Mute: ImageVector
    get() {
        if (_Mute != null) return _Mute!!
        
        _Mute = ImageVector.Builder(
            name = "mute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.69386f, 2.03934f)
                curveTo(8.87908f, 2.11749f, 8.99949f, 2.29898f, 8.99949f, 2.50001f)
                verticalLineTo(13.5f)
                curveTo(8.99949f, 13.7014f, 8.87862f, 13.8832f, 8.69288f, 13.9611f)
                curveTo(8.50713f, 14.039f, 8.29277f, 13.9978f, 8.14909f, 13.8567f)
                lineTo(5.22265f, 10.9817f)
                horizontalLineTo(3.49951f)
                curveTo(2.67108f, 10.9817f, 1.99951f, 10.3101f, 1.99951f, 9.48172f)
                verticalLineTo(6.49273f)
                curveTo(1.99951f, 5.66431f, 2.67108f, 4.99273f, 3.49951f, 4.99273f)
                horizontalLineTo(5.22389f)
                lineTo(8.15061f, 2.14185f)
                curveTo(8.29461f, 2.00157f, 8.50863f, 1.96119f, 8.69386f, 2.03934f)
                close()
                moveTo(7.99949f, 3.68507f)
                lineTo(5.77605f, 5.85089f)
                curveTo(5.68269f, 5.94184f, 5.5575f, 5.99273f, 5.42717f, 5.99273f)
                horizontalLineTo(3.49951f)
                curveTo(3.22337f, 5.99273f, 2.99951f, 6.21659f, 2.99951f, 6.49273f)
                verticalLineTo(9.48172f)
                curveTo(2.99951f, 9.75786f, 3.22337f, 9.98172f, 3.49951f, 9.98172f)
                horizontalLineTo(5.42717f)
                curveTo(5.55824f, 9.98172f, 5.68407f, 10.0332f, 5.77757f, 10.125f)
                lineTo(7.99949f, 12.3079f)
                verticalLineTo(3.68507f)
                close()
                moveTo(10.1464f, 6.14646f)
                curveTo(10.3417f, 5.9512f, 10.6583f, 5.9512f, 10.8536f, 6.14646f)
                lineTo(12f, 7.29291f)
                lineTo(13.1464f, 6.14646f)
                curveTo(13.3417f, 5.9512f, 13.6583f, 5.9512f, 13.8536f, 6.14646f)
                curveTo(14.0488f, 6.34172f, 14.0488f, 6.65831f, 13.8536f, 6.85357f)
                lineTo(12.7071f, 8.00001f)
                lineTo(13.8536f, 9.14646f)
                curveTo(14.0488f, 9.34172f, 14.0488f, 9.65831f, 13.8536f, 9.85357f)
                curveTo(13.6583f, 10.0488f, 13.3417f, 10.0488f, 13.1464f, 9.85357f)
                lineTo(12f, 8.70712f)
                lineTo(10.8536f, 9.85357f)
                curveTo(10.6583f, 10.0488f, 10.3417f, 10.0488f, 10.1464f, 9.85357f)
                curveTo(9.95118f, 9.65831f, 9.95118f, 9.34172f, 10.1464f, 9.14646f)
                lineTo(11.2929f, 8.00001f)
                lineTo(10.1464f, 6.85357f)
                curveTo(9.95118f, 6.65831f, 9.95118f, 6.34172f, 10.1464f, 6.14646f)
                close()
            }
        }.build()
        
        return _Mute!!
    }

private var _Mute: ImageVector? = null

