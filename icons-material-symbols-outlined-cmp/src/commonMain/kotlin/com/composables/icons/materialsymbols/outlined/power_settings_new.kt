package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Power_settings_new: ImageVector
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
                moveTo(440f, 520f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(40f, 320f)
                quadToRelative(-74f, 0f, -139.5f, -28.5f)
                reflectiveQuadTo(226f, 734f)
                quadToRelative(-49f, -49f, -77.5f, -114.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -80f, 33f, -151f)
                reflectiveQuadToRelative(93f, -123f)
                lineToRelative(56f, 56f)
                quadToRelative(-48f, 40f, -75f, 97f)
                reflectiveQuadToRelative(-27f, 121f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                quadToRelative(117f, 0f, 198.5f, -82f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -64f, -26.5f, -121f)
                reflectiveQuadTo(658f, 262f)
                lineToRelative(56f, -56f)
                quadToRelative(60f, 52f, 93f, 123f)
                reflectiveQuadToRelative(33f, 151f)
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

