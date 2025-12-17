package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PauseCircle: ImageVector
    get() {
        if (_PauseCircle != null) return _PauseCircle!!
        
        _PauseCircle = ImageVector.Builder(
            name = "pause-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, true, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 14f)
                moveToRelative(0f, 1f)
                arcTo(8f, 8f, 0f, true, false, 8f, 0f)
                arcToRelative(8f, 8f, 0f, false, false, 0f, 16f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 6.25f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, 2.5f, 0f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -2.5f, 0f)
                close()
                moveToRelative(3.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, 2.5f, 0f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -2.5f, 0f)
                close()
            }
        }.build()
        
        return _PauseCircle!!
    }

private var _PauseCircle: ImageVector? = null

