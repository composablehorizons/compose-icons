package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Command: ImageVector
    get() {
        if (_Command != null) return _Command!!
        
        _Command = ImageVector.Builder(
            name = "command",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5f, 3.5f)
                verticalLineTo(5f)
                horizontalLineTo(3.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                moveTo(6f, 5f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, true, false, 3.5f, 6f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                horizontalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0f, true, false, 6f, 12.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 2.5f, -2.5f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0f, true, false, 10f, 3.5f)
                verticalLineTo(5f)
                close()
                moveToRelative(4f, 1f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
                moveToRelative(1f, -1f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, true, true, 12.5f, 5f)
                close()
                moveToRelative(0f, 6f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, -1.5f, 1.5f)
                close()
                moveToRelative(-6f, 0f)
                verticalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, true, true, 3.5f, 11f)
                close()
            }
        }.build()
        
        return _Command!!
    }

private var _Command: ImageVector? = null

