package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stylus_pencil: ImageVector
    get() {
        if (_Stylus_pencil != null) return _Stylus_pencil!!
        
        _Stylus_pencil = ImageVector.Builder(
            name = "stylus_pencil",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298f, 640f)
                quadToRelative(-21f, 0f, -33f, -17f)
                reflectiveQuadToRelative(-4f, -37f)
                lineToRelative(170f, -442f)
                quadToRelative(5f, -11f, 14.5f, -17.5f)
                reflectiveQuadTo(466f, 120f)
                horizontalLineToRelative(28f)
                quadToRelative(11f, 0f, 20.5f, 6.5f)
                reflectiveQuadTo(529f, 144f)
                lineToRelative(170f, 442f)
                quadToRelative(8f, 20f, -4f, 37f)
                reflectiveQuadToRelative(-33f, 17f)
                horizontalLineTo(298f)
                close()
                moveToRelative(-83f, 200f)
                quadToRelative(-20f, 0f, -32.5f, -16.5f)
                reflectiveQuadTo(177f, 787f)
                lineToRelative(5f, -12f)
                quadToRelative(8f, -25f, 29f, -40f)
                reflectiveQuadToRelative(47f, -15f)
                horizontalLineToRelative(444f)
                quadToRelative(26f, 0f, 47f, 15f)
                reflectiveQuadToRelative(29f, 40f)
                lineToRelative(5f, 12f)
                quadToRelative(7f, 20f, -5.5f, 36.5f)
                reflectiveQuadTo(745f, 840f)
                horizontalLineTo(215f)
                close()
            }
        }.build()
        
        return _Stylus_pencil!!
    }

private var _Stylus_pencil: ImageVector? = null

