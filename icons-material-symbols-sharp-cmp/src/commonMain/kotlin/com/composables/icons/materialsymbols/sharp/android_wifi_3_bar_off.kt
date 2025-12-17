package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Android_wifi_3_bar_off: ImageVector
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
                moveTo(278f, 598f)
                lineToRelative(-84f, -84f)
                quadToRelative(24f, -23f, 51.5f, -41.5f)
                reflectiveQuadTo(302f, 440f)
                lineToRelative(-110f, -77f)
                quadToRelative(-23f, 14f, -43f, 30.5f)
                reflectiveQuadTo(109f, 429f)
                lineToRelative(-85f, -85f)
                quadToRelative(15f, -14f, 31f, -27.5f)
                reflectiveQuadTo(88f, 290f)
                lineToRelative(-58f, -41f)
                lineToRelative(57f, -81f)
                lineToRelative(786f, 550f)
                lineToRelative(-57f, 82f)
                lineToRelative(-392f, -275f)
                quadToRelative(-41f, 8f, -78f, 26f)
                reflectiveQuadToRelative(-68f, 47f)
                close()
                moveToRelative(147f, -315f)
                lineToRelative(-135f, -95f)
                quadToRelative(46f, -14f, 93.5f, -21f)
                reflectiveQuadToRelative(96.5f, -7f)
                quadToRelative(128f, 0f, 246f, 47.5f)
                reflectiveQuadTo(936f, 344f)
                lineToRelative(-85f, 85f)
                quadToRelative(-75f, -72f, -171f, -110.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-14f, 0f, -27.5f, 0.5f)
                reflectiveQuadTo(425f, 283f)
                close()
                moveToRelative(55f, 517f)
                lineTo(364f, 684f)
                quadToRelative(23f, -20f, 53f, -32f)
                reflectiveQuadToRelative(63f, -12f)
                quadToRelative(33f, 0f, 63f, 12f)
                reflectiveQuadToRelative(53f, 32f)
                lineTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar_off!!
    }

private var _Android_wifi_3_bar_off: ImageVector? = null

