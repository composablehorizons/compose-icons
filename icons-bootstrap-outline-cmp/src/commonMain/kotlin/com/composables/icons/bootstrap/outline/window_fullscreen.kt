package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.WindowFullscreen: ImageVector
    get() {
        if (_WindowFullscreen != null) return _WindowFullscreen!!
        
        _WindowFullscreen = ImageVector.Builder(
            name = "window-fullscreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(1.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(1f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(15f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(1f, 5f)
                verticalLineTo(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(8f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _WindowFullscreen!!
    }

private var _WindowFullscreen: ImageVector? = null

