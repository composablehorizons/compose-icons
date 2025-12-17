package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_pawn: ImageVector
    get() {
        if (_Chess_pawn != null) return _Chess_pawn!!
        
        _Chess_pawn = ImageVector.Builder(
            name = "chess_pawn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-200f)
                quadToRelative(88f, -60f, 129f, -125f)
                reflectiveQuadToRelative(56f, -115f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(90f)
                quadToRelative(-14f, -22f, -22f, -47f)
                reflectiveQuadToRelative(-8f, -53f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(660f, 260f)
                quadToRelative(0f, 28f, -8f, 53f)
                reflectiveQuadToRelative(-22f, 47f)
                horizontalLineToRelative(90f)
                verticalLineToRelative(80f)
                horizontalLineTo(615f)
                quadToRelative(15f, 50f, 56f, 115f)
                reflectiveQuadToRelative(129f, 125f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Chess_pawn!!
    }

private var _Chess_pawn: ImageVector? = null

