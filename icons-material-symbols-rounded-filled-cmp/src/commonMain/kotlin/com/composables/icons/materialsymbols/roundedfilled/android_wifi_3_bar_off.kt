package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Android_wifi_3_bar_off: ImageVector
    get() {
        if (_Android_wifi_3_bar_off != null) return _Android_wifi_3_bar_off!!
        
        _Android_wifi_3_bar_off = ImageVector.Builder(
            name = "android_wifi_3_bar_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(302f, 440f)
                lineToRelative(-110f, -77f)
                quadToRelative(-10f, 6f, -19f, 12.5f)
                reflectiveQuadTo(155f, 389f)
                quadToRelative(-20f, 16f, -45.5f, 15.5f)
                reflectiveQuadTo(66f, 386f)
                quadToRelative(-17f, -17f, -17f, -42f)
                reflectiveQuadToRelative(20f, -40f)
                quadToRelative(5f, -4f, 9.5f, -7f)
                reflectiveQuadToRelative(9.5f, -7f)
                lineToRelative(-18f, -12f)
                quadToRelative(-17f, -12f, -20.5f, -32f)
                reflectiveQuadToRelative(8.5f, -37f)
                quadToRelative(12f, -17f, 32.5f, -21f)
                reflectiveQuadToRelative(37.5f, 8f)
                lineToRelative(704f, 494f)
                quadToRelative(17f, 12f, 21f, 32f)
                reflectiveQuadToRelative(-8f, 37f)
                quadToRelative(-12f, 17f, -32.5f, 20.5f)
                reflectiveQuadTo(775f, 771f)
                lineTo(424f, 525f)
                quadToRelative(-26f, 5f, -50.5f, 14.5f)
                reflectiveQuadTo(326f, 563f)
                quadToRelative(-22f, 14f, -47f, 12.5f)
                reflectiveQuadTo(236f, 556f)
                quadToRelative(-17f, -17f, -16.5f, -41.5f)
                reflectiveQuadTo(240f, 476f)
                quadToRelative(15f, -11f, 30.5f, -19.5f)
                reflectiveQuadTo(302f, 440f)
                close()
                moveToRelative(123f, -157f)
                lineToRelative(-135f, -95f)
                quadToRelative(46f, -14f, 93.5f, -21f)
                reflectiveQuadToRelative(96.5f, -7f)
                quadToRelative(113f, 0f, 218f, 37f)
                reflectiveQuadToRelative(193f, 107f)
                quadToRelative(20f, 15f, 20f, 40f)
                reflectiveQuadToRelative(-17f, 42f)
                quadToRelative(-18f, 18f, -43.5f, 18.5f)
                reflectiveQuadTo(805f, 389f)
                quadToRelative(-70f, -54f, -153f, -81.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-14f, 0f, -27.5f, 0.5f)
                reflectiveQuadTo(425f, 283f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar_off!!
    }

private var _Android_wifi_3_bar_off: ImageVector? = null

