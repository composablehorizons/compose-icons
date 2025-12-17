package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.View_column: ImageVector
    get() {
        if (_View_column != null) return _View_column!!
        
        _View_column = ImageVector.Builder(
            name = "view_column",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(53f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(333f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(253f, 760f)
                horizontalLineToRelative(-53f)
                close()
                moveToRelative(253f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(373f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(453f, 200f)
                horizontalLineToRelative(53f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(586f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(506f, 760f)
                horizontalLineToRelative(-53f)
                close()
                moveToRelative(253f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(626f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(706f, 200f)
                horizontalLineToRelative(53f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(839f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(759f, 760f)
                horizontalLineToRelative(-53f)
                close()
            }
        }.build()
        
        return _View_column!!
    }

private var _View_column: ImageVector? = null

