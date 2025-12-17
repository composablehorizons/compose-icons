package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Admin_panel_settings: ImageVector
    get() {
        if (_Admin_panel_settings != null) return _Admin_panel_settings!!
        
        _Admin_panel_settings = ImageVector.Builder(
            name = "admin_panel_settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveTo(160f, 444f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(14f, -5f, 28f, -5f)
                reflectiveQuadToRelative(28f, 5f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(122f)
                quadToRelative(0f, 17f, -15f, 27.5f)
                reflectiveQuadToRelative(-32f, 5.5f)
                quadToRelative(-18f, -5f, -36f, -7.5f)
                reflectiveQuadToRelative(-37f, -2.5f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 32f, 7.5f, 62.5f)
                reflectiveQuadTo(429f, 804f)
                quadToRelative(9f, 19f, -5.5f, 34f)
                reflectiveQuadToRelative(-33.5f, 6f)
                quadToRelative(-42f, -22f, -77f, -54f)
                reflectiveQuadToRelative(-62f, -70f)
                quadToRelative(-43f, -59f, -67f, -129.5f)
                reflectiveQuadTo(160f, 444f)
                close()
                moveToRelative(520f, 236f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 620f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 620f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 680f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(31f, 0f, 57f, -14.5f)
                reflectiveQuadToRelative(42f, -38.5f)
                quadToRelative(-22f, -13f, -47f, -20f)
                reflectiveQuadToRelative(-52f, -7f)
                quadToRelative(-27f, 0f, -52f, 7f)
                reflectiveQuadToRelative(-47f, 20f)
                quadToRelative(16f, 24f, 42f, 38.5f)
                reflectiveQuadToRelative(57f, 14.5f)
                close()
            }
        }.build()
        
        return _Admin_panel_settings!!
    }

private var _Admin_panel_settings: ImageVector? = null

