package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Network_wifi_2_bar: ImageVector
    get() {
        if (_Network_wifi_2_bar != null) return _Network_wifi_2_bar!!
        
        _Network_wifi_2_bar = ImageVector.Builder(
            name = "network_wifi_2_bar",
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
                quadToRelative(96f, -98f, 220f, -149f)
                reflectiveQuadToRelative(260f, -51f)
                quadToRelative(137f, 0f, 261f, 51f)
                reflectiveQuadToRelative(219f, 149f)
                lineTo(480f, 840f)
                close()
                moveTo(299f, 545f)
                quadToRelative(38f, -28f, 84f, -43.5f)
                reflectiveQuadToRelative(97f, -15.5f)
                quadToRelative(51f, 0f, 97f, 15.5f)
                reflectiveQuadToRelative(84f, 43.5f)
                lineToRelative(183f, -183f)
                quadToRelative(-78f, -59f, -170.5f, -90.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-101f, 0f, -193.5f, 31.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(183f, 183f)
                close()
            }
        }.build()
        
        return _Network_wifi_2_bar!!
    }

private var _Network_wifi_2_bar: ImageVector? = null

