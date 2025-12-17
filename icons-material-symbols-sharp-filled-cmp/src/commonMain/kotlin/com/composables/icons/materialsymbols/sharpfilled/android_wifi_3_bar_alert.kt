package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Android_wifi_3_bar_alert: ImageVector
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
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-80f)
                close()
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
                quadToRelative(64f, 0f, 124.5f, 18.5f)
                reflectiveQuadTo(717f, 473f)
                quadToRelative(-29f, 11f, -61f, 29f)
                reflectiveQuadToRelative(-53f, 45f)
                quadToRelative(-26f, -13f, -57.5f, -20f)
                reflectiveQuadToRelative(-65.5f, -7f)
                quadToRelative(-57f, 0f, -108.5f, 20f)
                reflectiveQuadTo(278f, 598f)
                close()
                moveToRelative(202f, 202f)
                lineTo(364f, 684f)
                quadToRelative(23f, -20f, 53f, -32f)
                reflectiveQuadToRelative(63f, -12f)
                quadToRelative(22f, 0f, 42.5f, 5.5f)
                reflectiveQuadTo(561f, 660f)
                quadToRelative(-2f, 14f, -1f, 28.5f)
                reflectiveQuadToRelative(3f, 28.5f)
                lineToRelative(-83f, 83f)
                close()
            }
        }.build()
        
        return _Android_wifi_3_bar_alert!!
    }

private var _Android_wifi_3_bar_alert: ImageVector? = null

