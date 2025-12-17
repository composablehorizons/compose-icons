package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Party_mode: ImageVector
    get() {
        if (_Party_mode != null) return _Party_mode!!
        
        _Party_mode = ImageVector.Builder(
            name = "party_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(126f)
                lineToRelative(50f, -54f)
                quadToRelative(11f, -12f, 26.5f, -19f)
                reflectiveQuadToRelative(32.5f, -7f)
                horizontalLineToRelative(170f)
                quadToRelative(17f, 0f, 32.5f, 7f)
                reflectiveQuadToRelative(26.5f, 19f)
                lineToRelative(50f, 54f)
                horizontalLineToRelative(126f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 280f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(321f, -140f)
                quadToRelative(72f, 0f, 125.5f, -45.5f)
                reflectiveQuadTo(660f, 540f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(620f, 500f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(580f, 540f)
                quadToRelative(0f, 35f, -27f, 57.5f)
                reflectiveQuadTo(490f, 620f)
                horizontalLineTo(377f)
                quadToRelative(-14f, 0f, -18f, 15f)
                reflectiveQuadToRelative(9f, 26f)
                quadToRelative(23f, 20f, 52.5f, 29.5f)
                reflectiveQuadTo(481f, 700f)
                close()
                moveTo(341f, 540f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(381f, 500f)
                quadToRelative(0f, -35f, 27f, -57.5f)
                reflectiveQuadToRelative(63f, -22.5f)
                horizontalLineToRelative(113f)
                quadToRelative(14f, 0f, 18f, -15f)
                reflectiveQuadToRelative(-9f, -26f)
                quadToRelative(-23f, -20f, -52.5f, -29.5f)
                reflectiveQuadTo(480f, 340f)
                quadToRelative(-72f, 0f, -125.5f, 45.5f)
                reflectiveQuadTo(301f, 500f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(341f, 540f)
                close()
            }
        }.build()
        
        return _Party_mode!!
    }

private var _Party_mode: ImageVector? = null

