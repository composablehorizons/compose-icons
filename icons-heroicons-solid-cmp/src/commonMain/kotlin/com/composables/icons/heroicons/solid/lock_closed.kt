package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) return _LockClosed!!
        
        _LockClosed = ImageVector.Builder(
            name = "lock-closed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 1.5f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, -5.25f, 5.25f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(6.75f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-6.75f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
                close()
                moveToRelative(3.75f, 8.25f)
                verticalLineToRelative(-3f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, -7.5f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.5f)
                close()
            }
        }.build()
        
        return _LockClosed!!
    }

private var _LockClosed: ImageVector? = null

