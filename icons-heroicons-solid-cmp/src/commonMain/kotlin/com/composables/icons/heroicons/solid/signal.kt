package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Signal: ImageVector
    get() {
        if (_Signal != null) return _Signal!!
        
        _Signal = ImageVector.Builder(
            name = "signal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.636f, 4.575f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                arcToRelative(9f, 9f, 0f, false, false, 0f, 12.728f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                curveToRelative(-4.101f, -4.1f, -4.101f, -10.748f, 0f, -14.849f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveToRelative(12.728f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                curveToRelative(4.101f, 4.1f, 4.101f, 10.75f, 0f, 14.85f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.061f)
                arcToRelative(9f, 9f, 0f, false, false, 0f, -12.728f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(7.757f, 6.697f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                arcToRelative(6f, 6f, 0f, false, false, 0f, 8.486f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 0f, -10.606f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveToRelative(8.486f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 0f, 10.606f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                arcToRelative(6f, 6f, 0f, false, false, 0f, -8.486f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(9.879f, 8.818f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 4.243f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.061f, 1.061f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 0f, -6.364f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveToRelative(4.242f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, 0f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, 0f, 6.364f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -4.243f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.061f)
                close()
                moveTo(10.875f, 12f)
                arcToRelative(1.125f, 1.125f, 0f, true, true, 2.25f, 0f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -2.25f, 0f)
                close()
            }
        }.build()
        
        return _Signal!!
    }

private var _Signal: ImageVector? = null

