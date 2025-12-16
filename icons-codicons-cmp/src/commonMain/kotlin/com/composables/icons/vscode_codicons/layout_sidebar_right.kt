package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutSidebarRight: ImageVector
    get() {
        if (_LayoutSidebarRight != null) return _LayoutSidebarRight!!
        
        _LayoutSidebarRight = ImageVector.Builder(
            name = "layout-sidebar-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                curveTo(13.881f, 1f, 15f, 2.119f, 15f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(15f, 13.881f, 13.881f, 15f, 12.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 15f, 1f, 13.881f, 1f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 2.119f, 2.119f, 1f, 3.5f, 1f)
                horizontalLineTo(12.5f)
                close()
                moveTo(9f, 14f)
                verticalLineTo(2f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
                horizontalLineTo(9f)
                close()
            }
        }.build()
        
        return _LayoutSidebarRight!!
    }

private var _LayoutSidebarRight: ImageVector? = null

