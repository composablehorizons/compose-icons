package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Wifi_1_bar: ImageVector
    get() {
        if (_Wifi_1_bar != null) return _Wifi_1_bar!!
        
        _Wifi_1_bar = ImageVector.Builder(
            name = "wifi_1_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                lineTo(339f, 698f)
                quadToRelative(28f, -28f, 64.5f, -43f)
                reflectiveQuadToRelative(76.5f, -15f)
                quadToRelative(40f, 0f, 76.5f, 15f)
                reflectiveQuadToRelative(64.5f, 43f)
                lineTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Wifi_1_bar!!
    }

private var _Wifi_1_bar: ImageVector? = null

