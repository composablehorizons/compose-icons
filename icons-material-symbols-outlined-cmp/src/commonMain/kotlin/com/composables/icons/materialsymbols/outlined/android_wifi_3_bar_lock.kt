package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Android_wifi_3_bar_lock: ImageVector
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
            }
        }.build()
        
        return _Android_wifi_3_bar_lock!!
    }

private var _Android_wifi_3_bar_lock: ImageVector? = null

