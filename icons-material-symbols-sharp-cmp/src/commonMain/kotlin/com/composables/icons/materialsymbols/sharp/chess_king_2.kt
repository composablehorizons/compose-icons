package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chess_king_2: ImageVector
    get() {
        if (_Chess_king_2 != null) return _Chess_king_2!!
        
        _Chess_king_2 = ImageVector.Builder(
            name = "chess_king_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                verticalLineToRelative(-355f)
                quadToRelative(12f, -21f, 26.5f, -39.5f)
                reflectiveQuadTo(538f, 450f)
                quadToRelative(44f, -42f, 100.5f, -66f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(360f)
                horizontalLineTo(480f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 123.5f, 25f)
                reflectiveQuadTo(425f, 453f)
                quadToRelative(17f, 16f, 30.5f, 34f)
                reflectiveQuadToRelative(24.5f, 38f)
                verticalLineToRelative(355f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -100f, -70.5f, -170f)
                reflectiveQuadTo(200f, 440f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(120f, 520f)
                verticalLineToRelative(280f)
                close()
                moveToRelative(400f, 0f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 440f)
                quadToRelative(-99f, 0f, -169.5f, 70f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-80f, -514f)
                verticalLineToRelative(-46f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(45f)
                quadToRelative(39f, 10f, 68f, 37.5f)
                reflectiveQuadToRelative(42f, 65.5f)
                quadToRelative(-20f, 8f, -37f, 19f)
                reflectiveQuadToRelative(-34f, 24f)
                quadToRelative(-3f, -30f, -25.5f, -50.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(-31f, 0f, -53.5f, 20.5f)
                reflectiveQuadTo(401f, 431f)
                quadToRelative(-16f, -13f, -34f, -24f)
                reflectiveQuadToRelative(-37f, -19f)
                quadToRelative(13f, -38f, 42.5f, -64.5f)
                reflectiveQuadTo(440f, 286f)
                close()
            }
        }.build()
        
        return _Chess_king_2!!
    }

private var _Chess_king_2: ImageVector? = null

