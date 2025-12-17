package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Memory: ImageVector
    get() {
        if (_Memory != null) return _Memory!!
        
        _Memory = ImageVector.Builder(
            name = "memory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, -0.293f)
                lineToRelative(0.353f, -0.353f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.353f, 0.353f)
                arcToRelative(1f, 1f, 0f, false, false, 0.707f, 0.293f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(0.5f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(5f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(4.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(2f, 10f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(3f, 0f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(2f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Memory!!
    }

private var _Memory: ImageVector? = null

