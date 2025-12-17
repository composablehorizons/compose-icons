package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wifi_password: ImageVector
    get() {
        if (_Wifi_password != null) return _Wifi_password!!
        
        _Wifi_password = ImageVector.Builder(
            name = "wifi_password",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 960f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 920f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 760f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 720f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(960f, 800f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 960f)
                horizontalLineTo(760f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(840f, 680f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-320f, 80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(0f, -440f)
                quadToRelative(75f, 0f, 142.5f, 24f)
                reflectiveQuadTo(745f, 490f)
                quadToRelative(20f, 15f, 20.5f, 39.5f)
                reflectiveQuadTo(748f, 572f)
                quadToRelative(-17f, 17f, -42f, 17.5f)
                reflectiveQuadTo(661f, 576f)
                quadToRelative(-38f, -26f, -84f, -41f)
                reflectiveQuadToRelative(-97f, -15f)
                quadToRelative(-51f, 0f, -97f, 15f)
                reflectiveQuadToRelative(-84f, 41f)
                quadToRelative(-20f, 14f, -45f, 13f)
                reflectiveQuadToRelative(-42f, -18f)
                quadToRelative(-17f, -18f, -17f, -42.5f)
                reflectiveQuadToRelative(20f, -39.5f)
                quadToRelative(55f, -42f, 122.5f, -65.5f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(125f, 0f, 235.5f, 41f)
                reflectiveQuadTo(914f, 317f)
                quadToRelative(20f, 17f, 21f, 42f)
                reflectiveQuadToRelative(-17f, 43f)
                quadToRelative(-17f, 17f, -42f, 17.5f)
                reflectiveQuadTo(831f, 404f)
                quadToRelative(-72f, -59f, -161.5f, -91.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-100f, 0f, -189.5f, 32.5f)
                reflectiveQuadTo(129f, 404f)
                quadToRelative(-20f, 16f, -45f, 15.5f)
                reflectiveQuadTo(42f, 402f)
                quadToRelative(-18f, -18f, -17f, -43f)
                reflectiveQuadToRelative(21f, -42f)
                quadToRelative(88f, -75f, 198.5f, -116f)
                reflectiveQuadTo(480f, 160f)
                close()
            }
        }.build()
        
        return _Wifi_password!!
    }

private var _Wifi_password: ImageVector? = null

