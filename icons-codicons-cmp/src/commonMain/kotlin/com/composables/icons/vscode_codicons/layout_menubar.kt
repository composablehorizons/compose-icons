package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutMenubar: ImageVector
    get() {
        if (_LayoutMenubar != null) return _LayoutMenubar!!
        
        _LayoutMenubar = ImageVector.Builder(
            name = "layout-menubar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3f)
                curveTo(4.776f, 3f, 5f, 3.224f, 5f, 3.5f)
                curveTo(5f, 3.776f, 4.776f, 4f, 4.5f, 4f)
                horizontalLineTo(3.5f)
                curveTo(3.224f, 4f, 3f, 3.776f, 3f, 3.5f)
                curveTo(3f, 3.224f, 3.224f, 3f, 3.5f, 3f)
                horizontalLineTo(4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 3f)
                curveTo(7.776f, 3f, 8f, 3.224f, 8f, 3.5f)
                curveTo(8f, 3.776f, 7.776f, 4f, 7.5f, 4f)
                horizontalLineTo(6.5f)
                curveTo(6.224f, 4f, 6f, 3.776f, 6f, 3.5f)
                curveTo(6f, 3.224f, 6.224f, 3f, 6.5f, 3f)
                horizontalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3f)
                curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
                curveTo(11f, 3.776f, 10.776f, 4f, 10.5f, 4f)
                horizontalLineTo(9.5f)
                curveTo(9.224f, 4f, 9f, 3.776f, 9f, 3.5f)
                curveTo(9f, 3.224f, 9.224f, 3f, 9.5f, 3f)
                horizontalLineTo(10.5f)
                close()
            }
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
                moveTo(3.5f, 2f)
                curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
                horizontalLineTo(12.5f)
                curveTo(13.328f, 14f, 14f, 13.328f, 14f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
                horizontalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _LayoutMenubar!!
    }

private var _LayoutMenubar: ImageVector? = null

