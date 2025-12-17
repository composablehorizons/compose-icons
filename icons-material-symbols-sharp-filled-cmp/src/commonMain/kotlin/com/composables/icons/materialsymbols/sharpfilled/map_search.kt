package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Map_search: ImageVector
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
                lineToRelative(102f, 102f)
                lineToRelative(-56f, 56f)
                lineToRelative(-102f, -102f)
                quadToRelative(-18f, 11f, -38.5f, 16.5f)
                reflectiveQuadTo(640f, 800f)
                close()
                moveToRelative(-520f, 49f)
                verticalLineToRelative(-647f)
                lineToRelative(240f, -82f)
                lineToRelative(240f, 84f)
                lineToRelative(240f, -93f)
                verticalLineToRelative(396f)
                quadToRelative(-35f, -51f, -87.5f, -79f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(-20f, 0f, -40f, 3.5f)
                reflectiveQuadTo(560f, 414f)
                verticalLineToRelative(-140f)
                lineToRelative(-160f, -56f)
                verticalLineToRelative(523f)
                lineTo(120f, 849f)
                close()
            }
        }.build()
        
        return _Map_search!!
    }

private var _Map_search: ImageVector? = null

