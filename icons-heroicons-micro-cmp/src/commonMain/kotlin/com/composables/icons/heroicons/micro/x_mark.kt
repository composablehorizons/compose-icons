package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.XMark: ImageVector
    get() {
        if (_XMark != null) return _XMark!!
        
        _XMark = ImageVector.Builder(
            name = "x-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.28f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineTo(6.94f, 8f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineTo(8f, 9.06f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(9.06f, 8f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(8f, 6.94f)
                lineTo(5.28f, 4.22f)
                close()
            }
        }.build()
        
        return _XMark!!
    }

private var _XMark: ImageVector? = null

