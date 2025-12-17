package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.BoltSlash: ImageVector
    get() {
        if (_BoltSlash != null) return _BoltSlash!!
        
        _BoltSlash = ImageVector.Builder(
            name = "bolt-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.22f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(14.5f, 14.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.73f, 7.912f)
                lineTo(2.191f, 10.75f)
                arcTo(0.75f, 0.75f, 0f, false, false, 2.75f, 12f)
                horizontalLineToRelative(6.068f)
                lineTo(4.73f, 7.912f)
                close()
                moveTo(9.233f, 12.415f)
                lineToRelative(-1.216f, 5.678f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.292f, 0.657f)
                lineToRelative(2.956f, -3.303f)
                lineToRelative(-3.032f, -3.032f)
                close()
                moveTo(15.27f, 12.088f)
                lineToRelative(2.539f, -2.838f)
                arcTo(0.75f, 0.75f, 0f, false, false, 17.25f, 8f)
                horizontalLineToRelative(-6.068f)
                lineToRelative(4.088f, 4.088f)
                close()
                moveTo(10.767f, 7.585f)
                lineToRelative(1.216f, -5.678f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.292f, -0.657f)
                lineTo(7.735f, 4.553f)
                lineToRelative(3.032f, 3.032f)
                close()
            }
        }.build()
        
        return _BoltSlash!!
    }

private var _BoltSlash: ImageVector? = null

