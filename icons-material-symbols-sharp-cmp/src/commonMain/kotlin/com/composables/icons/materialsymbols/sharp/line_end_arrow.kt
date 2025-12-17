package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Line_end_arrow: ImageVector
    get() {
        if (_Line_end_arrow != null) return _Line_end_arrow!!
        
        _Line_end_arrow = ImageVector.Builder(
            name = "line_end_arrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                verticalLineToRelative(-240f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(-240f)
                lineToRelative(440f, 280f)
                lineToRelative(-440f, 280f)
                close()
                moveToRelative(80f, -146f)
                lineToRelative(211f, -134f)
                lineToRelative(-211f, -134f)
                verticalLineToRelative(268f)
                close()
                moveToRelative(0f, -134f)
                close()
            }
        }.build()
        
        return _Line_end_arrow!!
    }

private var _Line_end_arrow: ImageVector? = null

