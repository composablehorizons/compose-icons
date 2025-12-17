package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Android_wifi_3_bar: ImageVector
    get() {
        if (_Android_wifi_3_bar != null) return _Android_wifi_3_bar!!
        
        _Android_wifi_3_bar = ImageVector.Builder(
            name = "android_wifi_3_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(109f, 429f)
                lineToRelative(-85f, -85f)
                quadToRelative(92f, -89f, 210f, -136.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(128f, 0f, 246f, 47.5f)
                reflectiveQuadTo(936f, 344f)
                lineToRelative(-85f, 85f)
                quadToRelative(-75f, -72f, -171f, -110.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-104f, 0f, -200f, 38.5f)
                reflectiveQuadTo(109f, 429f)
                close()
                moveToRelative(169f, 169f)
                lineToRelative(-84f, -84f)
                quadToRelative(59f, -55f, 132.5f, -84.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(80f, 0f, 153.5f, 29.5f)
                reflectiveQuadTo(766f, 514f)
                lineToRelative(-84f, 84f)
                quadToRelative(-42f, -38f, -93.5f, -58f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-57f, 0f, -108.5f, 20f)
                reflectiveQuadTo(278f, 598f)
                close()
                moveToRelative(202f, 202f)
                lineTo(364f, 684f)
                quadToRelative(23f, -20f, 53f, -32f)
                reflectiveQuadToRelative(63f, -12f)
                quadToRelative(33f, 0f, 63f, 12f)
                reflectiveQuadToRelative(53f, 32f)
                lineTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar!!
    }

private var _Android_wifi_3_bar: ImageVector? = null

