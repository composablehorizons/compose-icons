package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolStructure: ImageVector
    get() {
        if (_SymbolStructure != null) return _SymbolStructure!!
        
        _SymbolStructure = ImageVector.Builder(
            name = "symbol-structure",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3f)
                curveTo(1f, 2.44772f, 1.44772f, 2f, 2f, 2f)
                horizontalLineTo(14f)
                curveTo(14.5523f, 2f, 15f, 2.44772f, 15f, 3f)
                verticalLineTo(6f)
                curveTo(15f, 6.55228f, 14.5523f, 7f, 14f, 7f)
                horizontalLineTo(2f)
                curveTo(1.44772f, 7f, 1f, 6.55228f, 1f, 6f)
                verticalLineTo(3f)
                close()
                moveTo(2f, 3f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                lineTo(2f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 9f)
                curveTo(1.44772f, 9f, 1f, 9.44772f, 1f, 10f)
                verticalLineTo(13f)
                curveTo(1f, 13.5523f, 1.44772f, 14f, 2f, 14f)
                horizontalLineTo(5f)
                curveTo(5.55228f, 14f, 6f, 13.5523f, 6f, 13f)
                verticalLineTo(10f)
                curveTo(6f, 9.44772f, 5.55228f, 9f, 5f, 9f)
                horizontalLineTo(2f)
                close()
                moveTo(5f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 9f)
                curveTo(10.4477f, 9f, 10f, 9.44772f, 10f, 10f)
                verticalLineTo(13f)
                curveTo(10f, 13.5523f, 10.4477f, 14f, 11f, 14f)
                horizontalLineTo(14f)
                curveTo(14.5523f, 14f, 15f, 13.5523f, 15f, 13f)
                verticalLineTo(10f)
                curveTo(15f, 9.44772f, 14.5523f, 9f, 14f, 9f)
                horizontalLineTo(11f)
                close()
                moveTo(14f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _SymbolStructure!!
    }

private var _SymbolStructure: ImageVector? = null

