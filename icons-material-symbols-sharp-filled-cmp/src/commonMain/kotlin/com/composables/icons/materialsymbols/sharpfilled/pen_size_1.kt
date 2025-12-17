package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Pen_size_1: ImageVector
    get() {
        if (_Pen_size_1 != null) return _Pen_size_1!!
        
        _Pen_size_1 = ImageVector.Builder(
            name = "pen_size_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(199f, 761f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                lineToRelative(520f, -520f)
                quadToRelative(9f, -9f, 21f, -9f)
                reflectiveQuadToRelative(21f, 9f)
                quadToRelative(9f, 9f, 9f, 21f)
                reflectiveQuadToRelative(-9f, 21f)
                lineTo(241f, 761f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-21f, -9f)
                close()
            }
        }.build()
        
        return _Pen_size_1!!
    }

private var _Pen_size_1: ImageVector? = null

