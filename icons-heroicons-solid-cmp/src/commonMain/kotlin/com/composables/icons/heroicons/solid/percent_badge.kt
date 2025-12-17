package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.PercentBadge: ImageVector
    get() {
        if (_PercentBadge != null) return _PercentBadge!!
        
        _PercentBadge = ImageVector.Builder(
            name = "percent-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.99f, 2.243f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, -3.398f, 1.55f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, -3.497f, 1.306f)
                arcToRelative(4.491f, 4.491f, 0f, false, false, -1.307f, 3.498f)
                arcToRelative(4.491f, 4.491f, 0f, false, false, -1.548f, 3.397f)
                curveToRelative(0f, 1.357f, 0.6f, 2.573f, 1.548f, 3.397f)
                arcToRelative(4.491f, 4.491f, 0f, false, false, 1.307f, 3.498f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, 3.498f, 1.307f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, 3.397f, 1.549f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, 3.397f, -1.549f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, 3.497f, -1.307f)
                arcToRelative(4.491f, 4.491f, 0f, false, false, 1.306f, -3.497f)
                arcToRelative(4.491f, 4.491f, 0f, false, false, 1.55f, -3.398f)
                curveToRelative(0f, -1.357f, -0.601f, -2.573f, -1.549f, -3.397f)
                arcToRelative(4.491f, 4.491f, 0f, false, false, -1.307f, -3.498f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, -3.498f, -1.307f)
                arcToRelative(4.49f, 4.49f, 0f, false, false, -3.396f, -1.549f)
                close()
                moveToRelative(3.53f, 7.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(6f, -6f)
                close()
                moveToRelative(-5.78f, -0.905f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
                moveToRelative(4.5f, 4.5f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, 2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, -2.25f)
                close()
            }
        }.build()
        
        return _PercentBadge!!
    }

private var _PercentBadge: ImageVector? = null

