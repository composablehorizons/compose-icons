package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Android_wifi_4_bar_lock: ImageVector
    get() {
        if (_Android_wifi_4_bar_lock != null) return _Android_wifi_4_bar_lock!!
        
        _Android_wifi_4_bar_lock = ImageVector.Builder(
            name = "android_wifi_4_bar_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 800f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(800f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(760f, 560f)
                verticalLineToRelative(40f)
                close()
                moveTo(73f, 424f)
                lineTo(2f, 353f)
                quadToRelative(97f, -94f, 220.5f, -143.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(134f, 0f, 257.5f, 49.5f)
                reflectiveQuadTo(958f, 353f)
                lineToRelative(-67f, 68f)
                quadToRelative(-4f, -2f, -7.5f, -3.5f)
                reflectiveQuadTo(876f, 414f)
                quadToRelative(-81f, -75f, -183f, -114.5f)
                reflectiveQuadTo(480f, 260f)
                quadToRelative(-115f, 0f, -220f, 42.5f)
                reflectiveQuadTo(73f, 424f)
                close()
                moveToRelative(113f, 114f)
                lineToRelative(-70f, -71f)
                quadToRelative(74f, -71f, 168f, -109f)
                reflectiveQuadToRelative(197f, -38f)
                quadToRelative(76f, 0f, 148f, 21.5f)
                reflectiveQuadTo(765f, 404f)
                quadToRelative(-30f, 5f, -57.5f, 19.5f)
                reflectiveQuadTo(658f, 460f)
                quadToRelative(-42f, -19f, -87f, -29.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-83f, 0f, -158.5f, 30.5f)
                reflectiveQuadTo(186f, 538f)
                close()
                moveToRelative(112f, 113f)
                lineToRelative(-70f, -71f)
                quadToRelative(51f, -48f, 116f, -74f)
                reflectiveQuadToRelative(136f, -26f)
                quadToRelative(37f, 0f, 73f, 7.5f)
                reflectiveQuadToRelative(70f, 21.5f)
                quadToRelative(-12f, 23f, -17.5f, 48f)
                reflectiveQuadToRelative(-5.5f, 51f)
                quadToRelative(-28f, -15f, -58f, -21.5f)
                reflectiveQuadToRelative(-62f, -6.5f)
                quadToRelative(-51f, 0f, -97.5f, 18f)
                reflectiveQuadTo(298f, 651f)
                close()
                moveToRelative(182f, 183f)
                lineToRelative(120f, -121f)
                verticalLineToRelative(-35f)
                quadToRelative(-26f, -18f, -56f, -28f)
                reflectiveQuadToRelative(-64f, -10f)
                quadToRelative(-41f, 0f, -76f, 14.5f)
                reflectiveQuadTo(341f, 694f)
                lineToRelative(139f, 140f)
                close()
            }
        }.build()
        
        return _Android_wifi_4_bar_lock!!
    }

private var _Android_wifi_4_bar_lock: ImageVector? = null

