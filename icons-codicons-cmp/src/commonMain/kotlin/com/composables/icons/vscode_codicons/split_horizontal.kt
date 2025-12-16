package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SplitHorizontal: ImageVector
    get() {
        if (_SplitHorizontal != null) return _SplitHorizontal!!
        
        _SplitHorizontal = ImageVector.Builder(
            name = "split-horizontal",
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
                curveTo(1f, 13.878f, 2.122f, 15f, 3.5f, 15f)
                horizontalLineTo(12.5f)
                curveTo(13.878f, 15f, 15f, 13.878f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.122f, 13.878f, 1f, 12.5f, 1f)
                close()
                moveTo(2f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                horizontalLineTo(7.5f)
                verticalLineTo(14f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 14f, 2f, 13.327f, 2f, 12.5f)
                close()
                moveTo(14f, 12.5f)
                curveTo(14f, 13.327f, 13.327f, 14f, 12.5f, 14f)
                horizontalLineTo(8.5f)
                verticalLineTo(2f)
                horizontalLineTo(12.5f)
                curveTo(13.327f, 2f, 14f, 2.673f, 14f, 3.5f)
                verticalLineTo(12.5f)
                close()
            }
        }.build()
        
        return _SplitHorizontal!!
    }

private var _SplitHorizontal: ImageVector? = null

