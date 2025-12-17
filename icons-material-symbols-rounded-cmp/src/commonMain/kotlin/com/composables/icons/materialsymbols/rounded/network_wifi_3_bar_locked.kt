package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Network_wifi_3_bar_locked: ImageVector
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
                moveTo(480f, 240f)
                quadToRelative(-101f, 0f, -193.5f, 31.5f)
                reflectiveQuadTo(116f, 362f)
                lineToRelative(116f, 116f)
                quadToRelative(53f, -38f, 116f, -59.5f)
                reflectiveQuadTo(480f, 397f)
                quadToRelative(41f, 0f, 79f, 8f)
                reflectiveQuadToRelative(74f, 22f)
                quadToRelative(16f, 6f, 16.5f, 23.5f)
                reflectiveQuadTo(633f, 477f)
                quadToRelative(-51f, 32f, -82f, 85.5f)
                reflectiveQuadTo(520f, 681f)
                quadToRelative(0f, 11f, 2f, 21f)
                reflectiveQuadToRelative(4f, 21f)
                reflectiveQuadToRelative(4f, 21f)
                quadToRelative(2f, 10f, 2f, 21f)
                quadToRelative(0f, 20f, -15f, 31.5f)
                reflectiveQuadTo(481f, 808f)
                quadToRelative(-14f, 0f, -29f, -5.5f)
                reflectiveQuadTo(423f, 783f)
                lineTo(61f, 421f)
                quadToRelative(-11f, -11f, -17.5f, -26f)
                reflectiveQuadTo(37f, 364f)
                quadToRelative(0f, -17f, 7.5f, -33f)
                reflectiveQuadTo(65f, 304f)
                quadToRelative(86f, -75f, 193.5f, -109.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(114f, 0f, 221.5f, 34.5f)
                reflectiveQuadTo(895f, 304f)
                quadToRelative(13f, 11f, 20.5f, 27f)
                reflectiveQuadToRelative(7.5f, 33f)
                quadToRelative(0f, 16f, -6.5f, 31f)
                reflectiveQuadTo(899f, 421f)
                lineToRelative(-27f, 26f)
                quadToRelative(-12f, 11f, -28.5f, 11.5f)
                reflectiveQuadTo(815f, 447f)
                quadToRelative(-12f, -12f, -12f, -29f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(29f, -28f)
                quadToRelative(-78f, -59f, -170.5f, -90.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(200f, 600f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 680f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(680f)
                close()
                moveToRelative(40f, -200f)
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

