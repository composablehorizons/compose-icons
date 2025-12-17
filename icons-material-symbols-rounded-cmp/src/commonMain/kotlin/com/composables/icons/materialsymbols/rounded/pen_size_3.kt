package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pen_size_3: ImageVector
    get() {
        if (_Pen_size_3 != null) return _Pen_size_3!!
        
        _Pen_size_3 = ImageVector.Builder(
            name = "pen_size_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(218f, 742f)
                quadToRelative(-17f, -17f, -17f, -42f)
                reflectiveQuadToRelative(17f, -42f)
                lineToRelative(440f, -440f)
                quadToRelative(17f, -18f, 42f, -17.5f)
                reflectiveQuadToRelative(42f, 17.5f)
                quadToRelative(17f, 17f, 17.5f, 42f)
                reflectiveQuadTo(742f, 302f)
                lineTo(302f, 742f)
                quadToRelative(-17f, 17f, -42f, 17.5f)
                reflectiveQuadTo(218f, 742f)
                close()
            }
        }.build()
        
        return _Pen_size_3!!
    }

private var _Pen_size_3: ImageVector? = null

