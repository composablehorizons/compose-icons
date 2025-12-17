package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ToggleOff: ImageVector
    get() {
        if (_ToggleOff != null) return _ToggleOff!!
        
        _ToggleOff = ImageVector.Builder(
            name = "toggle-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 4f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                horizontalLineTo(8f)
                arcToRelative(5f, 5f, 0f, false, false, 2f, -4f)
                arcToRelative(5f, 5f, 0f, false, false, -2f, -4f)
                close()
                moveToRelative(-6f, 8f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                moveTo(0f, 8f)
                arcToRelative(5f, 5f, 0f, false, false, 5f, 5f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, -10f)
                horizontalLineTo(5f)
                arcToRelative(5f, 5f, 0f, false, false, -5f, 5f)
            }
        }.build()
        
        return _ToggleOff!!
    }

private var _ToggleOff: ImageVector? = null

