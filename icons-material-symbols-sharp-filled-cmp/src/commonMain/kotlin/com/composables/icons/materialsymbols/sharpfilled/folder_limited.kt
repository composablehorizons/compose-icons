package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Folder_limited: ImageVector
    get() {
        if (_Folder_limited != null) return _Folder_limited!!
        
        _Folder_limited = ImageVector.Builder(
            name = "folder_limited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(320f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(560f)
                horizontalLineTo(80f)
                close()
                moveToRelative(400f, -120f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(-46f, -248f)
                quadToRelative(11f, -5f, 22f, -8.5f)
                reflectiveQuadToRelative(24f, -3.5f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 13f, -3.5f, 24f)
                reflectiveQuadToRelative(-8.5f, 22f)
                lineTo(434f, 432f)
                close()
                moveToRelative(46f, 188f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -13f, 3.5f, -24f)
                reflectiveQuadToRelative(8.5f, -22f)
                lineToRelative(134f, 134f)
                quadToRelative(-11f, 5f, -22f, 8.5f)
                reflectiveQuadToRelative(-24f, 3.5f)
                close()
            }
        }.build()
        
        return _Folder_limited!!
    }

private var _Folder_limited: ImageVector? = null

