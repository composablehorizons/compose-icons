package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Android_wifi_3_bar_lock: ImageVector
    get() {
        if (_Android_wifi_3_bar_lock != null) return _Android_wifi_3_bar_lock!!
        
        _Android_wifi_3_bar_lock = ImageVector.Builder(
            name = "android_wifi_3_bar_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(714f, 800f)
                quadToRelative(-14f, 0f, -24f, -10f)
                reflectiveQuadToRelative(-10f, -24f)
                verticalLineToRelative(-132f)
                quadToRelative(0f, -14f, 10f, -24f)
                reflectiveQuadToRelative(24f, -10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(6f)
                quadToRelative(14f, 0f, 24f, 10f)
                reflectiveQuadToRelative(10f, 24f)
                verticalLineToRelative(132f)
                quadToRelative(0f, 14f, -10f, 24f)
                reflectiveQuadToRelative(-24f, 10f)
                horizontalLineTo(714f)
                close()
                moveToRelative(46f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(40f)
                close()
                moveTo(480f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(0f, -280f)
                quadToRelative(-41f, 0f, -79.5f, 10.5f)
                reflectiveQuadTo(327f, 562f)
                quadToRelative(-22f, 14f, -47.5f, 13f)
                reflectiveQuadTo(236f, 556f)
                quadToRelative(-17f, -17f, -16.5f, -41.5f)
                reflectiveQuadTo(240f, 476f)
                quadToRelative(53f, -37f, 114f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(51f, 0f, 99f, 12f)
                reflectiveQuadToRelative(93f, 35f)
                quadToRelative(-24f, 20f, -39.5f, 46.5f)
                reflectiveQuadTo(608f, 549f)
                quadToRelative(-30f, -14f, -62.5f, -21.5f)
                reflectiveQuadTo(480f, 520f)
                close()
                moveToRelative(0f, -240f)
                quadToRelative(-89f, 0f, -172f, 27.5f)
                reflectiveQuadTo(155f, 389f)
                quadToRelative(-20f, 16f, -45.5f, 15.5f)
                reflectiveQuadTo(66f, 386f)
                quadToRelative(-17f, -17f, -17f, -42f)
                reflectiveQuadToRelative(20f, -40f)
                quadToRelative(88f, -70f, 193f, -107f)
                reflectiveQuadToRelative(218f, -37f)
                quadToRelative(113f, 0f, 218f, 37f)
                reflectiveQuadToRelative(193f, 107f)
                quadToRelative(20f, 15f, 20f, 40f)
                reflectiveQuadToRelative(-17f, 42f)
                quadToRelative(-18f, 18f, -43.5f, 18.5f)
                reflectiveQuadTo(805f, 389f)
                quadToRelative(-70f, -54f, -153f, -81.5f)
                reflectiveQuadTo(480f, 280f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar_lock!!
    }

private var _Android_wifi_3_bar_lock: ImageVector? = null

