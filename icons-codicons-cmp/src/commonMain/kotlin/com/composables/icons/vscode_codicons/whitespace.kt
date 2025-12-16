package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Whitespace: ImageVector
    get() {
        if (_Whitespace != null) return _Whitespace!!
        
        _Whitespace = ImageVector.Builder(
            name = "whitespace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 2f)
                horizontalLineTo(11.5f)
                curveTo(11.776f, 2f, 12f, 2.224f, 12f, 2.5f)
                curveTo(12f, 2.776f, 11.776f, 3f, 11.5f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(13.5f)
                curveTo(11f, 13.776f, 10.776f, 14f, 10.5f, 14f)
                curveTo(10.224f, 14f, 10f, 13.776f, 10f, 13.5f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(13.5f)
                curveTo(9f, 13.776f, 8.776f, 14f, 8.5f, 14f)
                curveTo(8.224f, 14f, 8f, 13.776f, 8f, 13.5f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                curveTo(5.067f, 9f, 3.5f, 7.433f, 3.5f, 5.5f)
                curveTo(3.5f, 3.567f, 5.067f, 2f, 7f, 2f)
                close()
                moveTo(7f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                curveTo(5.619f, 3f, 4.5f, 4.119f, 4.5f, 5.5f)
                curveTo(4.5f, 6.881f, 5.619f, 8f, 7f, 8f)
                close()
            }
        }.build()
        
        return _Whitespace!!
    }

private var _Whitespace: ImageVector? = null

