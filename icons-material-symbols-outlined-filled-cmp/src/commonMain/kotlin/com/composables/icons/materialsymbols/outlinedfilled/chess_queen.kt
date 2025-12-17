package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chess_queen: ImageVector
    get() {
        if (_Chess_queen != null) return _Chess_queen!!
        
        _Chess_queen = ImageVector.Builder(
            name = "chess_queen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(223f, 840f)
                lineToRelative(-89f, -481f)
                quadToRelative(-37f, 7f, -65.5f, -17f)
                reflectiveQuadTo(40f, 280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(0f, 14f, -4f, 26f)
                reflectiveQuadToRelative(-12f, 22f)
                quadToRelative(22f, 13f, 44.5f, 21.5f)
                reflectiveQuadTo(276f, 358f)
                quadToRelative(44f, 0f, 81.5f, -22f)
                reflectiveQuadToRelative(58.5f, -60f)
                lineToRelative(25f, -46f)
                quadToRelative(-19f, -11f, -30f, -29f)
                reflectiveQuadToRelative(-11f, -41f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 23f, -11f, 41f)
                reflectiveQuadToRelative(-30f, 29f)
                lineToRelative(25f, 46f)
                quadToRelative(21f, 38f, 58.5f, 60f)
                reflectiveQuadToRelative(81.5f, 22f)
                quadToRelative(25f, 0f, 47.5f, -8f)
                reflectiveQuadToRelative(44.5f, -21f)
                quadToRelative(-8f, -10f, -12f, -22.5f)
                reflectiveQuadToRelative(-4f, -26.5f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 280f)
                quadToRelative(0f, 38f, -28.5f, 62f)
                reflectiveQuadTo(826f, 359f)
                lineToRelative(-89f, 481f)
                horizontalLineTo(223f)
                close()
            }
        }.build()
        
        return _Chess_queen!!
    }

private var _Chess_queen: ImageVector? = null

