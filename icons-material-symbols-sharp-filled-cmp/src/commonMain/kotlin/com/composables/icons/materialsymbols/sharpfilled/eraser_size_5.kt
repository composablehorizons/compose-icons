package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Eraser_size_5: ImageVector
    get() {
        if (_Eraser_size_5 != null) return _Eraser_size_5!!
        
        _Eraser_size_5 = ImageVector.Builder(
            name = "eraser_size_5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(402f, 840f)
                quadToRelative(-118f, 0f, -200f, -82f)
                reflectiveQuadToRelative(-82f, -200f)
                quadToRelative(0f, -54f, 20f, -105.5f)
                reflectiveQuadToRelative(62f, -93.5f)
                lineToRelative(157f, -157f)
                quadToRelative(42f, -42f, 93.5f, -62f)
                reflectiveQuadTo(558f, 120f)
                quadToRelative(118f, 0f, 200f, 82f)
                reflectiveQuadToRelative(82f, 200f)
                quadToRelative(0f, 54f, -20f, 105.5f)
                reflectiveQuadTo(758f, 601f)
                lineTo(601f, 758f)
                quadToRelative(-42f, 42f, -93.5f, 62f)
                reflectiveQuadTo(402f, 840f)
                close()
            }
        }.build()
        
        return _Eraser_size_5!!
    }

private var _Eraser_size_5: ImageVector? = null

