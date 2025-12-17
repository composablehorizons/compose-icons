package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Light: ImageVector
    get() {
        if (_Light != null) return _Light!!
        
        _Light = ImageVector.Builder(
            name = "light",
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
                horizontalLineTo(129f)
                quadToRelative(-4f, -16f, -6.5f, -36.5f)
                reflectiveQuadTo(120f, 600f)
                quadToRelative(2f, -140f, 93f, -241.5f)
                reflectiveQuadTo(440f, 242f)
                verticalLineToRelative(-122f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(122f)
                quadToRelative(136f, 15f, 227f, 116.5f)
                reflectiveQuadTo(840f, 600f)
                quadToRelative(0f, 23f, -2.5f, 43.5f)
                reflectiveQuadTo(831f, 680f)
                horizontalLineTo(640f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(200f, 600f)
                horizontalLineToRelative(560f)
                quadToRelative(0f, -116f, -82f, -198f)
                reflectiveQuadToRelative(-198f, -82f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                close()
                moveToRelative(280f, 160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 680f)
                horizontalLineTo(400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(0f, -80f)
                close()
            }
        }.build()
        
        return _Light!!
    }

private var _Light: ImageVector? = null

