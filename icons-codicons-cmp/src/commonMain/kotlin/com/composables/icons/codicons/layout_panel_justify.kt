package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutPanelJustify: ImageVector
    get() {
        if (_LayoutPanelJustify != null) return _LayoutPanelJustify!!
        
        _LayoutPanelJustify = ImageVector.Builder(
            name = "layout-panel-justify",
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
                curveTo(2.121f, 1f, 1f, 2.121f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.879f, 2.121f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.879f, 15f, 15f, 13.879f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.121f, 13.879f, 1f, 12.5f, 1f)
                close()
                moveTo(14f, 3.5f)
                verticalLineTo(10f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                close()
                moveTo(5f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                close()
                moveTo(4f, 2f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                horizontalLineTo(4f)
                close()
            }
        }.build()
        
        return _LayoutPanelJustify!!
    }

private var _LayoutPanelJustify: ImageVector? = null

