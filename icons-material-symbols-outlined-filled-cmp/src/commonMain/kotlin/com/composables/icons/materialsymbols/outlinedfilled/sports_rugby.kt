package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Sports_rugby: ImageVector
    get() {
        if (_Sports_rugby != null) return _Sports_rugby!!
        
        _Sports_rugby = ImageVector.Builder(
            name = "sports_rugby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(306f, 860f)
                quadToRelative(-57f, 0f, -103f, -9f)
                reflectiveQuadToRelative(-65f, -29f)
                quadToRelative(-18f, -19f, -28f, -66f)
                reflectiveQuadToRelative(-10f, -106f)
                quadToRelative(0f, -115f, 40.5f, -220.5f)
                reflectiveQuadTo(252f, 252f)
                quadToRelative(71f, -71f, 177.5f, -111.5f)
                reflectiveQuadTo(654f, 100f)
                quadToRelative(57f, 0f, 103f, 9f)
                reflectiveQuadToRelative(65f, 29f)
                quadToRelative(18f, 19f, 28f, 66f)
                reflectiveQuadToRelative(10f, 106f)
                quadToRelative(0f, 115f, -40.5f, 220.5f)
                reflectiveQuadTo(708f, 708f)
                quadToRelative(-71f, 71f, -177.5f, 111.5f)
                reflectiveQuadTo(306f, 860f)
                close()
                moveTo(182f, 634f)
                quadToRelative(33f, -72f, 80f, -140.5f)
                reflectiveQuadTo(366f, 366f)
                quadToRelative(57f, -57f, 125.5f, -104f)
                reflectiveQuadTo(632f, 182f)
                quadToRelative(-91f, 3f, -178.5f, 37.5f)
                reflectiveQuadTo(310f, 310f)
                quadToRelative(-59f, 57f, -92.5f, 143f)
                reflectiveQuadTo(182f, 634f)
                close()
                moveToRelative(146f, 144f)
                quadToRelative(91f, -3f, 178.5f, -37.5f)
                reflectiveQuadTo(650f, 650f)
                quadToRelative(59f, -57f, 92.5f, -143f)
                reflectiveQuadTo(778f, 326f)
                quadToRelative(-33f, 72f, -80f, 140.5f)
                reflectiveQuadTo(594f, 594f)
                quadToRelative(-57f, 57f, -125.5f, 104f)
                reflectiveQuadTo(328f, 778f)
                close()
            }
        }.build()
        
        return _Sports_rugby!!
    }

private var _Sports_rugby: ImageVector? = null

