package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                quadToRelative(150f, 0f, 255f, -47f)
                reflectiveQuadToRelative(105f, -113f)
                quadToRelative(0f, -66f, -105f, -113f)
                reflectiveQuadToRelative(-255f, -47f)
                quadToRelative(-150f, 0f, -255f, 47f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, 66f, 105f, 113f)
                reflectiveQuadToRelative(255f, 47f)
                close()
                moveToRelative(0f, 100f)
                quadToRelative(41f, 0f, 102.5f, -8.5f)
                reflectiveQuadTo(701f, 504f)
                quadToRelative(57f, -19f, 98f, -49.5f)
                reflectiveQuadToRelative(41f, -74.5f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 44f, -41f, 74.5f)
                reflectiveQuadTo(701f, 604f)
                quadToRelative(-57f, 19f, -118.5f, 27.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(-41f, 0f, -102.5f, -8.5f)
                reflectiveQuadTo(259f, 604f)
                quadToRelative(-57f, -19f, -98f, -49.5f)
                reflectiveQuadTo(120f, 480f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 44f, 41f, 74.5f)
                reflectiveQuadToRelative(98f, 49.5f)
                quadToRelative(57f, 19f, 118.5f, 27.5f)
                reflectiveQuadTo(480f, 540f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(41f, 0f, 102.5f, -8.5f)
                reflectiveQuadTo(701f, 704f)
                quadToRelative(57f, -19f, 98f, -49.5f)
                reflectiveQuadToRelative(41f, -74.5f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 44f, -41f, 74.5f)
                reflectiveQuadTo(701f, 804f)
                quadToRelative(-57f, 19f, -118.5f, 27.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(-41f, 0f, -102.5f, -8.5f)
                reflectiveQuadTo(259f, 804f)
                quadToRelative(-57f, -19f, -98f, -49.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-100f)
                quadToRelative(0f, 44f, 41f, 74.5f)
                reflectiveQuadToRelative(98f, 49.5f)
                quadToRelative(57f, 19f, 118.5f, 27.5f)
                reflectiveQuadTo(480f, 740f)
                close()
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

