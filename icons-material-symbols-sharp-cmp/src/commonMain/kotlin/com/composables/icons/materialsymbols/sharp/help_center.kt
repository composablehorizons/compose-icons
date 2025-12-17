package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Help_center: ImageVector
    get() {
        if (_Help_center != null) return _Help_center!!
        
        _Help_center = ImageVector.Builder(
            name = "help_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 720f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(530f, 670f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(480f, 620f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(430f, 670f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-36f, -154f)
                horizontalLineToRelative(74f)
                quadToRelative(0f, -36f, 8f, -53f)
                reflectiveQuadToRelative(34f, -43f)
                quadToRelative(35f, -35f, 49.5f, -58.5f)
                reflectiveQuadTo(624f, 358f)
                quadToRelative(0f, -53f, -36f, -85.5f)
                reflectiveQuadTo(491f, 240f)
                quadToRelative(-55f, 0f, -93.5f, 27f)
                reflectiveQuadTo(344f, 342f)
                lineToRelative(66f, 26f)
                quadToRelative(7f, -27f, 28f, -43.5f)
                reflectiveQuadToRelative(49f, -16.5f)
                quadToRelative(27f, 0f, 45f, 14.5f)
                reflectiveQuadToRelative(18f, 38.5f)
                quadToRelative(0f, 17f, -11f, 36f)
                reflectiveQuadToRelative(-37f, 42f)
                quadToRelative(-33f, 29f, -45.5f, 55.5f)
                reflectiveQuadTo(444f, 566f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Help_center!!
    }

private var _Help_center: ImageVector? = null

