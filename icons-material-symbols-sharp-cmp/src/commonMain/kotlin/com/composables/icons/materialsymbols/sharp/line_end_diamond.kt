package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Line_end_diamond: ImageVector
    get() {
        if (_Line_end_diamond != null) return _Line_end_diamond!!
        
        _Line_end_diamond = ImageVector.Builder(
            name = "line_end_diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 647f)
                lineToRelative(167f, -167f)
                lineToRelative(-167f, -167f)
                lineToRelative(-167f, 167f)
                lineToRelative(167f, 167f)
                close()
                moveToRelative(0f, 113f)
                lineTo(360f, 520f)
                horizontalLineTo(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                lineToRelative(240f, -240f)
                lineToRelative(280f, 280f)
                lineToRelative(-280f, 280f)
                close()
                moveToRelative(0f, -280f)
                close()
            }
        }.build()
        
        return _Line_end_diamond!!
    }

private var _Line_end_diamond: ImageVector? = null

