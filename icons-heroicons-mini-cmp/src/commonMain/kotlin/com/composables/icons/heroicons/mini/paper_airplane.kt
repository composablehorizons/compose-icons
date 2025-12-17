package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.PaperAirplane: ImageVector
    get() {
        if (_PaperAirplane != null) return _PaperAirplane!!
        
        _PaperAirplane = ImageVector.Builder(
            name = "paper-airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.105f, 2.288f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.826f, 0.95f)
                lineToRelative(1.414f, 4.926f)
                arcTo(1.5f, 1.5f, 0f, false, false, 5.135f, 9.25f)
                horizontalLineToRelative(6.115f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(5.135f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.442f, 1.086f)
                lineToRelative(-1.414f, 4.926f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.826f, 0.95f)
                arcToRelative(28.897f, 28.897f, 0f, false, false, 15.293f, -7.155f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.114f)
                arcTo(28.897f, 28.897f, 0f, false, false, 3.105f, 2.288f)
                close()
            }
        }.build()
        
        return _PaperAirplane!!
    }

private var _PaperAirplane: ImageVector? = null

