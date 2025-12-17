package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Android_wifi_3_bar_alert: ImageVector
    get() {
        if (_Android_wifi_3_bar_alert != null) return _Android_wifi_3_bar_alert!!
        
        _Android_wifi_3_bar_alert = ImageVector.Builder(
            name = "android_wifi_3_bar_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(-60f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 540f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 580f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 680f)
                close()
                moveTo(480f, 280f)
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
                moveToRelative(0f, 520f)
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
                quadToRelative(64f, 0f, 124.5f, 18.5f)
                reflectiveQuadTo(717f, 473f)
                quadToRelative(-29f, 11f, -61f, 29f)
                reflectiveQuadToRelative(-53f, 45f)
                quadToRelative(-26f, -13f, -57.5f, -20f)
                reflectiveQuadToRelative(-65.5f, -7f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar_alert!!
    }

private var _Android_wifi_3_bar_alert: ImageVector? = null

