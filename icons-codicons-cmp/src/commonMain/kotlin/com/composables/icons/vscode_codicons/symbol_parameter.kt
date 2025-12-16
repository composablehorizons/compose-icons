package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolParameter: ImageVector
    get() {
        if (_SymbolParameter != null) return _SymbolParameter!!
        
        _SymbolParameter = ImageVector.Builder(
            name = "symbol-parameter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 3.5f)
                curveTo(4f, 3.22386f, 4.22386f, 3f, 4.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(11.7761f, 3f, 12f, 3.22386f, 12f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(12f, 4.77614f, 11.7761f, 5f, 11.5f, 5f)
                curveTo(11.2239f, 5f, 11f, 4.77614f, 11f, 4.5f)
                verticalLineTo(4f)
                horizontalLineTo(8.5f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                curveTo(9.27614f, 12f, 9.5f, 12.2239f, 9.5f, 12.5f)
                curveTo(9.5f, 12.7761f, 9.27614f, 13f, 9f, 13f)
                horizontalLineTo(7f)
                curveTo(6.72386f, 13f, 6.5f, 12.7761f, 6.5f, 12.5f)
                curveTo(6.5f, 12.2239f, 6.72386f, 12f, 7f, 12f)
                horizontalLineTo(7.5f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(4.5f)
                curveTo(5f, 4.77614f, 4.77614f, 5f, 4.5f, 5f)
                curveTo(4.22386f, 5f, 4f, 4.77614f, 4f, 4.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(4.35355f, 6.64645f)
                curveTo(4.54882f, 6.84171f, 4.54882f, 7.15829f, 4.35355f, 7.35355f)
                lineTo(2.20711f, 9.5f)
                lineTo(4.35355f, 11.6464f)
                curveTo(4.54882f, 11.8417f, 4.54882f, 12.1583f, 4.35355f, 12.3536f)
                curveTo(4.15829f, 12.5488f, 3.84171f, 12.5488f, 3.64645f, 12.3536f)
                lineTo(1.14645f, 9.85355f)
                curveTo(0.951184f, 9.65829f, 0.951184f, 9.34171f, 1.14645f, 9.14645f)
                lineTo(3.64645f, 6.64645f)
                curveTo(3.84171f, 6.45118f, 4.15829f, 6.45118f, 4.35355f, 6.64645f)
                close()
                moveTo(14.8536f, 9.14645f)
                lineTo(12.3536f, 6.64645f)
                curveTo(12.1583f, 6.45118f, 11.8417f, 6.45118f, 11.6464f, 6.64645f)
                curveTo(11.4512f, 6.84171f, 11.4512f, 7.15829f, 11.6464f, 7.35355f)
                lineTo(13.7929f, 9.5f)
                lineTo(11.6464f, 11.6464f)
                curveTo(11.4512f, 11.8417f, 11.4512f, 12.1583f, 11.6464f, 12.3536f)
                curveTo(11.8417f, 12.5488f, 12.1583f, 12.5488f, 12.3536f, 12.3536f)
                lineTo(14.8536f, 9.85355f)
                curveTo(15.0488f, 9.65829f, 15.0488f, 9.34171f, 14.8536f, 9.14645f)
                close()
            }
        }.build()
        
        return _SymbolParameter!!
    }

private var _SymbolParameter: ImageVector? = null

