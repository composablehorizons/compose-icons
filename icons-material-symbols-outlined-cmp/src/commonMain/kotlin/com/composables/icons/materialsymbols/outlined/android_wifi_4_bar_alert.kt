package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Android_wifi_4_bar_alert: ImageVector
    get() {
        if (_Android_wifi_4_bar_alert != null) return _Android_wifi_4_bar_alert!!
        
        _Android_wifi_4_bar_alert = ImageVector.Builder(
            name = "android_wifi_4_bar_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(73f, 424f)
                lineTo(2f, 353f)
                quadToRelative(97f, -94f, 220.5f, -143.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(134f, 0f, 257.5f, 49.5f)
                reflectiveQuadTo(958f, 353f)
                lineToRelative(-71f, 71f)
                quadToRelative(-82f, -79f, -187f, -121.5f)
                reflectiveQuadTo(480f, 260f)
                quadToRelative(-115f, 0f, -220f, 42.5f)
                reflectiveQuadTo(73f, 424f)
                close()
                moveToRelative(407f, 376f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveTo(298f, 651f)
                lineToRelative(-70f, -71f)
                quadToRelative(51f, -48f, 116f, -74f)
                reflectiveQuadToRelative(136f, -26f)
                quadToRelative(41f, 0f, 80.5f, 8.5f)
                reflectiveQuadTo(636f, 514f)
                quadToRelative(-17f, 17f, -33f, 38.5f)
                reflectiveQuadTo(574f, 597f)
                quadToRelative(-23f, -8f, -46.5f, -12.5f)
                reflectiveQuadTo(480f, 580f)
                quadToRelative(-51f, 0f, -97.5f, 18f)
                reflectiveQuadTo(298f, 651f)
                close()
                moveTo(186f, 538f)
                lineToRelative(-70f, -71f)
                quadToRelative(74f, -71f, 168f, -109f)
                reflectiveQuadToRelative(197f, -38f)
                quadToRelative(103f, 0f, 196.5f, 37.5f)
                reflectiveQuadTo(845f, 466f)
                lineToRelative(-15f, 16f)
                quadToRelative(-20f, -3f, -36.5f, -7.5f)
                reflectiveQuadTo(760f, 470f)
                quadToRelative(-14f, 0f, -28.5f, 3.5f)
                reflectiveQuadTo(701f, 482f)
                quadToRelative(-50f, -30f, -106f, -46f)
                reflectiveQuadToRelative(-115f, -16f)
                quadToRelative(-83f, 0f, -158.5f, 30.5f)
                reflectiveQuadTo(186f, 538f)
                close()
                moveToRelative(574f, 262f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Android_wifi_4_bar_alert!!
    }

private var _Android_wifi_4_bar_alert: ImageVector? = null

