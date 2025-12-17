package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Page_header: ImageVector
    get() {
        if (_Page_header != null) return _Page_header!!
        
        _Page_header = ImageVector.Builder(
            name = "page_header",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, 640f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Page_header!!
    }

private var _Page_header: ImageVector? = null

