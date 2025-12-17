package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wifi_channel: ImageVector
    get() {
        if (_Wifi_channel != null) return _Wifi_channel!!
        
        _Wifi_channel = ImageVector.Builder(
            name = "wifi_channel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-16f, 0f, -26.5f, -12f)
                reflectiveQuadToRelative(-8.5f, -28f)
                quadToRelative(11f, -82f, 29.5f, -173f)
                reflectiveQuadTo(200f, 464f)
                quadToRelative(26f, -72f, 56.5f, -108f)
                reflectiveQuadToRelative(63.5f, -36f)
                quadToRelative(21f, 0f, 41.5f, 15.5f)
                reflectiveQuadTo(401f, 380f)
                quadToRelative(19f, 29f, 35f, 70.5f)
                reflectiveQuadToRelative(28f, 92.5f)
                quadToRelative(14f, -106f, 31f, -185f)
                reflectiveQuadToRelative(39f, -132f)
                quadToRelative(22f, -53f, 48.5f, -79.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(42f, 0f, 76f, 49f)
                reflectiveQuadToRelative(60f, 147f)
                quadToRelative(28f, 106f, 42f, 237f)
                reflectiveQuadToRelative(20f, 246f)
                quadToRelative(1f, 17f, -10f, 29f)
                reflectiveQuadToRelative(-28f, 12f)
                quadToRelative(-17f, 0f, -30.5f, -11f)
                reflectiveQuadTo(751f, 801f)
                quadToRelative(-9f, -33f, -21f, -65f)
                reflectiveQuadToRelative(-26f, -60f)
                quadToRelative(-18f, -36f, -34.5f, -56f)
                reflectiveQuadTo(640f, 600f)
                quadToRelative(-18f, 0f, -37.5f, 30f)
                reflectiveQuadTo(575f, 677f)
                quadToRelative(-13f, 26f, -24.5f, 57f)
                reflectiveQuadTo(530f, 799f)
                quadToRelative(-5f, 18f, -19f, 29.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-17f, 0f, -30f, -12f)
                reflectiveQuadToRelative(-15f, -30f)
                quadToRelative(-10f, -68f, -23f, -131.5f)
                reflectiveQuadTo(383f, 550f)
                quadToRelative(-16f, -53f, -32f, -91f)
                reflectiveQuadToRelative(-31f, -54f)
                quadToRelative(-17f, 18f, -34f, 60.5f)
                reflectiveQuadTo(252f, 568f)
                quadToRelative(-14f, 51f, -26.5f, 110f)
                reflectiveQuadTo(205f, 800f)
                quadToRelative(-2f, 17f, -15f, 28.5f)
                reflectiveQuadTo(160f, 840f)
                close()
                moveToRelative(380f, -260f)
                quadToRelative(23f, -30f, 48.5f, -45f)
                reflectiveQuadToRelative(51.5f, -15f)
                quadToRelative(26f, 0f, 51.5f, 15f)
                reflectiveQuadToRelative(48.5f, 45f)
                quadToRelative(-9f, -75f, -20.5f, -139f)
                reflectiveQuadTo(695f, 327f)
                quadToRelative(-13f, -50f, -27f, -82f)
                reflectiveQuadToRelative(-28f, -43f)
                quadToRelative(-14f, 11f, -28f, 43f)
                reflectiveQuadToRelative(-27f, 82f)
                quadToRelative(-13f, 50f, -24.5f, 114f)
                reflectiveQuadTo(540f, 580f)
                close()
            }
        }.build()
        
        return _Wifi_channel!!
    }

private var _Wifi_channel: ImageVector? = null

