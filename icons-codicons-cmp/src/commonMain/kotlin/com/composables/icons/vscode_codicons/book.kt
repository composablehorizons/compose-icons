package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Book: ImageVector
    get() {
        if (_Book != null) return _Book!!
        
        _Book = ImageVector.Builder(
            name = "book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 2f)
                curveTo(1.67157f, 2f, 1f, 2.67157f, 1f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(1f, 13.3284f, 1.67157f, 14f, 2.5f, 14f)
                horizontalLineTo(6f)
                curveTo(6.8178f, 14f, 7.54389f, 13.6073f, 8f, 13.0002f)
                curveTo(8.45612f, 13.6073f, 9.1822f, 14f, 10f, 14f)
                horizontalLineTo(13.5f)
                curveTo(14.3284f, 14f, 15f, 13.3284f, 15f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(15f, 2.67157f, 14.3284f, 2f, 13.5f, 2f)
                horizontalLineTo(10f)
                curveTo(9.1822f, 2f, 8.45612f, 2.39267f, 8f, 2.99976f)
                curveTo(7.54389f, 2.39267f, 6.8178f, 2f, 6f, 2f)
                horizontalLineTo(2.5f)
                close()
                moveTo(7.5f, 4.5f)
                verticalLineTo(11.5f)
                curveTo(7.5f, 12.3284f, 6.82843f, 13f, 6f, 13f)
                horizontalLineTo(2.5f)
                curveTo(2.22386f, 13f, 2f, 12.7761f, 2f, 12.5f)
                verticalLineTo(3.5f)
                curveTo(2f, 3.22386f, 2.22386f, 3f, 2.5f, 3f)
                horizontalLineTo(6f)
                curveTo(6.82843f, 3f, 7.5f, 3.67157f, 7.5f, 4.5f)
                close()
                moveTo(8.5f, 11.5f)
                verticalLineTo(4.5f)
                curveTo(8.5f, 3.67157f, 9.17157f, 3f, 10f, 3f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 3f, 14f, 3.22386f, 14f, 3.5f)
                verticalLineTo(12.5f)
                curveTo(14f, 12.7761f, 13.7761f, 13f, 13.5f, 13f)
                horizontalLineTo(10f)
                curveTo(9.17157f, 13f, 8.5f, 12.3284f, 8.5f, 11.5f)
                close()
            }
        }.build()
        
        return _Book!!
    }

private var _Book: ImageVector? = null

