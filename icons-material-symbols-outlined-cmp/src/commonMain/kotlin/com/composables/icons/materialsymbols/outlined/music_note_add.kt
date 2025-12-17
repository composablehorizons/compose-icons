package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Music_note_add: ImageVector
    get() {
        if (_Music_note_add != null) return _Music_note_add!!
        
        _Music_note_add = ImageVector.Builder(
            name = "music_note_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(23f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(560f, 542f)
                verticalLineToRelative(-422f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineTo(640f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(280f, 440f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Music_note_add!!
    }

private var _Music_note_add: ImageVector? = null

