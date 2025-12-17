package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Map_search: ImageVector
    get() {
        if (_Map_search != null) return _Map_search!!
        
        _Map_search = ImageVector.Builder(
            name = "map_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 720f)
                quadToRelative(34f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(23.5f, -60f)
                quadToRelative(1f, -34f, -22.5f, -57f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(-34f, 0f, -57f, 23f)
                reflectiveQuadToRelative(-23f, 57f)
                quadToRelative(0f, 34f, 23f, 57f)
                reflectiveQuadToRelative(57f, 23f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 43.5f)
                reflectiveQuadTo(778f, 722f)
                lineToRelative(74f, 74f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-74f, -74f)
                quadToRelative(-18f, 11f, -38.5f, 16.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveToRelative(-466f, 28f)
                quadToRelative(-20f, 8f, -37f, -4.5f)
                reflectiveQuadTo(120f, 790f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -13f, 7.5f, -23f)
                reflectiveQuadToRelative(20.5f, -15f)
                lineToRelative(186f, -63f)
                quadToRelative(13f, -5f, 26f, -5f)
                reflectiveQuadToRelative(26f, 5f)
                lineToRelative(214f, 75f)
                lineToRelative(186f, -72f)
                quadToRelative(20f, -8f, 37f, 4.5f)
                reflectiveQuadToRelative(17f, 33.5f)
                verticalLineToRelative(270f)
                quadToRelative(0f, 17f, -16f, 23f)
                reflectiveQuadToRelative(-29f, -6f)
                quadToRelative(-33f, -28f, -72.5f, -42.5f)
                reflectiveQuadTo(640f, 400f)
                horizontalLineToRelative(-17f)
                quadToRelative(-9f, 0f, -17f, 2f)
                quadToRelative(-18f, 2f, -32f, -8.5f)
                reflectiveQuadTo(560f, 366f)
                verticalLineToRelative(-92f)
                lineToRelative(-160f, -56f)
                verticalLineToRelative(481f)
                quadToRelative(0f, 19f, -10.5f, 34f)
                reflectiveQuadTo(362f, 755f)
                lineToRelative(-188f, 73f)
                close()
            }
        }.build()
        
        return _Map_search!!
    }

private var _Map_search: ImageVector? = null

