package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolNumeric: ImageVector
    get() {
        if (_SymbolNumeric != null) return _SymbolNumeric!!
        
        _SymbolNumeric = ImageVector.Builder(
            name = "symbol-numeric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 6f, 15f, 5.776f, 15f, 5.5f)
                curveTo(15f, 5.224f, 14.776f, 5f, 14.5f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(1.5f)
                curveTo(11f, 1.224f, 10.776f, 1f, 10.5f, 1f)
                curveTo(10.224f, 1f, 10f, 1.224f, 10f, 1.5f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(1.5f)
                curveTo(6f, 1.224f, 5.776f, 1f, 5.5f, 1f)
                curveTo(5.224f, 1f, 5f, 1.224f, 5f, 1.5f)
                verticalLineTo(5f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 5f, 1f, 5.224f, 1f, 5.5f)
                curveTo(1f, 5.776f, 1.224f, 6f, 1.5f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(1.5f)
                curveTo(1.224f, 10f, 1f, 10.224f, 1f, 10.5f)
                curveTo(1f, 10.776f, 1.224f, 11f, 1.5f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(14.5f)
                curveTo(5f, 14.776f, 5.224f, 15f, 5.5f, 15f)
                curveTo(5.776f, 15f, 6f, 14.776f, 6f, 14.5f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(14.5f)
                curveTo(10f, 14.776f, 10.224f, 15f, 10.5f, 15f)
                curveTo(10.776f, 15f, 11f, 14.776f, 11f, 14.5f)
                verticalLineTo(11f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 11f, 15f, 10.776f, 15f, 10.5f)
                curveTo(15f, 10.224f, 14.776f, 10f, 14.5f, 10f)
                close()
                moveTo(6f, 10f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _SymbolNumeric!!
    }

private var _SymbolNumeric: ImageVector? = null

