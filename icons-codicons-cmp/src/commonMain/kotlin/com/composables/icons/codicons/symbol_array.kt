package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolArray: ImageVector
    get() {
        if (_SymbolArray != null) return _SymbolArray!!
        
        _SymbolArray = ImageVector.Builder(
            name = "symbol-array",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 14f)
                horizontalLineTo(4.5f)
                curveTo(3.673f, 14f, 3f, 13.327f, 3f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(3f, 2.673f, 3.673f, 2f, 4.5f, 2f)
                horizontalLineTo(5f)
                curveTo(5.276f, 2f, 5.5f, 2.224f, 5.5f, 2.5f)
                curveTo(5.5f, 2.776f, 5.276f, 3f, 5f, 3f)
                horizontalLineTo(4.5f)
                curveTo(4.225f, 3f, 4f, 3.224f, 4f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(4f, 12.776f, 4.225f, 13f, 4.5f, 13f)
                horizontalLineTo(5f)
                curveTo(5.276f, 13f, 5.5f, 13.224f, 5.5f, 13.5f)
                curveTo(5.5f, 13.776f, 5.276f, 14f, 5f, 14f)
                close()
                moveTo(13f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 2.673f, 12.327f, 2f, 11.5f, 2f)
                horizontalLineTo(11f)
                curveTo(10.724f, 2f, 10.5f, 2.224f, 10.5f, 2.5f)
                curveTo(10.5f, 2.776f, 10.724f, 3f, 11f, 3f)
                horizontalLineTo(11.5f)
                curveTo(11.775f, 3f, 12f, 3.224f, 12f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(12f, 12.776f, 11.775f, 13f, 11.5f, 13f)
                horizontalLineTo(11f)
                curveTo(10.724f, 13f, 10.5f, 13.224f, 10.5f, 13.5f)
                curveTo(10.5f, 13.776f, 10.724f, 14f, 11f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.327f, 14f, 13f, 13.327f, 13f, 12.5f)
                close()
            }
        }.build()
        
        return _SymbolArray!!
    }

private var _SymbolArray: ImageVector? = null

