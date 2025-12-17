package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Stylus_highlighter: ImageVector
    get() {
        if (_Stylus_highlighter != null) return _Stylus_highlighter!!
        
        _Stylus_highlighter = ImageVector.Builder(
            name = "stylus_highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 640f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(99f)
                lineToRelative(301f, 149f)
                verticalLineToRelative(371f)
                horizontalLineTo(280f)
                close()
                moveTo(160f, 840f)
                lineToRelative(40f, -120f)
                horizontalLineToRelative(560f)
                lineToRelative(40f, 120f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Stylus_highlighter!!
    }

private var _Stylus_highlighter: ImageVector? = null

