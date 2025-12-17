package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wifi_channel: ImageVector
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
                moveTo(120f, 840f)
                quadToRelative(11f, -87f, 30.5f, -190.5f)
                reflectiveQuadTo(200f, 464f)
                quadToRelative(26f, -69f, 56f, -106.5f)
                reflectiveQuadToRelative(64f, -37.5f)
                quadToRelative(20f, 0f, 40f, 14f)
                reflectiveQuadToRelative(39f, 43f)
                quadToRelative(19f, 29f, 35.5f, 70f)
                reflectiveQuadToRelative(29.5f, 96f)
                quadToRelative(13f, -103f, 30f, -181.5f)
                reflectiveQuadTo(533f, 229f)
                quadToRelative(22f, -54f, 48.5f, -81.5f)
                reflectiveQuadTo(640f, 120f)
                quadToRelative(43f, 0f, 77f, 51f)
                reflectiveQuadToRelative(59f, 145f)
                quadToRelative(31f, 116f, 45f, 260f)
                reflectiveQuadToRelative(19f, 264f)
                horizontalLineToRelative(-80f)
                quadToRelative(-18f, -88f, -56f, -164f)
                reflectiveQuadToRelative(-64f, -76f)
                quadToRelative(-26f, 0f, -64.5f, 76f)
                reflectiveQuadTo(520f, 840f)
                horizontalLineToRelative(-80f)
                quadToRelative(-8f, -72f, -21.5f, -141.5f)
                reflectiveQuadTo(388f, 569f)
                quadToRelative(-17f, -60f, -34f, -103.5f)
                reflectiveQuadTo(320f, 405f)
                quadToRelative(-17f, 17f, -34f, 60f)
                reflectiveQuadToRelative(-34f, 103f)
                quadToRelative(-17f, 60f, -30.5f, 129.5f)
                reflectiveQuadTo(200f, 840f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(420f, -260f)
                quadToRelative(23f, -29f, 48f, -44.5f)
                reflectiveQuadToRelative(52f, -15.5f)
                quadToRelative(27f, 0f, 52f, 15.5f)
                reflectiveQuadToRelative(48f, 44.5f)
                quadToRelative(-9f, -76f, -20.5f, -139.5f)
                reflectiveQuadTo(695f, 327f)
                quadToRelative(-13f, -50f, -27f, -82f)
                reflectiveQuadToRelative(-28f, -43f)
                quadToRelative(-14f, 11f, -28f, 43f)
                reflectiveQuadToRelative(-27f, 82f)
                quadToRelative(-13f, 50f, -24.5f, 113.5f)
                reflectiveQuadTo(540f, 580f)
                close()
            }
        }.build()
        
        return _Wifi_channel!!
    }

private var _Wifi_channel: ImageVector? = null

