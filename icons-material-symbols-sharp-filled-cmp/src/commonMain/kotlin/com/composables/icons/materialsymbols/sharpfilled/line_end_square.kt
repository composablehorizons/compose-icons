package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Line_end_square: ImageVector
    get() {
        if (_Line_end_square != null) return _Line_end_square!!
        
        _Line_end_square = ImageVector.Builder(
            name = "line_end_square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 700f)
                verticalLineToRelative(-180f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(440f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Line_end_square!!
    }

private var _Line_end_square: ImageVector? = null

