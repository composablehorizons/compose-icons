package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Artist: ImageVector
    get() {
        if (_Artist != null) return _Artist!!
        
        _Artist = ImageVector.Builder(
            name = "artist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 800f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(8f, 0f, 18f, 1.5f)
                reflectiveQuadToRelative(22f, 6.5f)
                verticalLineToRelative(-208f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(440f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(120f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -35f, 17.5f, -63f)
                reflectiveQuadToRelative(46.5f, -43f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(42f, 0f, 83.5f, 6.5f)
                reflectiveQuadTo(607f, 546f)
                quadToRelative(-66f, 40f, -82f, 114.5f)
                reflectiveQuadTo(551f, 800f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Artist!!
    }

private var _Artist: ImageVector? = null

