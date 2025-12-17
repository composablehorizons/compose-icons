package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Link: ImageVector
    get() {
        if (_Link != null) return _Link!!
        
        _Link = ImageVector.Builder(
            name = "link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.902f, 4.098f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, -5.304f, 0f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 1.035f, 6.037f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.646f, 1.353f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -1.449f, -8.45f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(5.25f, 5.25f, 0f, true, true, 7.424f, 7.424f)
                lineToRelative(-1.757f, 1.757f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, 0f, -5.304f)
                close()
                moveToRelative(-7.389f, 4.267f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1f, -0.353f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, 1.449f, 8.45f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(5.25f, 5.25f, 0f, true, true, -7.424f, -7.424f)
                lineToRelative(1.757f, -1.757f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-1.757f, 1.757f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 5.304f, 5.304f)
                lineToRelative(4.5f, -4.5f)
                arcToRelative(3.75f, 3.75f, 0f, false, false, -1.035f, -6.037f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.354f, -1f)
                close()
            }
        }.build()
        
        return _Link!!
    }

private var _Link: ImageVector? = null

