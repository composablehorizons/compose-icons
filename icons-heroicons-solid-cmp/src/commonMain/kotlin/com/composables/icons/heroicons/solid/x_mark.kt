package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.XMark: ImageVector
    get() {
        if (_XMark != null) return _XMark!!
        
        _XMark = ImageVector.Builder(
            name = "x-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.47f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineTo(12f, 10.94f)
                lineToRelative(5.47f, -5.47f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineTo(13.06f, 12f)
                lineToRelative(5.47f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(12f, 13.06f)
                lineToRelative(-5.47f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineTo(10.94f, 12f)
                lineTo(5.47f, 6.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _XMark!!
    }

private var _XMark: ImageVector? = null

