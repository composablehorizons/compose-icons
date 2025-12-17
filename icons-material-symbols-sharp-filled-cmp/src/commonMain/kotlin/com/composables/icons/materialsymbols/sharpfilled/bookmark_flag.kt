package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bookmark_flag: ImageVector
    get() {
        if (_Bookmark_flag != null) return _Bookmark_flag!!
        
        _Bookmark_flag = ImageVector.Builder(
            name = "bookmark_flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 560f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(180f)
                lineToRelative(-60f, -80f)
                lineToRelative(60f, -80f)
                horizontalLineTo(380f)
                verticalLineToRelative(280f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(720f)
                lineTo(480f, 720f)
                lineTo(200f, 840f)
                close()
            }
        }.build()
        
        return _Bookmark_flag!!
    }

private var _Bookmark_flag: ImageVector? = null

