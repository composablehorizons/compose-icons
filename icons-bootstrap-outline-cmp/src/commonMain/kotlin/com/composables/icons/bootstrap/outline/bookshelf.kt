package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bookshelf: ImageVector
    get() {
        if (_Bookshelf != null) return _Bookshelf!!
        
        _Bookshelf = ImageVector.Builder(
            name = "bookshelf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(2f)
                horizontalLineToRelative(10f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                verticalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(3f, 14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(10f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(10f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Bookshelf!!
    }

private var _Bookshelf: ImageVector? = null

