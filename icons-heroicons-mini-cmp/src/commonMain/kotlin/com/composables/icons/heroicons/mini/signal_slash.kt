package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.SignalSlash: ImageVector
    get() {
        if (_SignalSlash != null) return _SignalSlash!!
        
        _SignalSlash = ImageVector.Builder(
            name = "signal-slash",
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
                lineToRelative(6.783f, 6.782f)
                arcToRelative(1f, 1f, 0f, false, true, 0.935f, 0.935f)
                lineToRelative(6.782f, 6.783f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-6.783f, -6.782f)
                arcToRelative(1f, 1f, 0f, false, true, -0.935f, -0.935f)
                lineTo(2.22f, 3.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(3.636f, 16.364f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, -1.39f, -10.936f)
                lineTo(3.349f, 6.53f)
                arcToRelative(7.503f, 7.503f, 0f, false, false, 1.348f, 8.773f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 1.061f)
                close()
                moveTo(6.464f, 13.536f)
                arcToRelative(5f, 5f, 0f, false, true, -1.213f, -5.103f)
                lineToRelative(1.262f, 1.262f)
                arcToRelative(3.493f, 3.493f, 0f, false, false, 1.012f, 2.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                close()
                moveTo(16.364f, 3.636f)
                arcToRelative(9.004f, 9.004f, 0f, false, true, 1.39f, 10.937f)
                lineToRelative(-1.103f, -1.104f)
                arcToRelative(7.503f, 7.503f, 0f, false, false, -1.348f, -8.772f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.061f, -1.061f)
                close()
                moveTo(13.536f, 6.464f)
                arcToRelative(5f, 5f, 0f, false, true, 1.213f, 5.103f)
                lineToRelative(-1.262f, -1.262f)
                arcToRelative(3.493f, 3.493f, 0f, false, false, -1.012f, -2.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _SignalSlash!!
    }

private var _SignalSlash: ImageVector? = null

