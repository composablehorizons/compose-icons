package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Artist: ImageVector
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
                verticalLineToRelative(-168f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(780f, 400f)
                horizontalLineToRelative(60f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 480f)
                horizontalLineToRelative(-40f)
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
                moveTo(160f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-72f)
                quadToRelative(0f, -35f, 17.5f, -63f)
                reflectiveQuadToRelative(46.5f, -43f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(28f, 0f, 55.5f, 3f)
                reflectiveQuadToRelative(55.5f, 9f)
                quadToRelative(17f, 4f, 21.5f, 21f)
                reflectiveQuadToRelative(-9.5f, 31f)
                quadToRelative(-21f, 25f, -31.5f, 54.5f)
                reflectiveQuadTo(521f, 700f)
                quadToRelative(0f, 13f, 1.5f, 25.5f)
                reflectiveQuadTo(528f, 751f)
                quadToRelative(5f, 18f, -4.5f, 33.5f)
                reflectiveQuadTo(497f, 800f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Artist!!
    }

private var _Artist: ImageVector? = null

