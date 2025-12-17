package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_panorama: ImageVector
    get() {
        if (_Settings_panorama != null) return _Settings_panorama!!
        
        _Settings_panorama = ImageVector.Builder(
            name = "settings_panorama",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(570f, 878f)
                quadToRelative(-19f, 5f, -34.5f, -6.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -20f, 15.5f, -31.5f)
                reflectiveQuadTo(571f, 602f)
                quadToRelative(37f, 10f, 74f, 14f)
                reflectiveQuadToRelative(75f, 4f)
                quadToRelative(38f, 0f, 75.5f, -4f)
                reflectiveQuadToRelative(74.5f, -14f)
                quadToRelative(19f, -5f, 34.5f, 6.5f)
                reflectiveQuadTo(920f, 640f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 20f, -15.5f, 31.5f)
                reflectiveQuadTo(870f, 878f)
                quadToRelative(-37f, -10f, -74.5f, -14f)
                reflectiveQuadToRelative(-75.5f, -4f)
                quadToRelative(-38f, 0f, -75.5f, 4f)
                reflectiveQuadTo(570f, 878f)
                close()
                moveToRelative(-88f, -538f)
                quadToRelative(-59f, 0f, -99.5f, 41f)
                reflectiveQuadTo(342f, 480f)
                quadToRelative(0f, 48f, 27.5f, 84f)
                reflectiveQuadToRelative(70.5f, 50f)
                verticalLineToRelative(231f)
                quadToRelative(0f, 14f, -10.5f, 24.5f)
                reflectiveQuadTo(405f, 880f)
                quadToRelative(-15f, 0f, -26f, -10f)
                reflectiveQuadToRelative(-13f, -25f)
                lineToRelative(-11f, -91f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(308f, 727f)
                lineToRelative(-62f, 26f)
                quadToRelative(-25f, 11f, -50f, 2f)
                reflectiveQuadToRelative(-39f, -32f)
                lineToRelative(-47f, -82f)
                quadToRelative(-14f, -23f, -8f, -49f)
                reflectiveQuadToRelative(27f, -43f)
                lineToRelative(53f, -40f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineToRelative(-53f, -40f)
                quadToRelative(-21f, -17f, -27f, -43f)
                reflectiveQuadToRelative(8f, -49f)
                lineToRelative(47f, -82f)
                quadToRelative(14f, -23f, 39f, -32f)
                reflectiveQuadToRelative(50f, 2f)
                lineToRelative(62f, 26f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(8f, -66f)
                quadToRelative(3f, -27f, 23f, -44.5f)
                reflectiveQuadToRelative(47f, -17.5f)
                horizontalLineToRelative(96f)
                quadToRelative(27f, 0f, 47f, 17.5f)
                reflectiveQuadToRelative(23f, 44.5f)
                lineToRelative(8f, 66f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(60f, -26f)
                quadToRelative(25f, -11f, 50.5f, -2f)
                reflectiveQuadToRelative(39.5f, 32f)
                lineToRelative(47f, 82f)
                quadToRelative(14f, 23f, 8.5f, 49f)
                reflectiveQuadTo(833f, 415f)
                lineToRelative(-54f, 38f)
                quadToRelative(1f, 5f, 1f, 12.5f)
                verticalLineToRelative(15.5f)
                quadToRelative(0f, 17f, -12f, 28f)
                reflectiveQuadToRelative(-29f, 11f)
                horizontalLineTo(616f)
                quadToRelative(3f, -10f, 4.5f, -19.5f)
                reflectiveQuadTo(622f, 480f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                close()
            }
        }.build()
        
        return _Settings_panorama!!
    }

private var _Settings_panorama: ImageVector? = null

