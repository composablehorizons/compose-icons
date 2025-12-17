package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChevronUpDown: ImageVector
    get() {
        if (_ChevronUpDown != null) return _ChevronUpDown!!
        
        _ChevronUpDown = ImageVector.Builder(
            name = "chevron-up-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.47f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineTo(12f, 6.31f)
                lineTo(8.78f, 9.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.75f, -3.75f)
                close()
                moveToRelative(-3.75f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineTo(12f, 17.69f)
                lineToRelative(3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-3.75f, -3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _ChevronUpDown!!
    }

private var _ChevronUpDown: ImageVector? = null

