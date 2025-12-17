package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Android_wifi_4_bar: ImageVector
    get() {
        if (_Android_wifi_4_bar != null) return _Android_wifi_4_bar!!
        
        _Android_wifi_4_bar = ImageVector.Builder(
            name = "android_wifi_4_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298f, 651f)
                lineToRelative(-70f, -71f)
                quadToRelative(51f, -48f, 116f, -74f)
                reflectiveQuadToRelative(136f, -26f)
                quadToRelative(71f, 0f, 136f, 26f)
                reflectiveQuadToRelative(116f, 74f)
                lineToRelative(-70f, 71f)
                quadToRelative(-38f, -35f, -84.5f, -53f)
                reflectiveQuadTo(480f, 580f)
                quadToRelative(-51f, 0f, -97.5f, 18f)
                reflectiveQuadTo(298f, 651f)
                close()
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
                moveToRelative(113f, 114f)
                lineToRelative(-70f, -71f)
                quadToRelative(74f, -71f, 168f, -109f)
                reflectiveQuadToRelative(197f, -38f)
                quadToRelative(103f, 0f, 196.5f, 37.5f)
                reflectiveQuadTo(845f, 466f)
                lineToRelative(-70f, 71f)
                quadToRelative(-60f, -57f, -136.5f, -87f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-83f, 0f, -158.5f, 30.5f)
                reflectiveQuadTo(186f, 538f)
                close()
                moveToRelative(294f, 296f)
                lineToRelative(139f, -140f)
                quadToRelative(-28f, -25f, -63f, -39.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-41f, 0f, -76f, 14.5f)
                reflectiveQuadTo(341f, 694f)
                lineToRelative(139f, 140f)
                close()
            }
        }.build()
        
        return _Android_wifi_4_bar!!
    }

private var _Android_wifi_4_bar: ImageVector? = null

