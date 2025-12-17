package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.MusicalNote: ImageVector
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
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(9f, 9f)
                lineToRelative(10.5f, -3f)
                moveToRelative(0f, 6.553f)
                verticalLineToRelative(3.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.632f, 2.163f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(1.803f, 1.803f, 0f, true, true, -0.99f, -3.467f)
                lineToRelative(2.31f, -0.66f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 1.632f, -2.163f)
                close()
                moveToRelative(0f, 0f)
                verticalLineTo(2.25f)
                lineTo(9f, 5.25f)
                verticalLineToRelative(10.303f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -1.632f, 2.163f)
                lineToRelative(-1.32f, 0.377f)
                arcToRelative(1.803f, 1.803f, 0f, false, true, -0.99f, -3.467f)
                lineToRelative(2.31f, -0.66f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9f, 15.553f)
                close()
            }
        }.build()
        
        return _MusicalNote!!
    }

private var _MusicalNote: ImageVector? = null

