package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Signal_wifi_statusbar_not_connected: ImageVector
    get() {
        if (_Signal_wifi_statusbar_not_connected != null) return _Signal_wifi_statusbar_not_connected!!
        
        _Signal_wifi_statusbar_not_connected = ImageVector.Builder(
            name = "signal_wifi_statusbar_not_connected",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineToRelative(-40f, 40f)
                quadToRelative(-28f, -36f, -69.5f, -58f)
                reflectiveQuadTo(760f, 320f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 49f, 22f, 90.5f)
                reflectiveQuadToRelative(58f, 69.5f)
                lineTo(480f, 840f)
                close()
                moveToRelative(280f, -40f)
                quadToRelative(-17f, 0f, -29.5f, -12.5f)
                reflectiveQuadTo(718f, 758f)
                quadToRelative(0f, -17f, 12.5f, -29.5f)
                reflectiveQuadTo(760f, 716f)
                quadToRelative(17f, 0f, 29.5f, 12.5f)
                reflectiveQuadTo(802f, 758f)
                quadToRelative(0f, 17f, -12.5f, 29.5f)
                reflectiveQuadTo(760f, 800f)
                close()
                moveToRelative(-30f, -128f)
                quadToRelative(0f, -38f, 10f, -59f)
                reflectiveQuadToRelative(43f, -54f)
                quadToRelative(21f, -21f, 27f, -31.5f)
                reflectiveQuadToRelative(6f, -26.5f)
                quadToRelative(0f, -18f, -14f, -31.5f)
                reflectiveQuadTo(765f, 456f)
                quadToRelative(-21f, 0f, -39f, 13.5f)
                reflectiveQuadTo(700f, 506f)
                lineToRelative(-54f, -22f)
                quadToRelative(12f, -38f, 44f, -61f)
                reflectiveQuadToRelative(75f, -23f)
                quadToRelative(49f, 0f, 80f, 29f)
                reflectiveQuadToRelative(31f, 74f)
                quadToRelative(0f, 23f, -10f, 41f)
                reflectiveQuadToRelative(-38f, 46f)
                quadToRelative(-24f, 24f, -30f, 38.5f)
                reflectiveQuadToRelative(-6f, 43.5f)
                horizontalLineToRelative(-62f)
                close()
            }
        }.build()
        
        return _Signal_wifi_statusbar_not_connected!!
    }

private var _Signal_wifi_statusbar_not_connected: ImageVector? = null

