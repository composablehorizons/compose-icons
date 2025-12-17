package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Chess_king_2: ImageVector
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
                moveTo(520f, 880f)
                verticalLineToRelative(-355f)
                quadToRelative(0f, -20f, 1.5f, -40.5f)
                reflectiveQuadTo(538f, 450f)
                quadToRelative(44f, -42f, 100.5f, -66f)
                reflectiveQuadTo(760f, 360f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(360f)
                horizontalLineTo(520f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 123.5f, 25f)
                reflectiveQuadTo(425f, 453f)
                quadToRelative(14f, 14f, 14.5f, 33f)
                reflectiveQuadToRelative(0.5f, 39f)
                verticalLineToRelative(355f)
                horizontalLineTo(40f)
                close()
                moveToRelative(400f, -594f)
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
                quadToRelative(19f, 5f, 35f, 14f)
                reflectiveQuadToRelative(30f, 21f)
                quadToRelative(-29f, 14f, -55.5f, 33f)
                reflectiveQuadTo(480f, 395f)
                quadToRelative(-23f, -23f, -49.5f, -42f)
                reflectiveQuadTo(375f, 320f)
                quadToRelative(14f, -12f, 30.5f, -20.5f)
                reflectiveQuadTo(440f, 286f)
                close()
            }
        }.build()
        
        return _Chess_king_2!!
    }

private var _Chess_king_2: ImageVector? = null

