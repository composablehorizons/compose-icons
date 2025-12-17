package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.News: ImageVector
    get() {
        if (_News != null) return _News!!
        
        _News = ImageVector.Builder(
            name = "news",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(520f)
                lineToRelative(200f, 200f)
                verticalLineToRelative(520f)
                horizontalLineTo(120f)
                close()
                moveToRelative(480f, -640f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(160f)
                lineTo(600f, 200f)
                close()
                moveTo(280f, 680f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, -320f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _News!!
    }

private var _News: ImageVector? = null

