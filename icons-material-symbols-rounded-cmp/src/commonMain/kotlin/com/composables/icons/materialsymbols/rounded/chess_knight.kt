package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Chess_knight: ImageVector
    get() {
        if (_Chess_knight != null) return _Chess_knight!!
        
        _Chess_knight = ImageVector.Builder(
            name = "chess_knight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -23f, 12f, -41.5f)
                reflectiveQuadToRelative(32f, -29.5f)
                lineToRelative(196f, -99f)
                verticalLineToRelative(-70f)
                lineToRelative(-139f, 69f)
                quadToRelative(-12f, 6f, -25f, 9f)
                reflectiveQuadToRelative(-26f, 3f)
                quadToRelative(-31f, 0f, -58.5f, -16f)
                reflectiveQuadTo(149f, 499f)
                quadToRelative(-14f, -27f, -12f, -57.5f)
                reflectiveQuadToRelative(19f, -56.5f)
                lineToRelative(124f, -185f)
                lineToRelative(-39f, -58f)
                quadToRelative(-14f, -20f, -2f, -41f)
                reflectiveQuadToRelative(36f, -21f)
                horizontalLineToRelative(165f)
                quadToRelative(133f, 0f, 226.5f, 93f)
                reflectiveQuadTo(760f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                horizontalLineToRelative(-90f)
                lineToRelative(12f, 18f)
                quadToRelative(7f, 10f, 7f, 22f)
                reflectiveQuadToRelative(-7f, 22f)
                lineTo(223f, 430f)
                quadToRelative(-5f, 8f, -5.5f, 16.5f)
                reflectiveQuadTo(221f, 463f)
                quadToRelative(5f, 11f, 13.5f, 14.5f)
                reflectiveQuadTo(251f, 481f)
                quadToRelative(3f, 0f, 15f, -3f)
                lineToRelative(196f, -99f)
                quadToRelative(20f, -10f, 39f, 1.5f)
                reflectiveQuadToRelative(19f, 34.5f)
                verticalLineToRelative(136f)
                quadToRelative(0f, 23f, -12f, 41.5f)
                reflectiveQuadTo(476f, 622f)
                lineToRelative(-196f, 98f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(160f, -320f)
                close()
            }
        }.build()
        
        return _Chess_knight!!
    }

private var _Chess_knight: ImageVector? = null

