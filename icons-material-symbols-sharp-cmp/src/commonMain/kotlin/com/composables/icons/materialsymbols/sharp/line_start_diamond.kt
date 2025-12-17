package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Line_start_diamond: ImageVector
    get() {
        if (_Line_start_diamond != null) return _Line_start_diamond!!
        
        _Line_start_diamond = ImageVector.Builder(
            name = "line_start_diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 647f)
                lineToRelative(167f, -167f)
                lineToRelative(-167f, -167f)
                lineToRelative(-167f, 167f)
                lineToRelative(167f, 167f)
                close()
                moveToRelative(0f, 113f)
                lineTo(80f, 480f)
                lineToRelative(280f, -280f)
                lineToRelative(240f, 240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                lineTo(360f, 760f)
                close()
                moveToRelative(0f, -280f)
                close()
            }
        }.build()
        
        return _Line_start_diamond!!
    }

private var _Line_start_diamond: ImageVector? = null

