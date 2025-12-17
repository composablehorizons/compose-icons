package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Grid_guides: ImageVector
    get() {
        if (_Grid_guides != null) return _Grid_guides!!
        
        _Grid_guides = ImageVector.Builder(
            name = "grid_guides",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 760f)
                horizontalLineToRelative(447f)
                lineToRelative(-84f, -84f)
                quadToRelative(-29f, 21f, -64.5f, 32.5f)
                reflectiveQuadTo(480f, 720f)
                quadToRelative(-39f, 0f, -74.5f, -12f)
                reflectiveQuadTo(341f, 675f)
                lineToRelative(-85f, 85f)
                close()
                moveToRelative(-56f, -57f)
                lineToRelative(84f, -84f)
                quadToRelative(-21f, -29f, -32.5f, -64.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -39f, 12f, -74.5f)
                reflectiveQuadToRelative(33f, -64.5f)
                lineToRelative(-85f, -85f)
                verticalLineToRelative(447f)
                close()
                moveToRelative(142f, -142f)
                lineToRelative(82f, -81f)
                lineToRelative(-82f, -81f)
                quadToRelative(-11f, 18f, -16.5f, 38f)
                reflectiveQuadToRelative(-5.5f, 43f)
                quadToRelative(0f, 23f, 5.5f, 43f)
                reflectiveQuadToRelative(16.5f, 38f)
                close()
                moveToRelative(138f, 79f)
                quadToRelative(23f, 0f, 43f, -5.5f)
                reflectiveQuadToRelative(38f, -16.5f)
                lineToRelative(-81f, -82f)
                lineToRelative(-82f, 82f)
                quadToRelative(18f, 11f, 38.5f, 16.5f)
                reflectiveQuadTo(480f, 640f)
                close()
                moveToRelative(0f, -217f)
                lineToRelative(81f, -81f)
                quadToRelative(-18f, -11f, -38f, -16.5f)
                reflectiveQuadToRelative(-43f, -5.5f)
                quadToRelative(-23f, 0f, -43f, 5.5f)
                reflectiveQuadTo(399f, 342f)
                lineToRelative(81f, 81f)
                close()
                moveToRelative(138f, 138f)
                quadToRelative(11f, -18f, 16.5f, -38f)
                reflectiveQuadToRelative(5.5f, -43f)
                quadToRelative(0f, -23f, -5.5f, -43.5f)
                reflectiveQuadTo(618f, 398f)
                lineToRelative(-81f, 81f)
                lineToRelative(81f, 82f)
                close()
                moveToRelative(142f, 142f)
                verticalLineToRelative(-447f)
                lineToRelative(-85f, 85f)
                quadToRelative(21f, 29f, 33f, 64.5f)
                reflectiveQuadToRelative(12f, 74.5f)
                quadToRelative(0f, 39f, -11.5f, 74.5f)
                reflectiveQuadTo(676f, 619f)
                lineToRelative(84f, 84f)
                close()
                moveTo(619f, 285f)
                lineToRelative(85f, -85f)
                horizontalLineTo(257f)
                lineToRelative(84f, 84f)
                quadToRelative(29f, -21f, 64.5f, -32.5f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(39f, 0f, 74.5f, 12f)
                reflectiveQuadToRelative(64.5f, 33f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Grid_guides!!
    }

private var _Grid_guides: ImageVector? = null

