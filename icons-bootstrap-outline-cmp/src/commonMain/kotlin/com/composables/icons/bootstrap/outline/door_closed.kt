package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.DoorClosed: ImageVector
    get() {
        if (_DoorClosed != null) return _DoorClosed!!
        
        _DoorClosed = ImageVector.Builder(
            name = "door-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(3f)
                close()
                moveToRelative(1f, 13f)
                horizontalLineToRelative(8f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, 0f)
            }
        }.build()
        
        return _DoorClosed!!
    }

private var _DoorClosed: ImageVector? = null

