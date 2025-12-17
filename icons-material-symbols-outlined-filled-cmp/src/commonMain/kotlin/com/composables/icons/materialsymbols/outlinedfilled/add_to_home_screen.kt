package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Add_to_home_screen: ImageVector
    get() {
        if (_Add_to_home_screen != null) return _Add_to_home_screen!!
        
        _Add_to_home_screen = ImageVector.Builder(
            name = "add_to_home_screen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 920f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 120f)
                verticalLineToRelative(720f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 920f)
                horizontalLineTo(320f)
                close()
                moveTo(176f, 680f)
                lineToRelative(-56f, -56f)
                lineToRelative(224f, -224f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineTo(176f, 680f)
                close()
            }
        }.build()
        
        return _Add_to_home_screen!!
    }

private var _Add_to_home_screen: ImageVector? = null

