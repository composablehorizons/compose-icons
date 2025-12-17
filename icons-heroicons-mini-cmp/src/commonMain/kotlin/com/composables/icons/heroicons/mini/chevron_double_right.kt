package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ChevronDoubleRight: ImageVector
    get() {
        if (_ChevronDoubleRight != null) return _ChevronDoubleRight!!
        
        _ChevronDoubleRight = ImageVector.Builder(
            name = "chevron-double-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.28f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineTo(13.69f, 10f)
                lineTo(9.97f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(4.25f, 4.25f)
                close()
                moveTo(6.03f, 5.22f)
                lineToRelative(4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-4.25f, 4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineTo(8.69f, 10f)
                lineTo(4.97f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _ChevronDoubleRight!!
    }

private var _ChevronDoubleRight: ImageVector? = null

