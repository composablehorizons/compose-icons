package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PercentBadge: ImageVector
    get() {
        if (_PercentBadge != null) return _PercentBadge!!
        
        _PercentBadge = ImageVector.Builder(
            name = "percent-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.597f, 7.348f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 5.304f)
                arcToRelative(3f, 3f, 0f, false, false, 3.75f, 3.751f)
                arcToRelative(3f, 3f, 0f, false, false, 5.305f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, 3.751f, -3.75f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -5.305f)
                arcToRelative(3f, 3f, 0f, false, false, -3.75f, -3.751f)
                arcToRelative(3f, 3f, 0f, false, false, -5.305f, 0f)
                arcToRelative(3f, 3f, 0f, false, false, -3.751f, 3.75f)
                close()
                moveToRelative(9.933f, 0.182f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(6f, -6f)
                close()
                moveToRelative(0.47f, 5.22f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 2.5f, 0f)
                close()
                moveTo(7.25f, 8.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, 0f, 2.5f)
                close()
            }
        }.build()
        
        return _PercentBadge!!
    }

private var _PercentBadge: ImageVector? = null

