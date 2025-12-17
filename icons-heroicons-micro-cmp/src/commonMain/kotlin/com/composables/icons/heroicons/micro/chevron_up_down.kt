package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ChevronUpDown: ImageVector
    get() {
        if (_ChevronUpDown != null) return _ChevronUpDown!!
        
        _ChevronUpDown = ImageVector.Builder(
            name = "chevron-up-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.22f, 10.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineTo(8f, 11.94f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(10.78f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineTo(8f, 4.06f)
                lineTo(6.28f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(2.25f, -2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                close()
            }
        }.build()
        
        return _ChevronUpDown!!
    }

private var _ChevronUpDown: ImageVector? = null

