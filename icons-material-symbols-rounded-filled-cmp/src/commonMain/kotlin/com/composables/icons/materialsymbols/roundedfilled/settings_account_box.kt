package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Settings_account_box: ImageVector
    get() {
        if (_Settings_account_box != null) return _Settings_account_box!!
        
        _Settings_account_box = ImageVector.Builder(
            name = "settings_account_box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(580f, 920f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 860f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 520f)
                horizontalLineToRelative(280f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(920f, 580f)
                verticalLineToRelative(280f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(860f, 920f)
                horizontalLineTo(580f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(240f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -6f, -2f, -11f)
                reflectiveQuadToRelative(-6f, -10f)
                quadToRelative(-25f, -27f, -58.5f, -43f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(-40f, 0f, -73.5f, 16f)
                reflectiveQuadTo(588f, 819f)
                quadToRelative(-2f, 2f, -8f, 21f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                close()
                moveToRelative(120f, -140f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(660f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveTo(403f, 880f)
                quadToRelative(-15f, 0f, -24.5f, -8.5f)
                reflectiveQuadTo(367f, 850f)
                lineToRelative(-13f, -96f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 727f)
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
                lineToRelative(-25f, 18f)
                quadToRelative(-5f, 4f, -11f, 5.5f)
                reflectiveQuadToRelative(-12f, 1.5f)
                horizontalLineTo(629f)
                quadToRelative(-6f, 0f, -11f, -4f)
                reflectiveQuadToRelative(-7f, -9f)
                quadToRelative(-16f, -38f, -50.5f, -62.5f)
                reflectiveQuadTo(482f, 340f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 44f, 23.5f, 78.5f)
                reflectiveQuadTo(427f, 609f)
                quadToRelative(5f, 2f, 9f, 7f)
                reflectiveQuadToRelative(4f, 11f)
                verticalLineToRelative(219f)
                quadToRelative(0f, 14f, -10.5f, 24f)
                reflectiveQuadTo(403f, 880f)
                close()
            }
        }.build()
        
        return _Settings_account_box!!
    }

private var _Settings_account_box: ImageVector? = null

