package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_wifi_off: ImageVector
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
                moveTo(717f, 586f)
                quadToRelative(-8f, 0f, -15f, -2.5f)
                reflectiveQuadToRelative(-13f, -8.5f)
                lineTo(341f, 228f)
                quadToRelative(-5f, -5f, -7.5f, -11.5f)
                reflectiveQuadTo(331f, 204f)
                quadToRelative(0f, -11f, 6.5f, -21f)
                reflectiveQuadToRelative(19.5f, -12f)
                quadToRelative(30f, -5f, 61f, -8f)
                reflectiveQuadToRelative(62f, -3f)
                quadToRelative(125f, 0f, 239.5f, 43.5f)
                reflectiveQuadTo(928f, 332f)
                quadToRelative(7f, 6f, 10f, 14f)
                reflectiveQuadToRelative(3f, 16f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(745f, 575f)
                quadToRelative(-6f, 6f, -13f, 8.5f)
                reflectiveQuadToRelative(-15f, 2.5f)
                close()
                moveToRelative(74f, 317f)
                lineTo(604f, 716f)
                lineToRelative(-96f, 96f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineTo(30f, 390f)
                quadToRelative(-12f, -12f, -12f, -30f)
                reflectiveQuadToRelative(13f, -29f)
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
            }
        }.build()
        
        return _Signal_wifi_off!!
    }

private var _Signal_wifi_off: ImageVector? = null

