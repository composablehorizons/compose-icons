package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Highlighter_size_3: ImageVector
    get() {
        if (_Highlighter_size_3 != null) return _Highlighter_size_3!!
        
        _Highlighter_size_3 = ImageVector.Builder(
            name = "highlighter_size_3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(310f, 790f)
                lineTo(169f, 649f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(423f, -424f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(141f, 142f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(367f, 790f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(310f, 790f)
                close()
            }
        }.build()
        
        return _Highlighter_size_3!!
    }

private var _Highlighter_size_3: ImageVector? = null

