package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolOperator: ImageVector
    get() {
        if (_SymbolOperator != null) return _SymbolOperator!!
        
        _SymbolOperator = ImageVector.Builder(
            name = "symbol-operator",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                curveTo(4.77614f, 2f, 5f, 2.22386f, 5f, 2.5f)
                verticalLineTo(4f)
                horizontalLineTo(6.5f)
                curveTo(6.77614f, 4f, 7f, 4.22386f, 7f, 4.5f)
                curveTo(7f, 4.77614f, 6.77614f, 5f, 6.5f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(6.5f)
                curveTo(5f, 6.77614f, 4.77614f, 7f, 4.5f, 7f)
                curveTo(4.22386f, 7f, 4f, 6.77614f, 4f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 5f, 2f, 4.77614f, 2f, 4.5f)
                curveTo(2f, 4.22386f, 2.22386f, 4f, 2.5f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(2.5f)
                curveTo(4f, 2.22386f, 4.22386f, 2f, 4.5f, 2f)
                close()
                moveTo(9.5f, 4f)
                curveTo(9.22386f, 4f, 9f, 4.22386f, 9f, 4.5f)
                curveTo(9f, 4.77614f, 9.22386f, 5f, 9.5f, 5f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 5f, 14f, 4.77614f, 14f, 4.5f)
                curveTo(14f, 4.22386f, 13.7761f, 4f, 13.5f, 4f)
                horizontalLineTo(9.5f)
                close()
                moveTo(5.20711f, 11.5f)
                lineTo(6.85355f, 9.85355f)
                curveTo(7.04882f, 9.65829f, 7.04882f, 9.34171f, 6.85355f, 9.14645f)
                curveTo(6.65829f, 8.95118f, 6.34171f, 8.95118f, 6.14645f, 9.14645f)
                lineTo(4.5f, 10.7929f)
                lineTo(2.85355f, 9.14645f)
                curveTo(2.65829f, 8.95118f, 2.34171f, 8.95118f, 2.14645f, 9.14645f)
                curveTo(1.95118f, 9.34171f, 1.95118f, 9.65829f, 2.14645f, 9.85355f)
                lineTo(3.79289f, 11.5f)
                lineTo(2.14645f, 13.1464f)
                curveTo(1.95118f, 13.3417f, 1.95118f, 13.6583f, 2.14645f, 13.8536f)
                curveTo(2.34171f, 14.0488f, 2.65829f, 14.0488f, 2.85355f, 13.8536f)
                lineTo(4.5f, 12.2071f)
                lineTo(6.14645f, 13.8536f)
                curveTo(6.34171f, 14.0488f, 6.65829f, 14.0488f, 6.85355f, 13.8536f)
                curveTo(7.04882f, 13.6583f, 7.04882f, 13.3417f, 6.85355f, 13.1464f)
                lineTo(5.20711f, 11.5f)
                close()
                moveTo(11.5f, 10f)
                curveTo(12.0523f, 10f, 12.5f, 9.55228f, 12.5f, 9f)
                curveTo(12.5f, 8.44771f, 12.0523f, 8f, 11.5f, 8f)
                curveTo(10.9477f, 8f, 10.5f, 8.44771f, 10.5f, 9f)
                curveTo(10.5f, 9.55228f, 10.9477f, 10f, 11.5f, 10f)
                close()
                moveTo(9.5f, 10.5f)
                curveTo(9.22386f, 10.5f, 9f, 10.7239f, 9f, 11f)
                curveTo(9f, 11.2761f, 9.22386f, 11.5f, 9.5f, 11.5f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 11.5f, 14f, 11.2761f, 14f, 11f)
                curveTo(14f, 10.7239f, 13.7761f, 10.5f, 13.5f, 10.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(12.5f, 13f)
                curveTo(12.5f, 13.5523f, 12.0523f, 14f, 11.5f, 14f)
                curveTo(10.9477f, 14f, 10.5f, 13.5523f, 10.5f, 13f)
                curveTo(10.5f, 12.4477f, 10.9477f, 12f, 11.5f, 12f)
                curveTo(12.0523f, 12f, 12.5f, 12.4477f, 12.5f, 13f)
                close()
            }
        }.build()
        
        return _SymbolOperator!!
    }

private var _SymbolOperator: ImageVector? = null

