package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Wifi_notification: ImageVector
    get() {
        if (_Wifi_notification != null) return _Wifi_notification!!
        
        _Wifi_notification = ImageVector.Builder(
            name = "wifi_notification",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 800f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(200f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 720f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 680f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -83f, 50f, -147.5f)
                reflectiveQuadTo(420f, 168f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 140f)
                verticalLineToRelative(28f)
                quadToRelative(2f, 1f, 4f, 1f)
                reflectiveQuadToRelative(4f, 1f)
                quadToRelative(22f, 6f, 22f, 30.5f)
                reflectiveQuadTo(544f, 236f)
                quadToRelative(-28f, 12f, -54f, 27f)
                reflectiveQuadToRelative(-50f, 33f)
                quadToRelative(-37f, 27f, -38.5f, 75f)
                reflectiveQuadToRelative(33.5f, 83f)
                lineToRelative(203f, 203f)
                quadToRelative(11f, 11f, 25.5f, 17f)
                reflectiveQuadToRelative(30.5f, 6f)
                horizontalLineToRelative(66f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(200f)
                close()
                moveToRelative(493f, -420f)
                quadToRelative(-46f, 0f, -87f, 15f)
                reflectiveQuadToRelative(-74f, 41f)
                quadToRelative(-10f, 8f, -22.5f, 8f)
                reflectiveQuadToRelative(-21.5f, -9f)
                quadToRelative(-9f, -9f, -8f, -22f)
                reflectiveQuadToRelative(11f, -21f)
                quadToRelative(42f, -34f, 93.5f, -53f)
                reflectiveQuadTo(694f, 280f)
                quadToRelative(58f, 0f, 109f, 19f)
                reflectiveQuadToRelative(93f, 53f)
                quadToRelative(10f, 8f, 10.5f, 21f)
                reflectiveQuadToRelative(-8.5f, 22f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-22f, -8f)
                quadToRelative(-33f, -26f, -74.5f, -41f)
                reflectiveQuadTo(693f, 340f)
                close()
                moveToRelative(1f, 120f)
                quadToRelative(-21f, 0f, -40.5f, 6f)
                reflectiveQuadTo(617f, 483f)
                quadToRelative(-11f, 7f, -22.5f, 6.5f)
                reflectiveQuadTo(574f, 480f)
                quadToRelative(-9f, -9f, -8.5f, -21f)
                reflectiveQuadToRelative(10.5f, -20f)
                quadToRelative(25f, -18f, 54.5f, -28.5f)
                reflectiveQuadTo(693f, 400f)
                quadToRelative(33f, 0f, 63.5f, 10.5f)
                reflectiveQuadTo(812f, 439f)
                quadToRelative(10f, 8f, 10.5f, 20f)
                reflectiveQuadToRelative(-8.5f, 21f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-23f, -7f)
                quadToRelative(-17f, -11f, -36f, -16.5f)
                reflectiveQuadToRelative(-40f, -5.5f)
                close()
                moveToRelative(0f, 140f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(654f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(694f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(734f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(694f, 600f)
                close()
            }
        }.build()
        
        return _Wifi_notification!!
    }

private var _Wifi_notification: ImageVector? = null

