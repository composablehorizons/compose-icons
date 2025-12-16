package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Discard: ImageVector
    get() {
        if (_Discard != null) return _Discard!!
        
        _Discard = ImageVector.Builder(
            name = "discard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.00098f, 2.5f)
                curveTo(3.00098f, 2.22386f, 3.22483f, 2f, 3.50098f, 2f)
                curveTo(3.77712f, 2f, 4.00098f, 2.22386f, 4.00098f, 2.5f)
                verticalLineTo(6.34262f)
                lineTo(7.17202f, 3.17157f)
                curveTo(8.73412f, 1.60948f, 11.2668f, 1.60948f, 12.8289f, 3.17157f)
                curveTo(14.391f, 4.73367f, 14.391f, 7.26633f, 12.8289f, 8.82843f)
                lineTo(7.80375f, 13.8536f)
                curveTo(7.60849f, 14.0488f, 7.2919f, 14.0488f, 7.09664f, 13.8536f)
                curveTo(6.90138f, 13.6583f, 6.90138f, 13.3417f, 7.09664f, 13.1464f)
                lineTo(12.1218f, 8.12132f)
                curveTo(13.2933f, 6.94975f, 13.2933f, 5.05025f, 12.1218f, 3.87868f)
                curveTo(10.9502f, 2.70711f, 9.0507f, 2.70711f, 7.87913f, 3.87868f)
                lineTo(4.75781f, 7f)
                horizontalLineTo(8.50098f)
                curveTo(8.77712f, 7f, 9.00098f, 7.22386f, 9.00098f, 7.5f)
                curveTo(9.00098f, 7.77614f, 8.77712f, 8f, 8.50098f, 8f)
                horizontalLineTo(3.60098f)
                curveTo(3.26961f, 8f, 3.00098f, 7.73137f, 3.00098f, 7.4f)
                verticalLineTo(2.5f)
                close()
            }
        }.build()
        
        return _Discard!!
    }

private var _Discard: ImageVector? = null

