package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Android_wifi_4_bar_off: ImageVector
    get() {
        if (_Android_wifi_4_bar_off != null) return _Android_wifi_4_bar_off!!
        
        _Android_wifi_4_bar_off = ImageVector.Builder(
            name = "android_wifi_4_bar_off",
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
                quadToRelative(19f, -18f, 39.5f, -34.5f)
                reflectiveQuadTo(83f, 287f)
                lineToRelative(-53f, -38f)
                lineToRelative(57f, -81f)
                lineToRelative(786f, 550f)
                lineToRelative(-57f, 82f)
                lineToRelative(-313f, -219f)
                quadToRelative(-6f, -1f, -11.5f, -1f)
                horizontalLineTo(480f)
                quadToRelative(-51f, 0f, -97.5f, 18f)
                reflectiveQuadTo(298f, 651f)
                lineToRelative(-70f, -71f)
                quadToRelative(32f, -31f, 70.5f, -52.5f)
                reflectiveQuadTo(379f, 494f)
                lineToRelative(-60f, -42f)
                quadToRelative(-37f, 15f, -70.5f, 36.5f)
                reflectiveQuadTo(186f, 538f)
                lineToRelative(-70f, -71f)
                quadToRelative(25f, -24f, 52f, -44f)
                reflectiveQuadToRelative(57f, -37f)
                lineToRelative(-54f, -38f)
                quadToRelative(-26f, 17f, -50.5f, 35.5f)
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
                moveToRelative(-79f, -535f)
                lineToRelative(-112f, -78f)
                quadToRelative(47f, -14f, 94.5f, -20.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(134f, 0f, 257.5f, 49.5f)
                reflectiveQuadTo(958f, 353f)
                lineToRelative(-71f, 71f)
                quadToRelative(-82f, -79f, -187f, -121.5f)
                reflectiveQuadTo(480f, 260f)
                quadToRelative(-20f, 0f, -39.5f, 1f)
                reflectiveQuadToRelative(-39.5f, 4f)
                close()
                moveToRelative(380f, 266f)
                lineTo(479f, 320f)
                quadToRelative(103f, 0f, 197.5f, 37.5f)
                reflectiveQuadTo(845f, 466f)
                lineToRelative(-64f, 65f)
                close()
            }
        }.build()
        
        return _Android_wifi_4_bar_off!!
    }

private var _Android_wifi_4_bar_off: ImageVector? = null

