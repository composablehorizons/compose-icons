package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutPanelRight: ImageVector
    get() {
        if (_LayoutPanelRight != null) return _LayoutPanelRight!!
        
        _LayoutPanelRight = ImageVector.Builder(
            name = "layout-panel-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                horizontalLineTo(3.5f)
                curveTo(2.122f, 1f, 1f, 2.122f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.879f, 2.122f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.878f, 15f, 15f, 13.879f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.122f, 13.878f, 1f, 12.5f, 1f)
                close()
                moveTo(12.5f, 2f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                close()
                moveTo(6f, 14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _LayoutPanelRight!!
    }

private var _LayoutPanelRight: ImageVector? = null

