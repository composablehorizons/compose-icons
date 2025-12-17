package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Person_raised_hand: ImageVector
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
                horizontalLineTo(160f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-86f)
                quadToRelative(0f, -24f, -12f, -42.5f)
                reflectiveQuadTo(674f, 562f)
                quadToRelative(-41f, -20f, -95f, -31f)
                reflectiveQuadToRelative(-99f, -11f)
                quadToRelative(-66f, 0f, -122.5f, -27f)
                reflectiveQuadToRelative(-96f, -72.5f)
                quadTo(222f, 375f, 202f, 315.5f)
                reflectiveQuadTo(190f, 192f)
                quadToRelative(-10f, 30f, -14.5f, 64f)
                reflectiveQuadToRelative(-4.5f, 66f)
                quadToRelative(0f, 58f, 20.5f, 111.5f)
                reflectiveQuadTo(240f, 538f)
                verticalLineToRelative(182f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 240f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 240f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveTo(320f, 800f)
                verticalLineToRelative(-37f)
                quadToRelative(0f, -67f, 46.5f, -115f)
                reflectiveQuadTo(480f, 600f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(480f)
                quadToRelative(-34f, 0f, -57f, 24.5f)
                reflectiveQuadTo(400f, 763f)
                verticalLineToRelative(37f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, -80f)
                close()
                moveToRelative(0f, -480f)
                close()
            }
        }.build()
        
        return _Person_raised_hand!!
    }

private var _Person_raised_hand: ImageVector? = null

