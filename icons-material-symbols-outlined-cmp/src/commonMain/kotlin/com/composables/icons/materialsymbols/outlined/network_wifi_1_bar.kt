package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Network_wifi_1_bar: ImageVector
    get() {
        if (_Network_wifi_1_bar != null) return _Network_wifi_1_bar!!
        
        _Network_wifi_1_bar = ImageVector.Builder(
            name = "network_wifi_1_bar",
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
                moveTo(361f, 607f)
                quadToRelative(25f, -18f, 55.5f, -28f)
                reflectiveQuadToRelative(63.5f, -10f)
                quadToRelative(33f, 0f, 63.5f, 10f)
                reflectiveQuadToRelative(55.5f, 28f)
                lineToRelative(245f, -245f)
                quadToRelative(-78f, -59f, -170.5f, -90.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-101f, 0f, -193.5f, 31.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(245f, 245f)
                close()
            }
        }.build()
        
        return _Network_wifi_1_bar!!
    }

private var _Network_wifi_1_bar: ImageVector? = null

