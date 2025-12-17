package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Android_wifi_3_bar_lock: ImageVector
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
                moveTo(109f, 429f)
                lineToRelative(-85f, -85f)
                quadToRelative(92f, -89f, 210f, -136.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(128f, 0f, 246f, 47.5f)
                reflectiveQuadTo(936f, 344f)
                lineToRelative(-68f, 68f)
                quadToRelative(-11f, -4f, -23.5f, -6f)
                reflectiveQuadToRelative(-24.5f, -4f)
                quadToRelative(-72f, -60f, -159f, -91f)
                reflectiveQuadToRelative(-181f, -31f)
                quadToRelative(-104f, 0f, -200f, 38.5f)
                reflectiveQuadTo(109f, 429f)
                close()
                moveToRelative(169f, 169f)
                lineToRelative(-84f, -84f)
                quadToRelative(59f, -55f, 132.5f, -84.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(51f, 0f, 99f, 12f)
                reflectiveQuadToRelative(93f, 35f)
                quadToRelative(-24f, 20f, -39.5f, 46.5f)
                reflectiveQuadTo(608f, 549f)
                quadToRelative(-30f, -14f, -62.5f, -21.5f)
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
        
        return _Android_wifi_3_bar_lock!!
    }

private var _Android_wifi_3_bar_lock: ImageVector? = null

