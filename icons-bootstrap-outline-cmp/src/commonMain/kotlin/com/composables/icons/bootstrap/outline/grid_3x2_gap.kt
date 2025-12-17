package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Grid3x2Gap: ImageVector
    get() {
        if (_Grid3x2Gap != null) return _Grid3x2Gap!!
        
        _Grid3x2Gap = ImageVector.Builder(
            name = "grid-3x2-gap",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 4f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                close()
                moveToRelative(1f, 7f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                moveToRelative(0f, -5f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                moveToRelative(5f, 5f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                moveToRelative(0f, -5f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                moveTo(9f, 4f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                close()
                moveToRelative(5f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 9f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                close()
                moveToRelative(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
                moveToRelative(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                close()
                moveToRelative(-3f, -5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
                moveToRelative(1f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Grid3x2Gap!!
    }

private var _Grid3x2Gap: ImageVector? = null

