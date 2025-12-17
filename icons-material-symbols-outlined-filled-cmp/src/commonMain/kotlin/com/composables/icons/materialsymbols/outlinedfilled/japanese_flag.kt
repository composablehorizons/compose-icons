package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Japanese_flag: ImageVector
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
                moveTo(160f, 840f)
                verticalLineToRelative(-699f)
                quadToRelative(34f, -8f, 68f, -14.5f)
                reflectiveQuadToRelative(70f, -6.5f)
                quadToRelative(49f, 0f, 98f, 14.5f)
                reflectiveQuadToRelative(95f, 41.5f)
                quadToRelative(47f, 28f, 97.5f, 42.5f)
                reflectiveQuadTo(692f, 233f)
                quadToRelative(27f, 0f, 54f, -3f)
                reflectiveQuadToRelative(54f, -5f)
                verticalLineToRelative(487f)
                quadToRelative(-27f, 2f, -54.5f, 5f)
                reflectiveQuadToRelative(-53.5f, 3f)
                quadToRelative(-53f, 0f, -103f, -14f)
                reflectiveQuadToRelative(-95f, -41f)
                quadToRelative(-45f, -27f, -94.5f, -41f)
                reflectiveQuadTo(299f, 610f)
                quadToRelative(-14f, 0f, -28f, 1.5f)
                reflectiveQuadToRelative(-31f, 3.5f)
                verticalLineToRelative(225f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Japanese_flag!!
    }

private var _Japanese_flag: ImageVector? = null

