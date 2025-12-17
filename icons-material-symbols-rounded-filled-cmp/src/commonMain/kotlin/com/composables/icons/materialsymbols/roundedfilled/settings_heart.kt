package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_heart: ImageVector
    get() {
        if (_Settings_heart != null) return _Settings_heart!!
        
        _Settings_heart = ImageVector.Builder(
            name = "settings_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(433f, 880f)
                quadToRelative(-27f, 0f, -46.5f, -18f)
                reflectiveQuadTo(363f, 818f)
                lineToRelative(-9f, -66f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
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
                lineToRelative(9f, -66f)
                quadToRelative(4f, -26f, 23.5f, -44f)
                reflectiveQuadToRelative(46.5f, -18f)
                horizontalLineToRelative(94f)
                quadToRelative(27f, 0f, 46.5f, 18f)
                reflectiveQuadToRelative(23.5f, 44f)
                lineToRelative(9f, 66f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(62f, -26f)
                quadToRelative(25f, -11f, 50f, -2f)
                reflectiveQuadToRelative(39f, 32f)
                lineToRelative(47f, 82f)
                quadToRelative(14f, 23f, 8f, 49f)
                reflectiveQuadToRelative(-27f, 43f)
                lineToRelative(-53f, 40f)
                quadToRelative(1f, 7f, 1f, 13.5f)
                verticalLineToRelative(27f)
                quadToRelative(0f, 6.5f, -2f, 13.5f)
                lineToRelative(53f, 40f)
                quadToRelative(21f, 17f, 27f, 43f)
                reflectiveQuadToRelative(-8f, 49f)
                lineToRelative(-48f, 82f)
                quadToRelative(-14f, 23f, -39f, 32f)
                reflectiveQuadToRelative(-50f, -2f)
                lineToRelative(-60f, -26f)
                quadToRelative(-11f, 8f, -23f, 15f)
                reflectiveQuadToRelative(-24f, 12f)
                lineToRelative(-9f, 66f)
                quadToRelative(-4f, 26f, -23.5f, 44f)
                reflectiveQuadTo(527f, 880f)
                horizontalLineToRelative(-94f)
                close()
                moveToRelative(49f, -257f)
                quadToRelative(8f, 0f, 15f, -2.5f)
                reflectiveQuadToRelative(13f, -8.5f)
                lineToRelative(112f, -112f)
                quadToRelative(17f, -17f, 22f, -41.5f)
                reflectiveQuadToRelative(-5f, -47.5f)
                quadToRelative(-10f, -23f, -30f, -37f)
                reflectiveQuadToRelative(-45f, -14f)
                quadToRelative(-25f, 0f, -45f, 15.5f)
                reflectiveQuadTo(482f, 408f)
                quadToRelative(-18f, -17f, -37.5f, -32.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(-25f, 0f, -45.5f, 13.5f)
                reflectiveQuadTo(324f, 410f)
                quadToRelative(-10f, 23f, -4.5f, 47.5f)
                reflectiveQuadTo(342f, 500f)
                lineToRelative(111f, 112f)
                quadToRelative(6f, 6f, 13.5f, 8.5f)
                reflectiveQuadTo(482f, 623f)
                close()
            }
        }.build()
        
        return _Settings_heart!!
    }

private var _Settings_heart: ImageVector? = null

