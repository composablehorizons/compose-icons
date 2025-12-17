package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Highlighter_size_2: ImageVector
    get() {
        if (_Highlighter_size_2 != null) return _Highlighter_size_2!!
        
        _Highlighter_size_2 = ImageVector.Builder(
            name = "highlighter_size_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(282f, 762f)
                lineToRelative(-84f, -84f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(423f, -423f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(84f, 85f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(339f, 762f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(282f, 762f)
                close()
            }
        }.build()
        
        return _Highlighter_size_2!!
    }

private var _Highlighter_size_2: ImageVector? = null

