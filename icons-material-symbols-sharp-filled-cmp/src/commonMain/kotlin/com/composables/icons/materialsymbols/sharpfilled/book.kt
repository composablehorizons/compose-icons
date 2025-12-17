package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Book: ImageVector
    get() {
        if (_Book != null) return _Book!!
        
        _Book = ImageVector.Builder(
            name = "book",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -440f)
                lineToRelative(100f, -60f)
                lineToRelative(100f, 60f)
                verticalLineToRelative(-280f)
                horizontalLineTo(440f)
                verticalLineToRelative(280f)
                close()
            }
        }.build()
        
        return _Book!!
    }

private var _Book: ImageVector? = null

