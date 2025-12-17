package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Title: ImageVector
    get() {
        if (_Title != null) return _Title!!
        
        _Title = ImageVector.Builder(
            name = "title",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineTo(200f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(120f)
                horizontalLineTo(540f)
                verticalLineToRelative(520f)
                horizontalLineTo(420f)
                close()
            }
        }.build()
        
        return _Title!!
    }

private var _Title: ImageVector? = null

