package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ChevronDown: ImageVector
    get() {
        if (_ChevronDown != null) return _ChevronDown!!
        
        _ChevronDown = ImageVector.Builder(
            name = "chevron-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.53f, 16.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-7.5f, -7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineTo(12f, 14.69f)
                lineToRelative(6.97f, -6.97f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-7.5f, 7.5f)
                close()
            }
        }.build()
        
        return _ChevronDown!!
    }

private var _ChevronDown: ImageVector? = null

