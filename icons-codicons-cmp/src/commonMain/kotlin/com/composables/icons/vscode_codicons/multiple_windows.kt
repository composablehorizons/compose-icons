package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MultipleWindows: ImageVector
    get() {
        if (_MultipleWindows != null) return _MultipleWindows!!
        
        _MultipleWindows = ImageVector.Builder(
            name = "multiple-windows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 13f)
                curveTo(11.878f, 13f, 13f, 11.879f, 13f, 10.5f)
                verticalLineTo(3.5f)
                curveTo(13f, 2.121f, 11.878f, 1f, 10.5f, 1f)
                horizontalLineTo(3.5f)
                curveTo(2.122f, 1f, 1f, 2.121f, 1f, 3.5f)
                verticalLineTo(10.5f)
                curveTo(1f, 11.879f, 2.122f, 13f, 3.5f, 13f)
                horizontalLineTo(10.5f)
                close()
                moveTo(3.5f, 2f)
                horizontalLineTo(10.5f)
                curveTo(11.327f, 2f, 12f, 2.673f, 12f, 3.5f)
                verticalLineTo(4f)
                horizontalLineTo(2f)
                verticalLineTo(3.5f)
                curveTo(2f, 2.673f, 2.673f, 2f, 3.5f, 2f)
                close()
                moveTo(2f, 10.5f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(10.5f)
                curveTo(12f, 11.327f, 11.327f, 12f, 10.5f, 12f)
                horizontalLineTo(3.5f)
                curveTo(2.673f, 12f, 2f, 11.327f, 2f, 10.5f)
                close()
                moveTo(15f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(15f, 12.98f, 12.98f, 15f, 10.5f, 15f)
                horizontalLineTo(5.5f)
                curveTo(4.68f, 15f, 3.96f, 14.61f, 3.5f, 14f)
                horizontalLineTo(10.5f)
                curveTo(12.43f, 14f, 14f, 12.43f, 14f, 10.5f)
                verticalLineTo(3.5f)
                curveTo(14.61f, 3.96f, 15f, 4.68f, 15f, 5.5f)
                close()
            }
        }.build()
        
        return _MultipleWindows!!
    }

private var _MultipleWindows: ImageVector? = null

