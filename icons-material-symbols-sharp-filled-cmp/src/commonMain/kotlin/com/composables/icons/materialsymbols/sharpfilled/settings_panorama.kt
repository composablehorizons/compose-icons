package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Settings_panorama: ImageVector
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
                moveToRelative(-200f, 2f)
                lineToRelative(-16f, -128f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-119f, 50f)
                lineTo(78f, 585f)
                lineToRelative(103f, -78f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineTo(78f, 375f)
                lineToRelative(110f, -190f)
                lineToRelative(119f, 50f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(16f, -128f)
                horizontalLineToRelative(220f)
                lineToRelative(16f, 128f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(119f, -50f)
                lineToRelative(110f, 190f)
                lineToRelative(-103f, 78f)
                quadToRelative(1f, 7f, 1f, 13.5f)
                verticalLineToRelative(33.5f)
                quadToRelative(0f, 10f, -2f, 20f)
                horizontalLineTo(616f)
                quadToRelative(3f, -10f, 4.5f, -19.5f)
                reflectiveQuadTo(622f, 480f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-59f, 0f, -99.5f, 41f)
                reflectiveQuadTo(342f, 480f)
                quadToRelative(0f, 48f, 27.5f, 84f)
                reflectiveQuadToRelative(70.5f, 50f)
                verticalLineToRelative(266f)
                horizontalLineToRelative(-70f)
                close()
            }
        }.build()
        
        return _Settings_panorama!!
    }

private var _Settings_panorama: ImageVector? = null

