package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chess_pawn_2: ImageVector
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
                moveTo(233f, 880f)
                quadToRelative(-30f, 0f, -50f, -22f)
                reflectiveQuadToRelative(-15f, -51f)
                quadToRelative(17f, -72f, 63f, -129f)
                reflectiveQuadToRelative(115f, -89f)
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
                quadToRelative(69f, 32f, 115f, 89f)
                reflectiveQuadToRelative(63f, 129f)
                quadToRelative(7f, 29f, -13f, 51f)
                reflectiveQuadToRelative(-51f, 22f)
                horizontalLineTo(233f)
                close()
                moveToRelative(247f, -240f)
                quadToRelative(-77f, 0f, -139f, 44f)
                reflectiveQuadToRelative(-88f, 116f)
                horizontalLineToRelative(453f)
                quadToRelative(-26f, -72f, -87.5f, -116f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(0f, -40f)
                close()
                moveToRelative(0f, 600f)
                close()
                moveToRelative(0f, -360f)
                close()
            }
        }.build()
        
        return _Chess_pawn_2!!
    }

private var _Chess_pawn_2: ImageVector? = null

