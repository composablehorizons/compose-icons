package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bookmark_remove: ImageVector
    get() {
        if (_Bookmark_remove != null) return _Bookmark_remove!!
        
        _Bookmark_remove = ImageVector.Builder(
            name = "bookmark_remove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 280f)
                horizontalLineTo(600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                close()
                moveTo(480f, 720f)
                lineTo(200f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                verticalLineToRelative(518f)
                lineToRelative(200f, -86f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-278f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                lineTo(480f, 720f)
                close()
                moveTo(280f, 200f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
            }
        }.build()
        
        return _Bookmark_remove!!
    }

private var _Bookmark_remove: ImageVector? = null

