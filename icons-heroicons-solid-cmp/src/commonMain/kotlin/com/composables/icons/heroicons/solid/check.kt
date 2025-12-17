package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Check: ImageVector
    get() {
        if (_Check != null) return _Check!!
        
        _Check = ImageVector.Builder(
            name = "check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.916f, 4.626f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.208f, 1.04f)
                lineToRelative(-9f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.154f, 0.114f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineToRelative(5.353f, 5.353f)
                lineToRelative(8.493f, -12.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.04f, -0.207f)
                close()
            }
        }.build()
        
        return _Check!!
    }

private var _Check: ImageVector? = null

