package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.DiffModified: ImageVector
    get() {
        if (_DiffModified != null) return _DiffModified!!
        
        _DiffModified = ImageVector.Builder(
            name = "diff-modified",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 2f)
                horizontalLineTo(4.5f)
                curveTo(3.119f, 2f, 2f, 3.119f, 2f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 12.881f, 3.119f, 14f, 4.5f, 14f)
                horizontalLineTo(11.5f)
                curveTo(12.881f, 14f, 14f, 12.881f, 14f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 3.119f, 12.881f, 2f, 11.5f, 2f)
                close()
                moveTo(13f, 11.5f)
                curveTo(13f, 12.328f, 12.328f, 13f, 11.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
                horizontalLineTo(11.5f)
                curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
                verticalLineTo(11.5f)
                close()
                moveTo(11f, 8f)
                curveTo(11f, 9.654f, 9.654f, 11f, 8f, 11f)
                curveTo(6.346f, 11f, 5f, 9.654f, 5f, 8f)
                curveTo(5f, 6.346f, 6.346f, 5f, 8f, 5f)
                curveTo(9.654f, 5f, 11f, 6.346f, 11f, 8f)
                close()
            }
        }.build()
        
        return _DiffModified!!
    }

private var _DiffModified: ImageVector? = null

