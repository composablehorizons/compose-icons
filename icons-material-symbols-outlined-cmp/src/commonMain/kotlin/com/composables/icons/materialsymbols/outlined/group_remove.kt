package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Group_remove: ImageVector
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
                moveToRelative(220f, 322f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -36f, -16f, -68.5f)
                reflectiveQuadTo(662f, 554f)
                quadToRelative(51f, 18f, 94.5f, 46.5f)
                reflectiveQuadTo(800f, 680f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -360f)
                horizontalLineTo(720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(-640f, 40f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveTo(0f, 800f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(64f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(576f, 582f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(640f, 688f)
                verticalLineToRelative(112f)
                horizontalLineTo(0f)
                close()
                moveToRelative(320f, -400f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(320f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 400f)
                close()
                moveTo(80f, 720f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(540f, 654f)
                quadToRelative(-54f, -27f, -109f, -40.5f)
                reflectiveQuadTo(320f, 600f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(100f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadTo(80f, 688f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, -400f)
                close()
                moveToRelative(0f, 400f)
                close()
            }
        }.build()
        
        return _Group_remove!!
    }

private var _Group_remove: ImageVector? = null

