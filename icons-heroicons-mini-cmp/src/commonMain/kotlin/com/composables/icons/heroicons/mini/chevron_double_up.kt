package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) return _ChevronDoubleUp!!
        
        _ChevronDoubleUp = ImageVector.Builder(
            name = "chevron-double-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.47f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(10f, 6.31f)
                lineToRelative(-3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(4.25f, -4.25f)
                close()
                moveToRelative(-4.25f, 9.25f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(10f, 11.31f)
                lineToRelative(-3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _ChevronDoubleUp!!
    }

private var _ChevronDoubleUp: ImageVector? = null

