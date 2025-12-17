package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChevronDoubleLeft: ImageVector
    get() {
        if (_ChevronDoubleLeft != null) return _ChevronDoubleLeft!!
        
        _ChevronDoubleLeft = ImageVector.Builder(
            name = "chevron-double-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.22f, 7.595f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                lineToRelative(-2.72f, -2.72f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineToRelative(-3.25f, 3.25f)
                close()
                moveToRelative(8.25f, -3.25f)
                lineToRelative(-3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(3.25f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-2.72f, -2.72f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _ChevronDoubleLeft!!
    }

private var _ChevronDoubleLeft: ImageVector? = null

