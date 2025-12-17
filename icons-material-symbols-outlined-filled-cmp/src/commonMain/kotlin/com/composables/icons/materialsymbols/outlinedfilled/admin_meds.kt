package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Admin_meds: ImageVector
    get() {
        if (_Admin_meds != null) return _Admin_meds!!
        
        _Admin_meds = ImageVector.Builder(
            name = "admin_meds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(328f, 631f)
                quadToRelative(29f, 29f, 68.5f, 29.5f)
                reflectiveQuadTo(465f, 632f)
                lineToRelative(56f, -56f)
                lineToRelative(-137f, -137f)
                lineToRelative(-56f, 56f)
                quadToRelative(-29f, 29f, -29f, 68f)
                reflectiveQuadToRelative(29f, 68f)
                close()
                moveToRelative(304f, -302f)
                quadToRelative(-29f, -28f, -68.5f, -29f)
                reflectiveQuadTo(495f, 328f)
                lineToRelative(-55f, 55f)
                lineToRelative(137f, 137f)
                lineToRelative(55f, -55f)
                quadToRelative(29f, -29f, 28.5f, -68f)
                reflectiveQuadTo(632f, 329f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(168f)
                quadToRelative(13f, -36f, 43.5f, -58f)
                reflectiveQuadToRelative(68.5f, -22f)
                quadToRelative(38f, 0f, 68.5f, 22f)
                reflectiveQuadToRelative(43.5f, 58f)
                horizontalLineToRelative(168f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -670f)
                quadToRelative(13f, 0f, 21.5f, -8.5f)
                reflectiveQuadTo(510f, 140f)
                quadToRelative(0f, -13f, -8.5f, -21.5f)
                reflectiveQuadTo(480f, 110f)
                quadToRelative(-13f, 0f, -21.5f, 8.5f)
                reflectiveQuadTo(450f, 140f)
                quadToRelative(0f, 13f, 8.5f, 21.5f)
                reflectiveQuadTo(480f, 170f)
                close()
            }
        }.build()
        
        return _Admin_meds!!
    }

private var _Admin_meds: ImageVector? = null

