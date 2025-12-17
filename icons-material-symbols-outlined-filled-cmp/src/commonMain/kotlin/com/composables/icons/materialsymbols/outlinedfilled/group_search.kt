package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Group_search: ImageVector
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
                moveToRelative(320f, 280f)
                quadToRelative(34f, 0f, 56.5f, -20f)
                reflectiveQuadToRelative(23.5f, -60f)
                quadToRelative(1f, -34f, -22.5f, -57f)
                reflectiveQuadTo(680f, 600f)
                quadToRelative(-34f, 0f, -57f, 23f)
                reflectiveQuadToRelative(-23f, 57f)
                quadToRelative(0f, 34f, 23f, 57f)
                reflectiveQuadToRelative(57f, 23f)
                close()
                moveTo(864f, 920f)
                lineTo(762f, 818f)
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
                lineTo(920f, 864f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(32f, 0f, 64.5f, 3.5f)
                reflectiveQuadTo(489f, 535f)
                quadToRelative(-24f, 32f, -36.5f, 69f)
                reflectiveQuadTo(440f, 680f)
                quadToRelative(0f, 32f, 8f, 62.5f)
                reflectiveQuadToRelative(24f, 57.5f)
                horizontalLineTo(40f)
                close()
                moveToRelative(720f, -480f)
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
            }
        }.build()
        
        return _Group_search!!
    }

private var _Group_search: ImageVector? = null

