package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Music_cast: ImageVector
    get() {
        if (_Music_cast != null) return _Music_cast!!
        
        _Music_cast = ImageVector.Builder(
            name = "music_cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(23f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(640f, 502f)
                verticalLineToRelative(-342f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(120f)
                horizontalLineTo(720f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(80f, 640f)
                quadToRelative(0f, -99f, 38f, -186.5f)
                reflectiveQuadTo(221f, 301f)
                quadToRelative(65f, -65f, 152.5f, -103f)
                reflectiveQuadTo(560f, 160f)
                verticalLineToRelative(80f)
                quadToRelative(-82f, 0f, -155f, 31.5f)
                reflectiveQuadToRelative(-127.5f, 86f)
                quadToRelative(-54.5f, 54.5f, -86f, 127f)
                reflectiveQuadTo(160f, 640f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -66f, 25.5f, -124.5f)
                reflectiveQuadToRelative(69f, -102f)
                quadTo(378f, 370f, 436f, 345f)
                reflectiveQuadToRelative(124f, -25f)
                verticalLineToRelative(80f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Music_cast!!
    }

private var _Music_cast: ImageVector? = null

