package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Add_a_photo: ImageVector
    get() {
        if (_Add_a_photo != null) return _Add_a_photo!!
        
        _Add_a_photo = ImageVector.Builder(
            name = "add_a_photo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(440f, 700f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(620f, 520f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(440f, 340f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(260f, 520f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(440f, 700f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(206f)
                lineToRelative(74f, -80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(480f)
                horizontalLineTo(40f)
                close()
            }
        }.build()
        
        return _Add_a_photo!!
    }

private var _Add_a_photo: ImageVector? = null

