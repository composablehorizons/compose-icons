package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Line_end_arrow: ImageVector
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
                moveTo(501f, 721f)
                quadToRelative(-20f, 13f, -40.5f, 1.5f)
                reflectiveQuadTo(440f, 687f)
                verticalLineToRelative(-167f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-167f)
                quadToRelative(0f, -24f, 20.5f, -35.5f)
                reflectiveQuadTo(501f, 239f)
                lineToRelative(326f, 207f)
                quadToRelative(19f, 12f, 19f, 34f)
                reflectiveQuadToRelative(-19f, 34f)
                lineTo(501f, 721f)
                close()
                moveToRelative(19f, -107f)
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

