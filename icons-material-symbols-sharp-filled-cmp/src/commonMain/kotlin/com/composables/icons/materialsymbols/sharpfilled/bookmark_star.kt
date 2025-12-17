package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bookmark_star: ImageVector
    get() {
        if (_Bookmark_star != null) return _Bookmark_star!!
        
        _Bookmark_star = ImageVector.Builder(
            name = "bookmark_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(389f, 560f)
                lineToRelative(91f, -55f)
                lineToRelative(91f, 55f)
                lineToRelative(-24f, -104f)
                lineToRelative(80f, -69f)
                lineToRelative(-105f, -9f)
                lineToRelative(-42f, -98f)
                lineToRelative(-42f, 98f)
                lineToRelative(-105f, 9f)
                lineToRelative(80f, 69f)
                lineToRelative(-24f, 104f)
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
        
        return _Bookmark_star!!
    }

private var _Bookmark_star: ImageVector? = null

