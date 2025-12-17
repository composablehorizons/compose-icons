package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Group_search: ImageVector
    get() {
        if (_Group_search != null) return _Group_search!!
        
        _Group_search = ImageVector.Builder(
            name = "group_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 760f)
                quadToRelative(34f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(23.5f, -60f)
                quadToRelative(1f, -34f, -22.5f, -57f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(-34f, 0f, -57f, 23f)
                reflectiveQuadToRelative(-23f, 57f)
                quadToRelative(0f, 34f, 23f, 57f)
                reflectiveQuadToRelative(57f, 23f)
                close()
                moveTo(836f, 892f)
                lineToRelative(-74f, -74f)
                quadToRelative(-18f, 11f, -38.5f, 16.5f)
                reflectiveQuadTo(680f, 840f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 23f, -5.5f, 43.5f)
                reflectiveQuadTo(818f, 762f)
                lineToRelative(74f, 74f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-716f, -92f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(18f, 0f, 36f, 1.5f)
                reflectiveQuadToRelative(36f, 3.5f)
                quadToRelative(20f, 3f, 28.5f, 21.5f)
                reflectiveQuadTo(459f, 585f)
                quadToRelative(-10f, 23f, -14.5f, 46.5f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, 17f, 2.5f, 34f)
                reflectiveQuadToRelative(7.5f, 34f)
                quadToRelative(6f, 20f, -5f, 36f)
                reflectiveQuadToRelative(-30f, 16f)
                horizontalLineTo(120f)
                close()
                moveToRelative(640f, -480f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                quadToRelative(-11f, 0f, -28f, -2.5f)
                reflectiveQuadToRelative(-28f, -5.5f)
                quadToRelative(27f, -32f, 41.5f, -71f)
                reflectiveQuadToRelative(14.5f, -81f)
                quadToRelative(0f, -42f, -14.5f, -81f)
                reflectiveQuadTo(544f, 168f)
                quadToRelative(14f, -5f, 28f, -6.5f)
                reflectiveQuadToRelative(28f, -1.5f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                close()
                moveTo(360f, 480f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
            }
        }.build()
        
        return _Group_search!!
    }

private var _Group_search: ImageVector? = null

