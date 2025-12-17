package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChevronUpDown: ImageVector
    get() {
        if (_ChevronUpDown != null) return _ChevronUpDown!!
        
        _ChevronUpDown = ImageVector.Builder(
            name = "chevron-up-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.53f, 3.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineTo(6.22f, 6.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineTo(10f, 5.06f)
                lineToRelative(2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-3.25f, -3.25f)
                close()
                moveToRelative(-4.31f, 9.81f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineTo(10f, 14.94f)
                lineToRelative(-2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                close()
            }
        }.build()
        
        return _ChevronUpDown!!
    }

private var _ChevronUpDown: ImageVector? = null

