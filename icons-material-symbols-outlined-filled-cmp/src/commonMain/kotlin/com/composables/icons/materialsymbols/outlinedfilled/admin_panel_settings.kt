package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Admin_panel_settings: ImageVector
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
                moveTo(680f, 680f)
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
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(227f)
                quadToRelative(-26f, -13f, -58.5f, -20f)
                reflectiveQuadToRelative(-61.5f, -7f)
                quadToRelative(-116f, 0f, -198f, 82f)
                reflectiveQuadToRelative(-82f, 198f)
                quadToRelative(0f, 62f, 23.5f, 112f)
                reflectiveQuadTo(483f, 879f)
                quadToRelative(-1f, 0f, -1.5f, 0.5f)
                reflectiveQuadToRelative(-1.5f, 0.5f)
                close()
            }
        }.build()
        
        return _Admin_panel_settings!!
    }

private var _Admin_panel_settings: ImageVector? = null

