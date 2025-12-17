package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bottom_drawer: ImageVector
    get() {
        if (_Bottom_drawer != null) return _Bottom_drawer!!
        
        _Bottom_drawer = ImageVector.Builder(
            name = "bottom_drawer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveToRelative(0f, -338f)
                quadToRelative(18f, -11f, 38.5f, -16.5f)
                reflectiveQuadTo(280f, 480f)
                horizontalLineToRelative(400f)
                quadToRelative(21f, 0f, 41.5f, 5.5f)
                reflectiveQuadTo(760f, 502f)
                verticalLineToRelative(-302f)
                horizontalLineTo(200f)
                verticalLineToRelative(302f)
                close()
                moveToRelative(0f, 258f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 560f)
                horizontalLineTo(280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(560f)
                horizontalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Bottom_drawer!!
    }

private var _Bottom_drawer: ImageVector? = null

