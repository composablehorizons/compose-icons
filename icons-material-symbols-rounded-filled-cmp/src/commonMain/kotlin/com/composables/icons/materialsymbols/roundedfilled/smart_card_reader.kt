package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Smart_card_reader: ImageVector
    get() {
        if (_Smart_card_reader != null) return _Smart_card_reader!!
        
        _Smart_card_reader = ImageVector.Builder(
            name = "smart_card_reader",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 840f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 680f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 760f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 880f)
                horizontalLineTo(120f)
                close()
                moveToRelative(120f, -260f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 580f)
                verticalLineToRelative(-420f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 80f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(420f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 620f)
                horizontalLineTo(240f)
                close()
                moveToRelative(110f, -61f)
                quadToRelative(20f, 0f, 36f, -12.5f)
                reflectiveQuadToRelative(27f, -30.5f)
                quadToRelative(16f, -26f, 21.5f, -56f)
                reflectiveQuadToRelative(5.5f, -60f)
                quadToRelative(0f, -30f, -5.5f, -60f)
                reflectiveQuadTo(413f, 284f)
                quadToRelative(-11f, -18f, -27.5f, -30.5f)
                reflectiveQuadTo(348f, 241f)
                quadToRelative(-12f, 0f, -20f, 9f)
                reflectiveQuadToRelative(-8f, 22f)
                verticalLineToRelative(256f)
                quadToRelative(0f, 13f, 8.5f, 22f)
                reflectiveQuadToRelative(21.5f, 9f)
                close()
                moveToRelative(210f, -79f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(560f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(560f, 480f)
                close()
            }
        }.build()
        
        return _Smart_card_reader!!
    }

private var _Smart_card_reader: ImageVector? = null

