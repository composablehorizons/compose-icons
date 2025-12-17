package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Preview: ImageVector
    get() {
        if (_Preview != null) return _Preview!!
        
        _Preview = ImageVector.Builder(
            name = "preview",
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-480f)
                horizontalLineTo(200f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(280f, -80f)
                quadToRelative(-82f, 0f, -146.5f, -44.5f)
                reflectiveQuadTo(240f, 520f)
                quadToRelative(29f, -71f, 93.5f, -115.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(82f, 0f, 146.5f, 44.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(-29f, 71f, -93.5f, 115.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(0f, -60f)
                quadToRelative(56f, 0f, 102f, -26.5f)
                reflectiveQuadToRelative(72f, -73.5f)
                quadToRelative(-26f, -47f, -72f, -73.5f)
                reflectiveQuadTo(480f, 420f)
                quadToRelative(-56f, 0f, -102f, 26.5f)
                reflectiveQuadTo(306f, 520f)
                quadToRelative(26f, 47f, 72f, 73.5f)
                reflectiveQuadTo(480f, 620f)
                close()
                moveToRelative(0f, -100f)
                close()
                moveToRelative(0f, 60f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 520f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 460f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 520f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 580f)
                close()
            }
        }.build()
        
        return _Preview!!
    }

private var _Preview: ImageVector? = null

