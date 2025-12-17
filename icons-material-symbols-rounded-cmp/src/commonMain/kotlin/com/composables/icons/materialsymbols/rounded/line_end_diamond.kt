package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Line_end_diamond: ImageVector
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
                moveToRelative(-28f, 85f)
                lineTo(360f, 520f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(240f)
                lineToRelative(212f, -212f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(224f, 224f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(628f, 732f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveToRelative(28f, -252f)
                close()
            }
        }.build()
        
        return _Line_end_diamond!!
    }

private var _Line_end_diamond: ImageVector? = null

