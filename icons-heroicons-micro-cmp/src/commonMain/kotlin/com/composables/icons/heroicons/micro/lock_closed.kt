package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) return _LockClosed!!
        
        _LockClosed = ImageVector.Builder(
            name = "lock-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -3.5f, 3.5f)
                verticalLineTo(7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 8.5f)
                verticalLineToRelative(5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 15f)
                horizontalLineToRelative(7f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 7f)
                verticalLineTo(4.5f)
                arcTo(3.5f, 3.5f, 0f, false, false, 8f, 1f)
                close()
                moveToRelative(2f, 6f)
                verticalLineTo(4.5f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _LockClosed!!
    }

private var _LockClosed: ImageVector? = null

