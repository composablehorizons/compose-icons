package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Wifi_protected_setup: ImageVector
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
                moveTo(627f, 750f)
                quadToRelative(17f, -33f, 26f, -69.5f)
                reflectiveQuadToRelative(9f, -75.5f)
                quadToRelative(0f, -80f, -35f, -146.5f)
                reflectiveQuadTo(532f, 348f)
                lineToRelative(-92f, 92f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(320f)
                lineToRelative(-92f, 92f)
                quadToRelative(52f, 47f, 83f, 112f)
                reflectiveQuadToRelative(31f, 141f)
                quadToRelative(0f, 91f, -42.5f, 165f)
                reflectiveQuadTo(627f, 750f)
                close()
                moveToRelative(-427f, 90f)
                lineToRelative(92f, -92f)
                quadToRelative(-53f, -47f, -83.5f, -112f)
                reflectiveQuadTo(178f, 495f)
                quadToRelative(0f, -91f, 42.5f, -165f)
                reflectiveQuadTo(334f, 210f)
                quadToRelative(-17f, 33f, -26.5f, 69.5f)
                reflectiveQuadTo(298f, 355f)
                quadToRelative(0f, 80f, 35.5f, 146.5f)
                reflectiveQuadTo(428f, 612f)
                lineToRelative(92f, -92f)
                verticalLineToRelative(320f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Wifi_protected_setup!!
    }

private var _Wifi_protected_setup: ImageVector? = null

