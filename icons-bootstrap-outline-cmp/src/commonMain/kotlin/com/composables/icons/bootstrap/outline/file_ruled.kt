package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.FileRuled: ImageVector
    get() {
        if (_FileRuled != null) return _FileRuled!!
        
        _FileRuled = ImageVector.Builder(
            name = "file-ruled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(2f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(10f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(9f, 6f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                close()
                moveToRelative(0f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
                moveToRelative(-8f, 2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
                moveToRelative(-2f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineToRelative(2f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _FileRuled!!
    }

private var _FileRuled: ImageVector? = null

