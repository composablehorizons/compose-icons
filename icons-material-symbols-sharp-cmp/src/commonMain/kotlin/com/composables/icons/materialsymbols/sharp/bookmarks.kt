package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bookmarks: ImageVector
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
                moveTo(120f, 920f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(720f)
                lineTo(400f, 800f)
                lineTo(120f, 920f)
                close()
                moveToRelative(80f, -122f)
                lineToRelative(200f, -86f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-518f)
                horizontalLineTo(200f)
                verticalLineToRelative(518f)
                close()
                moveToRelative(560f, 2f)
                verticalLineToRelative(-680f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(760f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(200f, 280f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Bookmarks!!
    }

private var _Bookmarks: ImageVector? = null

