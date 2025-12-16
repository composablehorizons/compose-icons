package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SymbolEnumMember: ImageVector
    get() {
        if (_SymbolEnumMember != null) return _SymbolEnumMember!!
        
        _SymbolEnumMember = ImageVector.Builder(
            name = "symbol-enum-member",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3.5f)
                verticalLineTo(7.5f)
                curveTo(15f, 7.9f, 14.85f, 8.28f, 14.56f, 8.56f)
                curveTo(14.28f, 8.84f, 13.9f, 9f, 13.5f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(8.5f)
                curveTo(11f, 8.33f, 10.98f, 8.16f, 10.95f, 8f)
                horizontalLineTo(13.5f)
                curveTo(13.63f, 8f, 13.76f, 7.95f, 13.85f, 7.85f)
                curveTo(13.95f, 7.76f, 14f, 7.63f, 14f, 7.5f)
                verticalLineTo(3.5f)
                curveTo(14f, 3.37f, 13.95f, 3.24f, 13.85f, 3.15f)
                curveTo(13.76f, 3.05f, 13.63f, 3f, 13.5f, 3f)
                horizontalLineTo(7.5f)
                curveTo(7.37f, 3f, 7.24f, 3.05f, 7.15f, 3.15f)
                curveTo(7.05f, 3.24f, 7f, 3.37f, 7f, 3.5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(3.5f)
                curveTo(6f, 3.1f, 6.16f, 2.72f, 6.44f, 2.44f)
                curveTo(6.72f, 2.16f, 7.1f, 2f, 7.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(13.9f, 2f, 14.28f, 2.16f, 14.56f, 2.44f)
                curveTo(14.84f, 2.72f, 15f, 3.1f, 15f, 3.5f)
                close()
                moveTo(12.5f, 5f)
                curveTo(12.776f, 5f, 13f, 4.776f, 13f, 4.5f)
                curveTo(13f, 4.224f, 12.776f, 4f, 12.5f, 4f)
                horizontalLineTo(8.5f)
                curveTo(8.224f, 4f, 8f, 4.224f, 8f, 4.5f)
                curveTo(8f, 4.776f, 8.224f, 5f, 8.5f, 5f)
                horizontalLineTo(12.5f)
                close()
                moveTo(13f, 6.5f)
                curveTo(13f, 6.22f, 12.78f, 6f, 12.5f, 6f)
                horizontalLineTo(8.5f)
                curveTo(9.32f, 6f, 10.04f, 6.39f, 10.5f, 7f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 7f, 13f, 6.78f, 13f, 6.5f)
                close()
                moveTo(7.5f, 10f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 10f, 3f, 10.224f, 3f, 10.5f)
                curveTo(3f, 10.776f, 3.224f, 11f, 3.5f, 11f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 11f, 8f, 10.776f, 8f, 10.5f)
                curveTo(8f, 10.224f, 7.776f, 10f, 7.5f, 10f)
                close()
                moveTo(10f, 8.5f)
                verticalLineTo(12.5f)
                curveTo(10f, 13.327f, 9.327f, 14f, 8.5f, 14f)
                horizontalLineTo(2.5f)
                curveTo(1.673f, 14f, 1f, 13.327f, 1f, 12.5f)
                verticalLineTo(8.5f)
                curveTo(1f, 7.673f, 1.673f, 7f, 2.5f, 7f)
                horizontalLineTo(8.5f)
                curveTo(9.327f, 7f, 10f, 7.673f, 10f, 8.5f)
                close()
            }
        }.build()
        
        return _SymbolEnumMember!!
    }

private var _SymbolEnumMember: ImageVector? = null

