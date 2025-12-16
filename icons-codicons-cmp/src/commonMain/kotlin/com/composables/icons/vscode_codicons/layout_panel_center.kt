package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LayoutPanelCenter: ImageVector
    get() {
        if (_LayoutPanelCenter != null) return _LayoutPanelCenter!!
        
        _LayoutPanelCenter = ImageVector.Builder(
            name = "layout-panel-center",
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
                moveTo(2f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                close()
                moveTo(5f, 10f)
                verticalLineTo(2f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                verticalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _LayoutPanelCenter!!
    }

private var _LayoutPanelCenter: ImageVector? = null

