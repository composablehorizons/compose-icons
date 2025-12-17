package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wifi_home: ImageVector
    get() {
        if (_Wifi_home != null) return _Wifi_home!!
        
        _Wifi_home = ImageVector.Builder(
            name = "wifi_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-295f)
                lineToRelative(-40f, 31f)
                quadToRelative(-14f, 10f, -30f, 8f)
                reflectiveQuadToRelative(-26f, -16f)
                quadToRelative(-10f, -14f, -7.5f, -30f)
                reflectiveQuadTo(72f, 392f)
                lineToRelative(359f, -275f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(360f, 275f)
                quadToRelative(13f, 10f, 15f, 26.5f)
                reflectiveQuadToRelative(-8f, 29.5f)
                quadToRelative(-10f, 13f, -26f, 15f)
                reflectiveQuadToRelative(-29f, -8f)
                lineToRelative(-41f, -30f)
                verticalLineToRelative(26f)
                quadToRelative(-19f, -6f, -39f, -8.5f)
                reflectiveQuadToRelative(-41f, -2.5f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 9f, 0.5f, 18f)
                reflectiveQuadToRelative(1.5f, 17f)
                quadToRelative(2f, 18f, -8.5f, 31.5f)
                reflectiveQuadTo(406f, 800f)
                horizontalLineTo(240f)
                close()
                moveTo(550f, 920f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(520f, 890f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(550f, 860f)
                horizontalLineToRelative(27f)
                quadToRelative(-26f, -27f, -41.5f, -63f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -61f, 33f, -110.5f)
                reflectiveQuadToRelative(87f, -72.5f)
                quadToRelative(11f, -5f, 20.5f, 0f)
                reflectiveQuadToRelative(14.5f, 16f)
                quadToRelative(5f, 11f, 1f, 22.5f)
                reflectiveQuadTo(657f, 595f)
                quadToRelative(-35f, 17f, -56f, 50.5f)
                reflectiveQuadTo(580f, 720f)
                quadToRelative(0f, 29f, 10.5f, 54f)
                reflectiveQuadToRelative(29.5f, 44f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(650f, 760f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(680f, 790f)
                verticalLineToRelative(90f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 920f)
                horizontalLineToRelative(-90f)
                close()
                moveToRelative(251f, -17f)
                quadToRelative(-11f, 5f, -21f, 0f)
                reflectiveQuadToRelative(-15f, -16f)
                quadToRelative(-5f, -11f, -1f, -22.5f)
                reflectiveQuadToRelative(19f, -19.5f)
                quadToRelative(35f, -18f, 56f, -51f)
                reflectiveQuadToRelative(21f, -74f)
                quadToRelative(0f, -29f, -10.5f, -54f)
                reflectiveQuadTo(820f, 622f)
                verticalLineToRelative(28f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(790f, 680f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(760f, 650f)
                verticalLineToRelative(-90f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(800f, 520f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(920f, 550f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(890f, 580f)
                horizontalLineToRelative(-27f)
                quadToRelative(26f, 27f, 41.5f, 63f)
                reflectiveQuadToRelative(15.5f, 77f)
                quadToRelative(0f, 61f, -33f, 110.5f)
                reflectiveQuadTo(801f, 903f)
                close()
            }
        }.build()
        
        return _Wifi_home!!
    }

private var _Wifi_home: ImageVector? = null

