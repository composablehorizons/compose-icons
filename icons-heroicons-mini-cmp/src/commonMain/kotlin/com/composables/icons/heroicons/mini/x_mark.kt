package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.XMark: ImageVector
    get() {
        if (_XMark != null) return _XMark!!
        
        _XMark = ImageVector.Builder(
            name = "x-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.28f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineTo(8.94f, 10f)
                lineToRelative(-3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineTo(10f, 11.06f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(11.06f, 10f)
                lineToRelative(3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(10f, 8.94f)
                lineTo(6.28f, 5.22f)
                close()
            }
        }.build()
        
        return _XMark!!
    }

private var _XMark: ImageVector? = null

