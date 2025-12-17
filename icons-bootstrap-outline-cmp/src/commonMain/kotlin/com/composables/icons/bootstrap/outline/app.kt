package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.App: ImageVector
    get() {
        if (_App != null) return _App!!
        
        _App = ImageVector.Builder(
            name = "app",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                close()
                moveTo(5f, 1f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, 4f)
                horizontalLineToRelative(6f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineTo(5f)
                arcToRelative(4f, 4f, 0f, false, false, -4f, -4f)
                close()
            }
        }.build()
        
        return _App!!
    }

private var _App: ImageVector? = null

