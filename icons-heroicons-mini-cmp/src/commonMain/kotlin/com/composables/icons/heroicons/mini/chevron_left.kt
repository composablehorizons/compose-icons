package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChevronLeft: ImageVector
    get() {
        if (_ChevronLeft != null) return _ChevronLeft!!
        
        _ChevronLeft = ImageVector.Builder(
            name = "chevron-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.78f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineTo(8.06f, 10f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _ChevronLeft!!
    }

private var _ChevronLeft: ImageVector? = null

