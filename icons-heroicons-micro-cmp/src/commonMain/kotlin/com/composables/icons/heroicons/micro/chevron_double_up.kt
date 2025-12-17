package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChevronDoubleUp: ImageVector
    get() {
        if (_ChevronDoubleUp != null) return _ChevronDoubleUp!!
        
        _ChevronDoubleUp = ImageVector.Builder(
            name = "chevron-double-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.47f, 3.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineTo(8f, 4.81f)
                lineTo(5.28f, 7.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3.25f, -3.25f)
                close()
                moveToRelative(-3.25f, 8.25f)
                lineToRelative(3.25f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(8f, 9.81f)
                lineToRelative(-2.72f, 2.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _ChevronDoubleUp!!
    }

private var _ChevronDoubleUp: ImageVector? = null

