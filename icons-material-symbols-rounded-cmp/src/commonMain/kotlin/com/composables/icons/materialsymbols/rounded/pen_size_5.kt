package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pen_size_5: ImageVector
    get() {
        if (_Pen_size_5 != null) return _Pen_size_5!!
        
        _Pen_size_5 = ImageVector.Builder(
            name = "pen_size_5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(235f, 725f)
                quadToRelative(-35f, -35f, -35f, -85f)
                reflectiveQuadToRelative(35f, -85f)
                lineToRelative(320f, -320f)
                quadToRelative(35f, -35f, 85f, -35f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(35f, 35f, 35f, 85f)
                reflectiveQuadToRelative(-35f, 85f)
                lineTo(405f, 725f)
                quadToRelative(-35f, 35f, -85f, 35f)
                reflectiveQuadToRelative(-85f, -35f)
                close()
            }
        }.build()
        
        return _Pen_size_5!!
    }

private var _Pen_size_5: ImageVector? = null

