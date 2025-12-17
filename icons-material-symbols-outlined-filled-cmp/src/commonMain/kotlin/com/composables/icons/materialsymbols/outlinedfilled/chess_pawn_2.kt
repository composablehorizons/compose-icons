package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Chess_pawn_2: ImageVector
    get() {
        if (_Chess_pawn_2 != null) return _Chess_pawn_2!!
        
        _Chess_pawn_2 = ImageVector.Builder(
            name = "chess_pawn_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(0f, -94f, 50f, -173f)
                reflectiveQuadToRelative(136f, -118f)
                quadToRelative(-32f, -29f, -49f, -67.5f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(0f, -54f, 26.5f, -100f)
                reflectiveQuadToRelative(73.5f, -73f)
                quadToRelative(-10f, -15f, -15f, -32f)
                reflectiveQuadToRelative(-5f, -35f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 18f, -5f, 35f)
                reflectiveQuadToRelative(-15f, 32f)
                quadToRelative(47f, 27f, 73.5f, 73f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(0f, 43f, -17.5f, 81.5f)
                reflectiveQuadTo(613f, 589f)
                quadToRelative(86f, 39f, 136.5f, 118f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Chess_pawn_2!!
    }

private var _Chess_pawn_2: ImageVector? = null

