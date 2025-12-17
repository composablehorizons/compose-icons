package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Highlighter_size_4: ImageVector
    get() {
        if (_Highlighter_size_4 != null) return _Highlighter_size_4!!
        
        _Highlighter_size_4 = ImageVector.Builder(
            name = "highlighter_size_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(353f, 833f)
                lineTo(127f, 607f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(423f, -423f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(27.5f, 12f)
                lineToRelative(227f, 226f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(833f, 410f)
                lineTo(410f, 833f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(353f, 833f)
                close()
            }
        }.build()
        
        return _Highlighter_size_4!!
    }

private var _Highlighter_size_4: ImageVector? = null

