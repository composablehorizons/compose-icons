package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Group_remove: ImageVector
    get() {
        if (_Group_remove != null) return _Group_remove!!
        
        _Group_remove = ImageVector.Builder(
            name = "group_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(500f, 478f)
                quadToRelative(29f, -32f, 44.5f, -73f)
                reflectiveQuadToRelative(15.5f, -85f)
                quadToRelative(0f, -44f, -15.5f, -85f)
                reflectiveQuadTo(500f, 162f)
                quadToRelative(60f, 8f, 100f, 53f)
                reflectiveQuadToRelative(40f, 105f)
                quadToRelative(0f, 60f, -40f, 105f)
                reflectiveQuadToRelative(-100f, 53f)
                close()
                moveToRelative(198f, 322f)
                quadToRelative(11f, -18f, 16.5f, -38.5f)
                reflectiveQuadTo(720f, 720f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -36f, -16f, -68.5f)
                reflectiveQuadTo(662f, 554f)
                quadToRelative(51f, 18f, 94.5f, 46.5f)
                reflectiveQuadTo(800f, 680f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 800f)
                horizontalLineToRelative(-22f)
                close()
                moveToRelative(222f, -360f)
                horizontalLineTo(760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(960f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 440f)
                close()
                moveToRelative(-600f, 40f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(0f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(64f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(576f, 582f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(640f, 688f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 800f)
                horizontalLineTo(80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(0f, 720f)
                close()
            }
        }.build()
        
        return _Group_remove!!
    }

private var _Group_remove: ImageVector? = null

