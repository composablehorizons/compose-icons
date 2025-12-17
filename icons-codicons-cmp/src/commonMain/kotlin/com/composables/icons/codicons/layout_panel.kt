package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutPanel: ImageVector
    get() {
        if (_LayoutPanel != null) return _LayoutPanel!!
        
        _LayoutPanel = ImageVector.Builder(
            name = "layout-panel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 12.5f)
                curveTo(15f, 13.881f, 13.881f, 15f, 12.5f, 15f)
                horizontalLineTo(3.5f)
                curveTo(2.119f, 15f, 1f, 13.881f, 1f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(1f, 2.119f, 2.119f, 1f, 3.5f, 1f)
                horizontalLineTo(12.5f)
                curveTo(13.881f, 1f, 15f, 2.119f, 15f, 3.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(2f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(3.5f)
                curveTo(14f, 2.672f, 13.328f, 2f, 12.5f, 2f)
                horizontalLineTo(3.5f)
                curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
                verticalLineTo(10f)
                close()
            }
        }.build()
        
        return _LayoutPanel!!
    }

private var _LayoutPanel: ImageVector? = null

