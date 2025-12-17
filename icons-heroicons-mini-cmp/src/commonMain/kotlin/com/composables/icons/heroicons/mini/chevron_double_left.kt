package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChevronDoubleLeft: ImageVector
    get() {
        if (_ChevronDoubleLeft != null) return _ChevronDoubleLeft!!
        
        _ChevronDoubleLeft = ImageVector.Builder(
            name = "chevron-double-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.72f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(6.31f, 10f)
                lineToRelative(3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineTo(4.72f, 9.47f)
                close()
                moveToRelative(9.25f, -4.25f)
                lineTo(9.72f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(11.31f, 10f)
                lineToRelative(3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _ChevronDoubleLeft!!
    }

private var _ChevronDoubleLeft: ImageVector? = null

