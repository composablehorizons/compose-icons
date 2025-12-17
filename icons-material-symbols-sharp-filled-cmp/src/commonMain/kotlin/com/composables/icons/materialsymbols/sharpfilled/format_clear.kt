package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Format_clear: ImageVector
    get() {
        if (_Format_clear != null) return _Format_clear!!
        
        _Format_clear = ImageVector.Builder(
            name = "format_clear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 414f)
                lineToRelative(-93f, -93f)
                lineToRelative(-121f, -121f)
                horizontalLineToRelative(486f)
                verticalLineToRelative(120f)
                horizontalLineTo(568f)
                lineToRelative(-40f, 94f)
                close()
                moveTo(792f, 904f)
                lineTo(460f, 572f)
                lineToRelative(-80f, 188f)
                horizontalLineTo(249f)
                lineToRelative(119f, -280f)
                lineTo(56f, 168f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Format_clear!!
    }

private var _Format_clear: ImageVector? = null

