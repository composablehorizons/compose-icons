package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Line_start_diamond: ImageVector
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
                moveToRelative(-28f, 85f)
                lineTo(108f, 508f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(12f, -28f)
                lineToRelative(224f, -224f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(212f, 212f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(600f)
                lineTo(388f, 732f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(28f, -252f)
                close()
            }
        }.build()
        
        return _Line_start_diamond!!
    }

private var _Line_start_diamond: ImageVector? = null

