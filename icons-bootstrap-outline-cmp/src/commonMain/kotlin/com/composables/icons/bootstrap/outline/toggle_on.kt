package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ToggleOn: ImageVector
    get() {
        if (_ToggleOn != null) return _ToggleOn!!
        
        _ToggleOn = ImageVector.Builder(
            name = "toggle-on",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 3f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, 10f)
                horizontalLineToRelative(6f)
                arcToRelative(5f, 5f, 0f, false, false, 0f, -10f)
                close()
                moveToRelative(6f, 9f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, -8f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
            }
        }.build()
        
        return _ToggleOn!!
    }

private var _ToggleOn: ImageVector? = null

