package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.File_present: ImageVector
    get() {
        if (_File_present != null) return _File_present!!
        
        _File_present = ImageVector.Builder(
            name = "file_present",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(67f, 0f, 113.5f, -47f)
                reflectiveQuadTo(640f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23f, 56.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-220f)
                quadToRelative(0f, -9f, 6f, -14.5f)
                reflectiveQuadToRelative(14f, -5.5f)
                quadToRelative(9f, 0f, 14.5f, 5.5f)
                reflectiveQuadTo(440f, 380f)
                verticalLineToRelative(220f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-220f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(440f)
                lineToRelative(200f, 200f)
                verticalLineToRelative(600f)
                horizontalLineTo(160f)
                close()
                moveToRelative(400f, -720f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                lineTo(560f, 160f)
                close()
            }
        }.build()
        
        return _File_present!!
    }

private var _File_present: ImageVector? = null

