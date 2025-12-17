package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bookmarks: ImageVector
    get() {
        if (_Bookmarks != null) return _Bookmarks!!
        
        _Bookmarks = ImageVector.Builder(
            name = "bookmarks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 800f)
                lineTo(232f, 872f)
                quadToRelative(-40f, 17f, -76f, -6.5f)
                reflectiveQuadTo(120f, 799f)
                verticalLineToRelative(-519f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 200f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 280f)
                verticalLineToRelative(519f)
                quadToRelative(0f, 43f, -36f, 66.5f)
                reflectiveQuadTo(568f, 872f)
                lineToRelative(-168f, -72f)
                close()
                moveToRelative(0f, -88f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-518f)
                horizontalLineTo(200f)
                verticalLineToRelative(518f)
                lineToRelative(200f, -86f)
                close()
                moveToRelative(400f, 88f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 760f)
                verticalLineToRelative(-640f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 40f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 120f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 800f)
                close()
                moveTo(400f, 280f)
                horizontalLineTo(200f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-200f)
                close()
            }
        }.build()
        
        return _Bookmarks!!
    }

private var _Bookmarks: ImageVector? = null

