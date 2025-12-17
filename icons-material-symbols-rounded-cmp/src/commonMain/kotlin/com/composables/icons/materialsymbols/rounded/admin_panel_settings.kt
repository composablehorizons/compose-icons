package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Admin_panel_settings: ImageVector
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
                moveTo(480f, 86f)
                quadToRelative(8f, 0f, 14.5f, 1f)
                reflectiveQuadToRelative(13.5f, 4f)
                lineToRelative(240f, 90f)
                quadToRelative(23f, 9f, 37.5f, 29f)
                reflectiveQuadToRelative(14.5f, 45f)
                verticalLineToRelative(125f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 420f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 380f)
                verticalLineToRelative(-124f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 50f, 14.5f, 100f)
                reflectiveQuadToRelative(40f, 95f)
                quadToRelative(25.5f, 45f, 62f, 81f)
                reflectiveQuadToRelative(79.5f, 59f)
                quadToRelative(15f, 8f, 21.5f, 23f)
                reflectiveQuadToRelative(0.5f, 30f)
                quadToRelative(-7f, 16f, -22.5f, 22f)
                reflectiveQuadToRelative(-30.5f, -2f)
                quadToRelative(-113f, -56f, -179f, -169f)
                reflectiveQuadToRelative(-66f, -239f)
                verticalLineToRelative(-189f)
                quadToRelative(0f, -25f, 14.5f, -45f)
                reflectiveQuadToRelative(37.5f, -29f)
                lineToRelative(240f, -90f)
                quadToRelative(7f, -3f, 14f, -4f)
                reflectiveQuadToRelative(14f, -1f)
                close()
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
                moveTo(480f, 466f)
                close()
            }
        }.build()
        
        return _Admin_panel_settings!!
    }

private var _Admin_panel_settings: ImageVector? = null

