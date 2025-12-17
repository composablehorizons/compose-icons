package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Music_off: ImageVector
    get() {
        if (_Music_off != null) return _Music_off!!
        
        _Music_off = ImageVector.Builder(
            name = "music_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(792f, 904f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(560f, 446f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-246f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(160f)
                horizontalLineTo(560f)
                verticalLineToRelative(166f)
                close()
                moveTo(400f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(23f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(480f, 542f)
                verticalLineToRelative(-62f)
                lineToRelative(80f, 80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Music_off!!
    }

private var _Music_off: ImageVector? = null

