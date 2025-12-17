package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Network_wifi_3_bar: ImageVector
    get() {
        if (_Network_wifi_3_bar != null) return _Network_wifi_3_bar!!
        
        _Network_wifi_3_bar = ImageVector.Builder(
            name = "network_wifi_3_bar",
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
                moveTo(232f, 478f)
                quadToRelative(53f, -38f, 116f, -59.5f)
                reflectiveQuadTo(480f, 397f)
                quadToRelative(69f, 0f, 132f, 21.5f)
                reflectiveQuadTo(728f, 478f)
                lineToRelative(116f, -116f)
                quadToRelative(-78f, -59f, -170.5f, -90.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-101f, 0f, -193.5f, 31.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(116f, 116f)
                close()
            }
        }.build()
        
        return _Network_wifi_3_bar!!
    }

private var _Network_wifi_3_bar: ImageVector? = null

