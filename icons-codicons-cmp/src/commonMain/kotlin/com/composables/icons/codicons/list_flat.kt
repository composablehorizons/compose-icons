package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ListFlat: ImageVector
    get() {
        if (_ListFlat != null) return _ListFlat!!
        
        _ListFlat = ImageVector.Builder(
            name = "list-flat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                curveTo(2f, 3.224f, 2.224f, 3f, 2.5f, 3f)
                horizontalLineTo(10.5f)
                curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
                curveTo(11f, 3.776f, 10.776f, 4f, 10.5f, 4f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 4f, 2f, 3.776f, 2f, 3.5f)
                close()
                moveTo(13.5f, 6f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
                curveTo(2f, 6.776f, 2.224f, 7f, 2.5f, 7f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 7f, 14f, 6.776f, 14f, 6.5f)
                curveTo(14f, 6.224f, 13.776f, 6f, 13.5f, 6f)
                close()
                moveTo(9.5f, 9f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 9f, 2f, 9.224f, 2f, 9.5f)
                curveTo(2f, 9.776f, 2.224f, 10f, 2.5f, 10f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 10f, 10f, 9.776f, 10f, 9.5f)
                curveTo(10f, 9.224f, 9.776f, 9f, 9.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 12f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 12f, 12f, 12.224f, 12f, 12.5f)
                curveTo(12f, 12.776f, 11.776f, 13f, 11.5f, 13f)
                horizontalLineTo(2.5f)
                curveTo(2.224f, 13f, 2f, 12.776f, 2f, 12.5f)
                curveTo(2f, 12.224f, 2.224f, 12f, 2.5f, 12f)
                close()
            }
        }.build()
        
        return _ListFlat!!
    }

private var _ListFlat: ImageVector? = null

