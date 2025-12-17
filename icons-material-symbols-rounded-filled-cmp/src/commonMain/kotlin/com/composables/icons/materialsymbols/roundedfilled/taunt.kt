package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Taunt: ImageVector
    get() {
        if (_Taunt != null) return _Taunt!!
        
        _Taunt = ImageVector.Builder(
            name = "taunt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(218f, 579f)
                quadToRelative(-24f, 13f, -51f, 5.5f)
                reflectiveQuadTo(126f, 554f)
                quadToRelative(-17f, -29f, -6f, -60f)
                reflectiveQuadToRelative(43f, -42f)
                lineToRelative(305f, -101f)
                quadToRelative(14f, -5f, 27.5f, 1.5f)
                reflectiveQuadTo(518f, 376f)
                quadToRelative(8f, 14f, 2.5f, 29.5f)
                reflectiveQuadTo(501f, 429f)
                lineTo(218f, 579f)
                close()
                moveToRelative(102f, 261f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 760f)
                verticalLineToRelative(-147f)
                lineToRelative(315f, -166f)
                quadToRelative(14f, -8f, 19f, -23.5f)
                reflectiveQuadToRelative(-2f, -29.5f)
                lineToRelative(193f, -96f)
                quadToRelative(15f, -8f, 30.5f, -1.5f)
                reflectiveQuadTo(821f, 323f)
                quadToRelative(7f, 13f, 3.5f, 27f)
                reflectiveQuadTo(810f, 372f)
                lineTo(560f, 560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-20f, -440f)
                quadToRelative(-58f, 0f, -99f, -41f)
                reflectiveQuadToRelative(-41f, -99f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                close()
            }
        }.build()
        
        return _Taunt!!
    }

private var _Taunt: ImageVector? = null

