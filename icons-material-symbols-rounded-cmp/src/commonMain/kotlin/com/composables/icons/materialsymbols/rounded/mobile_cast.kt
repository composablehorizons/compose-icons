package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mobile_cast: ImageVector
    get() {
        if (_Mobile_cast != null) return _Mobile_cast!!
        
        _Mobile_cast = ImageVector.Builder(
            name = "mobile_cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 120f)
                verticalLineToRelative(124f)
                quadToRelative(18f, 7f, 29f, 22f)
                reflectiveQuadToRelative(11f, 34f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 19f, -11f, 34f)
                reflectiveQuadToRelative(-29f, 22f)
                verticalLineToRelative(444f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 880f)
                verticalLineToRelative(-760f)
                horizontalLineTo(280f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 400f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 120f)
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
                moveTo(680f, 880f)
                verticalLineToRelative(-760f)
                verticalLineToRelative(760f)
                close()
                moveTo(240f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 840f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 920f)
                close()
                moveToRelative(73f, -113f)
                quadToRelative(-15f, -15f, -33.5f, -26f)
                reflectiveQuadTo(240f, 765f)
                quadToRelative(-17f, -5f, -28.5f, -16.5f)
                reflectiveQuadTo(200f, 720f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(28f, -8.5f)
                quadToRelative(37f, 6f, 70.5f, 23.5f)
                reflectiveQuadTo(370f, 750f)
                quadToRelative(26f, 26f, 43.5f, 59.5f)
                reflectiveQuadTo(437f, 880f)
                quadToRelative(3f, 16f, -8.5f, 28f)
                reflectiveQuadTo(400f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(355f, 880f)
                quadToRelative(-5f, -21f, -16f, -39.5f)
                reflectiveQuadTo(313f, 807f)
                close()
                moveToRelative(113f, -113f)
                quadToRelative(-38f, -38f, -85.5f, -61.5f)
                reflectiveQuadTo(240f, 602f)
                quadToRelative(-17f, -2f, -28.5f, -13.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(29f, -9.5f)
                quadToRelative(69f, 7f, 131f, 36.5f)
                reflectiveQuadTo(483f, 637f)
                quadToRelative(49f, 49f, 77.5f, 111f)
                reflectiveQuadTo(597f, 879f)
                quadToRelative(2f, 17f, -9f, 29f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(517f, 880f)
                quadToRelative(-7f, -53f, -30f, -100.5f)
                reflectiveQuadTo(426f, 694f)
                close()
            }
        }.build()
        
        return _Mobile_cast!!
    }

private var _Mobile_cast: ImageVector? = null

