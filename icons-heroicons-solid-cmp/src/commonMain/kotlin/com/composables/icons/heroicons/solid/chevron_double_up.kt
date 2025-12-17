package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) return _ChevronDoubleUp!!
        
        _ChevronDoubleUp = ImageVector.Builder(
            name = "chevron-double-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.47f, 10.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(7.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(12f, 12.31f)
                lineToRelative(-6.97f, 6.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(7.5f, -7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.47f, 4.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(7.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(12f, 6.31f)
                lineToRelative(-6.97f, 6.97f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(7.5f, -7.5f)
                close()
            }
        }.build()
        
        return _ChevronDoubleUp!!
    }

private var _ChevronDoubleUp: ImageVector? = null

