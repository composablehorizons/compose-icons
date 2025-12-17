package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.DoorClosed: ImageVector
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
                moveTo(12f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-2f, 9f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
        }.build()
        
        return _DoorClosed!!
    }

private var _DoorClosed: ImageVector? = null

