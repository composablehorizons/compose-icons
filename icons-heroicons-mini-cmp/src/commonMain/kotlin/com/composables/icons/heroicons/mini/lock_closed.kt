package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) return _LockClosed!!
        
        _LockClosed = ImageVector.Builder(
            name = "lock-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -4.5f, 4.5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-0.5f)
                verticalLineTo(5.5f)
                arcTo(4.5f, 4.5f, 0f, false, false, 10f, 1f)
                close()
                moveToRelative(3f, 8f)
                verticalLineTo(5.5f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                verticalLineTo(9f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _LockClosed!!
    }

private var _LockClosed: ImageVector? = null

