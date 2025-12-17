package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Table: ImageVector
    get() {
        if (_Table != null) return _Table!!
        
        _Table = ImageVector.Builder(
            name = "table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(15f, 2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
                moveToRelative(-5f, 3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(-5f, 0f)
                verticalLineToRelative(-3f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
                moveToRelative(-4f, -4f)
                horizontalLineToRelative(4f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(4f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                close()
                moveToRelative(5f, -3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineTo(4f)
                close()
                moveToRelative(4f, 4f)
                horizontalLineTo(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Table!!
    }

private var _Table: ImageVector? = null

