package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.MusicalNote: ImageVector
    get() {
        if (_MusicalNote != null) return _MusicalNote!!
        
        _MusicalNote = ImageVector.Builder(
            name = "musical-note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.952f, 1.651f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.298f, 0.599f)
                verticalLineTo(16.303f)
                arcToRelative(3f, 3f, 0f, false, true, -2.176f, 2.884f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(2.553f, 2.553f, 0f, true, true, -1.403f, -4.909f)
                lineToRelative(2.311f, -0.66f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.088f, -1.442f)
                verticalLineTo(6.994f)
                lineToRelative(-9f, 2.572f)
                verticalLineToRelative(9.737f)
                arcToRelative(3f, 3f, 0f, false, true, -2.176f, 2.884f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(2.553f, 2.553f, 0f, true, true, -1.402f, -4.909f)
                lineToRelative(2.31f, -0.66f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.088f, -1.442f)
                verticalLineTo(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.544f, -0.721f)
                lineToRelative(10.5f, -3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.658f, 0.122f)
                close()
            }
        }.build()
        
        return _MusicalNote!!
    }

private var _MusicalNote: ImageVector? = null

