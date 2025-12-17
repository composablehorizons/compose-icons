package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Map_search: ImageVector
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
                moveTo(640f, 400f)
                verticalLineToRelative(-126f)
                verticalLineToRelative(126f)
                close()
                moveTo(174f, 828f)
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
                verticalLineToRelative(297f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 507f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 467f)
                verticalLineToRelative(-239f)
                lineToRelative(-120f, 46f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 414f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 374f)
                verticalLineToRelative(-100f)
                lineToRelative(-160f, -56f)
                verticalLineToRelative(481f)
                quadToRelative(0f, 19f, -10.5f, 34f)
                reflectiveQuadTo(362f, 755f)
                lineToRelative(-188f, 73f)
                close()
                moveToRelative(26f, -96f)
                lineToRelative(120f, -46f)
                verticalLineToRelative(-468f)
                lineToRelative(-120f, 40f)
                verticalLineToRelative(474f)
                close()
                moveToRelative(440f, -12f)
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
                moveTo(320f, 218f)
                verticalLineToRelative(468f)
                verticalLineToRelative(-468f)
                close()
            }
        }.build()
        
        return _Map_search!!
    }

private var _Map_search: ImageVector? = null

