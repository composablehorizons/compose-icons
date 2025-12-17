package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Signal_wifi_4_bar: ImageVector
    get() {
        if (_Signal_wifi_4_bar != null) return _Signal_wifi_4_bar!!
        
        _Signal_wifi_4_bar = ImageVector.Builder(
            name = "signal_wifi_4_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(423f, 783f)
                lineTo(61f, 421f)
                quadToRelative(-12f, -12f, -18f, -27f)
                reflectiveQuadToRelative(-6f, -30f)
                quadToRelative(0f, -17f, 7f, -32.5f)
                reflectiveQuadTo(65f, 304f)
                quadToRelative(82f, -71f, 195f, -107.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(107f, 0f, 220f, 36.5f)
                reflectiveQuadTo(895f, 304f)
                quadToRelative(14f, 12f, 21f, 27.5f)
                reflectiveQuadToRelative(7f, 32.5f)
                quadToRelative(0f, 15f, -6f, 30f)
                reflectiveQuadToRelative(-18f, 27f)
                lineTo(537f, 783f)
                quadToRelative(-12f, 12f, -27f, 18f)
                reflectiveQuadToRelative(-30f, 6f)
                quadToRelative(-15f, 0f, -30f, -6f)
                reflectiveQuadToRelative(-27f, -18f)
                close()
            }
        }.build()
        
        return _Signal_wifi_4_bar!!
    }

private var _Signal_wifi_4_bar: ImageVector? = null

