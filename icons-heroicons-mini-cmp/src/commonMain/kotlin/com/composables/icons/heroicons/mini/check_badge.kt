package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CheckBadge: ImageVector
    get() {
        if (_CheckBadge != null) return _CheckBadge!!
        
        _CheckBadge = ImageVector.Builder(
            name = "check-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.403f, 12.652f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -5.304f)
                arcToRelative(3f, 3f, 0f, false, false, -3.75f, -3.751f)
                arcToRelative(3f, 3f, 0f, false, false, -5.305f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -3.751f, 3.75f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 5.305f)
                arcToRelative(3f, 3f, 0f, false, false, 3.75f, 3.751f)
                arcToRelative(3f, 3f, 0f, false, false, 5.305f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, 3.751f, -3.75f)
                close()
                moveToRelative(-2.546f, -4.46f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.214f, -0.883f)
                lineToRelative(-3.483f, 4.79f)
                lineToRelative(-1.88f, -1.88f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.061f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.137f, -0.089f)
                lineToRelative(4f, -5.5f)
                close()
            }
        }.build()
        
        return _CheckBadge!!
    }

private var _CheckBadge: ImageVector? = null

