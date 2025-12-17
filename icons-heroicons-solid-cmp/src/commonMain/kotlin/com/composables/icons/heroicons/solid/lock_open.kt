package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.LockOpen: ImageVector
    get() {
        if (_LockOpen != null) return _LockOpen!!
        
        _LockOpen = ImageVector.Builder(
            name = "lock-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 1.5f)
                curveToRelative(2.9f, 0f, 5.25f, 2.35f, 5.25f, 5.25f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(6.75f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, -7.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(6.75f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(3.75f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-6.75f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.9f, 2.35f, -5.25f, 5.25f, -5.25f)
                close()
            }
        }.build()
        
        return _LockOpen!!
    }

private var _LockOpen: ImageVector? = null

