package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Arrow_menu_open: ImageVector
    get() {
        if (_Arrow_menu_open != null) return _Arrow_menu_open!!
        
        _Arrow_menu_open = ImageVector.Builder(
            name = "arrow_menu_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 800f)
                close()
                moveToRelative(160f, -168f)
                verticalLineToRelative(-304f)
                quadToRelative(0f, -14f, 12f, -19f)
                reflectiveQuadToRelative(22f, 5f)
                lineToRelative(138f, 138f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(554f, 646f)
                quadToRelative(-10f, 10f, -22f, 5f)
                reflectiveQuadToRelative(-12f, -19f)
                close()
            }
        }.build()
        
        return _Arrow_menu_open!!
    }

private var _Arrow_menu_open: ImageVector? = null

