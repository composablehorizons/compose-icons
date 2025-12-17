package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Person_raised_hand: ImageVector
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
                moveTo(80f, 920f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -120f)
                verticalLineToRelative(-240f)
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
                verticalLineToRelative(166f)
                horizontalLineTo(400f)
                verticalLineToRelative(-37f)
                quadToRelative(0f, -34f, 23f, -58.5f)
                reflectiveQuadToRelative(57f, -24.5f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-80f)
                horizontalLineTo(480f)
                quadToRelative(-67f, 0f, -113.5f, 48f)
                reflectiveQuadTo(320f, 763f)
                verticalLineToRelative(37f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -400f)
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

