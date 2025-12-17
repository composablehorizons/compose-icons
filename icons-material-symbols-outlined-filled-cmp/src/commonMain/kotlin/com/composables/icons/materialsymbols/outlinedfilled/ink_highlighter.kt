package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ink_highlighter: ImageVector
    get() {
        if (_Ink_highlighter != null) return _Ink_highlighter!!
        
        _Ink_highlighter = ImageVector.Builder(
            name = "ink_highlighter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(384f, 400f)
                lineToRelative(216f, 216f)
                lineToRelative(-200f, 200f)
                quadToRelative(-24f, 24f, -56f, 24f)
                reflectiveQuadToRelative(-56f, -24f)
                lineToRelative(-2f, -2f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(60f)
                lineToRelative(126f, -126f)
                lineToRelative(-2f, -2f)
                quadToRelative(-24f, -24f, -24f, -56f)
                reflectiveQuadToRelative(24f, -56f)
                lineToRelative(200f, -200f)
                close()
                moveToRelative(57f, -57f)
                lineToRelative(199f, -199f)
                quadToRelative(24f, -24f, 56f, -24f)
                reflectiveQuadToRelative(56f, 24f)
                lineToRelative(104f, 104f)
                quadToRelative(24f, 24f, 24f, 56f)
                reflectiveQuadToRelative(-24f, 56f)
                lineTo(657f, 559f)
                lineTo(441f, 343f)
                close()
            }
        }.build()
        
        return _Ink_highlighter!!
    }

private var _Ink_highlighter: ImageVector? = null

