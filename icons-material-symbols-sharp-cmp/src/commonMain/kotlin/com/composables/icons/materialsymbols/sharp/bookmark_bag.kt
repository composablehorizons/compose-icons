package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bookmark_bag: ImageVector
    get() {
        if (_Bookmark_bag != null) return _Bookmark_bag!!
        
        _Bookmark_bag = ImageVector.Builder(
            name = "bookmark_bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 560f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-80f)
                horizontalLineTo(420f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(100f, -240f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(720f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
                moveToRelative(80f, -122f)
                lineToRelative(200f, -86f)
                lineToRelative(200f, 86f)
                verticalLineToRelative(-518f)
                horizontalLineTo(280f)
                verticalLineToRelative(518f)
                close()
                moveToRelative(0f, -518f)
                horizontalLineToRelative(400f)
                horizontalLineToRelative(-400f)
                close()
            }
        }.build()
        
        return _Bookmark_bag!!
    }

private var _Bookmark_bag: ImageVector? = null

