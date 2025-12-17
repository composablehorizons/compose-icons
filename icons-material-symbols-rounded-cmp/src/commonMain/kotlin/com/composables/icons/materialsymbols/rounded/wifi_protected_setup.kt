package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Wifi_protected_setup: ImageVector
    get() {
        if (_Wifi_protected_setup != null) return _Wifi_protected_setup!!
        
        _Wifi_protected_setup = ImageVector.Builder(
            name = "wifi_protected_setup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(684f, 702f)
                quadToRelative(-11f, 10f, -23.5f, 1f)
                reflectiveQuadToRelative(-7.5f, -23f)
                quadToRelative(5f, -18f, 7f, -36.5f)
                reflectiveQuadToRelative(2f, -38.5f)
                quadToRelative(0f, -80f, -35f, -146.5f)
                reflectiveQuadTo(532f, 348f)
                lineToRelative(-58f, 58f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                verticalLineToRelative(-232f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                horizontalLineToRelative(232f)
                quadToRelative(14f, 0f, 19f, 12f)
                reflectiveQuadToRelative(-5f, 22f)
                lineToRelative(-58f, 58f)
                quadToRelative(52f, 47f, 83f, 112f)
                reflectiveQuadToRelative(31f, 141f)
                quadToRelative(0f, 45f, -11.5f, 86.5f)
                reflectiveQuadTo(739f, 630f)
                quadToRelative(-11f, 19f, -24.5f, 38.5f)
                reflectiveQuadTo(684f, 702f)
                close()
                moveTo(234f, 806f)
                lineToRelative(58f, -58f)
                quadToRelative(-53f, -47f, -83.5f, -112f)
                reflectiveQuadTo(178f, 495f)
                quadToRelative(0f, -45f, 11.5f, -86.5f)
                reflectiveQuadTo(221f, 330f)
                quadToRelative(11f, -19f, 25f, -38.5f)
                reflectiveQuadToRelative(31f, -33.5f)
                quadToRelative(11f, -10f, 23.5f, -1.5f)
                reflectiveQuadTo(308f, 279f)
                quadToRelative(-5f, 18f, -7.5f, 37f)
                reflectiveQuadToRelative(-2.5f, 39f)
                quadToRelative(0f, 80f, 35.5f, 146.5f)
                reflectiveQuadTo(428f, 612f)
                lineToRelative(58f, -58f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(232f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 840f)
                horizontalLineTo(248f)
                quadToRelative(-14f, 0f, -19f, -12f)
                reflectiveQuadToRelative(5f, -22f)
                close()
            }
        }.build()
        
        return _Wifi_protected_setup!!
    }

private var _Wifi_protected_setup: ImageVector? = null

