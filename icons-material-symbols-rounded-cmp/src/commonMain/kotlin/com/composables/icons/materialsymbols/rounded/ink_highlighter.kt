package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Ink_highlighter: ImageVector
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
                moveTo(544f, 560f)
                lineTo(440f, 456f)
                lineTo(240f, 656f)
                lineToRelative(104f, 104f)
                lineToRelative(200f, -200f)
                close()
                moveToRelative(-47f, -161f)
                lineToRelative(104f, 104f)
                lineToRelative(199f, -199f)
                lineToRelative(-104f, -104f)
                lineToRelative(-199f, 199f)
                close()
                moveToRelative(-84f, -28f)
                lineToRelative(216f, 216f)
                lineToRelative(-229f, 229f)
                quadToRelative(-24f, 24f, -56f, 24f)
                reflectiveQuadToRelative(-56f, -24f)
                lineToRelative(-2f, -2f)
                lineToRelative(-3f, 3f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(108f)
                quadToRelative(-14f, 0f, -19f, -12f)
                reflectiveQuadToRelative(5f, -22f)
                lineToRelative(92f, -92f)
                lineToRelative(-2f, -2f)
                quadToRelative(-24f, -24f, -24f, -56f)
                reflectiveQuadToRelative(24f, -56f)
                lineToRelative(229f, -229f)
                close()
                moveToRelative(0f, 0f)
                lineToRelative(227f, -227f)
                quadToRelative(24f, -24f, 56f, -24f)
                reflectiveQuadToRelative(56f, 24f)
                lineToRelative(104f, 104f)
                quadToRelative(24f, 24f, 24f, 56f)
                reflectiveQuadToRelative(-24f, 56f)
                lineTo(629f, 587f)
                lineTo(413f, 371f)
                close()
            }
        }.build()
        
        return _Ink_highlighter!!
    }

private var _Ink_highlighter: ImageVector? = null

