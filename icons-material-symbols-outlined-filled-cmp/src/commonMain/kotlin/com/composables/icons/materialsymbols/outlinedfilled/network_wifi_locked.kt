package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Network_wifi_locked: ImageVector
    get() {
        if (_Network_wifi_locked != null) return _Network_wifi_locked!!
        
        _Network_wifi_locked = ImageVector.Builder(
            name = "network_wifi_locked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(720f, 600f)
                verticalLineToRelative(40f)
                close()
                moveTo(480f, 840f)
                lineTo(0f, 360f)
                quadToRelative(95f, -97f, 219.5f, -148.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(136f, 0f, 260.5f, 51.5f)
                reflectiveQuadTo(960f, 360f)
                lineTo(859f, 461f)
                quadToRelative(-23f, -11f, -48f, -16f)
                reflectiveQuadToRelative(-51f, -5f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 26f, 5f, 51f)
                reflectiveQuadToRelative(16f, 48f)
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
                moveTo(174f, 420f)
                quadToRelative(67f, -48f, 145f, -74f)
                reflectiveQuadToRelative(161f, -26f)
                quadToRelative(83f, 0f, 161f, 26f)
                reflectiveQuadToRelative(145f, 74f)
                lineToRelative(58f, -58f)
                quadToRelative(-79f, -60f, -172f, -91f)
                reflectiveQuadToRelative(-192f, -31f)
                quadToRelative(-99f, 0f, -192f, 31f)
                reflectiveQuadToRelative(-172f, 91f)
                lineToRelative(58f, 58f)
                close()
            }
        }.build()
        
        return _Network_wifi_locked!!
    }

private var _Network_wifi_locked: ImageVector? = null

