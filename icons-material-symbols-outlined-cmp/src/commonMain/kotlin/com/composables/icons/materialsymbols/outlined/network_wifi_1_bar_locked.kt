package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Network_wifi_1_bar_locked: ImageVector
    get() {
        if (_Network_wifi_1_bar_locked != null) return _Network_wifi_1_bar_locked!!
        
        _Network_wifi_1_bar_locked = ImageVector.Builder(
            name = "network_wifi_1_bar_locked",
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
                lineToRelative(232f, 232f)
                quadToRelative(42f, -25f, 98f, -32.5f)
                reflectiveQuadToRelative(102f, 6.5f)
                quadToRelative(-14f, 25f, -21f, 55.5f)
                reflectiveQuadToRelative(-7f, 57.5f)
                quadToRelative(0f, 26f, 5f, 50.5f)
                reflectiveQuadToRelative(16f, 47.5f)
                lineToRelative(-61f, 61f)
                close()
                moveToRelative(200f, 0f)
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
        
        return _Network_wifi_1_bar_locked!!
    }

private var _Network_wifi_1_bar_locked: ImageVector? = null

