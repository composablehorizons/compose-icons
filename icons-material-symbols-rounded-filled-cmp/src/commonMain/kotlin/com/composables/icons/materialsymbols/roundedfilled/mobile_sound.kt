package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mobile_sound: ImageVector
    get() {
        if (_Mobile_sound != null) return _Mobile_sound!!
        
        _Mobile_sound = ImageVector.Builder(
            name = "mobile_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 840f)
                verticalLineToRelative(-720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 8f, -3f, 15.5f)
                reflectiveQuadToRelative(-9f, 13.5f)
                lineTo(511f, 395f)
                quadToRelative(-35f, 35f, -35f, 85f)
                reflectiveQuadToRelative(35f, 85f)
                lineToRelative(237f, 236f)
                quadToRelative(6f, 6f, 9f, 13.5f)
                reflectiveQuadToRelative(3f, 15.5f)
                verticalLineToRelative(10f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 920f)
                horizontalLineTo(280f)
                close()
                moveToRelative(350f, -354f)
                quadToRelative(-14f, -7f, -20.5f, -21.5f)
                reflectiveQuadTo(612f, 513f)
                quadToRelative(5f, -8f, 6.5f, -16f)
                reflectiveQuadToRelative(1.5f, -17f)
                quadToRelative(0f, -9f, -1.5f, -17f)
                reflectiveQuadToRelative(-6.5f, -16f)
                quadToRelative(-9f, -17f, -2.5f, -31.5f)
                reflectiveQuadTo(630f, 394f)
                quadToRelative(14f, -7f, 29.5f, -3.5f)
                reflectiveQuadTo(685f, 413f)
                quadToRelative(8f, 16f, 11.5f, 33f)
                reflectiveQuadToRelative(3.5f, 34f)
                quadToRelative(0f, 17f, -3.5f, 34f)
                reflectiveQuadTo(685f, 547f)
                quadToRelative(-10f, 19f, -25.5f, 22.5f)
                reflectiveQuadTo(630f, 566f)
                close()
                moveToRelative(97f, 98f)
                quadToRelative(-13f, -8f, -18f, -22.5f)
                reflectiveQuadToRelative(6f, -27.5f)
                quadToRelative(23f, -29f, 34f, -62.5f)
                reflectiveQuadToRelative(11f, -71.5f)
                quadToRelative(0f, -38f, -11f, -71.5f)
                reflectiveQuadTo(715f, 346f)
                quadToRelative(-11f, -13f, -6f, -27.5f)
                reflectiveQuadToRelative(18f, -22.5f)
                quadToRelative(13f, -8f, 29.5f, -7f)
                reflectiveQuadToRelative(30.5f, 21f)
                quadToRelative(26f, 37f, 39.5f, 80.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 46f, -13.5f, 89.5f)
                reflectiveQuadTo(787f, 650f)
                quadToRelative(-14f, 20f, -30.5f, 21f)
                reflectiveQuadToRelative(-29.5f, -7f)
                close()
                moveTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Mobile_sound!!
    }

private var _Mobile_sound: ImageVector? = null

