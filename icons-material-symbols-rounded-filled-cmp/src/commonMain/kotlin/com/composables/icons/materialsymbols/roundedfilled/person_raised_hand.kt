package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Person_raised_hand: ImageVector
    get() {
        if (_Person_raised_hand != null) return _Person_raised_hand!!
        
        _Person_raised_hand = ImageVector.Builder(
            name = "person_raised_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 840f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 920f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 760f)
                verticalLineToRelative(-200f)
                quadToRelative(-33f, -54f, -51f, -114.5f)
                reflectiveQuadTo(91f, 322f)
                quadToRelative(0f, -61f, 15.5f, -120f)
                reflectiveQuadTo(143f, 86f)
                quadToRelative(8f, -21f, 26f, -33.5f)
                reflectiveQuadToRelative(40f, -12.5f)
                quadToRelative(31f, 0f, 53f, 21f)
                reflectiveQuadToRelative(18f, 50f)
                lineToRelative(-11f, 91f)
                quadToRelative(-6f, 48f, 8.5f, 91f)
                reflectiveQuadToRelative(43.5f, 75.5f)
                quadToRelative(29f, 32.5f, 70f, 52f)
                reflectiveQuadToRelative(89f, 19.5f)
                quadToRelative(60f, 0f, 120.5f, 12.5f)
                reflectiveQuadTo(706f, 488f)
                quadToRelative(45f, 23f, 69.5f, 58.5f)
                reflectiveQuadTo(800f, 634f)
                verticalLineToRelative(126f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                horizontalLineTo(400f)
                verticalLineToRelative(-37f)
                quadToRelative(0f, -34f, 23f, -58.5f)
                reflectiveQuadToRelative(57f, -24.5f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 600f)
                horizontalLineTo(480f)
                quadToRelative(-67f, 0f, -113.5f, 48f)
                reflectiveQuadTo(320f, 763f)
                verticalLineToRelative(37f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Person_raised_hand!!
    }

private var _Person_raised_hand: ImageVector? = null

