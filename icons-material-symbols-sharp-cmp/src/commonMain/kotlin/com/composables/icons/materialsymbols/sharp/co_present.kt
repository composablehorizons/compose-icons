package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Co_present: ImageVector
    get() {
        if (_Co_present != null) return _Co_present!!
        
        _Co_present = ImageVector.Builder(
            name = "co_present",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 840f)
                verticalLineToRelative(-640f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                horizontalLineTo(40f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(720f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(360f, 560f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(440f, 400f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(360f, 320f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(360f, 480f)
                close()
                moveTo(40f, 880f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -34f, 17.5f, -62.5f)
                reflectiveQuadTo(104f, 662f)
                quadToRelative(62f, -31f, 126f, -46.5f)
                reflectiveQuadTo(360f, 600f)
                quadToRelative(66f, 0f, 130f, 15.5f)
                reflectiveQuadTo(616f, 662f)
                quadToRelative(29f, 15f, 46.5f, 43.5f)
                reflectiveQuadTo(680f, 768f)
                verticalLineToRelative(112f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-32f)
                quadToRelative(0f, -11f, -5.5f, -20f)
                reflectiveQuadTo(580f, 734f)
                quadToRelative(-54f, -27f, -109f, -40.5f)
                reflectiveQuadTo(360f, 680f)
                quadToRelative(-56f, 0f, -111f, 13.5f)
                reflectiveQuadTo(140f, 734f)
                quadToRelative(-9f, 5f, -14.5f, 14f)
                reflectiveQuadToRelative(-5.5f, 20f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(240f, -400f)
                close()
                moveToRelative(0f, 400f)
                close()
            }
        }.build()
        
        return _Co_present!!
    }

private var _Co_present: ImageVector? = null

