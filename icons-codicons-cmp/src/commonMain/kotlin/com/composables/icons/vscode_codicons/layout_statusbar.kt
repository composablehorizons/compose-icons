package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutStatusbar: ImageVector
    get() {
        if (_LayoutStatusbar != null) return _LayoutStatusbar!!
        
        _LayoutStatusbar = ImageVector.Builder(
            name = "layout-statusbar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.881f, 2.119f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 15f, 15f, 13.881f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.119f, 13.881f, 1f, 12.5f, 1f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 1f, 1f, 2.119f, 1f, 3.5f)
                close()
                moveTo(14f, 12f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.672f, 2.672f, 2f, 3.5f, 2f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 2f, 14f, 2.672f, 14f, 3.5f)
                verticalLineTo(12f)
                close()
            }
        }.build()
        
        return _LayoutStatusbar!!
    }

private var _LayoutStatusbar: ImageVector? = null

