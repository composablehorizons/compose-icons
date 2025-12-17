package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.ExpandAll: ImageVector
    get() {
        if (_ExpandAll != null) return _ExpandAll!!
        
        _ExpandAll = ImageVector.Builder(
            name = "expand-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.268f)
                verticalLineTo(11f)
                curveTo(14f, 12.657f, 12.657f, 14f, 11f, 14f)
                horizontalLineTo(3.268f)
                curveTo(3.614f, 14.598f, 4.26f, 15f, 5f, 15f)
                horizontalLineTo(11f)
                curveTo(13.209f, 15f, 15f, 13.209f, 15f, 11f)
                verticalLineTo(5f)
                curveTo(15f, 4.26f, 14.598f, 3.613f, 14f, 3.268f)
                close()
                moveTo(9.5f, 7.5f)
                curveTo(9.776f, 7.5f, 10f, 7.276f, 10f, 7f)
                curveTo(10f, 6.724f, 9.776f, 6.5f, 9.5f, 6.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.5f)
                curveTo(7.5f, 4.224f, 7.276f, 4f, 7f, 4f)
                curveTo(6.724f, 4f, 6.5f, 4.224f, 6.5f, 4.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(4.5f)
                curveTo(4.224f, 6.5f, 4f, 6.724f, 4f, 7f)
                curveTo(4f, 7.276f, 4.224f, 7.5f, 4.5f, 7.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(9.5f)
                curveTo(6.5f, 9.776f, 6.724f, 10f, 7f, 10f)
                curveTo(7.276f, 10f, 7.5f, 9.776f, 7.5f, 9.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(11f, 1f)
                curveTo(12.105f, 1f, 13f, 1.895f, 13f, 3f)
                verticalLineTo(11f)
                curveTo(13f, 12.105f, 12.105f, 13f, 11f, 13f)
                horizontalLineTo(3f)
                curveTo(1.895f, 13f, 1f, 12.105f, 1f, 11f)
                verticalLineTo(3f)
                curveTo(1f, 1.895f, 1.895f, 1f, 3f, 1f)
                horizontalLineTo(11f)
                close()
                moveTo(12f, 3f)
                curveTo(12f, 2.448f, 11.552f, 2f, 11f, 2f)
                horizontalLineTo(3f)
                curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
                verticalLineTo(11f)
                curveTo(2f, 11.552f, 2.448f, 12f, 3f, 12f)
                horizontalLineTo(11f)
                curveTo(11.552f, 12f, 12f, 11.552f, 12f, 11f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _ExpandAll!!
    }

private var _ExpandAll: ImageVector? = null

