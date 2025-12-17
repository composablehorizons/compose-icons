package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Japanese_flag: ImageVector
    get() {
        if (_Japanese_flag != null) return _Japanese_flag!!
        
        _Japanese_flag = ImageVector.Builder(
            name = "japanese_flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 522f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(14f, 143f)
                quadToRelative(-45f, -27f, -94.5f, -41f)
                reflectiveQuadTo(299f, 610f)
                quadToRelative(-14f, 0f, -28f, 1.5f)
                reflectiveQuadToRelative(-31f, 3.5f)
                verticalLineToRelative(185f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-624f)
                quadToRelative(0f, -15f, 9.5f, -27f)
                reflectiveQuadToRelative(24.5f, -15f)
                quadToRelative(26f, -5f, 51.5f, -9.5f)
                reflectiveQuadTo(298f, 120f)
                quadToRelative(49f, 0f, 98f, 14.5f)
                reflectiveQuadToRelative(95f, 41.5f)
                quadToRelative(47f, 28f, 97.5f, 42.5f)
                reflectiveQuadTo(692f, 233f)
                quadToRelative(17f, 0f, 32.5f, -1f)
                reflectiveQuadToRelative(32.5f, -3f)
                quadToRelative(17f, -2f, 30f, 10f)
                reflectiveQuadToRelative(13f, 29f)
                verticalLineToRelative(407f)
                quadToRelative(0f, 16f, -10.5f, 27.5f)
                reflectiveQuadTo(763f, 716f)
                quadToRelative(-18f, 2f, -36f, 3f)
                reflectiveQuadToRelative(-35f, 1f)
                quadToRelative(-53f, 0f, -103f, -14f)
                reflectiveQuadToRelative(-95f, -41f)
                close()
            }
        }.build()
        
        return _Japanese_flag!!
    }

private var _Japanese_flag: ImageVector? = null

