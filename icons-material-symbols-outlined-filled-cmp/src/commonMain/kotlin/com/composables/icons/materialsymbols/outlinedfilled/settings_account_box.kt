package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Settings_account_box: ImageVector
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
                moveToRelative(0f, -60f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(-32f)
                quadToRelative(-25f, -31f, -61f, -49.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(-43f, 0f, -79f, 18.5f)
                reflectiveQuadTo(580f, 828f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(140f, -140f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(660f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveTo(370f, 880f)
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
                lineToRelative(-85f, 65f)
                horizontalLineTo(616f)
                quadToRelative(-14f, -43f, -50f, -71.5f)
                reflectiveQuadTo(482f, 340f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 48f, 27f, 84f)
                reflectiveQuadToRelative(71f, 50f)
                verticalLineToRelative(266f)
                horizontalLineToRelative(-70f)
                close()
            }
        }.build()
        
        return _Settings_account_box!!
    }

private var _Settings_account_box: ImageVector? = null

