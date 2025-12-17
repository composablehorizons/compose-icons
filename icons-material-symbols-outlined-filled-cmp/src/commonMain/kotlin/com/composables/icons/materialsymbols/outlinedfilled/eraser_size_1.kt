package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Eraser_size_1: ImageVector
    get() {
        if (_Eraser_size_1 != null) return _Eraser_size_1!!
        
        _Eraser_size_1 = ImageVector.Builder(
            name = "eraser_size_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 760f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, -15f, 6f, -29.5f)
                reflectiveQuadToRelative(18f, -26.5f)
                lineToRelative(400f, -400f)
                quadToRelative(12f, -12f, 26.5f, -18f)
                reflectiveQuadToRelative(29.5f, -6f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 280f)
                quadToRelative(0f, 15f, -5.5f, 30f)
                reflectiveQuadTo(737f, 337f)
                lineTo(337f, 737f)
                quadToRelative(-12f, 12f, -26.5f, 17.5f)
                reflectiveQuadTo(280f, 760f)
                close()
            }
        }.build()
        
        return _Eraser_size_1!!
    }

private var _Eraser_size_1: ImageVector? = null

