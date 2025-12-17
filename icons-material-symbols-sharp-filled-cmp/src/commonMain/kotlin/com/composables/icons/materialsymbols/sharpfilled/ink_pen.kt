package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Ink_pen: ImageVector
    get() {
        if (_Ink_pen != null) return _Ink_pen!!
        
        _Ink_pen = ImageVector.Builder(
            name = "ink_pen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(611f, 499f)
                lineTo(461f, 348f)
                lineToRelative(111f, -110f)
                lineToRelative(-29f, -29f)
                lineToRelative(-219f, 219f)
                lineToRelative(-56f, -56f)
                lineToRelative(275f, -275f)
                lineToRelative(85f, 85f)
                lineToRelative(79f, -79f)
                lineToRelative(150f, 150f)
                lineToRelative(-246f, 246f)
                close()
                moveTo(270f, 840f)
                horizontalLineTo(120f)
                verticalLineToRelative(-150f)
                lineToRelative(284f, -285f)
                lineToRelative(151f, 150f)
                lineToRelative(-285f, 285f)
                close()
            }
        }.build()
        
        return _Ink_pen!!
    }

private var _Ink_pen: ImageVector? = null

