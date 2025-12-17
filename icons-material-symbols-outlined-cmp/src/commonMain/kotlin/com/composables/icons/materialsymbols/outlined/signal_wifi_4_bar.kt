package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Signal_wifi_4_bar: ImageVector
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
                moveTo(480f, 840f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Signal_wifi_4_bar!!
    }

private var _Signal_wifi_4_bar: ImageVector? = null

