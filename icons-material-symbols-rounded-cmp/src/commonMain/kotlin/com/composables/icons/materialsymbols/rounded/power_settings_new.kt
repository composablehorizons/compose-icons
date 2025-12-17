package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Power_settings_new: ImageVector
    get() {
        if (_Power_settings_new != null) return _Power_settings_new!!
        
        _Power_settings_new = ImageVector.Builder(
            name = "power_settings_new",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 480f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                close()
                moveToRelative(40f, 360f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 734f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -69f, 25.5f, -132.5f)
                reflectiveQuadTo(217f, 234f)
                quadToRelative(11f, -12f, 28f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                quadToRelative(11f, 11f, 10f, 27.5f)
                reflectiveQuadTo(272f, 291f)
                quadToRelative(-34f, 38f, -53f, 86.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                quadToRelative(117f, 0f, 198.5f, -82f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -54f, -19f, -103.5f)
                reflectiveQuadTo(687f, 289f)
                quadToRelative(-11f, -12f, -11.5f, -28f)
                reflectiveQuadToRelative(10.5f, -27f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(47f, 50f, 72f, 113.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 74f, -28.5f, 139.5f)
                reflectiveQuadToRelative(-77f, 114.5f)
                quadToRelative(-48.5f, 49f, -114f, 77.5f)
                reflectiveQuadTo(480f, 840f)
                close()
            }
        }.build()
        
        return _Power_settings_new!!
    }

private var _Power_settings_new: ImageVector? = null

