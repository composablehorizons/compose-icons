package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Signal_wifi_off: ImageVector
    get() {
        if (_Signal_wifi_off != null) return _Signal_wifi_off!!
        
        _Signal_wifi_off = ImageVector.Builder(
            name = "signal_wifi_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(745f, 575f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(689f, 574f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(155f, -155f)
                quadToRelative(-79f, -60f, -172f, -91f)
                reflectiveQuadToRelative(-192f, -31f)
                quadToRelative(-29f, 0f, -58f, 3f)
                reflectiveQuadToRelative(-58f, 8f)
                quadToRelative(-17f, 3f, -30f, -6f)
                reflectiveQuadToRelative(-16f, -26f)
                quadToRelative(-3f, -16f, 6f, -29.5f)
                reflectiveQuadToRelative(26f, -16.5f)
                quadToRelative(32f, -6f, 64.5f, -9.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(125f, 0f, 239.5f, 43.5f)
                reflectiveQuadTo(928f, 332f)
                quadToRelative(7f, 5f, 10f, 13f)
                reflectiveQuadToRelative(3f, 16f)
                quadToRelative(0f, 8f, -2.5f, 15.5f)
                reflectiveQuadTo(930f, 390f)
                lineTo(745f, 575f)
                close()
                moveTo(480f, 726f)
                lineToRelative(67f, -66f)
                lineToRelative(-350f, -350f)
                quadToRelative(-21f, 11f, -41f, 24.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(364f, 364f)
                close()
                moveTo(791f, 903f)
                lineTo(604f, 716f)
                lineToRelative(-96f, 96f)
                quadToRelative(-6f, 6f, -13f, 9f)
                reflectiveQuadToRelative(-15f, 3f)
                quadToRelative(-8f, 0f, -15f, -3f)
                reflectiveQuadToRelative(-13f, -9f)
                lineTo(30f, 390f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadTo(18f, 361f)
                quadToRelative(0f, -8f, 3f, -16f)
                reflectiveQuadToRelative(10f, -14f)
                quadToRelative(26f, -23f, 53f, -43f)
                reflectiveQuadToRelative(55f, -36f)
                lineToRelative(-84f, -84f)
                quadToRelative(-12f, -12f, -11.5f, -28f)
                reflectiveQuadTo(56f, 112f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 735f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(512f, 398f)
                close()
                moveToRelative(-140f, 87f)
                close()
            }
        }.build()
        
        return _Signal_wifi_off!!
    }

private var _Signal_wifi_off: ImageVector? = null

