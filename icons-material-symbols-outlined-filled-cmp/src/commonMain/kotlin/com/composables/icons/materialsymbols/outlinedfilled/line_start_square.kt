package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Line_start_square: ImageVector
    get() {
        if (_Line_start_square != null) return _Line_start_square!!
        
        _Line_start_square = ImageVector.Builder(
            name = "line_start_square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 700f)
                horizontalLineTo(80f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(180f)
                close()
            }
        }.build()
        
        return _Line_start_square!!
    }

private var _Line_start_square: ImageVector? = null

