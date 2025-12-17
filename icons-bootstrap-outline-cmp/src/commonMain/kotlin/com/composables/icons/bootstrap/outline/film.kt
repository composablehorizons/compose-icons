package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Film: ImageVector
    get() {
        if (_Film != null) return _Film!!
        
        _Film = ImageVector.Builder(
            name = "film",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(4f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineTo(1f)
                close()
                moveToRelative(8f, 8f)
                horizontalLineTo(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                close()
                moveTo(1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                close()
                moveToRelative(2f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(1f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                close()
                moveToRelative(2f, 3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-2f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-2f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                close()
                moveToRelative(2f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-2f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Film!!
    }

private var _Film: ImageVector? = null

