package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChevronDoubleDown: ImageVector
    get() {
        if (_ChevronDoubleDown != null) return _ChevronDoubleDown!!
        
        _ChevronDoubleDown = ImageVector.Builder(
            name = "chevron-double-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.47f, 15.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineTo(10f, 13.69f)
                lineTo(6.28f, 9.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(4.25f, 4.25f)
                close()
                moveTo(5.22f, 6.03f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 0f)
                lineToRelative(4.25f, -4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(10f, 8.69f)
                lineTo(6.28f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                close()
            }
        }.build()
        
        return _ChevronDoubleDown!!
    }

private var _ChevronDoubleDown: ImageVector? = null

