package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Directions_walk: ImageVector
    get() {
        if (_Directions_walk != null) return _Directions_walk!!
        
        _Directions_walk = ImageVector.Builder(
            name = "directions_walk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 920f)
                lineToRelative(112f, -564f)
                lineToRelative(-72f, 28f)
                verticalLineToRelative(136f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-188f)
                lineToRelative(202f, -86f)
                quadToRelative(14f, -6f, 29.5f, -7f)
                reflectiveQuadToRelative(29.5f, 4f)
                quadToRelative(14f, 5f, 26.5f, 14f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(40f, 64f)
                quadToRelative(26f, 42f, 70.5f, 69f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(80f)
                quadToRelative(-70f, 0f, -125f, -29f)
                reflectiveQuadToRelative(-94f, -74f)
                lineToRelative(-25f, 123f)
                lineToRelative(84f, 80f)
                verticalLineToRelative(300f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-260f)
                lineToRelative(-84f, -64f)
                lineToRelative(-72f, 324f)
                horizontalLineToRelative(-84f)
                close()
                moveToRelative(260f, -700f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(460f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(540f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(620f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(540f, 220f)
                close()
            }
        }.build()
        
        return _Directions_walk!!
    }

private var _Directions_walk: ImageVector? = null

