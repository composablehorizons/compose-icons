package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Network_wifi_3_bar_locked: ImageVector
    get() {
        if (_Network_wifi_3_bar_locked != null) return _Network_wifi_3_bar_locked!!
        
        _Network_wifi_3_bar_locked = ImageVector.Builder(
            name = "network_wifi_3_bar_locked",
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
                lineTo(859f, 461f)
                quadToRelative(-22f, -10f, -45f, -15f)
                reflectiveQuadToRelative(-48f, -6f)
                lineToRelative(78f, -78f)
                quadToRelative(-78f, -59f, -170.5f, -90.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-101f, 0f, -193.5f, 31.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(116f, 116f)
                quadToRelative(53f, -38f, 116f, -59.5f)
                reflectiveQuadTo(480f, 397f)
                quadToRelative(56f, 0f, 108f, 14.5f)
                reflectiveQuadToRelative(98f, 40.5f)
                quadToRelative(-73f, 23f, -119.5f, 85.5f)
                reflectiveQuadTo(520f, 681f)
                quadToRelative(0f, 26f, 5f, 50.5f)
                reflectiveQuadToRelative(16f, 47.5f)
                lineToRelative(-61f, 61f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Network_wifi_3_bar_locked!!
    }

private var _Network_wifi_3_bar_locked: ImageVector? = null

