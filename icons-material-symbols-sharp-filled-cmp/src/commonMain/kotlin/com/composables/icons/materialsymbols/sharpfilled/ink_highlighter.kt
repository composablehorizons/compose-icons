package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ink_highlighter: ImageVector
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
                moveTo(60f, 840f)
                lineToRelative(126f, -126f)
                lineToRelative(-30f, -30f)
                verticalLineToRelative(-56f)
                lineToRelative(228f, -228f)
                lineToRelative(216f, 216f)
                lineToRelative(-228f, 228f)
                horizontalLineToRelative(-56f)
                lineToRelative(-30f, -30f)
                lineToRelative(-26f, 26f)
                horizontalLineTo(60f)
                close()
                moveToRelative(381f, -497f)
                lineToRelative(255f, -255f)
                lineToRelative(216f, 216f)
                lineToRelative(-255f, 255f)
                lineToRelative(-216f, -216f)
                close()
            }
        }.build()
        
        return _Ink_highlighter!!
    }

private var _Ink_highlighter: ImageVector? = null

