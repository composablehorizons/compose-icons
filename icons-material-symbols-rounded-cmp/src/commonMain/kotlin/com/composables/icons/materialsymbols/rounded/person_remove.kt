package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Person_remove: ImageVector
    get() {
        if (_Person_remove != null) return _Person_remove!!
        
        _Person_remove = ImageVector.Builder(
            name = "person_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 360f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 440f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 360f)
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
                moveTo(40f, 720f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 582f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 520f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(616f, 582f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(680f, 688f)
                verticalLineToRelative(32f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 800f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 720f)
                close()
                moveToRelative(80f, 0f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(580f, 654f)
                quadToRelative(-54f, -27f, -109f, -40.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(140f, 654f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, -320f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 320f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 240f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 400f)
                close()
                moveToRelative(0f, -80f)
                close()
                moveToRelative(0f, 400f)
                close()
            }
        }.build()
        
        return _Person_remove!!
    }

private var _Person_remove: ImageVector? = null

