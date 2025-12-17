package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Highlighter_size_1: ImageVector
    get() {
        if (_Highlighter_size_1 != null) return _Highlighter_size_1!!
        
        _Highlighter_size_1 = ImageVector.Builder(
            name = "highlighter_size_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268f, 748f)
                lineToRelative(-56f, -56f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(423f, -423f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(56f, 56f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(748f, 325f)
                lineTo(324f, 748f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
            }
        }.build()
        
        return _Highlighter_size_1!!
    }

private var _Highlighter_size_1: ImageVector? = null

