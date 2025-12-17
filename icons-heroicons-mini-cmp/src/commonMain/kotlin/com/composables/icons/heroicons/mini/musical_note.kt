package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.MusicalNote: ImageVector
    get() {
        if (_MusicalNote != null) return _MusicalNote!!
        
        _MusicalNote = ImageVector.Builder(
            name = "musical-note",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.721f, 1.599f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.279f, 0.583f)
                verticalLineToRelative(11.29f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.774f, 2.2f)
                lineToRelative(-2.041f, 0.44f)
                arcToRelative(2.216f, 2.216f, 0f, false, true, -0.938f, -4.332f)
                lineToRelative(2.662f, -0.577f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.591f, -0.733f)
                verticalLineTo(6.112f)
                lineToRelative(-8f, 1.73f)
                verticalLineToRelative(7.684f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.774f, 2.2f)
                lineToRelative(-2.042f, 0.44f)
                arcToRelative(2.216f, 2.216f, 0f, true, true, -0.935f, -4.331f)
                lineToRelative(2.659f, -0.573f)
                arcTo(0.75f, 0.75f, 0f, false, false, 7f, 12.529f)
                verticalLineTo(4.236f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.591f, -0.733f)
                lineToRelative(9.5f, -2.054f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.63f, 0.15f)
                close()
            }
        }.build()
        
        return _MusicalNote!!
    }

private var _MusicalNote: ImageVector? = null

