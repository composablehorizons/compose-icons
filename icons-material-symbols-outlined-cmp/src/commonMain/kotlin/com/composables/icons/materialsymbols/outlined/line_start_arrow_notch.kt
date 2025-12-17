package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Line_start_arrow_notch: ImageVector
    get() {
        if (_Line_start_arrow_notch != null) return _Line_start_arrow_notch!!
        
        _Line_start_arrow_notch = ImageVector.Builder(
            name = "line_start_arrow_notch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 760f)
                lineTo(80f, 480f)
                lineToRelative(440f, -280f)
                lineToRelative(-137f, 240f)
                horizontalLineToRelative(497f)
                verticalLineToRelative(80f)
                horizontalLineTo(383f)
                lineToRelative(137f, 240f)
                close()
            }
        }.build()
        
        return _Line_start_arrow_notch!!
    }

private var _Line_start_arrow_notch: ImageVector? = null

