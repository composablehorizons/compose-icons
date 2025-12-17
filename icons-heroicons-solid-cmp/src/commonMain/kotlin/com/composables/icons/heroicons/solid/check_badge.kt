package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CheckBadge: ImageVector
    get() {
        if (_CheckBadge != null) return _CheckBadge!!
        
        _CheckBadge = ImageVector.Builder(
            name = "check-badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.603f, 3.799f)
                arcTo(4.49f, 4.49f, 0f, false, true, 12f, 2.25f)
                curveToRelative(1.357f, 0f, 2.573f, 0.6f, 3.397f, 1.549f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, 3.498f, 1.307f)
                arcToRelative(4.491f, 4.491f, 0f, false, true, 1.307f, 3.497f)
                arcTo(4.49f, 4.49f, 0f, false, true, 21.75f, 12f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, -1.549f, 3.397f)
                arcToRelative(4.491f, 4.491f, 0f, false, true, -1.307f, 3.497f)
                arcToRelative(4.491f, 4.491f, 0f, false, true, -3.497f, 1.307f)
                arcTo(4.49f, 4.49f, 0f, false, true, 12f, 21.75f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, -3.397f, -1.549f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, -3.498f, -1.306f)
                arcToRelative(4.491f, 4.491f, 0f, false, true, -1.307f, -3.498f)
                arcTo(4.49f, 4.49f, 0f, false, true, 2.25f, 12f)
                curveToRelative(0f, -1.357f, 0.6f, -2.573f, 1.549f, -3.397f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, 1.307f, -3.497f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, 3.497f, -1.307f)
                close()
                moveToRelative(7.007f, 6.387f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.22f, -0.872f)
                lineToRelative(-3.236f, 4.53f)
                lineTo(9.53f, 12.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.14f, -0.094f)
                lineToRelative(3.75f, -5.25f)
                close()
            }
        }.build()
        
        return _CheckBadge!!
    }

private var _CheckBadge: ImageVector? = null

