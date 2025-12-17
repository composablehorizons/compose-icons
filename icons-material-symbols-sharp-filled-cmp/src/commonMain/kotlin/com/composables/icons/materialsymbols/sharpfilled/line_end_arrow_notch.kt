package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Line_end_arrow_notch: ImageVector
    get() {
        if (_Line_end_arrow_notch != null) return _Line_end_arrow_notch!!
        
        _Line_end_arrow_notch = ImageVector.Builder(
            name = "line_end_arrow_notch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                lineToRelative(137f, -240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(497f)
                lineTo(440f, 200f)
                lineToRelative(440f, 280f)
                lineToRelative(-440f, 280f)
                close()
            }
        }.build()
        
        return _Line_end_arrow_notch!!
    }

private var _Line_end_arrow_notch: ImageVector? = null

