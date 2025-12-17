package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Line_start_arrow: ImageVector
    get() {
        if (_Line_start_arrow != null) return _Line_start_arrow!!
        
        _Line_start_arrow = ImageVector.Builder(
            name = "line_start_arrow",
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
                verticalLineToRelative(240f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(-80f, -146f)
                verticalLineToRelative(-268f)
                lineTo(229f, 480f)
                lineToRelative(211f, 134f)
                close()
                moveToRelative(0f, -134f)
                close()
            }
        }.build()
        
        return _Line_start_arrow!!
    }

private var _Line_start_arrow: ImageVector? = null

