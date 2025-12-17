package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Event_repeat: ImageVector
    get() {
        if (_Event_repeat != null) return _Event_repeat!!
        
        _Event_repeat = ImageVector.Builder(
            name = "event_repeat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 120f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(-40f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 880f)
                horizontalLineTo(200f)
                close()
                moveTo(760f, 960f)
                quadToRelative(-64f, 0f, -114.5f, -35.5f)
                reflectiveQuadTo(573f, 832f)
                quadToRelative(-5f, -11f, 2.5f, -21.5f)
                reflectiveQuadTo(595f, 800f)
                quadToRelative(14f, 0f, 25.5f, 8.5f)
                reflectiveQuadTo(639f, 830f)
                quadToRelative(18f, 32f, 50f, 51f)
                reflectiveQuadToRelative(71f, 19f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-29f, 0f, -54f, 10.5f)
                reflectiveQuadTo(662f, 660f)
                horizontalLineToRelative(28f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(720f, 690f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(690f, 720f)
                horizontalLineToRelative(-90f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 680f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(590f, 560f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(620f, 590f)
                verticalLineToRelative(27f)
                quadToRelative(27f, -26f, 63f, -41.5f)
                reflectiveQuadToRelative(77f, -15.5f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(960f, 760f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(760f, 960f)
                close()
            }
        }.build()
        
        return _Event_repeat!!
    }

private var _Event_repeat: ImageVector? = null

